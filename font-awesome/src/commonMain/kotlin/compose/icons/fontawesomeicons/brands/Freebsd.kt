package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Freebsd: ImageVector
    get() {
        if (_freebsd != null) {
            return _freebsd!!
        }
        _freebsd = Builder(name = "Freebsd", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(303.7f, 96.2f)
                curveToRelative(11.1f, -11.1f, 115.5f, -77.0f, 139.2f, -53.2f)
                curveToRelative(23.7f, 23.7f, -42.1f, 128.1f, -53.2f, 139.2f)
                curveToRelative(-11.1f, 11.1f, -39.4f, 0.9f, -63.1f, -22.9f)
                curveToRelative(-23.8f, -23.7f, -34.1f, -52.0f, -22.9f, -63.1f)
                close()
                moveTo(109.9f, 68.1f)
                curveTo(73.6f, 47.5f, 22.0f, 24.6f, 5.6f, 41.1f)
                curveToRelative(-16.6f, 16.6f, 7.1f, 69.4f, 27.9f, 105.7f)
                curveToRelative(18.5f, -32.2f, 44.8f, -59.3f, 76.4f, -78.7f)
                close()
                moveTo(406.7f, 174.0f)
                curveToRelative(3.3f, 11.3f, 2.7f, 20.7f, -2.7f, 26.1f)
                curveToRelative(-20.3f, 20.3f, -87.5f, -27.0f, -109.3f, -70.1f)
                curveToRelative(-18.0f, -32.3f, -11.1f, -53.4f, 14.9f, -48.7f)
                curveToRelative(5.7f, -3.6f, 12.3f, -7.6f, 19.6f, -11.6f)
                curveToRelative(-29.8f, -15.5f, -63.6f, -24.3f, -99.5f, -24.3f)
                curveToRelative(-119.1f, 0.0f, -215.6f, 96.5f, -215.6f, 215.6f)
                curveToRelative(0.0f, 119.0f, 96.5f, 215.6f, 215.6f, 215.6f)
                reflectiveCurveTo(445.3f, 380.1f, 445.3f, 261.0f)
                curveToRelative(0.0f, -38.4f, -10.1f, -74.5f, -27.7f, -105.8f)
                curveToRelative(-3.9f, 7.0f, -7.6f, 13.3f, -10.9f, 18.8f)
                close()
            }
        }
        .build()
        return _freebsd!!
    }

private var _freebsd: ImageVector? = null
