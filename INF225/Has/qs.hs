qs (p:xs) = (qs ls) ++ [p] ++ (qs gt)
	where
		ls = filter (< p) xs
		gt = filter (>= p) xs

main = qs (1:(0,1,2,3,4,5,6,7,12))