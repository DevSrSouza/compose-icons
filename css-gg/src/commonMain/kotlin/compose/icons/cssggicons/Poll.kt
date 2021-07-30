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

public val CssGgIcons.Poll: ImageVector
    get() {
        if (_poll != null) {
            return _poll!!
        }
        _poll = Builder(name = "Poll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 4.0f, 4.0f, 4.4477f, 4.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 19.5523f, 4.4477f, 20.0f, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 20.0f, 20.0f, 19.5523f, 20.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.4477f, 19.5523f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _poll!!
    }

private var _poll: ImageVector? = null
