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

public val LineAwesomeIcons.IciclesSolid: ImageVector
    get() {
        if (_iciclesSolid != null) {
            return _iciclesSolid!!
        }
        _iciclesSolid = Builder(name = "IciclesSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 7.375f)
                lineTo(6.8125f, 7.6563f)
                curveTo(7.5469f, 8.2695f, 8.0f, 9.1563f, 8.0f, 10.125f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 22.6445f, 9.3555f, 24.0f, 11.0f, 24.0f)
                curveTo(12.6445f, 24.0f, 14.0f, 22.6445f, 14.0f, 21.0f)
                lineTo(14.0f, 18.875f)
                curveTo(14.0f, 18.1445f, 14.6602f, 17.6797f, 15.3438f, 17.9375f)
                curveTo(15.7383f, 18.0859f, 16.0f, 18.4531f, 16.0f, 18.875f)
                lineTo(16.0f, 25.0f)
                curveTo(16.0f, 26.6445f, 17.3555f, 28.0f, 19.0f, 28.0f)
                curveTo(20.6445f, 28.0f, 22.0f, 26.6445f, 22.0f, 25.0f)
                lineTo(22.0f, 16.0313f)
                curveTo(22.0f, 14.7578f, 22.9805f, 13.7969f, 24.1875f, 13.75f)
                lineTo(24.2188f, 13.75f)
                lineTo(26.0f, 14.375f)
                lineTo(26.0f, 12.0f)
                close()
                moveTo(9.8125f, 8.7188f)
                lineTo(21.5f, 12.8125f)
                curveTo(20.5938f, 13.5938f, 20.0f, 14.7305f, 20.0f, 16.0313f)
                lineTo(20.0f, 25.0f)
                curveTo(20.0f, 25.5664f, 19.5664f, 26.0f, 19.0f, 26.0f)
                curveTo(18.4336f, 26.0f, 18.0f, 25.5664f, 18.0f, 25.0f)
                lineTo(18.0f, 18.875f)
                curveTo(18.0f, 17.6289f, 17.2305f, 16.5f, 16.0625f, 16.0625f)
                curveTo(14.1328f, 15.3398f, 12.0f, 16.8125f, 12.0f, 18.875f)
                lineTo(12.0f, 21.0f)
                curveTo(12.0f, 21.5664f, 11.5664f, 22.0f, 11.0f, 22.0f)
                curveTo(10.4336f, 22.0f, 10.0f, 21.5664f, 10.0f, 21.0f)
                lineTo(10.0f, 10.125f)
                curveTo(10.0f, 9.6445f, 9.9375f, 9.1719f, 9.8125f, 8.7188f)
                close()
            }
        }
        .build()
        return _iciclesSolid!!
    }

private var _iciclesSolid: ImageVector? = null
