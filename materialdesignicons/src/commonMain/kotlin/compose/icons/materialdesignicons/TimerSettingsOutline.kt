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

public val MaterialDesignIcons.TimerSettingsOutline: ImageVector
    get() {
        if (_timerSettingsOutline != null) {
            return _timerSettingsOutline!!
        }
        _timerSettingsOutline = Builder(name = "TimerSettingsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(8.1f, 19.0f, 5.0f, 15.9f, 5.0f, 12.0f)
                reflectiveCurveTo(8.1f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(19.0f, 8.1f, 19.0f, 12.0f)
                reflectiveCurveTo(15.9f, 19.0f, 12.0f, 19.0f)
                moveTo(19.0f, 6.4f)
                lineTo(20.5f, 5.0f)
                curveTo(20.0f, 4.5f, 19.5f, 4.0f, 19.0f, 3.6f)
                lineTo(17.6f, 5.0f)
                curveTo(16.0f, 3.7f, 14.1f, 3.0f, 12.0f, 3.0f)
                curveTo(7.0f, 3.0f, 3.0f, 7.0f, 3.0f, 12.0f)
                reflectiveCurveTo(7.0f, 21.0f, 12.0f, 21.0f)
                curveTo(17.0f, 21.0f, 21.0f, 17.0f, 21.0f, 12.0f)
                curveTo(21.0f, 9.9f, 20.3f, 7.9f, 19.0f, 6.4f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 0.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(0.0f)
                moveTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _timerSettingsOutline!!
    }

private var _timerSettingsOutline: ImageVector? = null
