#!/usr/bin/Rscript

# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?

getNextPrime <- function(kp,...) {
	test <- kp[length(kp)] + 2
	sqrt <- sqrt(test)
	i <- 1
	while(i < length(kp)) {
		if(kp[i] > sqrt) {
			break
		} else if(test %% kp[i] == 0) {
			test <- test + 2
			sqrt <- sqrt(test)
			i <- 1
		}
		i <- i + 1
	}
	test
}

args <- commandArgs(TRUE)

number <- as.numeric(args[1])

# vector that hold initial known primes
kp <- c(2, 3)
number <- if(number %% 2 == 0) (number / 2) else number
number <- if(number %% 3 == 0) number / 3 else number
test <- getNextPrime(kp)
while(number != 1) {
	if(number %% test == 0) {
		number <- number / test
	} else {
		test <- getNextPrime(kp)
		kp <- c(kp, test)
	}
}
test


