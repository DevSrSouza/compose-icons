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

public val LineAwesomeIcons.CampgroundSolid: ImageVector
    get() {
        if (_campgroundSolid != null) {
            return _campgroundSolid!!
        }
        _campgroundSolid = Builder(name = "CampgroundSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5313f, 4.875f)
                lineTo(10.1563f, 5.4688f)
                curveTo(10.1563f, 5.4688f, 8.8945f, 7.4102f, 7.2813f, 9.625f)
                curveTo(5.668f, 11.8398f, 3.6328f, 14.3477f, 2.4375f, 15.1875f)
                lineTo(1.9375f, 15.5313f)
                lineTo(2.0f, 16.125f)
                lineTo(3.0f, 25.125f)
                lineTo(3.0938f, 26.0f)
                lineTo(4.0f, 26.0f)
                curveTo(5.4844f, 26.0f, 7.2148f, 26.0781f, 8.9375f, 26.1875f)
                lineTo(10.0f, 26.25f)
                lineTo(10.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                lineTo(12.0f, 26.4063f)
                lineTo(12.9063f, 26.5f)
                curveTo(15.7344f, 26.75f, 17.875f, 27.0f, 17.875f, 27.0f)
                lineTo(18.0313f, 27.0f)
                lineTo(28.9688f, 24.8125f)
                lineTo(29.0f, 24.0313f)
                curveTo(29.0f, 24.0313f, 29.0898f, 22.3633f, 29.25f, 20.4063f)
                curveTo(29.4102f, 18.4492f, 29.6719f, 16.1484f, 29.9375f, 15.3125f)
                lineTo(30.1563f, 14.625f)
                lineTo(29.625f, 14.2188f)
                curveTo(26.1758f, 11.5469f, 22.875f, 5.5313f, 22.875f, 5.5313f)
                lineTo(22.5625f, 4.9063f)
                lineTo(21.8438f, 5.0f)
                curveTo(21.8438f, 5.0f, 15.418f, 5.8867f, 11.1875f, 5.0313f)
                close()
                moveTo(21.4688f, 7.0625f)
                curveTo(21.8789f, 7.8242f, 23.9023f, 11.4414f, 26.8125f, 14.3125f)
                lineTo(19.2813f, 15.5f)
                curveTo(16.8164f, 13.1328f, 14.3047f, 9.3906f, 12.9375f, 7.2188f)
                curveTo(16.8086f, 7.6172f, 20.6289f, 7.1758f, 21.4688f, 7.0625f)
                close()
                moveTo(10.9375f, 7.875f)
                curveTo(12.25f, 9.9883f, 15.0039f, 14.1367f, 17.9063f, 16.9063f)
                curveTo(17.25f, 19.582f, 17.0508f, 23.1484f, 17.0f, 24.9063f)
                curveTo(16.332f, 24.8359f, 15.5273f, 24.7383f, 14.0f, 24.5938f)
                lineTo(14.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 24.1563f)
                curveTo(6.9336f, 24.0977f, 5.8984f, 24.0469f, 4.9063f, 24.0313f)
                lineTo(4.0625f, 16.3438f)
                curveTo(5.6758f, 15.0313f, 7.4023f, 12.875f, 8.9063f, 10.8125f)
                curveTo(9.8828f, 9.4688f, 10.4922f, 8.5508f, 10.9375f, 7.875f)
                close()
                moveTo(27.7813f, 16.2188f)
                curveTo(27.5469f, 17.4102f, 27.3672f, 18.8164f, 27.25f, 20.2188f)
                curveTo(27.1211f, 21.8008f, 27.0898f, 22.668f, 27.0625f, 23.1875f)
                lineTo(19.0313f, 24.8125f)
                curveTo(19.082f, 23.0508f, 19.2656f, 19.7188f, 19.7813f, 17.4688f)
                close()
            }
        }
        .build()
        return _campgroundSolid!!
    }

private var _campgroundSolid: ImageVector? = null
