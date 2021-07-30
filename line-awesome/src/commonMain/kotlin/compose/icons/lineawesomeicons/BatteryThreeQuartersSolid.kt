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

public val LineAwesomeIcons.BatteryThreeQuartersSolid: ImageVector
    get() {
        if (_batteryThreeQuartersSolid != null) {
            return _batteryThreeQuartersSolid!!
        }
        _batteryThreeQuartersSolid = Builder(name = "BatteryThreeQuartersSolid", defaultWidth =
                32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight =
                32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                lineTo(3.0f, 24.0f)
                lineTo(27.0f, 24.0f)
                lineTo(27.0f, 19.0f)
                lineTo(29.0f, 19.0f)
                lineTo(29.0f, 13.0f)
                lineTo(27.0f, 13.0f)
                lineTo(27.0f, 8.0f)
                close()
                moveTo(5.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(7.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _batteryThreeQuartersSolid!!
    }

private var _batteryThreeQuartersSolid: ImageVector? = null
