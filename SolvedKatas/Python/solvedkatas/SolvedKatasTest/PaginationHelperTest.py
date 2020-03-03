import unittest
import SolvedKatas.PaginationHelper as Helper


class MyTestCase(unittest.TestCase):

    def setUp(self):
        collection = range(1, 25)
        self.pagination = Helper.PaginationHelper(collection, 10)

    def test_page_count(self):
        self.assertEqual(self.pagination.page_count(), 3)

    def test_page_index(self):
        self.assertEqual(self.pagination.page_index(23), 2)

    def test_item_count(self):
        self.assertEqual(self.pagination.item_count(), 24)

    def test_page_item_count(self):
        self.assertEqual(self.pagination.page_item_count(2), 4)


if __name__ == '__main__':
    unittest.main()
