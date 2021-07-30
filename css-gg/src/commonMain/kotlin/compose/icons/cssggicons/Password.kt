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

public val CssGgIcons.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 5.5523f, 13.0f, 5.0f, 13.0f)
                curveTo(4.4477f, 13.0f, 4.0f, 12.5523f, 4.0f, 12.0f)
                curveTo(4.0f, 11.4477f, 4.4477f, 11.0f, 5.0f, 11.0f)
                curveTo(5.5523f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                curveTo(9.5523f, 13.0f, 10.0f, 12.5523f, 10.0f, 12.0f)
                curveTo(10.0f, 11.4477f, 9.5523f, 11.0f, 9.0f, 11.0f)
                curveTo(8.4477f, 11.0f, 8.0f, 11.4477f, 8.0f, 12.0f)
                curveTo(8.0f, 12.5523f, 8.4477f, 13.0f, 9.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 12.5523f, 13.5523f, 13.0f, 13.0f, 13.0f)
                curveTo(12.4477f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
                curveTo(12.0f, 11.4477f, 12.4477f, 11.0f, 13.0f, 11.0f)
                curveTo(13.5523f, 11.0f, 14.0f, 11.4477f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 6.0f)
                curveTo(0.8954f, 6.0f, 0.0f, 6.8954f, 0.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(0.0f, 17.1046f, 0.8954f, 18.0f, 2.0f, 18.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1046f, 18.0f, 24.0f, 17.1046f, 24.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(24.0f, 6.8954f, 23.1046f, 6.0f, 22.0f, 6.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(22.0f, 8.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
