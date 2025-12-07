# AoC 2025
Today (04/12/25) is my first attempt at AoC, starting a little late, I had seen it around before but never caught the date it runs at (Dec 1-12).
## Day 1 - Password to the safe (04/12)
There is a safe with a dial of numbers ranging from 0 to 99. Inputs are given as {left/right}{movement}, e.g. if dial starts at 50 - L10 will mean turn dial to left by 10, resulting in dial ending up at 40.
As the dial is circular, 99 + R1 is 0 and 0 + L1 is 99.

The password (answer) however is not the combinations of these operations but the count of how many times you hit 0 with given operations. Honestly the only struggle was realising that they can give any number such as L1250 or R1250.

In the file given to me by AoC I had 4059 lines of operations, and the dial hit 0 997 times.

After submitting the answer, a second part to the same problem appeared, which took me a while to notice. In short, it would ask me to also calculate how many times does the dial pass over 0 without stopping. For the same file, with the update, the answer was 5978.
## Day 2 - Remove invalid IDs (07/12)
We are in a gift shop and the register has a bunch of IDs some of which are invalid. There is a certain pattern for them which is simply any repeating sequence of numbers such as 11111,494949,3859638596 and we are to return the sum of all the invalid IDs.

First part was easy and fun as well. The second part was absolute horror. I had some issues with somehow having overlapping ranges but I could not detect it by debugging the output. So I ended up using a HashSet to make sure that the invalid IDs are unique, which I think is what solved my issue but I am still not quite sure as it was the most elusive bug I've ever had.

I really enjoy dabbling into Java Streams such as a quick sum of the HashSet items but I am still not quite sure if I should incorporate them more into my code, will it become too much? Regardless, they are extremely useful.
