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

public val MaterialDesignIcons.PeanutOffOutline: ImageVector
    get() {
        if (_peanutOffOutline != null) {
            return _peanutOffOutline!!
        }
        _peanutOffOutline = Builder(name = "PeanutOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.69f, 19.58f)
                curveTo(17.36f, 20.21f, 16.93f, 20.77f, 16.41f, 21.25f)
                curveTo(14.86f, 22.71f, 12.69f, 23.31f, 10.61f, 22.85f)
                curveTo(7.1f, 22.1f, 4.87f, 18.64f, 5.62f, 15.13f)
                curveTo(5.87f, 13.95f, 6.45f, 12.87f, 7.28f, 12.0f)
                curveTo(7.62f, 11.64f, 7.62f, 11.08f, 7.28f, 10.72f)
                curveTo(6.63f, 9.91f, 6.21f, 8.95f, 6.04f, 7.93f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(15.3f, 19.56f)
                curveTo(15.69f, 19.13f, 16.0f, 18.63f, 16.19f, 18.08f)
                lineTo(13.75f, 15.64f)
                curveTo(13.57f, 15.87f, 13.29f, 16.0f, 13.0f, 16.0f)
                curveTo(12.45f, 16.0f, 12.0f, 15.55f, 12.0f, 15.0f)
                curveTo(12.0f, 14.71f, 12.13f, 14.43f, 12.36f, 14.25f)
                lineTo(9.55f, 11.44f)
                curveTo(9.53f, 12.18f, 9.24f, 12.88f, 8.73f, 13.41f)
                curveTo(7.03f, 15.22f, 7.13f, 18.07f, 8.94f, 19.77f)
                lineTo(8.95f, 19.78f)
                curveTo(10.76f, 21.47f, 13.61f, 21.37f, 15.3f, 19.56f)
                moveTo(14.0f, 17.0f)
                curveTo(12.71f, 17.0f, 12.72f, 19.0f, 14.0f, 19.0f)
                curveTo(15.28f, 19.0f, 15.29f, 17.0f, 14.0f, 17.0f)
                moveTo(6.9f, 3.7f)
                lineTo(8.43f, 5.23f)
                curveTo(8.68f, 4.71f, 9.05f, 4.25f, 9.5f, 3.89f)
                curveTo(10.2f, 3.31f, 11.09f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(12.88f)
                curveTo(13.47f, 3.14f, 14.0f, 3.41f, 14.5f, 3.79f)
                curveTo(16.22f, 5.17f, 16.5f, 7.69f, 15.12f, 9.41f)
                curveTo(14.7f, 9.93f, 14.46f, 10.58f, 14.45f, 11.25f)
                lineTo(18.32f, 15.12f)
                curveTo(18.07f, 13.97f, 17.5f, 12.92f, 16.72f, 12.06f)
                curveTo(16.37f, 11.7f, 16.33f, 11.13f, 16.62f, 10.72f)
                curveTo(16.62f, 10.72f, 18.0f, 9.0f, 18.0f, 7.0f)
                reflectiveCurveTo(15.97f, 0.997f, 12.0f, 0.997f)
                reflectiveCurveTo(6.9f, 3.7f, 6.9f, 3.7f)
                moveTo(12.0f, 17.0f)
                curveTo(12.0f, 15.71f, 10.0f, 15.72f, 10.0f, 17.0f)
                curveTo(10.0f, 18.28f, 12.0f, 18.29f, 12.0f, 17.0f)
                moveTo(13.0f, 5.0f)
                curveTo(11.71f, 5.0f, 11.72f, 7.0f, 13.0f, 7.0f)
                curveTo(14.28f, 7.0f, 14.29f, 5.0f, 13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _peanutOffOutline!!
    }

private var _peanutOffOutline: ImageVector? = null
