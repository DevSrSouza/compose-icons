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

public val MaterialDesignIcons.CookieClockOutline: ImageVector
    get() {
        if (_cookieClockOutline != null) {
            return _cookieClockOutline!!
        }
        _cookieClockOutline = Builder(name = "CookieClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 8.0f)
                curveTo(7.67f, 8.0f, 7.0f, 7.33f, 7.0f, 6.5f)
                reflectiveCurveTo(7.67f, 5.0f, 8.5f, 5.0f)
                reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f)
                reflectiveCurveTo(9.33f, 8.0f, 8.5f, 8.0f)
                moveTo(16.5f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12.0f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(13.61f, 23.0f, 11.5f, 21.8f, 10.23f, 19.96f)
                curveTo(5.62f, 19.57f, 2.0f, 15.71f, 2.0f, 11.0f)
                curveTo(2.0f, 6.03f, 6.03f, 2.0f, 11.0f, 2.0f)
                curveTo(11.0f, 2.0f, 12.0f, 2.0f, 12.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 5.0f, 14.0f, 5.0f, 14.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 7.0f, 17.0f, 7.0f, 17.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 9.0f, 19.6f, 9.0f, 19.87f, 9.5f)
                curveTo(19.91f, 9.74f, 19.95f, 10.0f, 19.97f, 10.24f)
                curveTo(21.8f, 11.5f, 23.0f, 13.61f, 23.0f, 16.0f)
                moveTo(9.16f, 17.74f)
                curveTo(8.76f, 17.47f, 8.5f, 17.0f, 8.5f, 16.5f)
                curveTo(8.5f, 16.04f, 8.71f, 15.64f, 9.03f, 15.36f)
                curveTo(9.12f, 14.45f, 9.38f, 13.59f, 9.78f, 12.81f)
                curveTo(9.32f, 12.55f, 9.0f, 12.06f, 9.0f, 11.5f)
                curveTo(9.0f, 10.67f, 9.67f, 10.0f, 10.5f, 10.0f)
                curveTo(10.96f, 10.0f, 11.36f, 10.21f, 11.64f, 10.53f)
                curveTo(12.59f, 9.77f, 13.74f, 9.26f, 15.0f, 9.08f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.5f)
                curveTo(12.67f, 9.0f, 12.0f, 8.33f, 12.0f, 7.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5f)
                curveTo(10.67f, 7.0f, 10.0f, 6.33f, 10.0f, 5.5f)
                verticalLineTo(4.07f)
                curveTo(6.91f, 4.5f, 4.47f, 7.0f, 4.07f, 10.08f)
                curveTo(4.25f, 9.46f, 4.82f, 9.0f, 5.5f, 9.0f)
                curveTo(6.33f, 9.0f, 7.0f, 9.67f, 7.0f, 10.5f)
                reflectiveCurveTo(6.33f, 12.0f, 5.5f, 12.0f)
                curveTo(4.71f, 12.0f, 4.07f, 11.39f, 4.0f, 10.62f)
                curveTo(4.0f, 11.11f, 4.0f, 11.61f, 4.09f, 12.12f)
                curveTo(4.5f, 14.81f, 6.54f, 17.04f, 9.16f, 17.74f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cookieClockOutline!!
    }

private var _cookieClockOutline: ImageVector? = null
