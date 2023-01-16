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

public val MaterialDesignIcons.MicrosoftXboxControllerBatteryCharging: ImageVector
    get() {
        if (_microsoftXboxControllerBatteryCharging != null) {
            return _microsoftXboxControllerBatteryCharging!!
        }
        _microsoftXboxControllerBatteryCharging = Builder(name =
                "MicrosoftXboxControllerBatteryCharging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(21.67f)
                curveTo(22.4f, 5.0f, 23.0f, 5.6f, 23.0f, 6.33f)
                verticalLineTo(19.67f)
                arcTo(1.33f, 1.33f, 0.0f, false, true, 21.67f, 21.0f)
                horizontalLineTo(14.33f)
                curveTo(13.6f, 21.0f, 13.0f, 20.4f, 13.0f, 19.67f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.75f)
                curveTo(5.75f, 16.75f, 5.0f, 19.0f, 3.0f, 20.0f)
                curveTo(1.0f, 20.0f, -0.5f, 17.0f, 3.5f, 8.5f)
                horizontalLineTo(3.75f)
                lineTo(4.19f, 7.67f)
                curveTo(4.19f, 7.67f, 7.0f, 6.0f, 8.33f, 7.23f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, true, 14.33f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                moveTo(21.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                moveTo(15.5f, 14.0f)
                lineTo(18.5f, 7.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.5f)
                lineTo(17.5f, 18.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.5f)
                moveTo(11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _microsoftXboxControllerBatteryCharging!!
    }

private var _microsoftXboxControllerBatteryCharging: ImageVector? = null
