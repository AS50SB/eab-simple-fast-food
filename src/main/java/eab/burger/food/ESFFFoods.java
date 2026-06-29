package eab.burger.food;
import eab.burger.EaBSimpleFastFoodMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
// Hello world!
public class ESFFFoods {
    public static void init()
    {

        System.out.println("ESF/EFF/FF mod init successful.");
    }
    private static Item registerItem(String name,Item item)
    {
        return Registry.register(Registries.ITEM,new Identifier(EaBSimpleFastFoodMod.MOD_ID,name),item);
    }
    private static Item createBasicFood(String name,int hunger,float saturation)
    {
        return registerItem(name,new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder()
            .hunger(hunger)
            .saturationModifier(saturation)
            .build()
        )));
    }
    public static void registerItemsToCreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
            .register(entries -> {
                entries.add(BEEF_BURGER);
                entries.add(PORK_BURGER);
                entries.add(MUTTON_BURGER); 
                entries.add(CHICKEN_BURGER);
                entries.add(BEEF_CHEESE_BURGER);
                entries.add(PORK_CHEESE_BURGER);
                entries.add(MUTTON_CHEESE_BURGER);
                entries.add(CHICKEN_CHEESE_BURGER);
                entries.add(SALMON_BURGER);
                entries.add(COD_BURGER);
                entries.add(SALMON_CHEESE_BURGER);
                entries.add(COD_CHEESE_BURGER);
                entries.add(MIXIN_BURGER);
                entries.add(SCRAMBLED_EGG);
                entries.add(FRIED_SCRAMBLED_EGG);
                entries.add(CHEESE);
                entries.add(CHICKEN_NUGGET);
                entries.add(COOKED_CHICKEN_NUGGET);
                entries.add(RAW_FRIES);
                entries.add(FRIES);
            });
    }
    // 汉堡
    // 牛肉
    public static final Item BEEF_BURGER;
    // 猪肉
    public static final Item PORK_BURGER;
    // 羊肉
    public static final Item MUTTON_BURGER;
    // 鸡肉
    public static final Item CHICKEN_BURGER;
    // 芝士牛肉
    public static final Item BEEF_CHEESE_BURGER;
    // 芝士猪肉
    public static final Item PORK_CHEESE_BURGER;
    // 芝士羊肉
    public static final Item MUTTON_CHEESE_BURGER;
    // 芝士鸡肉
    public static final Item CHICKEN_CHEESE_BURGER;
    // 三文鱼
    public static final Item SALMON_BURGER;
    // 鳕鱼
    public static final Item COD_BURGER;
    // 芝士三文鱼
    public static final Item SALMON_CHEESE_BURGER;
    // 芝士鳕鱼
    public static final Item COD_CHEESE_BURGER;
    // 混合
    public static final Item MIXIN_BURGER;

    // 普通食物
    // 生炒蛋
    public static final Item SCRAMBLED_EGG;
    // 煎炒蛋
    public static final Item FRIED_SCRAMBLED_EGG;
    // 芝士
    public static final Item CHEESE;
    // 生鸡块
    public static final Item CHICKEN_NUGGET;
    // 熟鸡块
    public static final Item COOKED_CHICKEN_NUGGET;
    // 生薯条
    public static final Item RAW_FRIES;
    // 去码头整点薯条()
    public static final Item FRIES;

    static
    {
        BEEF_BURGER = createBasicFood("beef_burger",5,10);
        PORK_BURGER = createBasicFood("pork_burger",5,10);
        MUTTON_BURGER = createBasicFood("mutton_burger",4,8);
        CHICKEN_BURGER = createBasicFood("chicken_burger",4,6.8f);
        PORK_CHEESE_BURGER = createBasicFood("pork_cheese_burger",8,10);
        MUTTON_CHEESE_BURGER = createBasicFood("mutton_cheese_burger",5,8);
        SALMON_BURGER = createBasicFood("salmon_burger",4,8);
        COD_BURGER = createBasicFood("cod_burger",4,5.8f);
        SALMON_CHEESE_BURGER = createBasicFood("salmon_cheese_burger",6,10);
        COD_CHEESE_BURGER = createBasicFood("cod_cheese_burger",4,5.8f);
        MIXIN_BURGER = createBasicFood("mixin_burger",10,10);
        BEEF_CHEESE_BURGER = createBasicFood("beef_cheese_burger",8,10);
        CHICKEN_CHEESE_BURGER = createBasicFood("chicken_cheese_burger",6,7.5f);

        SCRAMBLED_EGG = createBasicFood("scrambled_egg",0,0.1f);
        FRIED_SCRAMBLED_EGG = createBasicFood("fried_scrambled_egg",1,1.8f);
        CHEESE = createBasicFood("cheese",1,1.2f);
        CHICKEN_NUGGET = createBasicFood("chicken_nugget",0,0.1f);
        COOKED_CHICKEN_NUGGET = createBasicFood("cooked_chicken_nugget",1,0.8f);
        RAW_FRIES = createBasicFood("raw_fries",2,0.8f);
        FRIES = createBasicFood("fries",4,7.8f);
    }
}