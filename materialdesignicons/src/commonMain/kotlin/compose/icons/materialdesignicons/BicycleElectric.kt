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

public val MaterialDesignIcons.BicycleElectric: ImageVector
    get() {
        if (_bicycleElectric != null) {
            return _bicycleElectric!!
        }
        _bicycleElectric = Builder(name = "BicycleElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                curveTo(18.44f, 7.0f, 17.91f, 7.11f, 17.41f, 7.28f)
                lineTo(14.46f, 1.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.54f)
                lineTo(14.42f, 4.72f)
                lineTo(12.0f, 10.13f)
                lineTo(10.23f, 5.95f)
                curveTo(10.5f, 5.85f, 10.74f, 5.58f, 10.74f, 5.25f)
                curveTo(10.74f, 4.84f, 10.41f, 4.5f, 10.0f, 4.5f)
                horizontalLineTo(8.0f)
                curveTo(7.58f, 4.5f, 7.24f, 4.84f, 7.24f, 5.25f)
                reflectiveCurveTo(7.58f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(8.61f)
                lineTo(10.86f, 11.25f)
                horizontalLineTo(9.92f)
                curveTo(9.56f, 8.85f, 7.5f, 7.0f, 5.0f, 7.0f)
                curveTo(2.24f, 7.0f, 0.0f, 9.24f, 0.0f, 12.0f)
                reflectiveCurveTo(2.24f, 17.0f, 5.0f, 17.0f)
                curveTo(7.5f, 17.0f, 9.56f, 15.15f, 9.92f, 12.75f)
                horizontalLineTo(12.5f)
                lineTo(15.29f, 6.43f)
                lineTo(16.08f, 7.96f)
                curveTo(14.82f, 8.87f, 14.0f, 10.34f, 14.0f, 12.0f)
                curveTo(14.0f, 14.76f, 16.24f, 17.0f, 19.0f, 17.0f)
                reflectiveCurveTo(24.0f, 14.76f, 24.0f, 12.0f)
                reflectiveCurveTo(21.76f, 7.0f, 19.0f, 7.0f)
                moveTo(5.0f, 15.5f)
                curveTo(3.07f, 15.5f, 1.5f, 13.93f, 1.5f, 12.0f)
                reflectiveCurveTo(3.07f, 8.5f, 5.0f, 8.5f)
                curveTo(6.67f, 8.5f, 8.07f, 9.68f, 8.41f, 11.25f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.41f)
                curveTo(8.07f, 14.32f, 6.67f, 15.5f, 5.0f, 15.5f)
                moveTo(19.0f, 15.5f)
                curveTo(17.07f, 15.5f, 15.5f, 13.93f, 15.5f, 12.0f)
                curveTo(15.5f, 10.92f, 16.0f, 9.97f, 16.77f, 9.33f)
                lineTo(18.57f, 12.85f)
                lineTo(19.89f, 12.13f)
                lineTo(18.1f, 8.63f)
                curveTo(18.39f, 8.56f, 18.69f, 8.5f, 19.0f, 8.5f)
                curveTo(20.93f, 8.5f, 22.5f, 10.07f, 22.5f, 12.0f)
                reflectiveCurveTo(20.93f, 15.5f, 19.0f, 15.5f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(7.0f)
                lineTo(13.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                lineTo(11.0f, 18.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bicycleElectric!!
    }

private var _bicycleElectric: ImageVector? = null
