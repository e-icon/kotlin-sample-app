### Kotlin + Java -sample-app
#### 1. trafficstats_and_googlemap(Kotlin)
graph using mpandroidchart: https://weeklycoding.com/mpandroidchart/    
<img src="https://user-images.githubusercontent.com/88701071/128821346-011aadd8-dcd2-4c4a-a95e-7e2ba4e6902a.png" width="30%" height="30%"/>    
<img src="https://user-images.githubusercontent.com/88701071/128821357-bad835c6-1cea-4d42-ba85-5229e43a0ad2.png" width="30%" height="30%"/>    
***

#### 2. NavigateSampleApp(Java)
simple navigate app    

add dependency in build.gradle(Project)

    def nav_version = "2.3.5"
    classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        
add dependency in build.gradle(Module)    
    
    def nav_version = "2.3.5"
    def fragment_version = "1.3.6"

    // Java language implementation
    implementation "androidx.navigation:navigation-fragment:$nav_version"
    implementation "androidx.navigation:navigation-ui:$nav_version"

    // Java language implementation
    implementation "androidx.fragment:fragment:$fragment_version"

refer to https://developer.android.com/guide/navigation/navigation-navigate?hl=ko    

it includes 3 fragments    
when you click the button, you can go to the next fragment(screen)    
<img width="50%" alt="캡처" src="https://user-images.githubusercontent.com/88701071/129449158-66439694-a394-4d10-88a2-5cf95cf85104.PNG">    
<img src="https://user-images.githubusercontent.com/88701071/129449187-7ef246bf-8643-4d66-a568-e20a77de93eb.png" width="30%" height="30%"/>    
<img src="https://user-images.githubusercontent.com/88701071/129449191-3ec93657-9fe2-41e4-a477-d63dbf049833.png" width="30%" height="30%"/>     
***

#### 3. GridViewControl
6x6 table.    
you can add and delete rows and columns.    

<img src="https://user-images.githubusercontent.com/88701071/130631256-0077ca70-427e-4d43-8a00-54e5584abdfb.png" width="30%" height="30%"/>      
<img src="https://user-images.githubusercontent.com/88701071/130631274-36a72d6f-8691-4f77-9cf2-846a3917d92c.png" width="30%" height="30%"/>    
***



