package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceMobileVibration: ImageVector
    get() {
        if (_deviceMobileVibration != null) {
            return _deviceMobileVibration!!
        }
        _deviceMobileVibration = Builder(name = "DeviceMobileVibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 5.0f)
                lineTo(14.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 19.0f)
                lineTo(4.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(10.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                lineTo(9.0f, 17.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(2.0f, 3.0f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(2.0f, 3.0f)
            }
        }
        .build()
        return _deviceMobileVibration!!
    }

private var _deviceMobileVibration: ImageVector? = null
