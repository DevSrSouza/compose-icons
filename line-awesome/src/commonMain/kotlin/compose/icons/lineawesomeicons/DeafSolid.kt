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

public val LineAwesomeIcons.DeafSolid: ImageVector
    get() {
        if (_deafSolid != null) {
            return _deafSolid!!
        }
        _deafSolid = Builder(name = "DeafSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(21.875f, 20.4375f)
                curveTo(23.3828f, 18.2031f, 25.0f, 15.1992f, 25.0f, 12.0f)
                curveTo(25.0f, 7.5898f, 21.4102f, 4.0f, 17.0f, 4.0f)
                curveTo(13.8789f, 4.0f, 11.1602f, 5.793f, 9.8438f, 8.4063f)
                close()
                moveTo(17.0f, 6.0f)
                curveTo(20.3086f, 6.0f, 23.0f, 8.6914f, 23.0f, 12.0f)
                curveTo(23.0f, 14.5313f, 21.7266f, 17.0313f, 20.4375f, 19.0f)
                lineTo(14.0313f, 12.5938f)
                curveTo(14.2188f, 11.0898f, 15.4297f, 10.0f, 17.0f, 10.0f)
                curveTo(18.0781f, 10.0f, 19.0938f, 10.5898f, 19.625f, 11.5313f)
                lineTo(21.3438f, 10.5313f)
                curveTo(20.457f, 8.9688f, 18.7969f, 8.0f, 17.0f, 8.0f)
                curveTo(14.9219f, 8.0f, 13.1719f, 9.2031f, 12.4063f, 10.9688f)
                lineTo(11.375f, 9.9375f)
                curveTo(12.2188f, 7.6406f, 14.4141f, 6.0f, 17.0f, 6.0f)
                close()
                moveTo(11.1563f, 15.3438f)
                lineTo(11.0f, 15.4688f)
                lineTo(11.0f, 16.0f)
                curveTo(11.0f, 17.4297f, 12.2148f, 17.9805f, 13.0313f, 18.3438f)
                curveTo(13.7813f, 18.6758f, 14.0f, 18.8125f, 14.0f, 19.0f)
                curveTo(14.0f, 19.6875f, 12.918f, 20.0f, 11.9063f, 20.0f)
                lineTo(11.9063f, 22.0f)
                curveTo(13.8672f, 22.0f, 15.2813f, 21.2266f, 15.7813f, 20.0f)
                close()
                moveTo(9.0f, 22.0f)
                lineTo(9.0f, 23.0f)
                curveTo(9.0f, 25.7578f, 11.2422f, 28.0f, 14.0f, 28.0f)
                curveTo(16.9063f, 28.0f, 18.0f, 26.1602f, 18.875f, 24.6875f)
                curveTo(19.0859f, 24.3359f, 19.2813f, 24.0039f, 19.5f, 23.6875f)
                lineTo(18.0625f, 22.25f)
                curveTo(18.0391f, 22.2852f, 18.0234f, 22.3438f, 18.0f, 22.375f)
                curveTo(17.6836f, 22.8086f, 17.4102f, 23.2578f, 17.1563f, 23.6875f)
                curveTo(16.3203f, 25.0898f, 15.7695f, 26.0f, 14.0f, 26.0f)
                curveTo(12.3477f, 26.0f, 11.0f, 24.6523f, 11.0f, 23.0f)
                lineTo(11.0f, 22.0f)
                close()
            }
        }
        .build()
        return _deafSolid!!
    }

private var _deafSolid: ImageVector? = null
