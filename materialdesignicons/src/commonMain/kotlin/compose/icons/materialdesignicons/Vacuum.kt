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

public val MaterialDesignIcons.Vacuum: ImageVector
    get() {
        if (_vacuum != null) {
            return _vacuum!!
        }
        _vacuum = Builder(name = "Vacuum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0f, 20.0f)
                horizontalLineTo(18.46f)
                lineTo(12.0f, 4.61f)
                curveTo(11.81f, 4.14f, 11.5f, 3.76f, 11.06f, 3.46f)
                reflectiveCurveTo(10.14f, 3.0f, 9.61f, 3.0f)
                curveTo(8.9f, 3.0f, 8.28f, 3.27f, 7.76f, 3.79f)
                reflectiveCurveTo(7.0f, 4.92f, 7.0f, 5.64f)
                lineTo(7.0f, 9.0f)
                horizontalLineTo(8.0f)
                curveTo(10.21f, 9.0f, 12.0f, 10.79f, 12.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                curveTo(8.61f, 21.16f, 9.0f, 20.13f, 9.0f, 19.0f)
                curveTo(9.0f, 16.24f, 6.76f, 14.0f, 4.0f, 14.0f)
                curveTo(3.29f, 14.0f, 2.61f, 14.15f, 2.0f, 14.42f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.64f)
                curveTo(5.0f, 4.8f, 5.23f, 4.0f, 5.63f, 3.32f)
                curveTo(6.04f, 2.62f, 6.59f, 2.06f, 7.3f, 1.63f)
                curveTo(8.0f, 1.21f, 8.77f, 1.0f, 9.61f, 1.0f)
                curveTo(10.55f, 1.0f, 11.4f, 1.26f, 12.16f, 1.77f)
                reflectiveCurveTo(13.5f, 2.97f, 13.87f, 3.81f)
                lineTo(20.66f, 20.0f)
                horizontalLineTo(23.0f)
                moveTo(7.0f, 19.0f)
                curveTo(7.0f, 20.66f, 5.66f, 22.0f, 4.0f, 22.0f)
                reflectiveCurveTo(1.0f, 20.66f, 1.0f, 19.0f)
                reflectiveCurveTo(2.34f, 16.0f, 4.0f, 16.0f)
                reflectiveCurveTo(7.0f, 17.34f, 7.0f, 19.0f)
                moveTo(5.0f, 19.0f)
                curveTo(5.0f, 18.45f, 4.55f, 18.0f, 4.0f, 18.0f)
                reflectiveCurveTo(3.0f, 18.45f, 3.0f, 19.0f)
                reflectiveCurveTo(3.45f, 20.0f, 4.0f, 20.0f)
                reflectiveCurveTo(5.0f, 19.55f, 5.0f, 19.0f)
                close()
            }
        }
        .build()
        return _vacuum!!
    }

private var _vacuum: ImageVector? = null
