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

public val CssGgIcons.Boy: ImageVector
    get() {
        if (_boy != null) {
            return _boy!!
        }
        _boy = Builder(name = "Boy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 13.5523f, 10.0f, 13.0f)
                curveTo(10.0f, 12.4477f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 12.4477f, 8.0f, 13.0f)
                curveTo(8.0f, 13.5523f, 8.4477f, 14.0f, 9.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                curveTo(16.0f, 13.5523f, 15.5523f, 14.0f, 15.0f, 14.0f)
                curveTo(14.4477f, 14.0f, 14.0f, 13.5523f, 14.0f, 13.0f)
                curveTo(14.0f, 12.4477f, 14.4477f, 12.0f, 15.0f, 12.0f)
                curveTo(15.5523f, 12.0f, 16.0f, 12.4477f, 16.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 11.1637f, 19.8717f, 10.3574f, 19.6337f, 9.5997f)
                curveTo(18.7991f, 9.8256f, 17.9212f, 9.946f, 17.0152f, 9.946f)
                curveTo(13.2921f, 9.946f, 10.0442f, 7.9114f, 8.3228f, 4.8933f)
                curveTo(5.7547f, 6.2249f, 4.0f, 8.9075f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _boy!!
    }

private var _boy: ImageVector? = null
