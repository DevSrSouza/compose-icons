package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Data: ImageVector
    get() {
        if (_data != null) {
            return _data!!
        }
        _data = Builder(name = "Data", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.889f)
                curveTo(13.657f, 8.889f, 15.0f, 10.232f, 15.0f, 11.889f)
                curveTo(15.0f, 13.195f, 14.165f, 14.307f, 13.0f, 14.719f)
                verticalLineTo(19.889f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.719f)
                curveTo(9.835f, 14.307f, 9.0f, 13.195f, 9.0f, 11.889f)
                curveTo(9.0f, 10.232f, 10.343f, 8.889f, 12.0f, 8.889f)
                close()
                moveTo(12.0f, 10.889f)
                curveTo(12.552f, 10.889f, 13.0f, 11.337f, 13.0f, 11.889f)
                curveTo(13.0f, 12.441f, 12.552f, 12.889f, 12.0f, 12.889f)
                curveTo(11.448f, 12.889f, 11.0f, 12.441f, 11.0f, 11.889f)
                curveTo(11.0f, 11.337f, 11.448f, 10.889f, 12.0f, 10.889f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 6.939f)
                curveTo(5.783f, 8.206f, 5.0f, 9.956f, 5.0f, 11.889f)
                curveTo(5.0f, 14.067f, 5.994f, 16.012f, 7.554f, 17.296f)
                lineTo(8.977f, 15.872f)
                curveTo(7.776f, 14.959f, 7.0f, 13.515f, 7.0f, 11.889f)
                curveTo(7.0f, 10.508f, 7.56f, 9.258f, 8.464f, 8.354f)
                lineTo(7.05f, 6.939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.535f, 8.353f)
                curveTo(16.44f, 9.258f, 17.0f, 10.508f, 17.0f, 11.889f)
                curveTo(17.0f, 13.515f, 16.224f, 14.959f, 15.023f, 15.872f)
                lineTo(16.446f, 17.296f)
                curveTo(18.006f, 16.012f, 19.0f, 14.067f, 19.0f, 11.889f)
                curveTo(19.0f, 9.956f, 18.216f, 8.206f, 16.95f, 6.939f)
                lineTo(15.535f, 8.353f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 11.889f)
                curveTo(1.0f, 8.852f, 2.231f, 6.102f, 4.222f, 4.111f)
                lineTo(5.636f, 5.525f)
                curveTo(4.007f, 7.154f, 3.0f, 9.404f, 3.0f, 11.889f)
                curveTo(3.0f, 14.374f, 4.007f, 16.624f, 5.636f, 18.253f)
                lineTo(4.222f, 19.667f)
                curveTo(2.231f, 17.677f, 1.0f, 14.927f, 1.0f, 11.889f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 19.667f)
                curveTo(21.769f, 17.677f, 23.0f, 14.927f, 23.0f, 11.889f)
                curveTo(23.0f, 8.851f, 21.769f, 6.101f, 19.778f, 4.111f)
                lineTo(18.364f, 5.525f)
                curveTo(19.993f, 7.154f, 21.0f, 9.404f, 21.0f, 11.889f)
                curveTo(21.0f, 14.374f, 19.993f, 16.624f, 18.364f, 18.253f)
                lineTo(19.778f, 19.667f)
                close()
            }
        }
        .build()
        return _data!!
    }

private var _data: ImageVector? = null
