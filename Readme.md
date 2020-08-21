# Geektrust Tame of Thrones

Solution for the Geektrust Tame Of Thrones problem.

## Problem Statement
Please refer to the pdf document with problem statement. Same has been copied below.
[Geektrust Tame Of Thrones](/docs/Geektrust_in_tameofthrones_java.pdf)

There is no ruler in the universe of **Southeros** and pandemonium reigns. **Shan**, the gorilla king of the **Space kingdom**
wants to rule all Six Kingdoms in the **universe of Southeros**. He needs the support of 3 more kingdoms to be the ruler.

Each kingdom has an animal emblem and **Shan** needs to send a message with the animal in the message to win them over.<br/>
**SPACE** emblem - **Gorilla**,<br/>
**LAND** emblem - **Panda**, <br/>
**WATER** emblem - **Octopus**,<br/>
**ICE** emblem - **Mammoth**, <br/>
**AIR** emblem - **Owl**,<br/>
**FIRE** emblem - **Dragon**.<br/>

Your coding challenge is to have **King Shan** send secret a message to each kingdom and win them over.
Once he wins 3 more kingdoms, he is the ruler! The secret message needs to contain the letters of the animal in their emblem.

For example, secret message to the **Land kingdom** (emblem: **Panda**) needs to have the letter 'p','n','d' at-least once and 'a' at-
least twice. If he sends "ahdvvnxxxautup" to the **Land kingdom**, he will win them over.
**King Shan** wants to make sure his secret message is not found by his enemies easily. So he decides to use the oldest of the
ciphers **'Seasar cipher’**. A cipher is a type of secret code, where you swap the letters around so that no-one can read your
message.

To make the secret message encrypted, **King Shan** uses a **secret key**, which is the number of characters in the emblem.
If **King Shan** wants to send a message to **kingdom Air**, he uses the number 3 as the cipher key, as emblem **‘owl’** has 3
characters. So, to encrypt the letter ‘a’, just move 3 letters clockwise on the message wheel, which will give the letter ‘d’.
So if **King Shan**, sends the message **"rozo"** to **Air**, **King Shan** will receive
the allegiance from **Air**. As "rozo" will decrypt to "olwl" and these letters
contain the emblem characters ‘o’, ’w’, ’l’.

If **King Shan** wants to send a message to **kingdom Land**, he uses the
number 5 as the cipher key, as emblem **‘panda’** has 5 characters. To
encrypt the letter ‘a’, just move 5 letters clockwise on the message
wheel, which will give you the letter ‘f’.

**Sample input & output**
Your program should take the location to the test file as parameter. Input needs to be read from a text file,
and output should be printed to the console.

**Input Format**
```
KINGDOM_1 SECRET_MSG_TO_KINGDOM_1
KINGDOM_2 SECRET_MSG_TO_KINGDOM_2
...
KINGDOM_N SECRET_MSG_TO_KINGDOM_N
```

**Output Format**
```
RULER ALLY_KINGDOM_1, ALLY_KINGDOM_N
```

**Sample Input**
```
AIR ROZO
LAND FAIJWJSOOFAMAU
ICE STHSTSTVSASOS
```

**Sample Output**
```
SPACE AIR LAND ICE
```

Message send by Space Kingdom to other kingdoms

More samples input output scenarios.
Please stick to the Sample input output format as shown. This is very important as we are automating the
correctness of the solution to give you a faster evaluation. You can find some sample input output files here.

**Sample Input 1(Message send by Space Kingdom to other kingdoms)**
```
LAND FDIXXSOKKOFBBMU
ICE MOMAMVTMTMHTM
WATER SUMMER IS COMING
AIR OWLAOWLBOWLC
FIRE AJXGAMUTA
```

**Sample Output 1**
```
SPACE LAND ICE FIRE
```
<sub><sup>*Ruler Kingdom (SPACE) and its allies*<sup/><sub/>

**Sample Input 2(Message send by Space Kingdom to other kingdoms)**
```
AIR OWLAOWLBOWLC
LAND OFBBMUFDICCSO
ICE VTBTBHTBBBOBAB
WATER SUMMER IS COMING
```

**Sample Output 2**
```
NONE
```
<sub><sup>*SPACE Kingdom did not get enough allies*<sup/><sub/>

## How to run

### With a file from repo
```console
$ gradle clean build run --args="src/main/resources/input/sample.txt" --info
```

### With a file of your own
```console
$ gradle clean build run --args="home/Downloads/sample.txt" --info
```

### With a CLI argument
```console
$ gradle clean build run --args="AIR ROZO LAND FAIJWJSOOFAMAU ICE STHSTSTVSASOS" --info
```