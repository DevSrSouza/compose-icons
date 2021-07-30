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

public val CssGgIcons.Browser: ImageVector
    get() {
        if (_browser != null) {
            return _browser!!
        }
        _browser = Builder(name = "Browser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                curveTo(4.5523f, 8.0f, 5.0f, 7.5523f, 5.0f, 7.0f)
                curveTo(5.0f, 6.4477f, 4.5523f, 6.0f, 4.0f, 6.0f)
                curveTo(3.4477f, 6.0f, 3.0f, 6.4477f, 3.0f, 7.0f)
                curveTo(3.0f, 7.5523f, 3.4477f, 8.0f, 4.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                curveTo(8.0f, 7.5523f, 7.5523f, 8.0f, 7.0f, 8.0f)
                curveTo(6.4477f, 8.0f, 6.0f, 7.5523f, 6.0f, 7.0f)
                curveTo(6.0f, 6.4477f, 6.4477f, 6.0f, 7.0f, 6.0f)
                curveTo(7.5523f, 6.0f, 8.0f, 6.4477f, 8.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(10.5523f, 8.0f, 11.0f, 7.5523f, 11.0f, 7.0f)
                curveTo(11.0f, 6.4477f, 10.5523f, 6.0f, 10.0f, 6.0f)
                curveTo(9.4477f, 6.0f, 9.0f, 6.4477f, 9.0f, 7.0f)
                curveTo(9.0f, 7.5523f, 9.4477f, 8.0f, 10.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                curveTo(1.3432f, 3.0f, 0.0f, 4.3432f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 19.6569f, 1.3432f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.6569f, 21.0f, 24.0f, 19.6569f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.3432f, 22.6569f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 5.0f, 2.0f, 5.4477f, 2.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(2.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.5523f, 21.5523f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                close()
            }
        }
        .build()
        return _browser!!
    }

private var _browser: ImageVector? = null
