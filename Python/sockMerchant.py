#!/bin/python3
import os


#
# Complete the 'sockMerchant' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY ar
#

def sockMerchant(n, ar):
    temp = 0;
    cnt = 0;

    ar.sort()
    for i in range(0, n - 1):
        if temp == 1:
            temp = 0
            continue

        if ar[i] == ar[i + 1]:
            cnt += 1
            temp = 1

    return cnt


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()