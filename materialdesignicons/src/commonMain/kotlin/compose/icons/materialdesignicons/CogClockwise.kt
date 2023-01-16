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

public val MaterialDesignIcons.CogClockwise: ImageVector
    get() {
        if (_cogClockwise != null) {
            return _cogClockwise!!
        }
        _cogClockwise = Builder(name = "CogClockwise", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.03f, 3.0f, 3.0f, 7.03f, 3.0f, 12.0f)
                reflectiveCurveTo(7.03f, 21.0f, 12.0f, 21.0f)
                curveTo(14.0f, 21.0f, 15.92f, 20.34f, 17.5f, 19.14f)
                lineTo(16.06f, 17.7f)
                curveTo(14.87f, 18.54f, 13.45f, 19.0f, 12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 5.0f, 15.87f, 5.0f, 12.0f)
                reflectiveCurveTo(8.13f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(19.0f, 8.13f, 19.0f, 12.0f)
                horizontalLineTo(16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(24.0f, 12.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 7.03f, 16.97f, 3.0f, 12.0f, 3.0f)
                moveTo(7.71f, 13.16f)
                curveTo(7.62f, 13.23f, 7.59f, 13.35f, 7.64f, 13.45f)
                lineTo(8.54f, 15.0f)
                curveTo(8.6f, 15.12f, 8.72f, 15.12f, 8.82f, 15.12f)
                lineTo(9.95f, 14.67f)
                curveTo(10.19f, 14.83f, 10.44f, 14.97f, 10.7f, 15.09f)
                lineTo(10.88f, 16.28f)
                curveTo(10.9f, 16.39f, 11.0f, 16.47f, 11.1f, 16.47f)
                horizontalLineTo(12.9f)
                curveTo(13.0f, 16.5f, 13.11f, 16.41f, 13.13f, 16.3f)
                lineTo(13.31f, 15.12f)
                curveTo(13.58f, 15.0f, 13.84f, 14.85f, 14.07f, 14.67f)
                lineTo(15.19f, 15.12f)
                curveTo(15.3f, 15.16f, 15.42f, 15.11f, 15.47f, 15.0f)
                lineTo(16.37f, 13.5f)
                curveTo(16.42f, 13.38f, 16.39f, 13.26f, 16.31f, 13.19f)
                lineTo(15.31f, 12.45f)
                curveTo(15.34f, 12.15f, 15.34f, 11.85f, 15.31f, 11.55f)
                lineTo(16.31f, 10.79f)
                curveTo(16.4f, 10.72f, 16.42f, 10.61f, 16.37f, 10.5f)
                lineTo(15.47f, 8.95f)
                curveTo(15.41f, 8.85f, 15.3f, 8.81f, 15.19f, 8.85f)
                lineTo(14.07f, 9.3f)
                curveTo(13.83f, 9.13f, 13.57f, 9.0f, 13.3f, 8.88f)
                lineTo(13.13f, 7.69f)
                curveTo(13.11f, 7.58f, 13.0f, 7.5f, 12.9f, 7.5f)
                horizontalLineTo(11.14f)
                curveTo(11.04f, 7.5f, 10.95f, 7.57f, 10.93f, 7.67f)
                lineTo(10.76f, 8.85f)
                curveTo(10.5f, 8.97f, 10.23f, 9.12f, 10.0f, 9.3f)
                lineTo(8.85f, 8.88f)
                curveTo(8.74f, 8.84f, 8.61f, 8.89f, 8.56f, 9.0f)
                lineTo(7.65f, 10.5f)
                curveTo(7.6f, 10.62f, 7.63f, 10.74f, 7.71f, 10.81f)
                lineTo(8.71f, 11.55f)
                curveTo(8.69f, 11.7f, 8.69f, 11.85f, 8.71f, 12.0f)
                curveTo(8.7f, 12.15f, 8.7f, 12.3f, 8.71f, 12.45f)
                lineTo(7.71f, 13.19f)
                moveTo(12.0f, 13.5f)
                horizontalLineTo(12.0f)
                curveTo(11.16f, 13.5f, 10.5f, 12.82f, 10.5f, 12.0f)
                curveTo(10.5f, 11.17f, 11.17f, 10.5f, 12.0f, 10.5f)
                reflectiveCurveTo(13.5f, 11.17f, 13.5f, 12.0f)
                reflectiveCurveTo(12.83f, 13.5f, 12.0f, 13.5f)
            }
        }
        .build()
        return _cogClockwise!!
    }

private var _cogClockwise: ImageVector? = null
