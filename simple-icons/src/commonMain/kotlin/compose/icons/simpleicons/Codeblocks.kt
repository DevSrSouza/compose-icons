package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Codeblocks: ImageVector
    get() {
        if (_codeblocks != null) {
            return _codeblocks!!
        }
        _codeblocks = Builder(name = "Codeblocks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.011f, 0.0f)
                verticalLineToRelative(8.406f)
                lineTo(8.61f, 8.406f)
                lineTo(8.61f, 0.0f)
                close()
                moveTo(15.401f, 0.0f)
                verticalLineToRelative(8.406f)
                lineTo(24.0f, 8.406f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(8.972f, 0.658f)
                lineToRelative(0.012f, 7.869f)
                lineToRelative(2.54f, 2.43f)
                lineToRelative(0.007f, -5.564f)
                close()
                moveTo(15.038f, 0.658f)
                lineTo(12.483f, 5.393f)
                lineTo(12.487f, 10.957f)
                lineTo(15.027f, 8.527f)
                close()
                moveTo(0.332f, 8.768f)
                lineToRelative(5.52f, 2.677f)
                lineToRelative(5.655f, -0.006f)
                lineToRelative(-2.773f, -2.67f)
                close()
                moveTo(15.276f, 8.768f)
                lineTo(12.53f, 11.49f)
                lineToRelative(5.655f, -0.09f)
                lineToRelative(5.498f, -2.631f)
                close()
                moveTo(5.953f, 12.623f)
                lineTo(0.318f, 15.232f)
                horizontalLineToRelative(8.405f)
                lineToRelative(2.748f, -2.722f)
                close()
                moveTo(12.518f, 12.51f)
                lineTo(15.265f, 15.232f)
                horizontalLineToRelative(8.402f)
                lineToRelative(-5.586f, -2.609f)
                close()
                moveTo(11.512f, 13.043f)
                lineTo(8.972f, 15.473f)
                lineTo(8.961f, 23.346f)
                lineTo(11.516f, 18.606f)
                close()
                moveTo(12.476f, 13.043f)
                lineTo(12.468f, 18.607f)
                lineTo(15.027f, 23.347f)
                lineTo(15.016f, 15.473f)
                close()
                moveTo(0.0f, 15.598f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(8.598f)
                verticalLineToRelative(-8.402f)
                close()
                moveTo(15.39f, 15.598f)
                lineTo(15.39f, 24.0f)
                horizontalLineToRelative(8.598f)
                verticalLineToRelative(-8.402f)
                close()
            }
        }
        .build()
        return _codeblocks!!
    }

private var _codeblocks: ImageVector? = null
