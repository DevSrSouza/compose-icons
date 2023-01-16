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

public val MaterialDesignIcons.CookieRefresh: ImageVector
    get() {
        if (_cookieRefresh != null) {
            return _cookieRefresh!!
        }
        _cookieRefresh = Builder(name = "CookieRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                curveTo(11.53f, 16.0f, 12.0f, 16.28f, 12.26f, 16.69f)
                curveTo(13.04f, 14.0f, 15.54f, 12.0f, 18.5f, 12.0f)
                curveTo(19.38f, 12.0f, 20.21f, 12.18f, 21.0f, 12.5f)
                curveTo(21.0f, 12.33f, 21.0f, 12.17f, 21.0f, 12.0f)
                curveTo(21.0f, 11.5f, 20.96f, 11.0f, 20.87f, 10.5f)
                curveTo(20.6f, 10.0f, 20.0f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 17.0f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.0f, 14.0f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.0f, 12.0f, 3.0f, 12.0f, 3.0f)
                curveTo(7.03f, 3.0f, 3.0f, 7.03f, 3.0f, 12.0f)
                reflectiveCurveTo(7.03f, 21.0f, 12.0f, 21.0f)
                curveTo(12.17f, 21.0f, 12.33f, 21.0f, 12.5f, 21.0f)
                curveTo(12.19f, 20.24f, 12.0f, 19.44f, 12.0f, 18.61f)
                curveTo(11.74f, 18.85f, 11.39f, 19.0f, 11.0f, 19.0f)
                curveTo(10.17f, 19.0f, 9.5f, 18.33f, 9.5f, 17.5f)
                reflectiveCurveTo(10.17f, 16.0f, 11.0f, 16.0f)
                moveTo(13.0f, 12.5f)
                curveTo(13.0f, 13.33f, 12.33f, 14.0f, 11.5f, 14.0f)
                reflectiveCurveTo(10.0f, 13.33f, 10.0f, 12.5f)
                reflectiveCurveTo(10.67f, 11.0f, 11.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.67f, 13.0f, 12.5f)
                moveTo(6.5f, 13.0f)
                curveTo(5.67f, 13.0f, 5.0f, 12.33f, 5.0f, 11.5f)
                reflectiveCurveTo(5.67f, 10.0f, 6.5f, 10.0f)
                reflectiveCurveTo(8.0f, 10.67f, 8.0f, 11.5f)
                reflectiveCurveTo(7.33f, 13.0f, 6.5f, 13.0f)
                moveTo(8.0f, 7.5f)
                curveTo(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f)
                reflectiveCurveTo(11.0f, 6.67f, 11.0f, 7.5f)
                reflectiveCurveTo(10.33f, 9.0f, 9.5f, 9.0f)
                reflectiveCurveTo(8.0f, 8.33f, 8.0f, 7.5f)
                moveTo(18.0f, 18.5f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16.0f, 18.0f, 16.0f)
                curveTo(16.62f, 16.0f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21.0f, 18.0f, 21.0f)
                curveTo(18.82f, 21.0f, 19.54f, 20.61f, 20.0f, 20.0f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18.0f, 22.5f)
                curveTo(15.79f, 22.5f, 14.0f, 20.71f, 14.0f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18.0f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _cookieRefresh!!
    }

private var _cookieRefresh: ImageVector? = null
