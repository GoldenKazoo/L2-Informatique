#include "TP8.h"

struct s_action
{   
    char    *name;
    void    (*function)(void);
};

struct s_items
{
    enum {SUB, ACT} s_enumitem;
    union 
    {
        t_menu      *submenu;
        t_action    *action;
    };
};

struct s_menu
{
    t_menu      *parent;
    char        *name;
    t_items     *childs[9];
};


t_menu* createMenu(const char* text)
{
    t_menu *menu;

    menu = malloc(sizeof(t_menu));
    if (menu == NULL)
        return (NULL);
    menu->name = strdup(text);
    menu->parent = NULL;
    if (menu->name == NULL)
        free(menu);
    return (menu);
}

void addMenuAction(t_menu* m, const char* text, void(*f)())
{
    t_action    *action;
    char        *name;
    bool        full;
    int         i;

    i = 0;
    full = true;
    name = malloc(sizeof(char) *strlen(text) + 1);
    while(i < 9)
    {
        if (m -> childs[i] == NULL)
        {
            action = malloc(sizeof(t_action));
            if (action == NULL)
                sleep(10);
            strcpy(name, text);
            action->name = name;
            action->function = f;
            m -> childs[i] = action;
            full = false;  
        }
        printf("%p\n", m -> childs[i]);
        printf("%s\n", m -> childs[i] -> name);
        sleep(1);
        i++;
    }
    if (full == true)
        printf("Cant add more action to this menu !\n");
}

void addSubMenu(t_menu* m, t_menu* sm)
{
    bool        full;
    int         i;

    i = 0;
    full = true;
    if (sm -> parent != NULL)
        return ;
    sm -> parent = m;
    while(i < 9)
    {
        if (m -> childs[i] == NULL)
        {
            m -> childs[i] = sm;
            full = false;    
        }
        i++;
    }
    if (full == true)
        printf("Cant add more submenue to this menu !\n");
    
}

void deleteMenu(t_menu* m)
{
    int i;

    i = 0;
    while (i < 9)
    {
        if (m -> childs[i] != NULL)
            if (sizeof(m ->childs[i]) == sizeof(t_menu))
                deleteMenu(m -> childs[i]);
            else if (sizeof(m->childs[i]) == sizeof(t_action))
                deleteMenu(m -> childs[i]);
            else
                printf("Bizarre");
        free(m -> childs[i]);
    }
    free(m -> childs);
    free(m);
}

void f1() {
    printf("Functionality 1 is called\n");
  }
   
  void f2() {
    printf("Functionality 2 is called\n");
  }
   
  bool cont = true;
   
  void quit() {
    cont = false;
  }
   
  int main() {
    t_menu* m;
    t_menu* sm;
   
    m = createMenu("Main menu");
   
    addMenuAction(m,"Apply functionnality 1",f1);
    addMenuAction(m,"Apply functionnality 2",f2);
   
    sm = createMenu("First submenu");
    addMenuAction(sm,"Apply functionnality 2",f2);
    addSubMenu(m,sm);
   
    sm = createMenu("Second submenu");
    addMenuAction(sm,"Apply functionnality 1",f1);
    addSubMenu(m,sm);
   
    addMenuAction(m,"Quit",quit);
   
    // while(cont) launchMenu(m);
   
    // deleteMenu(m);
   
    return EXIT_SUCCESS;
  }