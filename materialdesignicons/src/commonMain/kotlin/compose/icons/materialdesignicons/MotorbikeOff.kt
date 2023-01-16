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

public val MaterialDesignIcons.MotorbikeOff: ImageVector
    get() {
        if (_motorbikeOff != null) {
            return _motorbikeOff!!
        }
        _motorbikeOff = Builder(name = "MotorbikeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(8.1f, 10.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0f, 10.0f, 2.0f, 12.0f, 2.0f, 14.5f)
                reflectiveCurveTo(4.0f, 19.0f, 6.5f, 19.0f)
                curveTo(8.7f, 19.0f, 10.6f, 17.4f, 10.9f, 15.3f)
                lineTo(12.4f, 14.4f)
                lineTo(13.0f, 15.0f)
                curveTo(13.2f, 17.1f, 14.9f, 18.8f, 17.0f, 19.0f)
                lineTo(20.8f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(8.8f, 15.3f)
                curveTo(8.5f, 16.3f, 7.5f, 17.0f, 6.4f, 17.0f)
                curveTo(5.1f, 17.0f, 4.0f, 15.9f, 4.0f, 14.5f)
                reflectiveCurveTo(5.1f, 12.0f, 6.5f, 12.0f)
                curveTo(7.6f, 12.0f, 8.5f, 12.7f, 8.9f, 13.8f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.3f)
                horizontalLineTo(8.8f)
                moveTo(11.2f, 8.0f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(13.4f)
                lineTo(17.4f, 10.0f)
                horizontalLineTo(17.5f)
                curveTo(20.0f, 10.0f, 22.0f, 12.0f, 22.0f, 14.5f)
                curveTo(22.0f, 15.7f, 21.5f, 16.8f, 20.8f, 17.6f)
                lineTo(19.4f, 16.2f)
                curveTo(19.8f, 15.8f, 20.0f, 15.2f, 20.0f, 14.6f)
                curveTo(20.0f, 13.2f, 18.9f, 12.1f, 17.5f, 12.1f)
                curveTo(16.9f, 12.1f, 16.3f, 12.3f, 15.9f, 12.7f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(14.6f)
                lineTo(12.6f, 8.0f)
                horizontalLineTo(11.2f)
                close()
            }
        }
        .build()
        return _motorbikeOff!!
    }

private var _motorbikeOff: ImageVector? = null
