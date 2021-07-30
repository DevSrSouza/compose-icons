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

public val LineAwesomeIcons.DrumSolid: ImageVector
    get() {
        if (_drumSolid != null) {
            return _drumSolid!!
        }
        _drumSolid = Builder(name = "DrumSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.1875f, 5.0938f)
                lineTo(16.125f, 10.3438f)
                curveTo(15.8047f, 10.1289f, 15.4141f, 10.0f, 15.0f, 10.0f)
                curveTo(13.8945f, 10.0f, 13.0f, 10.8945f, 13.0f, 12.0f)
                curveTo(13.0f, 13.1055f, 13.8945f, 14.0f, 15.0f, 14.0f)
                curveTo(16.0508f, 14.0f, 16.9219f, 13.1875f, 17.0f, 12.1563f)
                lineTo(23.0625f, 9.2813f)
                curveTo(24.8789f, 10.0469f, 26.0f, 11.0469f, 26.0f, 12.0f)
                curveTo(26.0f, 13.8867f, 21.7227f, 16.0f, 16.0f, 16.0f)
                curveTo(10.2773f, 16.0f, 6.0f, 13.8867f, 6.0f, 12.0f)
                curveTo(6.0f, 10.1133f, 10.2773f, 8.0f, 16.0f, 8.0f)
                curveTo(16.1719f, 8.0f, 16.3281f, 7.9961f, 16.5f, 8.0f)
                lineTo(20.0313f, 6.3438f)
                curveTo(18.7773f, 6.1328f, 17.4336f, 6.0f, 16.0f, 6.0f)
                curveTo(9.1602f, 6.0f, 4.0f, 8.5781f, 4.0f, 12.0f)
                lineTo(4.0f, 22.0f)
                curveTo(4.0f, 22.9883f, 4.4453f, 23.8945f, 5.125f, 24.625f)
                curveTo(5.8047f, 25.3555f, 6.7305f, 25.9453f, 7.8125f, 26.4375f)
                curveTo(9.9766f, 27.4219f, 12.8398f, 28.0f, 16.0f, 28.0f)
                curveTo(19.1602f, 28.0f, 22.0234f, 27.4219f, 24.1875f, 26.4375f)
                curveTo(25.2695f, 25.9453f, 26.1953f, 25.3555f, 26.875f, 24.625f)
                curveTo(27.5547f, 23.8945f, 28.0f, 22.9883f, 28.0f, 22.0f)
                lineTo(28.0f, 12.0f)
                curveTo(28.0f, 10.5234f, 27.0234f, 9.2109f, 25.375f, 8.1875f)
                lineTo(28.0313f, 6.9063f)
                close()
                moveTo(6.0f, 15.4063f)
                curveTo(7.0156f, 16.1719f, 8.3789f, 16.8008f, 10.0f, 17.25f)
                lineTo(10.0f, 25.1563f)
                curveTo(9.5f, 25.0f, 9.043f, 24.8164f, 8.625f, 24.625f)
                curveTo(7.7188f, 24.2109f, 7.0273f, 23.7148f, 6.5938f, 23.25f)
                curveTo(6.1602f, 22.7852f, 6.0f, 22.3945f, 6.0f, 22.0f)
                close()
                moveTo(26.0f, 15.4063f)
                lineTo(26.0f, 22.0f)
                curveTo(26.0f, 22.3945f, 25.8398f, 22.7852f, 25.4063f, 23.25f)
                curveTo(24.9727f, 23.7148f, 24.2813f, 24.2109f, 23.375f, 24.625f)
                curveTo(22.957f, 24.8164f, 22.5f, 25.0f, 22.0f, 25.1563f)
                lineTo(22.0f, 17.25f)
                curveTo(23.6211f, 16.8008f, 24.9844f, 16.1719f, 26.0f, 15.4063f)
                close()
                moveTo(12.0f, 17.6875f)
                curveTo(13.2422f, 17.8945f, 14.582f, 18.0f, 16.0f, 18.0f)
                curveTo(17.418f, 18.0f, 18.7578f, 17.8945f, 20.0f, 17.6875f)
                lineTo(20.0f, 25.625f)
                curveTo(18.7695f, 25.8555f, 17.4219f, 26.0f, 16.0f, 26.0f)
                curveTo(14.5781f, 26.0f, 13.2305f, 25.8555f, 12.0f, 25.625f)
                close()
            }
        }
        .build()
        return _drumSolid!!
    }

private var _drumSolid: ImageVector? = null
