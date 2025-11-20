1. Read input from the file makelake.in
2. Parse the first line to get R, C, E, and N
3. Create a 2D array 'elevations' of size RxC and parse the next R lines to fill it with initial elevations
4. Loop N times:
    4.1. Parse each stomp-digging instruction and get R_s, C_s, and D_s
    4.2. For each cell in the 3x3 grid starting from (R_s, C_s):
        4.2.1. Find the maximum elevation in the grid
        4.2.2. Update the elevation of each cell to be the maximum of E and (maxElevation - D_s)
5. Calculate the total depth of the lake by summing up the differences between E and each elevation in the 'elevations' array
6. Calculate the volume of the lake by multiplying the total depth by the area of each square (6x6 inches)
7. Write the volume to the file makelake.out
