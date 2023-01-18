package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BatteryHalf: ImageVector
    get() {
        if (_batteryHalf != null) {
            return _batteryHalf!!
        }
        _batteryHalf = Builder(name = "BatteryHalf", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(77.7f, 144.0f)
                lineTo(386.3f, 144.0f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 432.0f, 189.7f)
                lineTo(432.0f, 322.3f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 386.3f, 368.0f)
                lineTo(77.7f, 368.0f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 32.0f, 322.3f)
                lineTo(32.0f, 189.7f)
                arcTo(45.7f, 45.7f, 0.0f, false, true, 77.7f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(89.69f, 198.93f)
                lineTo(236.0f, 198.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 202.93f)
                lineTo(240.0f, 309.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 313.06f)
                lineTo(89.69f, 313.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 85.69f, 309.06f)
                lineTo(85.69f, 202.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 89.69f, 198.93f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 218.67f)
                lineTo(480.0f, 293.33f)
            }
        }
        .build()
        return _batteryHalf!!
    }

private var _batteryHalf: ImageVector? = null
