using System.Collections.Generic;

namespace SolvedKatas
{
    public class PaginationHelper<T>
    {
        private readonly IList<T> collection;
        private readonly int itemsPerPage;

        /// <summary>
        /// Constructor, takes in a list of items and the number of items that fit within a single page
        /// </summary>
        /// <param name="collection">A list of items</param>
        /// <param name="itemsPerPage">The number of items that fit within a single page</param>
        public PaginationHelper(IList<T> collection, int itemsPerPage)
        {
            this.collection = collection;
            this.itemsPerPage = itemsPerPage;
        }

        /// <summary>
        /// The number of items within the collection
        /// </summary>
        public int ItemCount
        {
            get
            {
                return collection.Count;
            }
        }

        /// <summary>
        /// The number of pages
        /// </summary>
        public int PageCount
        {
            get
            {
                return itemsPerPage >= collection.Count ? 1 : (collection.Count / itemsPerPage) + 1;
            }
        }

        /// <summary>
        /// Returns the number of items in the page at the given page index 
        /// </summary>
        /// <param name="pageIndex">The zero-based page index to get the number of items for</param>
        /// <returns>The number of items on the specified page or -1 for pageIndex values that are out of range</returns>
        public int PageItemCount(int pageIndex)
        {
            int num = -1;
            int pages = PageCount;

            if ((pageIndex + 1) <= pages && pageIndex > -1 && collection.Count > 0)
                if ((pageIndex + 1) == pages)
                    num = (collection.Count % itemsPerPage);
                else
                    num = itemsPerPage;

            return num;
        }

        /// <summary>
        /// Returns the page index of the page containing the item at the given item index.
        /// </summary>
        /// <param name="itemIndex">The zero-based index of the item to get the pageIndex for</param>
        /// <returns>The zero-based page index of the page containing the item at the given item index or -1 if the item index is out of range</returns>
        public int PageIndex(int itemIndex)
        {
            return itemIndex > (collection.Count - 1) || itemIndex < 0 ? -1
            : (itemIndex / itemsPerPage);
        }
    }
}
