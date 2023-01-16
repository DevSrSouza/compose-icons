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

public val MaterialDesignIcons.AirHumidifierOff: ImageVector
    get() {
        if (_airHumidifierOff != null) {
            return _airHumidifierOff!!
        }
        _airHumidifierOff = Builder(name = "AirHumidifierOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(3.8f, 5.7f)
                curveTo(3.3f, 6.3f, 3.0f, 7.1f, 3.0f, 8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(9.6f, 11.5f)
                lineTo(12.4f, 14.3f)
                curveTo(12.1f, 14.7f, 11.6f, 15.0f, 11.0f, 15.0f)
                curveTo(9.9f, 15.0f, 9.0f, 14.1f, 9.0f, 13.0f)
                curveTo(9.0f, 12.4f, 9.3f, 11.9f, 9.6f, 11.5f)
                moveTo(16.0f, 17.9f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 7.7f, 5.1f, 7.4f, 5.2f, 7.1f)
                lineTo(8.2f, 10.1f)
                curveTo(7.5f, 10.8f, 7.0f, 11.9f, 7.0f, 13.0f)
                curveTo(7.0f, 15.2f, 8.8f, 17.0f, 11.0f, 17.0f)
                curveTo(12.1f, 17.0f, 13.2f, 16.5f, 13.9f, 15.8f)
                lineTo(16.0f, 17.9f)
                moveTo(17.0f, 13.8f)
                curveTo(17.1f, 12.5f, 19.0f, 10.5f, 19.0f, 10.5f)
                reflectiveCurveTo(21.0f, 12.7f, 21.0f, 14.0f)
                curveTo(21.0f, 15.0f, 20.2f, 15.9f, 19.2f, 16.0f)
                lineTo(17.0f, 13.8f)
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(16.2f, 4.0f, 18.0f, 5.8f, 18.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.9f, 15.1f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(9.2f)
                close()
            }
        }
        .build()
        return _airHumidifierOff!!
    }

private var _airHumidifierOff: ImageVector? = null
