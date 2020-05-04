import unittest
import SolvedKatas.NarcissisticNumber as Number


class NarcissisticNumberTest(unittest.TestCase):

    def setUp(self):
        self.number = Number.NarcissisticNumber()

    def testIsNarcissistic(self):
        self.assertEqual(self.number.narcissistic(7), True)
        self.assertEqual(self.number.narcissistic(371), True)

    def testIsNotNarcissistic(self):
        self.assertEqual(self.number.narcissistic(122), False)
        self.assertEqual(self.number.narcissistic(4887), False)


if __name__ == '__main__':
    unittest.main()
