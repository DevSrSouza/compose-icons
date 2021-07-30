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

public val CssGgIcons.WorkAlt: ImageVector
    get() {
        if (_workAlt != null) {
            return _workAlt!!
        }
        _workAlt = Builder(name = "WorkAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 7.0f)
                curveTo(17.0f, 5.3432f, 15.6569f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(8.3432f, 4.0f, 7.0f, 5.3432f, 7.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 7.0f, 3.0f, 8.3432f, 3.0f, 10.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 8.3432f, 19.6569f, 7.0f, 18.0f, 7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 6.0f, 9.0f, 6.4477f, 9.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 6.4477f, 14.5523f, 6.0f, 14.0f, 6.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 9.0f, 19.0f, 9.4477f, 19.0f, 10.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 18.5523f, 18.5523f, 19.0f, 18.0f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 9.4477f, 5.4477f, 9.0f, 6.0f, 9.0f)
                close()
            }
        }
        .build()
        return _workAlt!!
    }

private var _workAlt: ImageVector? = null
