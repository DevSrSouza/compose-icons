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

public val MaterialDesignIcons.AlarmLightOffOutline: ImageVector
    get() {
        if (_alarmLightOffOutline != null) {
            return _alarmLightOffOutline!!
        }
        _alarmLightOffOutline = Builder(name = "AlarmLightOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.3f)
                lineTo(9.0f, 5.8f)
                curveTo(9.9f, 5.3f, 10.9f, 5.0f, 12.0f, 5.0f)
                curveTo(15.3f, 5.0f, 18.0f, 7.7f, 18.0f, 11.0f)
                verticalLineTo(14.8f)
                lineTo(16.0f, 12.8f)
                verticalLineTo(11.0f)
                curveTo(16.0f, 8.8f, 14.2f, 7.0f, 12.0f, 7.0f)
                curveTo(11.5f, 7.0f, 11.0f, 7.1f, 10.5f, 7.3f)
                moveTo(20.1f, 4.8f)
                lineTo(18.7f, 3.4f)
                lineTo(16.6f, 5.5f)
                lineTo(18.0f, 6.9f)
                lineTo(20.1f, 4.8f)
                moveTo(19.5f, 10.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(22.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.5f)
                moveTo(4.5f, 10.5f)
                horizontalLineTo(1.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(10.5f)
                moveTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                lineTo(20.1f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 20.9f, 4.9f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(18.1f)
                lineTo(17.1f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                curveTo(6.0f, 10.1f, 6.2f, 9.2f, 6.6f, 8.5f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                moveTo(8.0f, 17.0f)
                horizontalLineTo(15.1f)
                lineTo(8.1f, 10.0f)
                curveTo(8.1f, 10.3f, 8.0f, 10.7f, 8.0f, 11.0f)
                verticalLineTo(17.0f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _alarmLightOffOutline!!
    }

private var _alarmLightOffOutline: ImageVector? = null
