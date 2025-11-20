import java.util.ArrayList;
//There is a **ClimbingClub class** that maintains a list of the climbs made by members of the club.

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
    * Guaranteed not to be null. Contains only non-null references.
    */
    
    private ArrayList<ClimbInfo> climbList;
    
    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }
    
    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
    * @param peakName the name of the mountain peak climbed
    * @param climbTime the number of minutes taken to complete the climb
    */
public void addClimb(String peakName, int climbTime)
{
    ClimbInfo newClimb = new ClimbInfo(peakName);

    // Find the correct position to insert the new climb in alphabetical order
    int index = 0;
    while (index < climbList.size() && peakName.compareTo(climbList.get(index).getName()) > 0) {
        index++;
    }

    // Insert the new climb at the determined position
    climbList.add(index, newClimb);
}

/** @return the number of distinct names in the list of climbs */
public int distinctPeakNames()
{
  if (climbList.size() == 0)
  {
    return 0;
  }
  ClimbInfo currInfo = climbList.get(0);
  String prevName = currInfo.getName();
  String currName = null;
  int numNames = 1;
  for (int k = 1; k < climbList.size(); k++)
  {
    currInfo = climbList.get(k);
    currName = currInfo.getName();
    if (prevName.compareTo(currName) != 0)
    {
      numNames++;
      prevName = currName;
    }
  }
  return numNames;
}



}