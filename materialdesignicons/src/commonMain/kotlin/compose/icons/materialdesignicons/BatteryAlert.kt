package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.BatteryAlert: ImageVector
    get() {
        if (_batteryAlert != null) {
            return _batteryAlert!!
        }
        _batteryAlert = Builder(name = "BatteryAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                moveTo(16.7f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.3f)
                curveTo(6.6f, 4.0f, 6.0f, 4.6f, 6.0f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(6.0f, 21.4f, 6.6f, 22.0f, 7.3f, 22.0f)
                horizontalLineTo(16.6f)
                curveTo(17.3f, 22.0f, 17.9f, 21.4f, 17.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(18.0f, 4.6f, 17.4f, 4.0f, 16.7f, 4.0f)
                close()
            }
        }
        .build()
        return _batteryAlert!!
    }

private var _batteryAlert: ImageVector? = null
