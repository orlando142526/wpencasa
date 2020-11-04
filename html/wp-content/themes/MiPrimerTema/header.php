<style type="text/css">
    #header {
        color: purple;
        background-color: #d8da3d }
</style>

<div id="header">
    <div id="headerimg">
        <h1>
            <a href="<?php echo get_option('home'); ?>">
                <?php bloginfo('name'); ?></a>
        </h1>
        <div class="description">
            <?php bloginfo('description'); ?>
            <br>
            <img src="<?php bloginfo('stylesheet_directory'); ?>/Imágenes/totoro.jpg">
        </div>
    </div>
</div>

