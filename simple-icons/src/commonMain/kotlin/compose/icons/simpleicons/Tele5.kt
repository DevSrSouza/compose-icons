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

public val SimpleIcons.Tele5: ImageVector
    get() {
        if (_tele5 != null) {
            return _tele5!!
        }
        _tele5 = Builder(name = "Tele5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.006f, 0.0f)
                verticalLineToRelative(5.027f)
                lineTo(3.83f, 5.027f)
                lineTo(3.83f, 0.0f)
                horizontalLineToRelative(-0.685f)
                verticalLineToRelative(4.18f)
                lineTo(2.23f, 4.18f)
                lineTo(2.23f, 0.074f)
                horizontalLineToRelative(-0.677f)
                lineTo(1.553f, 4.18f)
                horizontalLineToRelative(-0.87f)
                lineTo(0.683f, 0.0f)
                lineTo(0.007f, 0.0f)
                close()
                moveTo(5.629f, 0.004f)
                verticalLineToRelative(14.154f)
                horizontalLineToRelative(8.658f)
                lineTo(14.287f, 7.254f)
                horizontalLineToRelative(8.791f)
                lineTo(23.078f, 0.004f)
                lineTo(5.628f, 0.004f)
                close()
                moveTo(3.145f, 6.076f)
                verticalLineToRelative(3.9f)
                lineTo(0.005f, 9.976f)
                verticalLineToRelative(0.85f)
                lineTo(3.83f, 10.826f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-0.685f)
                close()
                moveTo(23.0f, 9.926f)
                lineTo(5.389f, 18.502f)
                curveToRelative(2.371f, 4.857f, 8.236f, 6.874f, 13.1f, 4.506f)
                verticalLineToRelative(0.002f)
                curveTo(23.352f, 20.64f, 25.372f, 14.783f, 23.0f, 9.926f)
                close()
                moveTo(0.006f, 12.129f)
                verticalLineToRelative(5.027f)
                lineTo(3.83f, 17.156f)
                lineTo(3.83f, 12.13f)
                horizontalLineToRelative(-0.685f)
                verticalLineToRelative(4.18f)
                lineTo(2.23f, 16.31f)
                verticalLineToRelative(-4.106f)
                horizontalLineToRelative(-0.677f)
                verticalLineToRelative(4.106f)
                horizontalLineToRelative(-0.87f)
                verticalLineToRelative(-4.18f)
                lineTo(0.007f, 12.13f)
                close()
                moveTo(0.006f, 18.199f)
                verticalLineToRelative(5.791f)
                horizontalLineToRelative(0.687f)
                verticalLineToRelative(-2.47f)
                lineTo(3.83f, 21.52f)
                verticalLineToRelative(-0.848f)
                lineTo(0.693f, 20.672f)
                verticalLineToRelative(-2.473f)
                lineTo(0.006f, 18.199f)
                close()
            }
        }
        .build()
        return _tele5!!
    }

private var _tele5: ImageVector? = null
