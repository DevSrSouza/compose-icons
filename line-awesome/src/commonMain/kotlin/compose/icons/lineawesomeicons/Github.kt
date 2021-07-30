package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3711f, 4.0f, 4.0f, 9.3711f, 4.0f, 16.0f)
                curveTo(4.0f, 21.3008f, 7.4375f, 25.8008f, 12.207f, 27.3867f)
                curveTo(12.8086f, 27.4961f, 13.0273f, 27.1289f, 13.0273f, 26.8086f)
                curveTo(13.0273f, 26.5234f, 13.0156f, 25.7695f, 13.0117f, 24.7695f)
                curveTo(9.6719f, 25.4922f, 8.9688f, 23.1602f, 8.9688f, 23.1602f)
                curveTo(8.4219f, 21.7734f, 7.6367f, 21.4023f, 7.6367f, 21.4023f)
                curveTo(6.5469f, 20.6602f, 7.7188f, 20.6758f, 7.7188f, 20.6758f)
                curveTo(8.9219f, 20.7617f, 9.5547f, 21.9102f, 9.5547f, 21.9102f)
                curveTo(10.625f, 23.7461f, 12.3633f, 23.2148f, 13.0469f, 22.9102f)
                curveTo(13.1563f, 22.1328f, 13.4688f, 21.6055f, 13.8086f, 21.3047f)
                curveTo(11.1445f, 21.0039f, 8.3438f, 19.9727f, 8.3438f, 15.375f)
                curveTo(8.3438f, 14.0625f, 8.8125f, 12.9922f, 9.5781f, 12.1523f)
                curveTo(9.457f, 11.8516f, 9.043f, 10.6289f, 9.6953f, 8.9766f)
                curveTo(9.6953f, 8.9766f, 10.7031f, 8.6563f, 12.9961f, 10.207f)
                curveTo(13.9531f, 9.9414f, 14.9805f, 9.8086f, 16.0f, 9.8047f)
                curveTo(17.0195f, 9.8086f, 18.0469f, 9.9414f, 19.0039f, 10.207f)
                curveTo(21.2969f, 8.6563f, 22.3008f, 8.9766f, 22.3008f, 8.9766f)
                curveTo(22.957f, 10.6289f, 22.5469f, 11.8516f, 22.4219f, 12.1523f)
                curveTo(23.1914f, 12.9922f, 23.6523f, 14.0625f, 23.6523f, 15.375f)
                curveTo(23.6523f, 19.9844f, 20.8477f, 20.9961f, 18.1758f, 21.2969f)
                curveTo(18.6055f, 21.6641f, 18.9883f, 22.3984f, 18.9883f, 23.5156f)
                curveTo(18.9883f, 25.1211f, 18.9766f, 26.4141f, 18.9766f, 26.8086f)
                curveTo(18.9766f, 27.1289f, 19.1914f, 27.5039f, 19.8008f, 27.3867f)
                curveTo(24.5664f, 25.7969f, 28.0f, 21.3008f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3711f, 22.6289f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
