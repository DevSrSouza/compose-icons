package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Steam: ImageVector
    get() {
        if (_steam != null) {
            return _steam!!
        }
        _steam = Builder(name = "Steam", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(10.8915f, 27.0f, 6.5986f, 23.4942f, 5.3672f, 18.7656f)
                lineTo(9.0332f, 20.3359f)
                curveTo(9.2019f, 21.8329f, 10.4579f, 23.0f, 12.0f, 23.0f)
                curveTo(13.657f, 23.0f, 15.0f, 21.657f, 15.0f, 20.0f)
                curveTo(15.0f, 19.968f, 14.9912f, 19.9373f, 14.9902f, 19.9063f)
                lineTo(19.168f, 16.9844f)
                curveTo(21.298f, 16.8944f, 23.0f, 15.152f, 23.0f, 13.0f)
                curveTo(23.0f, 10.791f, 21.209f, 9.0f, 19.0f, 9.0f)
                curveTo(16.848f, 9.0f, 15.1066f, 10.702f, 15.0176f, 12.832f)
                lineTo(12.0938f, 17.0098f)
                curveTo(12.0618f, 17.0088f, 12.032f, 17.0f, 12.0f, 17.0f)
                curveTo(11.3367f, 17.0f, 10.7291f, 17.2215f, 10.2324f, 17.5859f)
                lineTo(5.0332f, 15.3574f)
                curveTo(5.3689f, 9.592f, 10.1519f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveTo(20.657f, 10.0f, 22.0f, 11.343f, 22.0f, 13.0f)
                curveTo(22.0f, 14.657f, 20.657f, 16.0f, 19.0f, 16.0f)
                curveTo(17.343f, 16.0f, 16.0f, 14.657f, 16.0f, 13.0f)
                curveTo(16.0f, 11.343f, 17.343f, 10.0f, 19.0f, 10.0f)
                close()
                moveTo(19.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 11.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 18.895f, 14.0f, 20.0f)
                curveTo(14.0f, 21.105f, 13.105f, 22.0f, 12.0f, 22.0f)
                curveTo(11.1912f, 22.0f, 10.4988f, 21.5185f, 10.1836f, 20.8281f)
                lineTo(10.9668f, 21.1641f)
                curveTo(11.1588f, 21.2471f, 11.3596f, 21.2871f, 11.5566f, 21.2871f)
                curveTo(12.1386f, 21.2871f, 12.6935f, 20.946f, 12.9375f, 20.377f)
                curveTo(13.2635f, 19.616f, 12.9104f, 18.7342f, 12.1484f, 18.4082f)
                lineTo(11.4199f, 18.0957f)
                curveTo(11.6047f, 18.0394f, 11.7967f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _steam!!
    }

private var _steam: ImageVector? = null
