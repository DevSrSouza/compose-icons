package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.071f, 19.071f)
                curveTo(22.976f, 15.166f, 22.976f, 8.834f, 19.071f, 4.929f)
                curveTo(15.166f, 1.024f, 8.834f, 1.024f, 4.929f, 4.929f)
                curveTo(1.024f, 8.834f, 1.024f, 15.166f, 4.929f, 19.071f)
                curveTo(8.834f, 22.976f, 15.166f, 22.976f, 19.071f, 19.071f)
                close()
                moveTo(19.943f, 11.041f)
                curveTo(19.736f, 9.324f, 18.975f, 7.661f, 17.657f, 6.343f)
                curveTo(16.334f, 5.021f, 14.664f, 4.258f, 12.94f, 4.055f)
                lineTo(12.93f, 4.111f)
                curveTo(12.109f, 8.583f, 8.583f, 12.109f, 4.111f, 12.93f)
                lineTo(4.055f, 12.94f)
                curveTo(4.258f, 14.664f, 5.021f, 16.334f, 6.343f, 17.657f)
                curveTo(7.661f, 18.975f, 9.324f, 19.736f, 11.041f, 19.943f)
                curveTo(11.045f, 19.919f, 11.049f, 19.896f, 11.053f, 19.872f)
                curveTo(11.875f, 15.4f, 15.4f, 11.875f, 19.872f, 11.053f)
                curveTo(19.896f, 11.049f, 19.919f, 11.045f, 19.943f, 11.041f)
                close()
                moveTo(19.872f, 13.429f)
                verticalLineTo(13.095f)
                curveTo(16.507f, 13.859f, 13.859f, 16.507f, 13.095f, 19.872f)
                horizontalLineTo(13.429f)
                curveTo(14.978f, 19.592f, 16.46f, 18.854f, 17.657f, 17.657f)
                curveTo(18.854f, 16.46f, 19.592f, 14.978f, 19.872f, 13.429f)
                close()
                moveTo(4.111f, 10.888f)
                lineTo(4.111f, 10.666f)
                curveTo(4.378f, 9.083f, 5.122f, 7.565f, 6.343f, 6.343f)
                curveTo(7.565f, 5.122f, 9.083f, 4.378f, 10.666f, 4.111f)
                lineTo(10.888f, 4.111f)
                curveTo(10.125f, 7.476f, 7.476f, 10.125f, 4.111f, 10.888f)
                close()
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
