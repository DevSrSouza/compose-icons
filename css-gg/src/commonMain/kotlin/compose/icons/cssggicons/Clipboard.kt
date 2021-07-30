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

public val CssGgIcons.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(7.4477f, 11.0f, 7.0f, 11.4477f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 7.4477f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(15.9595f)
                curveTo(16.5118f, 13.0f, 16.9595f, 12.5523f, 16.9595f, 12.0f)
                curveTo(16.9595f, 11.4477f, 16.5118f, 11.0f, 15.9595f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0405f, 15.0665f)
                curveTo(7.4882f, 15.0665f, 7.0405f, 15.5142f, 7.0405f, 16.0665f)
                curveTo(7.0405f, 16.6188f, 7.4882f, 17.0665f, 8.0405f, 17.0665f)
                horizontalLineTo(16.0f)
                curveTo(16.5523f, 17.0665f, 17.0f, 16.6188f, 17.0f, 16.0665f)
                curveTo(17.0f, 15.5142f, 16.5523f, 15.0665f, 16.0f, 15.0665f)
                horizontalLineTo(8.0405f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 3.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 21.0f, 21.0f, 20.1046f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.8954f, 20.1046f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 7.6568f, 15.6569f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(8.3432f, 9.0f, 7.0f, 7.6568f, 7.0f, 6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 6.5523f, 9.4477f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 7.0f, 15.0f, 6.5523f, 15.0f, 6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
