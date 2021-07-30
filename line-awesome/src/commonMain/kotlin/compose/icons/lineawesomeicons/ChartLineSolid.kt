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

public val LineAwesomeIcons.ChartLineSolid: ImageVector
    get() {
        if (_chartLineSolid != null) {
            return _chartLineSolid!!
        }
        _chartLineSolid = Builder(name = "ChartLineSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.2188f, 5.375f)
                lineTo(23.7188f, 9.75f)
                lineTo(20.4375f, 8.0938f)
                lineTo(19.6563f, 7.7188f)
                lineTo(19.1563f, 8.4375f)
                lineTo(15.75f, 13.5625f)
                lineTo(12.5938f, 11.1875f)
                lineTo(12.0f, 10.75f)
                lineTo(11.4063f, 11.1875f)
                lineTo(7.7813f, 13.9063f)
                lineTo(4.25f, 13.0313f)
                lineTo(3.75f, 14.9688f)
                lineTo(7.75f, 15.9688f)
                lineTo(8.2188f, 16.0938f)
                lineTo(8.5938f, 15.8125f)
                lineTo(12.0f, 13.25f)
                lineTo(15.4063f, 15.8125f)
                lineTo(16.25f, 16.4375f)
                lineTo(16.8438f, 15.5625f)
                lineTo(20.3438f, 10.3125f)
                lineTo(23.5625f, 11.9063f)
                lineTo(24.2813f, 12.25f)
                lineTo(28.7813f, 6.625f)
                close()
                moveTo(20.0625f, 18.3125f)
                lineTo(19.2188f, 19.375f)
                lineTo(15.8125f, 23.625f)
                lineTo(12.5938f, 21.1875f)
                lineTo(12.0f, 20.75f)
                lineTo(11.4063f, 21.1875f)
                lineTo(7.9063f, 23.8125f)
                lineTo(4.4375f, 22.0938f)
                lineTo(3.5625f, 23.9063f)
                lineTo(7.5625f, 25.9063f)
                lineTo(8.0938f, 26.1563f)
                lineTo(8.5938f, 25.8125f)
                lineTo(12.0f, 23.25f)
                lineTo(15.4063f, 25.8125f)
                lineTo(16.1875f, 26.375f)
                lineTo(16.7813f, 25.625f)
                lineTo(19.9063f, 21.7188f)
                lineTo(23.1563f, 26.5625f)
                lineTo(23.9375f, 27.6875f)
                lineTo(24.7813f, 26.625f)
                lineTo(28.7813f, 21.625f)
                lineTo(27.2188f, 20.375f)
                lineTo(24.0938f, 24.2813f)
                lineTo(20.8438f, 19.4375f)
                close()
            }
        }
        .build()
        return _chartLineSolid!!
    }

private var _chartLineSolid: ImageVector? = null
