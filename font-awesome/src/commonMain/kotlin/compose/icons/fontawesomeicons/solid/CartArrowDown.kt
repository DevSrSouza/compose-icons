package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CartArrowDown: ImageVector
    get() {
        if (_cartArrowDown != null) {
            return _cartArrowDown!!
        }
        _cartArrowDown = Builder(name = "CartArrowDown", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.717f, 320.0f)
                horizontalLineTo(211.572f)
                lineToRelative(6.545f, 32.0f)
                horizontalLineToRelative(268.418f)
                curveToRelative(15.401f, 0.0f, 26.816f, 14.301f, 23.403f, 29.319f)
                lineToRelative(-5.517f, 24.276f)
                curveTo(523.112f, 414.668f, 536.0f, 433.828f, 536.0f, 456.0f)
                curveToRelative(0.0f, 31.202f, -25.519f, 56.444f, -56.824f, 55.994f)
                curveToRelative(-29.823f, -0.429f, -54.35f, -24.631f, -55.155f, -54.447f)
                curveToRelative(-0.44f, -16.287f, 6.085f, -31.049f, 16.803f, -41.548f)
                horizontalLineTo(231.176f)
                curveTo(241.553f, 426.165f, 248.0f, 440.326f, 248.0f, 456.0f)
                curveToRelative(0.0f, 31.813f, -26.528f, 57.431f, -58.67f, 55.938f)
                curveToRelative(-28.54f, -1.325f, -51.751f, -24.385f, -53.251f, -52.917f)
                curveToRelative(-1.158f, -22.034f, 10.436f, -41.455f, 28.051f, -51.586f)
                lineTo(93.883f, 64.0f)
                horizontalLineTo(24.0f)
                curveTo(10.745f, 64.0f, 0.0f, 53.255f, 0.0f, 40.0f)
                verticalLineTo(24.0f)
                curveTo(0.0f, 10.745f, 10.745f, 0.0f, 24.0f, 0.0f)
                horizontalLineToRelative(102.529f)
                curveToRelative(11.401f, 0.0f, 21.228f, 8.021f, 23.513f, 19.19f)
                lineTo(159.208f, 64.0f)
                horizontalLineTo(551.99f)
                curveToRelative(15.401f, 0.0f, 26.816f, 14.301f, 23.403f, 29.319f)
                lineToRelative(-47.273f, 208.0f)
                curveTo(525.637f, 312.246f, 515.923f, 320.0f, 504.717f, 320.0f)
                close()
                moveTo(403.029f, 192.0f)
                horizontalLineTo(360.0f)
                verticalLineToRelative(-60.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-24.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(-43.029f)
                curveToRelative(-10.691f, 0.0f, -16.045f, 12.926f, -8.485f, 20.485f)
                lineToRelative(67.029f, 67.029f)
                curveToRelative(4.686f, 4.686f, 12.284f, 4.686f, 16.971f, 0.0f)
                lineToRelative(67.029f, -67.029f)
                curveToRelative(7.559f, -7.559f, 2.205f, -20.485f, -8.486f, -20.485f)
                close()
            }
        }
        .build()
        return _cartArrowDown!!
    }

private var _cartArrowDown: ImageVector? = null
