items_ids = input('Item: ')

list_of_items = items_ids.split(",")

for item in list_of_items:
    with open(file=f"..\src\main/resources/assets\culturalcreators\models\item/{item}.json", mode="a", encoding="utf-8") as file:
        file.write('{\n'
                   '    "parent": "item/generated",\n'
                   '    "textures": {\n'
                   f'        "layer0": "culturalcreators:item/{item}"\n'
                   '    }\n'
                   '}')
    print("Done: ", item)
#incomplete_elote,incomplete_beef_burrito,incomplete_mutton_sandwich,incomplete_fried_eggplant_pasta,incomplete_eggplant_burger,incomplete_hearty_salad,incomplete_chicken_taco,incomplete_fish_taco,incomplete_pork_wrap,incomplete_spicy_curry,incomplete_exotic_roll_medley