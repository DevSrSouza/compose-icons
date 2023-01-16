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

public val MaterialDesignIcons.CookieClock: ImageVector
    get() {
        if (_cookieClock != null) {
            return _cookieClock!!
        }
        _cookieClock = Builder(name = "CookieClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.97f, 10.24f)
                curveTo(19.95f, 10.0f, 19.91f, 9.74f, 19.87f, 9.5f)
                curveTo(19.6f, 9.0f, 19.0f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.0f, 16.0f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                curveTo(14.0f, 5.0f, 13.0f, 5.0f, 13.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                curveTo(12.0f, 2.0f, 11.0f, 2.0f, 11.0f, 2.0f)
                curveTo(6.03f, 2.0f, 2.0f, 6.03f, 2.0f, 11.0f)
                curveTo(2.0f, 15.71f, 5.62f, 19.57f, 10.23f, 19.96f)
                curveTo(11.5f, 21.8f, 13.61f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 13.61f, 21.8f, 11.5f, 19.97f, 10.24f)
                moveTo(11.64f, 10.53f)
                curveTo(10.87f, 11.15f, 10.23f, 11.92f, 9.78f, 12.81f)
                curveTo(9.32f, 12.55f, 9.0f, 12.06f, 9.0f, 11.5f)
                curveTo(9.0f, 10.67f, 9.67f, 10.0f, 10.5f, 10.0f)
                curveTo(10.96f, 10.0f, 11.36f, 10.21f, 11.64f, 10.53f)
                moveTo(5.5f, 12.0f)
                curveTo(4.67f, 12.0f, 4.0f, 11.33f, 4.0f, 10.5f)
                reflectiveCurveTo(4.67f, 9.0f, 5.5f, 9.0f)
                reflectiveCurveTo(7.0f, 9.67f, 7.0f, 10.5f)
                reflectiveCurveTo(6.33f, 12.0f, 5.5f, 12.0f)
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 5.67f, 7.67f, 5.0f, 8.5f, 5.0f)
                reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f)
                reflectiveCurveTo(9.33f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(7.0f, 7.33f, 7.0f, 6.5f)
                moveTo(8.5f, 16.5f)
                curveTo(8.5f, 16.04f, 8.71f, 15.64f, 9.03f, 15.36f)
                curveTo(9.0f, 15.57f, 9.0f, 15.79f, 9.0f, 16.0f)
                curveTo(9.0f, 16.62f, 9.09f, 17.22f, 9.24f, 17.79f)
                curveTo(8.8f, 17.5f, 8.5f, 17.05f, 8.5f, 16.5f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }
        .build()
        return _cookieClock!!
    }

private var _cookieClock: ImageVector? = null
