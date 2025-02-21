char *ft_strcpy(char *str)
{
    char *new_str;
    int size;
    int i;
    
    size = ft_strlen(str);
    new_str = malloc(sizeof(char) * size + 1);

    while (str[i])
    {
        str[i] = new_str[i];
        i++;
    }
    new_str[i] = '\0';
    return (new_str);
}