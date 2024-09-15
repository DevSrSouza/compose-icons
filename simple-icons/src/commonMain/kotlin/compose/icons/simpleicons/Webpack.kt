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

public val SimpleIcons.Webpack: ImageVector
    get() {
        if (_webpack != null) {
            return _webpack!!
        }
        _webpack = Builder(name = "Webpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.199f, 18.498f)
                lineToRelative(-9.77f, 5.502f)
                verticalLineToRelative(-4.286f)
                lineToRelative(6.087f, -3.334f)
                lineToRelative(3.683f, 2.117f)
                close()
                moveTo(22.867f, 17.895f)
                lineTo(22.867f, 6.388f)
                lineToRelative(-3.575f, 2.054f)
                verticalLineToRelative(7.396f)
                close()
                moveTo(1.801f, 18.498f)
                lineToRelative(9.77f, 5.502f)
                verticalLineToRelative(-4.286f)
                lineTo(5.484f, 16.381f)
                lineToRelative(-3.683f, 2.117f)
                close()
                moveTo(1.133f, 17.895f)
                lineTo(1.133f, 6.388f)
                lineToRelative(3.575f, 2.054f)
                verticalLineToRelative(7.396f)
                close()
                moveTo(1.551f, 5.644f)
                lineToRelative(10.02f, -5.644f)
                verticalLineToRelative(4.143f)
                lineTo(5.152f, 7.659f)
                lineToRelative(-0.049f, 0.028f)
                close()
                moveTo(22.449f, 5.644f)
                lineToRelative(-10.02f, -5.644f)
                verticalLineToRelative(4.143f)
                lineToRelative(6.419f, 3.515f)
                lineToRelative(0.049f, 0.028f)
                lineToRelative(3.552f, -2.043f)
                close()
                moveTo(11.571f, 18.74f)
                lineToRelative(-6.006f, -3.287f)
                lineTo(5.566f, 8.938f)
                lineToRelative(6.005f, 3.453f)
                verticalLineToRelative(6.349f)
                close()
                moveTo(12.429f, 18.74f)
                lineToRelative(6.005f, -3.287f)
                lineTo(18.434f, 8.938f)
                lineToRelative(-6.005f, 3.453f)
                close()
                moveTo(5.972f, 8.184f)
                lineToRelative(6.029f, -3.302f)
                lineTo(18.03f, 8.184f)
                lineToRelative(-6.029f, 3.467f)
                close()
            }
        }
        .build()
        return _webpack!!
    }

private var _webpack: ImageVector? = null
