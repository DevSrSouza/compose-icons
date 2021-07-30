package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 15.0f)
                curveTo(6.6568f, 15.0f, 8.0f, 13.6569f, 8.0f, 12.0f)
                curveTo(8.0f, 10.3431f, 6.6568f, 9.0f, 5.0f, 9.0f)
                curveTo(3.3431f, 9.0f, 2.0f, 10.3431f, 2.0f, 12.0f)
                curveTo(2.0f, 13.6569f, 3.3431f, 15.0f, 5.0f, 15.0f)
                close()
                moveTo(5.0f, 13.0f)
                curveTo(5.5523f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4477f, 5.5523f, 11.0f, 5.0f, 11.0f)
                curveTo(4.4477f, 11.0f, 4.0f, 11.4477f, 4.0f, 12.0f)
                curveTo(4.0f, 12.5523f, 4.4477f, 13.0f, 5.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.6569f, 20.6569f, 15.0f, 19.0f, 15.0f)
                curveTo(17.3431f, 15.0f, 16.0f, 13.6569f, 16.0f, 12.0f)
                curveTo(16.0f, 10.3431f, 17.3431f, 9.0f, 19.0f, 9.0f)
                curveTo(20.6569f, 9.0f, 22.0f, 10.3431f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 12.5523f, 19.5523f, 13.0f, 19.0f, 13.0f)
                curveTo(18.4477f, 13.0f, 18.0f, 12.5523f, 18.0f, 12.0f)
                curveTo(18.0f, 11.4477f, 18.4477f, 11.0f, 19.0f, 11.0f)
                curveTo(19.5523f, 11.0f, 20.0f, 11.4477f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
