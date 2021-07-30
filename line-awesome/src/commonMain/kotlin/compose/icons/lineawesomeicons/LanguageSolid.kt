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

public val LineAwesomeIcons.LanguageSolid: ImageVector
    get() {
        if (_languageSolid != null) {
            return _languageSolid!!
        }
        _languageSolid = Builder(name = "LanguageSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 10.5625f)
                lineTo(10.5625f, 20.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 11.0f)
                lineTo(12.9375f, 11.0f)
                curveTo(12.8086f, 12.1484f, 12.457f, 13.0547f, 11.875f, 13.6875f)
                curveTo(11.5313f, 13.5742f, 11.2227f, 13.4336f, 10.9688f, 13.2813f)
                curveTo(10.2656f, 12.8633f, 10.0f, 12.418f, 10.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.0f, 13.1914f, 8.7344f, 14.1836f, 9.7188f, 14.8438f)
                curveTo(9.2266f, 14.9492f, 8.6563f, 15.0f, 8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                curveTo(9.7734f, 17.0f, 11.25f, 16.5938f, 12.375f, 15.8438f)
                curveTo(12.8984f, 15.9336f, 13.4297f, 16.0f, 14.0f, 16.0f)
                lineTo(14.0f, 14.125f)
                curveTo(14.543f, 13.2148f, 14.832f, 12.1523f, 14.9375f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(21.4375f, 12.0f)
                lineTo(26.0f, 12.0f)
                lineTo(26.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 21.4375f)
                close()
                moveTo(20.0f, 13.8438f)
                lineTo(19.0625f, 16.6875f)
                lineTo(17.0625f, 22.6875f)
                lineTo(17.0f, 22.8438f)
                lineTo(17.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 23.125f)
                lineTo(19.0313f, 23.0f)
                lineTo(20.9688f, 23.0f)
                lineTo(21.0f, 23.125f)
                lineTo(21.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 22.8438f)
                lineTo(22.9375f, 22.6875f)
                lineTo(20.9375f, 16.6875f)
                close()
                moveTo(20.0f, 20.125f)
                lineTo(20.2813f, 21.0f)
                lineTo(19.7188f, 21.0f)
                close()
            }
        }
        .build()
        return _languageSolid!!
    }

private var _languageSolid: ImageVector? = null
