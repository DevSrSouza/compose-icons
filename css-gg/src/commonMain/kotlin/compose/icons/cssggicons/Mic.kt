package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
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

public val CssGgIcons.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 4.0f)
                curveTo(9.0f, 2.343f, 10.343f, 1.0f, 12.0f, 1.0f)
                curveTo(13.657f, 1.0f, 15.0f, 2.343f, 15.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(15.0f, 13.657f, 13.657f, 15.0f, 12.0f, 15.0f)
                curveTo(10.343f, 15.0f, 9.0f, 13.657f, 9.0f, 12.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                curveTo(11.448f, 13.0f, 11.0f, 12.552f, 11.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.448f, 11.448f, 3.0f, 12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 14.973f, 15.838f, 17.441f, 13.0f, 17.917f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.917f)
                curveTo(8.162f, 17.441f, 6.0f, 14.973f, 6.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                curveTo(14.209f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
