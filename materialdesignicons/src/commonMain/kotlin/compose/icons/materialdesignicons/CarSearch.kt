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

public val MaterialDesignIcons.CarSearch: ImageVector
    get() {
        if (_carSearch != null) {
            return _carSearch!!
        }
        _carSearch = Builder(name = "CarSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.61f, 16.11f)
                curveTo(9.61f, 14.03f, 10.59f, 12.19f, 12.1f, 11.0f)
                horizontalLineTo(5.0f)
                lineTo(6.5f, 6.5f)
                horizontalLineTo(17.5f)
                lineTo(18.72f, 10.16f)
                curveTo(19.56f, 10.53f, 20.3f, 11.07f, 20.91f, 11.74f)
                lineTo(18.92f, 6.0f)
                curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 5.0f, 5.28f, 5.42f, 5.08f, 6.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.55f, 3.45f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 21.0f, 6.0f, 20.55f, 6.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.29f)
                curveTo(9.86f, 18.13f, 9.61f, 17.15f, 9.61f, 16.11f)
                moveTo(6.5f, 16.0f)
                curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f)
                reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f)
                reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f)
                reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f)
                moveTo(20.71f, 20.7f)
                lineTo(20.7f, 20.71f)
                lineTo(20.71f, 20.7f)
                moveTo(16.11f, 11.61f)
                curveTo(18.61f, 11.61f, 20.61f, 13.61f, 20.61f, 16.11f)
                curveTo(20.61f, 17.0f, 20.36f, 17.82f, 19.92f, 18.5f)
                lineTo(23.0f, 21.61f)
                lineTo(21.61f, 23.0f)
                lineTo(18.5f, 19.93f)
                curveTo(17.8f, 20.36f, 17.0f, 20.61f, 16.11f, 20.61f)
                curveTo(13.61f, 20.61f, 11.61f, 18.61f, 11.61f, 16.11f)
                reflectiveCurveTo(13.61f, 11.61f, 16.11f, 11.61f)
                moveTo(16.11f, 13.61f)
                curveTo(14.73f, 13.61f, 13.61f, 14.73f, 13.61f, 16.11f)
                reflectiveCurveTo(14.73f, 18.61f, 16.11f, 18.61f)
                reflectiveCurveTo(18.61f, 17.5f, 18.61f, 16.11f)
                reflectiveCurveTo(17.5f, 13.61f, 16.11f, 13.61f)
            }
        }
        .build()
        return _carSearch!!
    }

private var _carSearch: ImageVector? = null
