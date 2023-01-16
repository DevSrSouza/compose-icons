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

public val MaterialDesignIcons.CarParkingLights: ImageVector
    get() {
        if (_carParkingLights != null) {
            return _carParkingLights!!
        }
        _carParkingLights = Builder(name = "CarParkingLights", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3f, 9.2f)
                curveTo(8.1f, 9.6f, 9.0f, 10.5f, 9.0f, 12.0f)
                curveTo(9.0f, 13.5f, 8.1f, 14.4f, 7.3f, 14.8f)
                curveTo(6.9f, 13.4f, 6.9f, 10.6f, 7.3f, 9.2f)
                moveTo(6.5f, 7.0f)
                curveTo(4.5f, 7.0f, 4.5f, 17.0f, 6.5f, 17.0f)
                curveTo(8.5f, 17.0f, 11.0f, 15.1f, 11.0f, 12.0f)
                curveTo(11.0f, 8.9f, 8.5f, 7.0f, 6.5f, 7.0f)
                moveTo(16.7f, 9.2f)
                curveTo(17.0f, 10.6f, 17.0f, 13.4f, 16.7f, 14.8f)
                curveTo(15.9f, 14.4f, 15.0f, 13.5f, 15.0f, 12.0f)
                curveTo(15.0f, 10.5f, 15.9f, 9.6f, 16.7f, 9.2f)
                moveTo(17.5f, 7.0f)
                curveTo(15.5f, 7.0f, 13.0f, 8.9f, 13.0f, 12.0f)
                curveTo(13.0f, 15.1f, 15.5f, 17.0f, 17.5f, 17.0f)
                curveTo(19.5f, 17.0f, 19.5f, 7.0f, 17.5f, 7.0f)
                moveTo(4.9f, 6.2f)
                lineTo(2.5f, 4.6f)
                lineTo(1.4f, 6.3f)
                lineTo(4.0f, 8.0f)
                curveTo(4.2f, 7.3f, 4.5f, 6.6f, 4.9f, 6.2f)
                moveTo(20.0f, 8.0f)
                lineTo(22.6f, 6.3f)
                lineTo(21.5f, 4.6f)
                lineTo(19.1f, 6.2f)
                curveTo(19.4f, 6.6f, 19.8f, 7.2f, 20.0f, 8.0f)
                moveTo(4.0f, 16.0f)
                lineTo(1.4f, 17.7f)
                lineTo(2.5f, 19.4f)
                lineTo(4.9f, 17.8f)
                curveTo(4.6f, 17.4f, 4.2f, 16.8f, 4.0f, 16.0f)
                moveTo(20.5f, 11.0f)
                curveTo(20.5f, 11.3f, 20.5f, 11.7f, 20.5f, 12.0f)
                curveTo(20.5f, 12.3f, 20.5f, 12.6f, 20.5f, 13.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.5f)
                moveTo(19.1f, 17.8f)
                lineTo(21.5f, 19.4f)
                lineTo(22.6f, 17.7f)
                lineTo(20.0f, 16.0f)
                curveTo(19.8f, 16.7f, 19.5f, 17.4f, 19.1f, 17.8f)
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 11.7f, 3.5f, 11.4f, 3.5f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.5f)
                curveTo(3.5f, 12.7f, 3.5f, 12.3f, 3.5f, 12.0f)
                close()
            }
        }
        .build()
        return _carParkingLights!!
    }

private var _carParkingLights: ImageVector? = null
