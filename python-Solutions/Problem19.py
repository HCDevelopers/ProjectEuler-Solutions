from datetime import date
from datetime import timedelta

cur = date(1901, 1, 6)
end = date(2000, 12, 31)
week = timedelta(days = 7)  

sundays = 0

while cur <= end:
    if cur.day == 1:
        sundays += 1
    cur += week

print sundays
