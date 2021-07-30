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

public val LineAwesomeIcons.MapMarkedAltSolid: ImageVector
    get() {
        if (_mapMarkedAltSolid != null) {
            return _mapMarkedAltSolid!!
        }
        _mapMarkedAltSolid = Builder(name = "MapMarkedAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                curveTo(18.6992f, 3.0f, 16.0f, 5.6992f, 16.0f, 9.0f)
                curveTo(16.0f, 9.9922f, 16.3828f, 11.0039f, 16.875f, 12.125f)
                curveTo(17.3672f, 13.2461f, 17.9883f, 14.4336f, 18.625f, 15.5313f)
                curveTo(19.8984f, 17.7266f, 21.1875f, 19.5625f, 21.1875f, 19.5625f)
                lineTo(22.0f, 20.75f)
                lineTo(22.8125f, 19.5625f)
                curveTo(22.8125f, 19.5625f, 24.1016f, 17.7266f, 25.375f, 15.5313f)
                curveTo(26.0117f, 14.4336f, 26.6328f, 13.2461f, 27.125f, 12.125f)
                curveTo(27.6172f, 11.0039f, 28.0f, 9.9922f, 28.0f, 9.0f)
                curveTo(28.0f, 5.6992f, 25.3008f, 3.0f, 22.0f, 3.0f)
                close()
                moveTo(11.9688f, 4.9375f)
                lineTo(4.0f, 8.3438f)
                lineTo(4.0f, 27.5313f)
                lineTo(12.0313f, 24.0625f)
                lineTo(20.0313f, 27.0625f)
                lineTo(28.0f, 23.6563f)
                lineTo(28.0f, 14.9375f)
                curveTo(27.3633f, 16.1602f, 26.6563f, 17.332f, 26.0f, 18.375f)
                lineTo(26.0f, 22.3438f)
                lineTo(21.0f, 24.4688f)
                lineTo(21.0f, 22.8438f)
                lineTo(19.5313f, 20.7188f)
                curveTo(19.375f, 20.4922f, 19.1914f, 20.2227f, 19.0f, 19.9375f)
                lineTo(19.0f, 24.5625f)
                lineTo(13.0f, 22.3125f)
                lineTo(13.0f, 7.4375f)
                lineTo(14.0938f, 7.8438f)
                curveTo(14.1914f, 7.168f, 14.3672f, 6.5156f, 14.625f, 5.9063f)
                close()
                moveTo(22.0f, 5.0f)
                curveTo(24.2188f, 5.0f, 26.0f, 6.7813f, 26.0f, 9.0f)
                curveTo(26.0f, 9.3867f, 25.7578f, 10.3008f, 25.3125f, 11.3125f)
                curveTo(24.8672f, 12.3242f, 24.2383f, 13.4727f, 23.625f, 14.5313f)
                curveTo(22.8086f, 15.9375f, 22.457f, 16.4375f, 22.0f, 17.125f)
                curveTo(21.543f, 16.4375f, 21.1914f, 15.9375f, 20.375f, 14.5313f)
                curveTo(19.7617f, 13.4727f, 19.1328f, 12.3242f, 18.6875f, 11.3125f)
                curveTo(18.2422f, 10.3008f, 18.0f, 9.3867f, 18.0f, 9.0f)
                curveTo(18.0f, 6.7813f, 19.7813f, 5.0f, 22.0f, 5.0f)
                close()
                moveTo(11.0f, 7.5f)
                lineTo(11.0f, 22.3438f)
                lineTo(6.0f, 24.4688f)
                lineTo(6.0f, 9.6563f)
                close()
                moveTo(22.0f, 7.5f)
                curveTo(21.1719f, 7.5f, 20.5f, 8.1719f, 20.5f, 9.0f)
                curveTo(20.5f, 9.8281f, 21.1719f, 10.5f, 22.0f, 10.5f)
                curveTo(22.8281f, 10.5f, 23.5f, 9.8281f, 23.5f, 9.0f)
                curveTo(23.5f, 8.1719f, 22.8281f, 7.5f, 22.0f, 7.5f)
                close()
            }
        }
        .build()
        return _mapMarkedAltSolid!!
    }

private var _mapMarkedAltSolid: ImageVector? = null
