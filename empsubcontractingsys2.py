import random
import mysql.connector as mys
import os
import getpass 
d_uid="Admin"  #default userID
d_pw="1234"    #default password
f=0            #indicates program is running
db=mys.connect(host='localhost', user='root',passwd='Isgx#007',database='EmpSubcontractingSys')
p=db.cursor()
def login():
    print("------------------------------------------------------------")
    print("Please enter User ID and Password to login as Administrator.")
    uid=input("User ID: ")
    pw=getpass.getpass(prompt="PASSWORD: ")
    print("------------------------------------------------------------")
    print()
    print()
    if uid==d_uid and pw==d_pw:
        print("Welcome!")
        menu()
    else:
        print("Username or Password is incorrect.")
        c=input("Do you want to enter password again? (y/n): ")
        if c.lower()=='y':
            login()
        else:
            f=1
            print("Program execution finished.")
def menu():
   os.system('clear')
   print("------------------------------------------------------------")
   print("1. VIEW FULL RECORDS")
   print("2. VIEW CURRENT STATUS OF EMPLOYEES")
   print("3. VIEW AND ACCEPT JOB APPLICANTS")
   print("4. EDIT RECORDS")
   print("5. EDIT STATUS OF EMPLOYEES")
   print("------------------------------------------------------------")
login()


    
