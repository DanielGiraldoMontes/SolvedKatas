using System;

namespace SolvedKatas
{
    public class NarcissisticNumber
    {
        public static bool Narcissistic(int value)
        {
            string valueS = value.ToString();
            int multiply = valueS.Length;
            Int64 number = 0;
            for (int i = 0; i < valueS.Length; i++)
            {
                int mult = int.Parse(valueS[i].ToString());
                number += Int64.Parse(Math.Pow(mult,multiply).ToString());
            }
            return number == value;
        }
    }
}
