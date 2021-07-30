package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                curveTo(19.6569f, 9.0f, 21.0f, 7.6568f, 21.0f, 6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                curveTo(16.3431f, 3.0f, 15.0f, 4.3432f, 15.0f, 6.0f)
                curveTo(15.0f, 6.1255f, 15.0077f, 6.2492f, 15.0227f, 6.3706f)
                lineTo(8.0826f, 9.8407f)
                curveTo(7.543f, 9.3202f, 6.8089f, 9.0f, 6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 10.3431f, 3.0f, 12.0f)
                curveTo(3.0f, 13.6569f, 4.3432f, 15.0f, 6.0f, 15.0f)
                curveTo(6.8089f, 15.0f, 7.543f, 14.6798f, 8.0826f, 14.1593f)
                lineTo(15.0227f, 17.6294f)
                curveTo(15.0077f, 17.7508f, 15.0f, 17.8745f, 15.0f, 18.0f)
                curveTo(15.0f, 19.6569f, 16.3431f, 21.0f, 18.0f, 21.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                curveTo(21.0f, 16.3431f, 19.6569f, 15.0f, 18.0f, 15.0f)
                curveTo(17.1911f, 15.0f, 16.457f, 15.3202f, 15.9174f, 15.8407f)
                lineTo(8.9773f, 12.3706f)
                curveTo(8.9923f, 12.2492f, 9.0f, 12.1255f, 9.0f, 12.0f)
                curveTo(9.0f, 11.8745f, 8.9923f, 11.7508f, 8.9773f, 11.6294f)
                lineTo(15.9174f, 8.1593f)
                curveTo(16.457f, 8.6798f, 17.1911f, 9.0f, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
