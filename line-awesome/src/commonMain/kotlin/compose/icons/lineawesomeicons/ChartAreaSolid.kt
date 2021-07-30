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

public val LineAwesomeIcons.ChartAreaSolid: ImageVector
    get() {
        if (_chartAreaSolid != null) {
            return _chartAreaSolid!!
        }
        _chartAreaSolid = Builder(name = "ChartAreaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 4.0625f)
                lineTo(26.375f, 5.3125f)
                lineTo(21.75f, 8.9375f)
                lineTo(16.1563f, 8.0f)
                lineTo(15.7813f, 7.9375f)
                lineTo(15.4375f, 8.1563f)
                lineTo(9.75f, 11.9375f)
                lineTo(5.1875f, 11.0313f)
                lineTo(4.0f, 10.7813f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                close()
                moveTo(26.0f, 8.1563f)
                lineTo(26.0f, 13.5313f)
                lineTo(21.7813f, 16.875f)
                lineTo(16.3125f, 15.0625f)
                lineTo(15.8438f, 14.9063f)
                lineTo(15.4375f, 15.1563f)
                lineTo(9.875f, 18.875f)
                lineTo(6.0f, 17.3125f)
                lineTo(6.0f, 13.2188f)
                lineTo(9.8125f, 13.9688f)
                lineTo(10.2188f, 14.0625f)
                lineTo(10.5625f, 13.8438f)
                lineTo(16.2188f, 10.0625f)
                lineTo(21.8438f, 11.0f)
                lineTo(22.2813f, 11.0625f)
                lineTo(22.625f, 10.7813f)
                close()
                moveTo(26.0f, 16.0938f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 19.5f)
                lineTo(9.625f, 20.9375f)
                lineTo(10.125f, 21.125f)
                lineTo(10.5625f, 20.8438f)
                lineTo(16.1875f, 17.0938f)
                lineTo(21.6875f, 18.9375f)
                lineTo(22.1875f, 19.125f)
                lineTo(22.625f, 18.7813f)
                close()
            }
        }
        .build()
        return _chartAreaSolid!!
    }

private var _chartAreaSolid: ImageVector? = null
