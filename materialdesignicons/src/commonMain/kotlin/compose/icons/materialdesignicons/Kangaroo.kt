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

public val MaterialDesignIcons.Kangaroo: ImageVector
    get() {
        if (_kangaroo != null) {
            return _kangaroo!!
        }
        _kangaroo = Builder(name = "Kangaroo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8f, 6.59f)
                lineTo(19.0f, 7.97f)
                verticalLineTo(10.04f)
                lineTo(17.69f, 11.61f)
                lineTo(17.31f, 13.25f)
                lineTo(16.0f, 14.0f)
                lineTo(15.5f, 13.12f)
                lineTo(16.44f, 12.59f)
                lineTo(16.7f, 11.45f)
                lineTo(16.7f, 11.45f)
                lineTo(16.77f, 11.15f)
                lineTo(16.77f, 11.15f)
                verticalLineTo(11.15f)
                lineTo(17.47f, 10.31f)
                curveTo(17.65f, 10.1f, 17.62f, 9.78f, 17.41f, 9.61f)
                curveTo(17.2f, 9.43f, 16.88f, 9.46f, 16.7f, 9.67f)
                lineTo(15.85f, 10.69f)
                lineTo(15.56f, 11.93f)
                curveTo(15.38f, 11.96f, 15.2f, 12.0f, 15.0f, 12.0f)
                curveTo(14.31f, 12.0f, 13.68f, 11.76f, 13.23f, 11.4f)
                curveTo(13.15f, 12.7f, 12.73f, 13.81f, 12.13f, 14.43f)
                lineTo(10.5f, 16.19f)
                lineTo(9.96f, 19.79f)
                lineTo(8.07f, 21.0f)
                lineTo(7.53f, 20.17f)
                lineTo(9.04f, 19.19f)
                lineTo(9.5f, 15.92f)
                lineTo(9.5f, 15.91f)
                lineTo(10.0f, 14.54f)
                curveTo(9.47f, 14.08f, 9.08f, 13.28f, 8.88f, 12.3f)
                lineTo(8.71f, 12.61f)
                curveTo(8.35f, 13.25f, 8.0f, 13.9f, 7.56f, 14.56f)
                curveTo(7.11f, 15.2f, 6.66f, 15.9f, 5.78f, 16.44f)
                curveTo(5.34f, 16.72f, 4.7f, 16.84f, 4.17f, 16.73f)
                curveTo(3.61f, 16.61f, 3.14f, 16.26f, 2.86f, 15.89f)
                curveTo(2.31f, 15.13f, 2.15f, 14.35f, 2.0f, 13.62f)
                lineTo(2.97f, 13.36f)
                curveTo(3.2f, 14.0f, 3.5f, 14.65f, 3.88f, 15.0f)
                curveTo(4.26f, 15.33f, 4.57f, 15.26f, 4.84f, 15.0f)
                curveTo(5.16f, 14.73f, 5.47f, 14.15f, 5.73f, 13.55f)
                curveTo(6.0f, 12.94f, 6.22f, 12.28f, 6.45f, 11.6f)
                curveTo(6.93f, 10.24f, 7.39f, 8.82f, 8.2f, 7.36f)
                curveTo(8.62f, 6.64f, 9.13f, 5.89f, 9.92f, 5.22f)
                curveTo(10.7f, 4.55f, 11.73f, 4.0f, 13.0f, 4.0f)
                reflectiveCurveTo(15.7f, 5.22f, 16.58f, 6.34f)
                curveTo(17.0f, 6.89f, 17.87f, 6.82f, 18.22f, 6.21f)
                lineTo(19.14f, 4.63f)
                curveTo(19.0f, 4.58f, 18.89f, 4.5f, 18.79f, 4.4f)
                curveTo(18.4f, 4.0f, 18.4f, 3.38f, 18.79f, 3.0f)
                lineTo(19.93f, 4.13f)
                curveTo(19.96f, 4.13f, 20.0f, 4.11f, 20.0f, 4.11f)
                curveTo(20.41f, 4.11f, 20.75f, 4.35f, 20.91f, 4.69f)
                lineTo(22.0f, 7.0f)
                lineTo(21.0f, 7.5f)
                lineTo(19.8f, 6.59f)
                close()
            }
        }
        .build()
        return _kangaroo!!
    }

private var _kangaroo: ImageVector? = null
