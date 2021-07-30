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

public val LineAwesomeIcons.BrushSolid: ImageVector
    get() {
        if (_brushSolid != null) {
            return _brushSolid!!
        }
        _brushSolid = Builder(name = "BrushSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0313f)
                lineTo(18.2813f, 2.7188f)
                lineTo(12.7188f, 8.3125f)
                lineTo(12.0f, 9.0f)
                lineTo(11.0f, 10.0f)
                lineTo(8.7188f, 12.3125f)
                lineTo(8.1563f, 12.875f)
                lineTo(8.5938f, 13.5625f)
                curveTo(8.5938f, 13.5625f, 9.2031f, 14.5f, 9.6875f, 15.5313f)
                curveTo(9.9297f, 16.0469f, 10.1484f, 16.5938f, 10.2188f, 16.9688f)
                curveTo(10.2539f, 17.1563f, 10.2578f, 17.2695f, 10.25f, 17.3125f)
                curveTo(10.1406f, 17.3984f, 8.8242f, 18.4414f, 7.25f, 19.7188f)
                curveTo(5.6094f, 21.0469f, 3.8672f, 22.4453f, 3.1563f, 23.1563f)
                curveTo(1.6016f, 24.7109f, 1.6016f, 27.2578f, 3.1563f, 28.8125f)
                curveTo(4.7031f, 30.3594f, 7.2266f, 30.3477f, 8.7813f, 28.8125f)
                lineTo(8.8125f, 28.8125f)
                curveTo(9.5273f, 28.0977f, 10.9609f, 26.3828f, 12.2813f, 24.75f)
                curveTo(13.5703f, 23.1563f, 14.6563f, 21.8008f, 14.7188f, 21.7188f)
                curveTo(14.7148f, 21.7227f, 14.7617f, 21.6563f, 15.125f, 21.7188f)
                curveTo(15.4883f, 21.7813f, 16.0039f, 21.9688f, 16.5f, 22.2188f)
                curveTo(17.4922f, 22.7148f, 18.4063f, 23.375f, 18.4063f, 23.375f)
                lineTo(19.0938f, 23.875f)
                lineTo(19.6875f, 23.2813f)
                lineTo(22.0f, 21.0f)
                lineTo(23.0f, 20.0f)
                lineTo(23.6875f, 19.2813f)
                lineTo(29.2813f, 13.7188f)
                lineTo(29.9688f, 13.0f)
                lineTo(29.2813f, 12.2813f)
                lineTo(19.7188f, 2.7188f)
                close()
                moveTo(20.3125f, 7.25f)
                curveTo(20.5039f, 7.2656f, 20.6523f, 7.3398f, 20.7813f, 7.4688f)
                curveTo(21.293f, 7.9844f, 20.5469f, 9.9883f, 20.1875f, 10.8438f)
                curveTo(19.8281f, 11.7031f, 19.9414f, 12.375f, 20.4063f, 12.8438f)
                curveTo(21.1992f, 13.6445f, 23.2969f, 11.7617f, 24.1875f, 12.6563f)
                curveTo(25.0742f, 13.5508f, 23.4609f, 15.4531f, 24.0313f, 16.0313f)
                curveTo(24.043f, 16.043f, 24.0508f, 16.0508f, 24.0625f, 16.0625f)
                lineTo(22.2813f, 17.8438f)
                lineTo(14.1563f, 9.7188f)
                lineTo(15.5313f, 8.3438f)
                curveTo(15.5508f, 8.3672f, 15.5703f, 8.3828f, 15.5938f, 8.4063f)
                curveTo(16.2734f, 9.0898f, 17.668f, 8.4375f, 18.25f, 8.0625f)
                curveTo(18.9375f, 7.6211f, 19.7422f, 7.2031f, 20.3125f, 7.25f)
                close()
                moveTo(12.7188f, 11.1563f)
                lineTo(20.8438f, 19.2813f)
                lineTo(20.5625f, 19.5625f)
                lineTo(18.8438f, 21.3125f)
                curveTo(18.457f, 21.0469f, 18.1875f, 20.8281f, 17.4063f, 20.4375f)
                curveTo(16.8086f, 20.1406f, 16.1602f, 19.8672f, 15.4688f, 19.75f)
                curveTo(14.7773f, 19.6328f, 13.9023f, 19.6602f, 13.2813f, 20.2813f)
                lineTo(13.25f, 20.3438f)
                lineTo(13.2188f, 20.375f)
                curveTo(13.2188f, 20.375f, 12.0391f, 21.8711f, 10.7188f, 23.5f)
                curveTo(9.3984f, 25.1289f, 7.8672f, 26.9453f, 7.4063f, 27.4063f)
                curveTo(6.6172f, 28.1953f, 5.3828f, 28.1953f, 4.5938f, 27.4063f)
                curveTo(3.8047f, 26.6172f, 3.8047f, 25.3828f, 4.5938f, 24.5938f)
                curveTo(5.0547f, 24.1328f, 6.8711f, 22.6016f, 8.5f, 21.2813f)
                curveTo(10.1289f, 19.9609f, 11.625f, 18.7813f, 11.625f, 18.7813f)
                lineTo(11.6563f, 18.75f)
                lineTo(11.7188f, 18.7188f)
                curveTo(12.3516f, 18.0898f, 12.3125f, 17.2539f, 12.1875f, 16.5938f)
                curveTo(12.0625f, 15.9336f, 11.7813f, 15.2891f, 11.5f, 14.6875f)
                curveTo(11.1211f, 13.875f, 10.8984f, 13.5781f, 10.6563f, 13.1875f)
                lineTo(12.4375f, 11.4375f)
                close()
                moveTo(6.25f, 24.6563f)
                curveTo(5.6445f, 24.6563f, 5.1563f, 25.1445f, 5.1563f, 25.75f)
                curveTo(5.1563f, 26.3555f, 5.6445f, 26.8438f, 6.25f, 26.8438f)
                curveTo(6.8555f, 26.8438f, 7.3438f, 26.3555f, 7.3438f, 25.75f)
                curveTo(7.3438f, 25.1445f, 6.8555f, 24.6563f, 6.25f, 24.6563f)
                close()
            }
        }
        .build()
        return _brushSolid!!
    }

private var _brushSolid: ImageVector? = null
