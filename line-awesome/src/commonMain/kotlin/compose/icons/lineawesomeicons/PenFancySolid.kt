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

public val LineAwesomeIcons.PenFancySolid: ImageVector
    get() {
        if (_penFancySolid != null) {
            return _penFancySolid!!
        }
        _penFancySolid = Builder(name = "PenFancySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8125f, 4.0313f)
                curveTo(22.7227f, 4.0313f, 21.6133f, 4.4492f, 20.7813f, 5.2813f)
                lineTo(11.5f, 14.5625f)
                lineTo(6.0313f, 16.6563f)
                lineTo(5.5f, 16.875f)
                lineTo(5.4063f, 17.4375f)
                lineTo(4.0f, 26.8438f)
                lineTo(3.8125f, 28.1875f)
                lineTo(5.1563f, 28.0f)
                lineTo(14.5625f, 26.5938f)
                lineTo(15.125f, 26.5f)
                lineTo(15.3438f, 25.9688f)
                lineTo(17.3125f, 20.7813f)
                lineTo(17.8125f, 20.3125f)
                lineTo(26.8125f, 11.3125f)
                curveTo(28.4258f, 9.6992f, 28.457f, 7.1094f, 26.9375f, 5.4375f)
                lineTo(26.8125f, 5.2813f)
                curveTo(25.9805f, 4.4492f, 24.9023f, 4.0313f, 23.8125f, 4.0313f)
                close()
                moveTo(23.8125f, 6.0f)
                curveTo(24.375f, 6.0f, 24.9375f, 6.25f, 25.4063f, 6.7188f)
                curveTo(26.3438f, 7.6563f, 26.3438f, 8.9688f, 25.4063f, 9.9063f)
                lineTo(20.375f, 14.9375f)
                lineTo(17.1875f, 11.75f)
                lineTo(22.2188f, 6.7188f)
                curveTo(22.6875f, 6.25f, 23.25f, 6.0f, 23.8125f, 6.0f)
                close()
                moveTo(15.75f, 13.1875f)
                lineTo(18.9375f, 16.375f)
                lineTo(17.125f, 18.1875f)
                lineTo(13.9375f, 15.0f)
                close()
                moveTo(12.4063f, 16.3438f)
                lineTo(12.4375f, 16.3438f)
                lineTo(15.6563f, 19.5625f)
                lineTo(13.6875f, 24.7188f)
                lineTo(7.8438f, 25.5625f)
                lineTo(10.5313f, 22.875f)
                curveTo(10.5859f, 22.8789f, 10.6328f, 22.9063f, 10.6875f, 22.9063f)
                curveTo(11.5703f, 22.9063f, 12.3125f, 22.1953f, 12.3125f, 21.3125f)
                curveTo(12.3125f, 20.4297f, 11.5703f, 19.6875f, 10.6875f, 19.6875f)
                curveTo(9.8047f, 19.6875f, 9.0938f, 20.4297f, 9.0938f, 21.3125f)
                curveTo(9.0938f, 21.3672f, 9.1211f, 21.4141f, 9.125f, 21.4688f)
                lineTo(6.4375f, 24.1563f)
                lineTo(7.2813f, 18.3125f)
                close()
            }
        }
        .build()
        return _penFancySolid!!
    }

private var _penFancySolid: ImageVector? = null
