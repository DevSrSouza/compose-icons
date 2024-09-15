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
                moveTo(14.828f, 12.0f)
                lineTo(16.243f, 13.414f)
                lineTo(19.071f, 10.586f)
                curveTo(20.633f, 9.024f, 20.633f, 6.491f, 19.071f, 4.929f)
                curveTo(17.509f, 3.367f, 14.976f, 3.367f, 13.414f, 4.929f)
                lineTo(10.586f, 7.757f)
                lineTo(12.0f, 9.172f)
                lineTo(14.828f, 6.343f)
                curveTo(15.609f, 5.562f, 16.876f, 5.562f, 17.657f, 6.343f)
                curveTo(18.438f, 7.124f, 18.438f, 8.39f, 17.657f, 9.172f)
                lineTo(14.828f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.828f)
                lineTo(13.414f, 16.243f)
                lineTo(10.586f, 19.071f)
                curveTo(9.024f, 20.633f, 6.491f, 20.633f, 4.929f, 19.071f)
                curveTo(3.367f, 17.509f, 3.367f, 14.976f, 4.929f, 13.414f)
                lineTo(7.757f, 10.586f)
                lineTo(9.172f, 12.0f)
                lineTo(6.343f, 14.828f)
                curveTo(5.562f, 15.609f, 5.562f, 16.876f, 6.343f, 17.657f)
                curveTo(7.124f, 18.438f, 8.391f, 18.438f, 9.172f, 17.657f)
                lineTo(12.0f, 14.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 10.586f)
                curveTo(15.219f, 10.195f, 15.219f, 9.562f, 14.828f, 9.171f)
                curveTo(14.438f, 8.781f, 13.805f, 8.781f, 13.414f, 9.171f)
                lineTo(9.172f, 13.414f)
                curveTo(8.781f, 13.805f, 8.781f, 14.438f, 9.172f, 14.828f)
                curveTo(9.562f, 15.219f, 10.195f, 15.219f, 10.586f, 14.828f)
                lineTo(14.828f, 10.586f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
