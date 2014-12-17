#!/usr/bin/env python

# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?
# https://projecteuler.net/problem=3

import sys
import os.path
import math
import io

def resetFile(filename):
	os.remove(filename)
	inFile = open(filename, "a+")
	inFile.write('2\n')
	inFile.write('3\n')
	return inFile
	
def getNextPrime(index, kpFile):
	returnNum = None
	try:
		kpFile.seek(index)
		returnNum = int(kpFile.readline())
	except:
		kpFile.seek(index - 1)
		test = int(kpFile.readline()) + 2
		testSqrt = math.sqrt(test)
		testIndex = 1
		while(True):
			kpFile.seek(testIndex)
			testIndex += 1
			demon = int(kpFile.readline())
			print demon
			if denom > testSqrt:
				kpFile.seek(index)
				kpFile.write(str(test) + '\n')
				returnNum = test
				break
			elif test % demon == 0:
				test += 2
				testSqrt = math.sqrt(test)
				testIndex = 1
			
	return returnNum
	

n = int(sys.argv[1])
# open file and test to make sure it is valid.
filename = 'kp.txt'
kp = open(filename, "a+")
lines = 0
for line in kp:
	lines += 1
	if lines == 2:
		break
			
if lines < 2:
	kp = resetFile(filename)
else:
	kp.seek(0)
	test1 = int(kp.readline())
	test2 = int(kp.readline())
	if(test1 != 2 or test2 != 3):
		kp = resetFile(filename)
	
index = 0
kp.seek(index)
test_num = int(kp.readline())

while(n != 1):
	if(n % test_num == 0):
		n /= test_num
	else:
		index += 1
		test_num = getNextPrime(index,kp)
			
	
print(test_num)



