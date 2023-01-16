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

public val MaterialDesignIcons.TruckAlertOutline: ImageVector
    get() {
        if (_truckAlertOutline != null) {
            return _truckAlertOutline!!
        }
        _truckAlertOutline = Builder(name = "TruckAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                moveTo(8.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                moveTo(18.0f, 18.5f)
                curveTo(18.8f, 18.5f, 19.5f, 17.8f, 19.5f, 17.0f)
                reflectiveCurveTo(18.8f, 15.5f, 18.0f, 15.5f)
                reflectiveCurveTo(16.5f, 16.2f, 16.5f, 17.0f)
                reflectiveCurveTo(17.2f, 18.5f, 18.0f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.5f)
                lineTo(19.5f, 9.5f)
                moveTo(6.0f, 18.5f)
                curveTo(6.8f, 18.5f, 7.5f, 17.8f, 7.5f, 17.0f)
                reflectiveCurveTo(6.8f, 15.5f, 6.0f, 15.5f)
                reflectiveCurveTo(4.5f, 16.2f, 4.5f, 17.0f)
                reflectiveCurveTo(5.2f, 18.5f, 6.0f, 18.5f)
                moveTo(20.0f, 8.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 18.7f, 19.7f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(15.0f, 18.7f, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 18.7f, 7.7f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(3.0f, 18.7f, 3.0f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.9f, 1.9f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(3.0f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.8f)
                curveTo(4.3f, 14.4f, 5.2f, 14.0f, 6.0f, 14.0f)
                reflectiveCurveTo(7.7f, 14.4f, 8.2f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _truckAlertOutline!!
    }

private var _truckAlertOutline: ImageVector? = null
