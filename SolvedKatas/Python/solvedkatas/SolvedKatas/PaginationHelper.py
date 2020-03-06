class PaginationHelper:

    # The constructor takes in an array of items and a integer indicating
    # how many items fit within a single page
    def __init__(self, collection, items_per_page):
        # returns the number of items within the entire collection
        self.collection = collection
        self.items_per_page = items_per_page
        self.pages = 0
        self.total = 0
        self.num = None

    def item_count(self):
        # returns the number of pages
        return len(self.collection)

    def page_count(self):
        # returns the number of items on the current page. page_index is zero based
        # this method should return -1 for page_index values that are out of range
        return 1 if self.items_per_page >= len(self.collection) else int(
            len(self.collection) / self.items_per_page) + 1

    def page_item_count(self, page_index):
        # determines what page an item is on. Zero based indexes.
        # this method should return -1 for item_index values that are out of range
        self.num = -1
        self.pages = self.page_count()
        self.total = self.item_count()

        if (page_index + 1) <= self.pages and page_index > -1 and self.total > 0:
            if (page_index + 1) == self.pages:
                self.num = (self.total % self.items_per_page)
            else:
                self.num = self.items_per_page

        return self.num

    def page_index(self, item_index):
        return -1 if ((self.item_count() - 1) < item_index < 0 or self.item_count() == 0) \
            else (item_index + 1) // self.items_per_page
