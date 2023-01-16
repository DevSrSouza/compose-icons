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

public val MaterialDesignIcons.CarSearchOutline: ImageVector
    get() {
        if (_carSearchOutline != null) {
            return _carSearchOutline!!
        }
        _carSearchOutline = Builder(name = "CarSearchOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.29f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 20.5f, 5.6f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 21.0f, 3.0f, 20.5f, 3.0f, 20.0f)
                verticalLineTo(12.0f)
                lineTo(5.1f, 6.0f)
                curveTo(5.3f, 5.4f, 5.8f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(18.1f, 5.0f, 18.7f, 5.4f, 18.9f, 6.0f)
                lineTo(20.91f, 11.74f)
                curveTo(20.17f, 10.93f, 19.24f, 10.31f, 18.18f, 9.95f)
                lineTo(17.1f, 7.0f)
                horizontalLineTo(6.8f)
                lineTo(5.8f, 10.0f)
                horizontalLineTo(13.91f)
                curveTo(12.79f, 10.4f, 11.81f, 11.1f, 11.08f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.68f)
                curveTo(9.78f, 17.71f, 10.0f, 18.38f, 10.29f, 19.0f)
                moveTo(6.0f, 14.5f)
                curveTo(6.0f, 15.3f, 6.7f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(9.0f, 15.3f, 9.0f, 14.5f)
                reflectiveCurveTo(8.3f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(6.0f, 13.7f, 6.0f, 14.5f)
                moveTo(16.11f, 11.61f)
                curveTo(13.61f, 11.61f, 11.61f, 13.61f, 11.61f, 16.11f)
                reflectiveCurveTo(13.61f, 20.61f, 16.11f, 20.61f)
                curveTo(17.0f, 20.61f, 17.8f, 20.36f, 18.5f, 19.93f)
                lineTo(21.61f, 23.0f)
                lineTo(23.0f, 21.61f)
                lineTo(19.92f, 18.5f)
                curveTo(20.36f, 17.82f, 20.61f, 17.0f, 20.61f, 16.11f)
                curveTo(20.61f, 13.61f, 18.61f, 11.61f, 16.11f, 11.61f)
                moveTo(16.11f, 13.61f)
                curveTo(17.5f, 13.61f, 18.61f, 14.73f, 18.61f, 16.11f)
                reflectiveCurveTo(17.5f, 18.61f, 16.11f, 18.61f)
                reflectiveCurveTo(13.61f, 17.5f, 13.61f, 16.11f)
                reflectiveCurveTo(14.73f, 13.61f, 16.11f, 13.61f)
            }
        }
        .build()
        return _carSearchOutline!!
    }

private var _carSearchOutline: ImageVector? = null
