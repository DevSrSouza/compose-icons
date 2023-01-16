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

public val MaterialDesignIcons.ShieldCar: ImageVector
    get() {
        if (_shieldCar != null) {
            return _shieldCar!!
        }
        _shieldCar = Builder(name = "ShieldCar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.42f, 7.5f)
                lineTo(16.0f, 11.0f)
                horizontalLineTo(8.0f)
                lineTo(9.42f, 7.5f)
                horizontalLineTo(14.42f)
                moveTo(9.0f, 12.0f)
                curveTo(8.45f, 12.0f, 8.0f, 12.45f, 8.0f, 13.0f)
                reflectiveCurveTo(8.45f, 14.0f, 9.0f, 14.0f)
                reflectiveCurveTo(10.0f, 13.55f, 10.0f, 13.0f)
                reflectiveCurveTo(9.55f, 12.0f, 9.0f, 12.0f)
                moveTo(15.0f, 12.0f)
                curveTo(14.45f, 12.0f, 14.0f, 12.45f, 14.0f, 13.0f)
                reflectiveCurveTo(14.45f, 14.0f, 15.0f, 14.0f)
                reflectiveCurveTo(16.0f, 13.55f, 16.0f, 13.0f)
                reflectiveCurveTo(15.55f, 12.0f, 15.0f, 12.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 16.55f, 17.16f, 21.74f, 12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                moveTo(18.0f, 12.0f)
                lineTo(15.84f, 7.0f)
                curveTo(15.64f, 6.42f, 15.08f, 6.0f, 14.42f, 6.0f)
                horizontalLineTo(9.42f)
                curveTo(8.76f, 6.0f, 8.2f, 6.42f, 8.0f, 7.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 16.55f, 6.45f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(8.55f, 17.0f, 9.0f, 16.55f, 9.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.55f, 15.45f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 17.0f, 18.0f, 16.55f, 18.0f, 16.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _shieldCar!!
    }

private var _shieldCar: ImageVector? = null
