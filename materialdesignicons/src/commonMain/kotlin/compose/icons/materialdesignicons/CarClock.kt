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

public val MaterialDesignIcons.CarClock: ImageVector
    get() {
        if (_carClock != null) {
            return _carClock!!
        }
        _carClock = Builder(name = "CarClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                curveTo(23.0f, 4.13f, 19.87f, 1.0f, 16.0f, 1.0f)
                curveTo(12.47f, 1.0f, 9.57f, 3.61f, 9.08f, 7.0f)
                horizontalLineTo(4.5f)
                curveTo(3.84f, 7.0f, 3.28f, 7.42f, 3.08f, 8.0f)
                lineTo(1.0f, 14.0f)
                verticalLineTo(22.0f)
                curveTo(1.0f, 22.55f, 1.45f, 23.0f, 2.0f, 23.0f)
                horizontalLineTo(3.0f)
                curveTo(3.55f, 23.0f, 4.0f, 22.55f, 4.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                curveTo(16.0f, 22.55f, 16.45f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(18.0f)
                curveTo(18.55f, 23.0f, 19.0f, 22.55f, 19.0f, 22.0f)
                verticalLineTo(14.32f)
                curveTo(21.36f, 13.19f, 23.0f, 10.79f, 23.0f, 8.0f)
                moveTo(4.5f, 8.5f)
                horizontalLineTo(9.03f)
                curveTo(9.15f, 10.26f, 9.92f, 11.84f, 11.11f, 13.0f)
                horizontalLineTo(3.0f)
                lineTo(4.5f, 8.5f)
                moveTo(4.5f, 18.0f)
                curveTo(3.67f, 18.0f, 3.0f, 17.33f, 3.0f, 16.5f)
                reflectiveCurveTo(3.67f, 15.0f, 4.5f, 15.0f)
                reflectiveCurveTo(6.0f, 15.67f, 6.0f, 16.5f)
                reflectiveCurveTo(5.33f, 18.0f, 4.5f, 18.0f)
                moveTo(15.5f, 18.0f)
                curveTo(14.67f, 18.0f, 14.0f, 17.33f, 14.0f, 16.5f)
                reflectiveCurveTo(14.67f, 15.0f, 15.5f, 15.0f)
                reflectiveCurveTo(17.0f, 15.67f, 17.0f, 16.5f)
                reflectiveCurveTo(16.33f, 18.0f, 15.5f, 18.0f)
                moveTo(16.0f, 13.0f)
                curveTo(14.61f, 13.0f, 13.44f, 12.5f, 12.47f, 11.53f)
                curveTo(11.5f, 10.56f, 11.0f, 9.39f, 11.0f, 8.0f)
                curveTo(11.0f, 6.64f, 11.5f, 5.46f, 12.47f, 4.5f)
                curveTo(13.44f, 3.5f, 14.61f, 3.0f, 16.0f, 3.0f)
                curveTo(17.36f, 3.0f, 18.54f, 3.5f, 19.5f, 4.5f)
                curveTo(20.5f, 5.46f, 21.0f, 6.64f, 21.0f, 8.0f)
                curveTo(21.0f, 9.39f, 20.5f, 10.56f, 19.5f, 11.53f)
                curveTo(18.54f, 12.5f, 17.36f, 13.0f, 16.0f, 13.0f)
                moveTo(16.5f, 8.25f)
                lineTo(19.36f, 9.94f)
                lineTo(18.61f, 11.16f)
                lineTo(15.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(8.25f)
                close()
            }
        }
        .build()
        return _carClock!!
    }

private var _carClock: ImageVector? = null
