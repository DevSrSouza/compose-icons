package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.BatteryHalf: ImageVector
    get() {
        if (_batteryHalf != null) {
            return _batteryHalf!!
        }
        _batteryHalf = Builder(name = "BatteryHalf", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.0f, 21.0f)
                horizontalLineToRelative(58.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-58.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(59.0f, 27.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, 12.0f)
                lineToRelative(-4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 41.0f)
                lineToRelative(-28.0f, 0.0f)
                lineToRelative(0.0f, -16.0f)
                lineToRelative(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _batteryHalf!!
    }

private var _batteryHalf: ImageVector? = null
