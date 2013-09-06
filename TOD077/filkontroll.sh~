#!/bin/zsh

while :
    sleep -(touch $1)
do
    if [stat $1 | grep Modify]
then
    echo "this is already a file...";
    stat $1
else
    echo "we just touched something...the room is dark...";
    touch -f $1;
    stat $1;
fi
done
echo
echo "...done."
