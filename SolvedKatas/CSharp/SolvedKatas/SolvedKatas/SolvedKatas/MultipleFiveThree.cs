using System.Linq;

namespace SolvedKatas
{
    public static class MultipleFiveThree
    {
        public static int Solution(int value)
        {
            return Enumerable.Range(0, value).Where(x => x % 3 == 0 || x % 5 == 0).Sum();
        }
    }
}