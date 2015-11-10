while true
do 
	echo "git add ."
	git add .
	echo "git commit -m \"mess\""
	git commit -m "mess"
	echo "git push"
	git push -u origin master
	sleep 30
done

