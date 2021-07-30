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

public val CssGgIcons.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 12.0f)
                lineTo(16.2426f, 13.4142f)
                lineTo(19.071f, 10.5858f)
                curveTo(20.6331f, 9.0237f, 20.6331f, 6.491f, 19.071f, 4.9289f)
                curveTo(17.509f, 3.3668f, 14.9763f, 3.3668f, 13.4142f, 4.9289f)
                lineTo(10.5858f, 7.7573f)
                lineTo(12.0f, 9.1715f)
                lineTo(14.8284f, 6.3431f)
                curveTo(15.6095f, 5.5621f, 16.8758f, 5.5621f, 17.6568f, 6.3431f)
                curveTo(18.4379f, 7.1242f, 18.4379f, 8.3905f, 17.6568f, 9.1715f)
                lineTo(14.8284f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.8285f)
                lineTo(13.4142f, 16.2427f)
                lineTo(10.5858f, 19.0711f)
                curveTo(9.0237f, 20.6332f, 6.4911f, 20.6332f, 4.929f, 19.0711f)
                curveTo(3.3669f, 17.509f, 3.3669f, 14.9764f, 4.929f, 13.4143f)
                lineTo(7.7574f, 10.5858f)
                lineTo(9.1716f, 12.0f)
                lineTo(6.3432f, 14.8285f)
                curveTo(5.5621f, 15.6095f, 5.5621f, 16.8758f, 6.3432f, 17.6569f)
                curveTo(7.1242f, 18.4379f, 8.3905f, 18.4379f, 9.1716f, 17.6569f)
                lineTo(12.0f, 14.8285f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8285f, 10.5857f)
                curveTo(15.219f, 10.1952f, 15.219f, 9.562f, 14.8285f, 9.1715f)
                curveTo(14.4379f, 8.7809f, 13.8048f, 8.7809f, 13.4142f, 9.1715f)
                lineTo(9.1716f, 13.4141f)
                curveTo(8.7811f, 13.8046f, 8.7811f, 14.4378f, 9.1716f, 14.8283f)
                curveTo(9.5621f, 15.2188f, 10.1953f, 15.2188f, 10.5858f, 14.8283f)
                lineTo(14.8285f, 10.5857f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
