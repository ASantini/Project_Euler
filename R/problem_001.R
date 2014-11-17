#!/usr/bin/Rscript

# Original problem
# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.
# https://projecteuler.net/problem=1

args <- commandArgs(TRUE)

summation <- function(x) {
	(x*(x+1))/2
}

if(length(args) < 1) {
	print("Please pass an integer from the command line as an argument")
	print("Rscript <<file>> <<arg>>")
	stop()
}

n <- as.numeric(args[1])
if(n %/% 1 != n) {
	print("The value passed to the first argument is not an integer")
	stop()
}

n <- n - 1
div3 <- n %/% 3
div5 <- n %/% 5
div15 <- n %/% 15

result <- summation(div3)*3 + summation(div5)*5 - summation(div15)*15

print(result)