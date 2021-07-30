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

public val LineAwesomeIcons.MeteorSolid: ImageVector
    get() {
        if (_meteorSolid != null) {
            return _meteorSolid!!
        }
        _meteorSolid = Builder(name = "MeteorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.3438f, 1.5938f)
                lineTo(26.4375f, 4.1563f)
                lineTo(20.1875f, 8.25f)
                lineTo(20.5625f, 7.5938f)
                lineTo(22.1875f, 4.6563f)
                lineTo(19.2188f, 6.2188f)
                curveTo(19.2188f, 6.2188f, 16.4922f, 7.6797f, 13.2813f, 9.5938f)
                curveTo(10.0703f, 11.5078f, 6.4141f, 13.8242f, 4.4063f, 15.7813f)
                curveTo(1.1406f, 19.0469f, 1.1328f, 24.3164f, 4.4063f, 27.5f)
                lineTo(4.4375f, 27.5f)
                curveTo(7.707f, 30.75f, 12.918f, 30.7695f, 16.0938f, 27.5f)
                lineTo(16.0938f, 27.4688f)
                curveTo(17.7969f, 25.7617f, 19.9023f, 22.6563f, 21.625f, 19.9063f)
                curveTo(23.3516f, 17.1484f, 24.6563f, 14.7813f, 24.6563f, 14.7813f)
                lineTo(26.0625f, 12.3125f)
                lineTo(23.4375f, 13.375f)
                lineTo(22.625f, 13.6875f)
                lineTo(27.8438f, 5.5313f)
                close()
                moveTo(23.625f, 8.4063f)
                lineTo(19.25f, 15.25f)
                lineTo(17.5625f, 17.9063f)
                lineTo(20.4688f, 16.7188f)
                lineTo(21.4063f, 16.3438f)
                curveTo(20.8672f, 17.2656f, 20.75f, 17.4961f, 19.9063f, 18.8438f)
                curveTo(18.207f, 21.5586f, 16.082f, 24.6992f, 14.6875f, 26.0938f)
                curveTo(12.2695f, 28.6016f, 8.3398f, 28.6211f, 5.8125f, 26.0938f)
                lineTo(5.7813f, 26.0938f)
                curveTo(3.2734f, 23.6758f, 3.2852f, 19.7461f, 5.8125f, 17.2188f)
                curveTo(7.5039f, 15.5742f, 11.1484f, 13.1992f, 14.3125f, 11.3125f)
                curveTo(15.8398f, 10.4023f, 16.0625f, 10.2773f, 17.125f, 9.6875f)
                lineTo(16.5313f, 10.8125f)
                lineTo(14.5938f, 14.3438f)
                lineTo(17.9375f, 12.125f)
                close()
                moveTo(10.0f, 18.0f)
                curveTo(7.7891f, 18.0f, 6.0f, 19.7891f, 6.0f, 22.0f)
                curveTo(6.0f, 24.2109f, 7.7891f, 26.0f, 10.0f, 26.0f)
                curveTo(12.2109f, 26.0f, 14.0f, 24.2109f, 14.0f, 22.0f)
                curveTo(14.0f, 19.7891f, 12.2109f, 18.0f, 10.0f, 18.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveTo(11.1914f, 20.0f, 12.0f, 20.8086f, 12.0f, 22.0f)
                curveTo(12.0f, 23.1914f, 11.1914f, 24.0f, 10.0f, 24.0f)
                curveTo(8.8086f, 24.0f, 8.0f, 23.1914f, 8.0f, 22.0f)
                curveTo(8.0f, 20.8086f, 8.8086f, 20.0f, 10.0f, 20.0f)
                close()
            }
        }
        .build()
        return _meteorSolid!!
    }

private var _meteorSolid: ImageVector? = null
