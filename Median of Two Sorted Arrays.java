class Solution {
    func findMedianSortedArrays(_ nums1: [Int], _ nums2: [Int]) -> Double {
        let totalNumbers = nums1.count + nums2.count
        guard totalNumbers>0 else {return 0.0}

        var sortedNumber: [Int] = []
        var nums1 = nums1
        var nums2 = nums2

        for i in 0...totalNumbers{
            if let num1 = nums1.first , let num2 = nums2.first{
                if num1 <= num2{
                    sortedNumber.append(num1)
                    nums1.removeFirst()
                }else{
                    sortedNumber.append(num2)
                    nums2.removeFirst()
                }

            }else if let num1 = nums1.first{
                sortedNumber.append(num1)
                nums1.removeFirst()

            }else if let num2 = nums2.first{
                sortedNumber.append(num2)
                nums2.removeFirst()
            }
        }

        var median: Double = 0.0
        let x = totalNumbers/2 //normal mid index

        if totalNumbers%2 == 0{
            let midX = sortedNumber[x]
            let midY = sortedNumber[x-1]
            median = (Double(midX) + Double(midY)) / 2

        }else{
            median = Double(sortedNumber[x])
        }

        return median
    }
}
