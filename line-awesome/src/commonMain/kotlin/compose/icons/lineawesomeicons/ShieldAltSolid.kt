package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ShieldAltSolid: ImageVector
    get() {
        if (_shieldAltSolid != null) {
            return _shieldAltSolid!!
        }
        _shieldAltSolid = Builder(name = "ShieldAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.75f, 4.0f, 12.2344f, 4.8867f, 10.875f, 5.625f)
                curveTo(9.5156f, 6.3633f, 8.2813f, 7.0f, 6.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 8.0f)
                curveTo(5.0f, 15.7188f, 7.6094f, 20.7422f, 10.25f, 23.7813f)
                curveTo(12.8906f, 26.8203f, 15.625f, 27.9375f, 15.625f, 27.9375f)
                lineTo(16.0f, 28.0625f)
                lineTo(16.375f, 27.9375f)
                curveTo(16.375f, 27.9375f, 19.1094f, 26.8438f, 21.75f, 23.8125f)
                curveTo(24.3906f, 20.7813f, 27.0f, 15.7461f, 27.0f, 8.0f)
                lineTo(27.0f, 7.0f)
                lineTo(26.0f, 7.0f)
                curveTo(23.7305f, 7.0f, 22.4844f, 6.3633f, 21.125f, 5.625f)
                curveTo(19.7656f, 4.8867f, 18.25f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.75f, 6.0f, 18.7539f, 6.6133f, 20.1563f, 7.375f)
                curveTo(21.3398f, 8.0195f, 22.9102f, 8.6367f, 24.9375f, 8.8438f)
                curveTo(24.7461f, 15.6094f, 22.5078f, 19.9102f, 20.25f, 22.5f)
                curveTo(18.2031f, 24.8477f, 16.4844f, 25.6289f, 16.0f, 25.8438f)
                curveTo(15.5117f, 25.625f, 13.7969f, 24.8242f, 11.75f, 22.4688f)
                curveTo(9.4922f, 19.8711f, 7.2539f, 15.5781f, 7.0625f, 8.8438f)
                curveTo(9.0977f, 8.6367f, 10.6602f, 8.0195f, 11.8438f, 7.375f)
                curveTo(13.2461f, 6.6133f, 14.25f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _shieldAltSolid!!
    }

private var _shieldAltSolid: ImageVector? = null
