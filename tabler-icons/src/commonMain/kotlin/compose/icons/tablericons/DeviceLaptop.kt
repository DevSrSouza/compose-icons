package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceLaptop: ImageVector
    get() {
        if (_deviceLaptop != null) {
            return _deviceLaptop!!
        }
        _deviceLaptop = Builder(name = "DeviceLaptop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                lineTo(21.0f, 19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 7.0f)
                lineTo(19.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 15.0f)
                lineTo(5.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _deviceLaptop!!
    }

private var _deviceLaptop: ImageVector? = null
