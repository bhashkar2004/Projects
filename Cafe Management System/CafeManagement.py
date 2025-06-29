menu={"pizza":100,"Burger":80,"Pasta":40,"Chicken Dum Biryani":200,
      "Mutton Biryani":350,"Coffee":50}
buyonegetone=["pizza","Burger"]
print("Welcome To My Restaurant")
print()
print("pizza(Buy One Get One)=100\nBurger(Buy One Get One)=80\nPasta=40\nChicken Dum Biryani=200\nMutton Biryani=350\nCoffee=50")
total_bill=0
while True:
    item=input("Enter the item You want to order:")
    if item in menu:
        quantity=int(input("How many you want?"))
        
        print(f"Your item {item} has been added to your order")
        if item in buyonegetone:
            total_bill+=(quantity*menu[item])/2
        else:
            total_bill+=quantity*menu[item]
    else:
        print("Sorry,We don't have that item")
    another_order=input("Do you want another item?(yes/no): ")
    if another_order.lower()!='yes':
        break
if total_bill>=1000:
    percent=total_bill*0.1
    total_bill-=percent
    print(f"The Discount for you is {percent}")
print(f"The Total bill to pay is {total_bill} Rs")
print("Thank You Visit Again!!!")
