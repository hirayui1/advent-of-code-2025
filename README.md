# AoC 2025
Today (04/12/25) is my first attempt at AoC, starting a little late, I had seen it around before but never caught the date it runs at (Dec 1-12).
## Day 1 - Password to the safe (04/12)
There is a safe with a dial of numbers ranging from 0 to 99. Inputs are given as {left/right}{movement}, e.g. if dial starts at 50 - L10 will mean turn dial to left by 10, resulting in dial ending up at 40.
As the dial is circular, 99 + R1 is 0 and 0 + L1 is 99.

The password (answer) however is not the combinations of these operations but the count of how many times you hit 0 with given operations. Honestly the only struggle was realising that they can give any number such as L1250 or R1250.

In the file given to me by AoC I had 4059 lines of operations, and the dial hit 0 997 times.
