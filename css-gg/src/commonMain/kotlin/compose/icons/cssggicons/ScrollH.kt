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

public val CssGgIcons.ScrollH: ImageVector
    get() {
        if (_scrollH != null) {
            return _scrollH!!
        }
        _scrollH = Builder(name = "ScrollH", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1819f, 9.1715f)
                lineTo(5.7677f, 7.7573f)
                lineTo(1.525f, 12.0f)
                lineTo(5.7677f, 16.2426f)
                lineTo(7.1819f, 14.8284f)
                lineTo(4.3534f, 12.0f)
                lineTo(7.1819f, 9.1715f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8181f, 14.8284f)
                lineTo(18.2323f, 16.2426f)
                lineTo(22.4749f, 12.0f)
                lineTo(18.2323f, 7.7573f)
                lineTo(16.8181f, 9.1715f)
                lineTo(19.6465f, 12.0f)
                lineTo(16.8181f, 14.8284f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.9999f, 12.0f)
                curveTo(14.9999f, 13.6569f, 13.6567f, 15.0f, 11.9999f, 15.0f)
                curveTo(10.343f, 15.0f, 8.9999f, 13.6569f, 8.9999f, 12.0f)
                curveTo(8.9999f, 10.3431f, 10.343f, 9.0f, 11.9999f, 9.0f)
                curveTo(13.6567f, 9.0f, 14.9999f, 10.3431f, 14.9999f, 12.0f)
                close()
                moveTo(12.9999f, 12.0f)
                curveTo(12.9999f, 12.5523f, 12.5522f, 13.0f, 11.9999f, 13.0f)
                curveTo(11.4476f, 13.0f, 10.9999f, 12.5523f, 10.9999f, 12.0f)
                curveTo(10.9999f, 11.4477f, 11.4476f, 11.0f, 11.9999f, 11.0f)
                curveTo(12.5522f, 11.0f, 12.9999f, 11.4477f, 12.9999f, 12.0f)
                close()
            }
        }
        .build()
        return _scrollH!!
    }

private var _scrollH: ImageVector? = null
