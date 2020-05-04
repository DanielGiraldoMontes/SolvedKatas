using NUnit.Framework;
using SolvedKatas;

[TestFixture]
public class MultipleFiveThreeTest
{
  [Test]
  public void Test()
  {
    Assert.AreEqual(23, MultipleFiveThree.Solution(10));
  }
}