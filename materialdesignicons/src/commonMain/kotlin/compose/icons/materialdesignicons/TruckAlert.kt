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

public val MaterialDesignIcons.TruckAlert: ImageVector
    get() {
        if (_truckAlert != null) {
            return _truckAlert!!
        }
        _truckAlert = Builder(name = "TruckAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 18.7f, 4.3f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(9.0f, 18.7f, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.7f, 16.3f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(21.0f, 18.7f, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(8.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                moveTo(17.0f, 9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.5f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                moveTo(6.0f, 15.5f)
                curveTo(6.8f, 15.5f, 7.5f, 16.2f, 7.5f, 17.0f)
                reflectiveCurveTo(6.8f, 18.5f, 6.0f, 18.5f)
                reflectiveCurveTo(4.5f, 17.8f, 4.5f, 17.0f)
                reflectiveCurveTo(5.2f, 15.5f, 6.0f, 15.5f)
                moveTo(18.0f, 15.5f)
                curveTo(18.8f, 15.5f, 19.5f, 16.2f, 19.5f, 17.0f)
                reflectiveCurveTo(18.8f, 18.5f, 18.0f, 18.5f)
                reflectiveCurveTo(16.5f, 17.8f, 16.5f, 17.0f)
                reflectiveCurveTo(17.2f, 15.5f, 18.0f, 15.5f)
                close()
            }
        }
        .build()
        return _truckAlert!!
    }

private var _truckAlert: ImageVector? = null
