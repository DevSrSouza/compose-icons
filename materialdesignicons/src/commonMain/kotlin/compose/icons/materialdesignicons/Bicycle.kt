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

public val MaterialDesignIcons.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveTo(18.44f, 10.0f, 17.91f, 10.11f, 17.41f, 10.28f)
                lineTo(14.46f, 4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.54f)
                lineTo(14.42f, 7.72f)
                lineTo(12.0f, 13.13f)
                lineTo(10.23f, 8.95f)
                curveTo(10.5f, 8.85f, 10.74f, 8.58f, 10.74f, 8.25f)
                curveTo(10.74f, 7.84f, 10.41f, 7.5f, 10.0f, 7.5f)
                horizontalLineTo(8.0f)
                curveTo(7.58f, 7.5f, 7.24f, 7.84f, 7.24f, 8.25f)
                reflectiveCurveTo(7.58f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(8.61f)
                lineTo(10.86f, 14.25f)
                horizontalLineTo(9.92f)
                curveTo(9.56f, 11.85f, 7.5f, 10.0f, 5.0f, 10.0f)
                curveTo(2.24f, 10.0f, 0.0f, 12.24f, 0.0f, 15.0f)
                reflectiveCurveTo(2.24f, 20.0f, 5.0f, 20.0f)
                curveTo(7.5f, 20.0f, 9.56f, 18.15f, 9.92f, 15.75f)
                horizontalLineTo(12.5f)
                lineTo(15.29f, 9.43f)
                lineTo(16.08f, 10.96f)
                curveTo(14.82f, 11.87f, 14.0f, 13.34f, 14.0f, 15.0f)
                curveTo(14.0f, 17.76f, 16.24f, 20.0f, 19.0f, 20.0f)
                reflectiveCurveTo(24.0f, 17.76f, 24.0f, 15.0f)
                reflectiveCurveTo(21.76f, 10.0f, 19.0f, 10.0f)
                moveTo(5.0f, 18.5f)
                curveTo(3.07f, 18.5f, 1.5f, 16.93f, 1.5f, 15.0f)
                reflectiveCurveTo(3.07f, 11.5f, 5.0f, 11.5f)
                curveTo(6.67f, 11.5f, 8.07f, 12.68f, 8.41f, 14.25f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.75f)
                horizontalLineTo(8.41f)
                curveTo(8.07f, 17.32f, 6.67f, 18.5f, 5.0f, 18.5f)
                moveTo(19.0f, 18.5f)
                curveTo(17.07f, 18.5f, 15.5f, 16.93f, 15.5f, 15.0f)
                curveTo(15.5f, 13.92f, 16.0f, 12.97f, 16.77f, 12.33f)
                lineTo(18.57f, 15.85f)
                lineTo(19.89f, 15.13f)
                lineTo(18.1f, 11.63f)
                curveTo(18.39f, 11.56f, 18.69f, 11.5f, 19.0f, 11.5f)
                curveTo(20.93f, 11.5f, 22.5f, 13.07f, 22.5f, 15.0f)
                reflectiveCurveTo(20.93f, 18.5f, 19.0f, 18.5f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
