import unittest
import SolvedKatas.MultipleFiveThree as Number


class NarcissisticNumberTest(unittest.TestCase):

    def setUp(self):
        self.number = Number.MultipleFiveThree()

    def testIsMultiple(self):
        self.assertEqual(self.number.solution(10), 23)


if __name__ == '__main__':
    unittest.main()
