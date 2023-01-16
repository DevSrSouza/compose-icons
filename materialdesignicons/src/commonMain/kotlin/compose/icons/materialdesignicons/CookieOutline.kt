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

public val MaterialDesignIcons.CookieOutline: ImageVector
    get() {
        if (_cookieOutline != null) {
            return _cookieOutline!!
        }
        _cookieOutline = Builder(name = "CookieOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.87f, 10.5f)
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
                curveTo(3.0f, 16.97f, 7.03f, 21.0f, 12.0f, 21.0f)
                curveTo(16.97f, 21.0f, 21.0f, 16.97f, 21.0f, 12.0f)
                curveTo(21.0f, 11.5f, 20.96f, 11.0f, 20.87f, 10.5f)
                moveTo(11.32f, 18.96f)
                curveTo(12.0f, 18.82f, 12.5f, 18.22f, 12.5f, 17.5f)
                curveTo(12.5f, 16.67f, 11.83f, 16.0f, 11.0f, 16.0f)
                reflectiveCurveTo(9.5f, 16.67f, 9.5f, 17.5f)
                curveTo(9.5f, 18.0f, 9.76f, 18.47f, 10.16f, 18.74f)
                curveTo(7.54f, 18.04f, 5.5f, 15.81f, 5.09f, 13.12f)
                curveTo(5.0f, 12.61f, 5.0f, 12.11f, 5.0f, 11.62f)
                curveTo(5.07f, 12.39f, 5.71f, 13.0f, 6.5f, 13.0f)
                curveTo(7.33f, 13.0f, 8.0f, 12.33f, 8.0f, 11.5f)
                reflectiveCurveTo(7.33f, 10.0f, 6.5f, 10.0f)
                curveTo(5.82f, 10.0f, 5.25f, 10.46f, 5.07f, 11.08f)
                curveTo(5.47f, 8.0f, 7.91f, 5.5f, 11.0f, 5.07f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 7.33f, 11.67f, 8.0f, 12.5f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.5f)
                curveTo(13.0f, 9.33f, 13.67f, 10.0f, 14.5f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.5f)
                curveTo(16.0f, 11.33f, 16.67f, 12.0f, 17.5f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 16.08f, 15.5f, 19.36f, 11.32f, 18.96f)
                moveTo(9.5f, 9.0f)
                curveTo(8.67f, 9.0f, 8.0f, 8.33f, 8.0f, 7.5f)
                reflectiveCurveTo(8.67f, 6.0f, 9.5f, 6.0f)
                reflectiveCurveTo(11.0f, 6.67f, 11.0f, 7.5f)
                reflectiveCurveTo(10.33f, 9.0f, 9.5f, 9.0f)
                moveTo(13.0f, 12.5f)
                curveTo(13.0f, 13.33f, 12.33f, 14.0f, 11.5f, 14.0f)
                reflectiveCurveTo(10.0f, 13.33f, 10.0f, 12.5f)
                reflectiveCurveTo(10.67f, 11.0f, 11.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.67f, 13.0f, 12.5f)
                moveTo(18.0f, 14.5f)
                curveTo(18.0f, 15.33f, 17.33f, 16.0f, 16.5f, 16.0f)
                reflectiveCurveTo(15.0f, 15.33f, 15.0f, 14.5f)
                reflectiveCurveTo(15.67f, 13.0f, 16.5f, 13.0f)
                reflectiveCurveTo(18.0f, 13.67f, 18.0f, 14.5f)
                close()
            }
        }
        .build()
        return _cookieOutline!!
    }

private var _cookieOutline: ImageVector? = null
