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

public val LineAwesomeIcons.GlassesSolid: ImageVector
    get() {
        if (_glassesSolid != null) {
            return _glassesSolid!!
        }
        _glassesSolid = Builder(name = "GlassesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0625f, 6.0f)
                lineTo(4.8125f, 6.6563f)
                lineTo(1.3125f, 16.0f)
                lineTo(0.0f, 16.0f)
                lineTo(0.0f, 18.0f)
                lineTo(1.0f, 18.0f)
                lineTo(1.0f, 20.0f)
                curveTo(1.0f, 23.2969f, 3.7031f, 26.0f, 7.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                curveTo(12.2969f, 26.0f, 15.0f, 23.2969f, 15.0f, 20.0f)
                lineTo(15.0f, 17.0f)
                curveTo(15.0f, 16.4336f, 15.4336f, 16.0f, 16.0f, 16.0f)
                curveTo(16.5664f, 16.0f, 17.0f, 16.4336f, 17.0f, 17.0f)
                lineTo(17.0f, 20.0f)
                curveTo(17.0f, 23.2969f, 19.7031f, 26.0f, 23.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                curveTo(28.2969f, 26.0f, 31.0f, 23.2969f, 31.0f, 20.0f)
                lineTo(31.0f, 18.0f)
                lineTo(32.0f, 18.0f)
                lineTo(32.0f, 16.0f)
                lineTo(30.6875f, 16.0f)
                lineTo(27.1875f, 6.6563f)
                lineTo(26.9375f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(24.7188f, 6.375f)
                lineTo(22.2188f, 9.375f)
                lineTo(23.7813f, 10.625f)
                lineTo(25.6875f, 8.3125f)
                lineTo(28.5625f, 16.0f)
                lineTo(18.8125f, 16.0f)
                curveTo(18.3945f, 14.8438f, 17.293f, 14.0f, 16.0f, 14.0f)
                curveTo(14.707f, 14.0f, 13.6055f, 14.8438f, 13.1875f, 16.0f)
                lineTo(3.4375f, 16.0f)
                lineTo(6.3125f, 8.3125f)
                lineTo(8.2188f, 10.625f)
                lineTo(9.7813f, 9.375f)
                lineTo(7.2813f, 6.375f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(3.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 20.0f)
                curveTo(13.0f, 22.2031f, 11.2031f, 24.0f, 9.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                curveTo(4.7969f, 24.0f, 3.0f, 22.2031f, 3.0f, 20.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 20.0f)
                curveTo(29.0f, 22.2031f, 27.2031f, 24.0f, 25.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                curveTo(20.7969f, 24.0f, 19.0f, 22.2031f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _glassesSolid!!
    }

private var _glassesSolid: ImageVector? = null
