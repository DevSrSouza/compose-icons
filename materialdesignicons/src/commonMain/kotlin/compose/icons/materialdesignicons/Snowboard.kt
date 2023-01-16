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

public val MaterialDesignIcons.Snowboard: ImageVector
    get() {
        if (_snowboard != null) {
            return _snowboard!!
        }
        _snowboard = Builder(name = "Snowboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.87f, 20.37f)
                curveTo(21.76f, 20.2f, 21.62f, 20.09f, 21.43f, 20.06f)
                curveTo(21.18f, 20.0f, 20.96f, 20.05f, 20.78f, 20.2f)
                curveTo(20.43f, 20.5f, 20.04f, 20.73f, 19.58f, 20.86f)
                curveTo(19.13f, 21.0f, 18.66f, 21.0f, 18.16f, 20.9f)
                lineTo(17.04f, 20.62f)
                lineTo(16.0f, 14.46f)
                lineTo(12.74f, 11.79f)
                lineTo(14.5f, 8.94f)
                curveTo(15.08f, 9.85f, 15.85f, 10.58f, 16.83f, 11.14f)
                curveTo(17.81f, 11.7f, 18.88f, 12.0f, 20.03f, 12.0f)
                verticalLineTo(9.97f)
                curveTo(19.09f, 9.97f, 18.26f, 9.72f, 17.53f, 9.22f)
                reflectiveCurveTo(16.26f, 8.07f, 15.92f, 7.26f)
                lineTo(15.36f, 6.05f)
                curveTo(15.26f, 5.86f, 15.08f, 5.64f, 14.82f, 5.39f)
                curveTo(14.55f, 5.14f, 14.19f, 5.0f, 13.72f, 5.0f)
                horizontalLineTo(8.07f)
                lineTo(5.54f, 9.0f)
                lineTo(7.27f, 10.06f)
                lineTo(9.14f, 7.0f)
                horizontalLineTo(11.5f)
                lineTo(9.0f, 10.95f)
                curveTo(8.69f, 11.42f, 8.6f, 11.93f, 8.72f, 12.5f)
                lineTo(9.56f, 15.95f)
                lineTo(6.06f, 18.29f)
                lineTo(5.59f, 18.19f)
                curveTo(5.13f, 18.1f, 4.7f, 17.91f, 4.33f, 17.61f)
                curveTo(3.96f, 17.31f, 3.68f, 16.96f, 3.5f, 16.56f)
                curveTo(3.4f, 16.31f, 3.23f, 16.17f, 3.0f, 16.14f)
                curveTo(2.76f, 16.08f, 2.56f, 16.11f, 2.39f, 16.23f)
                reflectiveCurveTo(2.12f, 16.5f, 2.09f, 16.7f)
                curveTo(2.06f, 16.85f, 2.07f, 17.0f, 2.13f, 17.17f)
                curveTo(2.42f, 17.79f, 2.83f, 18.33f, 3.37f, 18.78f)
                curveTo(3.92f, 19.23f, 4.55f, 19.5f, 5.27f, 19.64f)
                lineTo(17.88f, 22.35f)
                curveTo(18.6f, 22.5f, 19.29f, 22.5f, 19.96f, 22.3f)
                curveTo(20.63f, 22.12f, 21.23f, 21.79f, 21.76f, 21.32f)
                curveTo(21.88f, 21.23f, 21.96f, 21.11f, 22.0f, 20.95f)
                curveTo(22.0f, 20.73f, 22.0f, 20.54f, 21.87f, 20.37f)
                moveTo(8.77f, 18.89f)
                lineTo(11.81f, 16.89f)
                lineTo(11.34f, 13.57f)
                lineTo(14.19f, 15.58f)
                lineTo(14.94f, 20.2f)
                lineTo(8.77f, 18.89f)
                moveTo(18.0f, 3.0f)
                curveTo(18.0f, 4.11f, 17.11f, 5.0f, 16.0f, 5.0f)
                reflectiveCurveTo(14.0f, 4.11f, 14.0f, 3.0f)
                reflectiveCurveTo(14.9f, 1.0f, 16.0f, 1.0f)
                reflectiveCurveTo(18.0f, 1.9f, 18.0f, 3.0f)
                close()
            }
        }
        .build()
        return _snowboard!!
    }

private var _snowboard: ImageVector? = null
