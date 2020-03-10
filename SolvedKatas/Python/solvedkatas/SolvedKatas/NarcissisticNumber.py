class NarcissisticNumber:

    def __init__(self):
        pass

    def narcissistic(self, value):
        return value == sum(int(x) ** len(str(value)) for x in str(value))
