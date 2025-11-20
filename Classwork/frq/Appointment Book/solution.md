This question involves the AppointmentBook class, which provides methods for students to schedule appointments with their teacher. Appointments can be scheduled during one of eight class periods during the school day, numbered 1 through 8. A requested appointment has a duration, which is the number of minutes the appointment will last. The 60 minutes within a period are numbered 0 through 59. In order for an appointment to be scheduled, the teacher must have a block of consecutive, available minutes that contains at least the requested number of minutes in a requested period. Scheduled appointments must start and end within the same period.


Part A
Main class, 2 inputs (period, how long) 

If how long is less than or equal to the window frame that is availiable, return first one. 

**Must use isMinuteFree

 Preconditions: 1 <= period <= 8; 1 <= duration <= 60
*/
public int findFreeBlock(int period, int duration){
    for (int )
}
Part B
Main class, 3 inputs, (first period, 2nd period, how long)

Complete method makeAppointment. Assume that findFreeBlock works as intended,
regardless of what you wrote in part (a). You must use findFreeBlock and reserveBlock
appropriately in order to receive full credit.
/**
* Searches periods from startPeriod to endPeriod, inclusive, for a block
* of duration free minutes, as described in part (b). If such a block is found,
* calls reserveBlock to reserve the block of minutes and returns true; otherwise
* returns false.
* Preconditions: 1 <= startPeriod <= endPeriod <= 8; 1 <= duration <= 60
*/
public boolean makeAppointment(int startPeriod, int endPeriod,
int duration)