using NUnit.Framework;
using SolvedKatas;
using System.Collections.Generic;

namespace SolvedKatasTest
{
    [TestFixture]
    public class NarcissisticNumberTest
    {
        private static IEnumerable<TestCaseData> testCases
        {
            get
            {
                yield return new TestCaseData(1)
                                .Returns(true)
                                .SetDescription("1 is narcissitic");
                yield return new TestCaseData(371)
                                .Returns(true)
                                .SetDescription("371 is narcissitic");

            }
        }

        [Test, TestCaseSource("testCases")]
        public bool Test(int n) => NarcissisticNumber.Narcissistic(n);
    }
}
