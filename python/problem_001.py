#!/usr/bin/env python

import sys

def summation(n):
	return (n * (n + 1))/2

n = int(sys.argv[1]) - 1
print summation(n/3) * 3 + summation(n/5) * 5 - summation(n/15) * 15