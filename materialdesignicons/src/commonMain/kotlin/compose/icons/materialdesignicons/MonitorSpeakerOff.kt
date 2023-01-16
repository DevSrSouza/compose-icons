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

public val MaterialDesignIcons.MonitorSpeakerOff: ImageVector
    get() {
        if (_monitorSpeakerOff != null) {
            return _monitorSpeakerOff!!
        }
        _monitorSpeakerOff = Builder(name = "MonitorSpeakerOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(1.2f, 3.1f)
                curveTo(1.1f, 3.4f, 1.0f, 3.7f, 1.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 17.1f, 1.9f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.9f)
                lineTo(14.0f, 15.9f)
                verticalLineTo(20.0f)
                curveTo(14.0f, 21.1f, 14.9f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(20.1f)
                lineTo(20.8f, 22.7f)
                curveTo(20.8f, 22.7f, 22.0f, 21.7f, 22.2f, 21.5f)
                lineTo(2.4f, 1.7f)
                moveTo(18.5f, 20.5f)
                curveTo(16.8f, 20.5f, 15.5f, 19.2f, 15.5f, 17.5f)
                verticalLineTo(17.4f)
                lineTo(18.6f, 20.5f)
                horizontalLineTo(18.5f)
                moveTo(23.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.2f)
                lineTo(5.2f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 2.0f, 23.0f, 2.9f, 23.0f, 4.0f)
                moveTo(21.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(15.0f, 9.0f, 14.1f, 9.8f, 14.0f, 10.8f)
                lineTo(17.8f, 14.6f)
                curveTo(18.0f, 14.5f, 18.2f, 14.5f, 18.5f, 14.5f)
                horizontalLineTo(18.6f)
                curveTo(20.3f, 14.5f, 21.6f, 15.8f, 21.6f, 17.5f)
                curveTo(21.6f, 17.7f, 21.6f, 18.0f, 21.5f, 18.2f)
                lineTo(23.1f, 19.8f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 9.9f, 22.1f, 9.0f, 21.0f, 9.0f)
                moveTo(18.5f, 13.5f)
                curveTo(17.7f, 13.5f, 17.0f, 12.8f, 17.0f, 12.0f)
                reflectiveCurveTo(17.7f, 10.5f, 18.5f, 10.5f)
                reflectiveCurveTo(20.0f, 11.2f, 20.0f, 12.0f)
                reflectiveCurveTo(19.3f, 13.5f, 18.5f, 13.5f)
                close()
            }
        }
        .build()
        return _monitorSpeakerOff!!
    }

private var _monitorSpeakerOff: ImageVector? = null
