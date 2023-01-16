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

public val MaterialDesignIcons.OilLevel: ImageVector
    get() {
        if (_oilLevel != null) {
            return _oilLevel!!
        }
        _oilLevel = Builder(name = "OilLevel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                curveTo(6.67f, 18.0f, 5.79f, 18.79f, 5.29f, 19.29f)
                reflectiveCurveTo(4.67f, 20.0f, 4.0f, 20.0f)
                reflectiveCurveTo(3.21f, 19.79f, 2.71f, 19.29f)
                curveTo(2.35f, 18.93f, 1.79f, 18.42f, 1.0f, 18.16f)
                verticalLineTo(20.41f)
                curveTo(1.09f, 20.5f, 1.18f, 20.59f, 1.29f, 20.71f)
                curveTo(1.79f, 21.21f, 2.67f, 22.0f, 4.0f, 22.0f)
                reflectiveCurveTo(6.21f, 21.21f, 6.71f, 20.71f)
                reflectiveCurveTo(7.33f, 20.0f, 8.0f, 20.0f)
                reflectiveCurveTo(8.79f, 20.21f, 9.29f, 20.71f)
                curveTo(9.73f, 21.14f, 10.44f, 21.8f, 11.5f, 21.96f)
                curveTo(11.66f, 22.0f, 11.83f, 22.0f, 12.0f, 22.0f)
                curveTo(13.33f, 22.0f, 14.21f, 21.21f, 14.71f, 20.71f)
                reflectiveCurveTo(15.33f, 20.0f, 16.0f, 20.0f)
                reflectiveCurveTo(16.79f, 20.21f, 17.29f, 20.71f)
                reflectiveCurveTo(18.67f, 22.0f, 20.0f, 22.0f)
                reflectiveCurveTo(22.21f, 21.21f, 22.71f, 20.71f)
                curveTo(22.82f, 20.59f, 22.91f, 20.5f, 23.0f, 20.41f)
                verticalLineTo(18.16f)
                curveTo(22.21f, 18.42f, 21.65f, 18.93f, 21.29f, 19.29f)
                curveTo(20.79f, 19.79f, 20.67f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveTo(19.21f, 19.79f, 18.71f, 19.29f)
                reflectiveCurveTo(17.33f, 18.0f, 16.0f, 18.0f)
                reflectiveCurveTo(13.79f, 18.79f, 13.29f, 19.29f)
                reflectiveCurveTo(12.67f, 20.0f, 12.0f, 20.0f)
                curveTo(11.78f, 20.0f, 11.63f, 19.97f, 11.5f, 19.92f)
                curveTo(11.22f, 19.82f, 11.05f, 19.63f, 10.71f, 19.29f)
                curveTo(10.21f, 18.79f, 9.33f, 18.0f, 8.0f, 18.0f)
                moveTo(22.0f, 10.5f)
                curveTo(22.0f, 10.5f, 24.0f, 12.67f, 24.0f, 14.0f)
                curveTo(24.0f, 15.1f, 23.1f, 16.0f, 22.0f, 16.0f)
                reflectiveCurveTo(20.0f, 15.1f, 20.0f, 14.0f)
                curveTo(20.0f, 12.67f, 22.0f, 10.5f, 22.0f, 10.5f)
                moveTo(22.5f, 7.13f)
                lineTo(19.24f, 5.24f)
                lineTo(12.73f, 9.0f)
                curveTo(12.39f, 8.4f, 11.74f, 8.0f, 11.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                curveTo(10.55f, 6.0f, 11.0f, 5.55f, 11.0f, 5.0f)
                reflectiveCurveTo(10.55f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 4.0f, 5.0f, 4.45f, 5.0f, 5.0f)
                reflectiveCurveTo(5.45f, 6.0f, 6.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 8.0f, 3.0f, 8.9f, 3.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.1f, 3.9f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.75f, 15.0f, 15.41f, 14.58f, 15.75f, 13.97f)
                lineTo(19.4f, 7.65f)
                lineTo(21.5f, 8.86f)
                curveTo(22.0f, 9.14f, 22.59f, 8.97f, 22.87f, 8.5f)
                curveTo(23.14f, 8.0f, 23.0f, 7.4f, 22.5f, 7.13f)
                moveTo(14.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.69f)
                lineTo(12.6f, 11.43f)
                lineTo(16.06f, 9.43f)
                lineTo(14.0f, 13.0f)
                moveTo(3.5f, 6.92f)
                lineTo(1.79f, 8.62f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.38f, 7.21f)
                lineTo(2.09f, 5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.5f, 5.5f)
                curveTo(3.89f, 5.89f, 3.89f, 6.5f, 3.5f, 6.92f)
                close()
            }
        }
        .build()
        return _oilLevel!!
    }

private var _oilLevel: ImageVector? = null
