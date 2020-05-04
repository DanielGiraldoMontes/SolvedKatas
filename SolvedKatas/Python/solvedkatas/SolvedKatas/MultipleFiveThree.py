class MultipleFiveThree:

    def __init__(self):
        pass

    def solution(self, number):
        return sum(x for x in range(number) if x % 3 == 0 or x % 5 == 0)

