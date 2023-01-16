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

public val MaterialDesignIcons.Turbine: ImageVector
    get() {
        if (_turbine != null) {
            return _turbine!!
        }
        _turbine = Builder(name = "Turbine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(12.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                reflectiveCurveTo(7.58f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(20.0f, 7.58f, 20.0f, 12.0f)
                reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f)
                moveTo(17.21f, 12.55f)
                lineTo(15.86f, 12.19f)
                lineTo(17.3f, 11.81f)
                lineTo(19.23f, 11.29f)
                curveTo(18.95f, 10.22f, 17.85f, 9.59f, 16.79f, 9.87f)
                lineTo(15.44f, 10.23f)
                lineTo(16.5f, 9.18f)
                lineTo(17.91f, 7.77f)
                curveTo(17.13f, 7.0f, 15.86f, 7.0f, 15.08f, 7.76f)
                lineTo(15.08f, 7.77f)
                lineTo(14.1f, 8.75f)
                lineTo(14.5f, 7.31f)
                lineTo(15.0f, 5.38f)
                curveTo(13.93f, 5.09f, 12.84f, 5.72f, 12.55f, 6.79f)
                lineTo(12.19f, 8.14f)
                lineTo(11.81f, 6.7f)
                lineTo(11.29f, 4.77f)
                curveTo(10.22f, 5.05f, 9.59f, 6.15f, 9.87f, 7.22f)
                lineTo(10.23f, 8.56f)
                lineTo(9.18f, 7.5f)
                lineTo(7.77f, 6.09f)
                curveTo(7.0f, 6.87f, 7.0f, 8.14f, 7.76f, 8.92f)
                lineTo(7.77f, 8.92f)
                lineTo(8.75f, 9.9f)
                lineTo(7.31f, 9.5f)
                lineTo(5.38f, 9.0f)
                curveTo(5.09f, 10.07f, 5.72f, 11.16f, 6.79f, 11.45f)
                lineTo(8.14f, 11.81f)
                lineTo(6.7f, 12.2f)
                lineTo(4.77f, 12.71f)
                curveTo(5.05f, 13.78f, 6.15f, 14.41f, 7.22f, 14.13f)
                lineTo(8.56f, 13.77f)
                lineTo(7.5f, 14.82f)
                lineTo(6.09f, 16.23f)
                curveTo(6.87f, 17.0f, 8.14f, 17.0f, 8.92f, 16.24f)
                lineTo(8.92f, 16.23f)
                lineTo(9.9f, 15.25f)
                lineTo(9.5f, 16.69f)
                lineTo(9.0f, 18.62f)
                curveTo(10.07f, 18.91f, 11.16f, 18.28f, 11.45f, 17.21f)
                lineTo(11.81f, 15.86f)
                lineTo(12.2f, 17.3f)
                lineTo(12.71f, 19.23f)
                curveTo(13.78f, 18.95f, 14.41f, 17.85f, 14.13f, 16.79f)
                lineTo(13.77f, 15.44f)
                lineTo(14.82f, 16.5f)
                lineTo(16.24f, 17.91f)
                curveTo(17.0f, 17.13f, 17.0f, 15.86f, 16.24f, 15.08f)
                lineTo(16.24f, 15.08f)
                lineTo(15.25f, 14.1f)
                lineTo(16.69f, 14.5f)
                lineTo(18.62f, 15.0f)
                curveTo(18.91f, 13.93f, 18.28f, 12.84f, 17.21f, 12.55f)
                moveTo(12.0f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12.0f)
                reflectiveCurveTo(11.17f, 10.5f, 12.0f, 10.5f)
                reflectiveCurveTo(13.5f, 11.17f, 13.5f, 12.0f)
                reflectiveCurveTo(12.83f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _turbine!!
    }

private var _turbine: ImageVector? = null
