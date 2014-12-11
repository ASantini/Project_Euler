#!/usr/bin/env python

# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?
# https://projecteuler.net/problem=3

import sys
import os.path
import json
imprt io

n = int(sys.argv[1]

kp = none

if(os.path.isfile('kp.json')):
	json_data = open('kp.json')
	kp = json.load(json_data)
else:
	kp = [2,3]
	
