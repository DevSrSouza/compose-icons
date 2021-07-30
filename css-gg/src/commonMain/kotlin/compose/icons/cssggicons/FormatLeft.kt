package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.FormatLeft: ImageVector
    get() {
        if (_formatLeft != null) {
            return _formatLeft!!
        }
        _formatLeft = Builder(name = "FormatLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                curveTo(3.4477f, 5.0f, 3.0f, 5.4477f, 3.0f, 6.0f)
                curveTo(3.0f, 6.5523f, 3.4477f, 7.0f, 4.0f, 7.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 7.0f, 21.0f, 6.5523f, 21.0f, 6.0f)
                curveTo(21.0f, 5.4477f, 20.5523f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                curveTo(3.4477f, 9.0f, 3.0f, 9.4477f, 3.0f, 10.0f)
                curveTo(3.0f, 10.5523f, 3.4477f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 11.0f, 13.0f, 10.5523f, 13.0f, 10.0f)
                curveTo(13.0f, 9.4477f, 12.5523f, 9.0f, 12.0f, 9.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                curveTo(3.0f, 13.4477f, 3.4477f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 13.4477f, 21.0f, 14.0f)
                curveTo(21.0f, 14.5523f, 20.5523f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 15.0f, 3.0f, 14.5523f, 3.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 17.0f)
                curveTo(3.4477f, 17.0f, 3.0f, 17.4477f, 3.0f, 18.0f)
                curveTo(3.0f, 18.5523f, 3.4477f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(12.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                curveTo(13.0f, 17.4477f, 12.5523f, 17.0f, 12.0f, 17.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _formatLeft!!
    }

private var _formatLeft: ImageVector? = null
