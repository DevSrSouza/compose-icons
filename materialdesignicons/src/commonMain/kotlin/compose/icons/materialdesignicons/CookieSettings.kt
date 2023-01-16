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

public val MaterialDesignIcons.CookieSettings: ImageVector
    get() {
        if (_cookieSettings != null) {
            return _cookieSettings!!
        }
        _cookieSettings = Builder(name = "CookieSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.87f, 9.5f)
                curveTo(20.6f, 9.0f, 20.0f, 9.0f, 20.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 7.0f, 17.0f, 7.0f, 17.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 5.0f, 14.0f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                curveTo(13.0f, 2.0f, 12.0f, 2.0f, 12.0f, 2.0f)
                curveTo(7.03f, 2.0f, 3.0f, 6.03f, 3.0f, 11.0f)
                reflectiveCurveTo(7.03f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(21.0f, 15.97f, 21.0f, 11.0f)
                curveTo(21.0f, 10.5f, 20.96f, 10.0f, 20.87f, 9.5f)
                moveTo(6.5f, 12.0f)
                curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f)
                reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f)
                reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f)
                reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f)
                moveTo(8.0f, 6.5f)
                curveTo(8.0f, 5.67f, 8.67f, 5.0f, 9.5f, 5.0f)
                reflectiveCurveTo(11.0f, 5.67f, 11.0f, 6.5f)
                reflectiveCurveTo(10.33f, 8.0f, 9.5f, 8.0f)
                reflectiveCurveTo(8.0f, 7.33f, 8.0f, 6.5f)
                moveTo(11.0f, 18.0f)
                curveTo(10.17f, 18.0f, 9.5f, 17.33f, 9.5f, 16.5f)
                reflectiveCurveTo(10.17f, 15.0f, 11.0f, 15.0f)
                reflectiveCurveTo(12.5f, 15.67f, 12.5f, 16.5f)
                reflectiveCurveTo(11.83f, 18.0f, 11.0f, 18.0f)
                moveTo(11.5f, 13.0f)
                curveTo(10.67f, 13.0f, 10.0f, 12.33f, 10.0f, 11.5f)
                reflectiveCurveTo(10.67f, 10.0f, 11.5f, 10.0f)
                reflectiveCurveTo(13.0f, 10.67f, 13.0f, 11.5f)
                reflectiveCurveTo(12.33f, 13.0f, 11.5f, 13.0f)
                moveTo(16.5f, 15.0f)
                curveTo(15.67f, 15.0f, 15.0f, 14.33f, 15.0f, 13.5f)
                reflectiveCurveTo(15.67f, 12.0f, 16.5f, 12.0f)
                reflectiveCurveTo(18.0f, 12.67f, 18.0f, 13.5f)
                reflectiveCurveTo(17.33f, 15.0f, 16.5f, 15.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _cookieSettings!!
    }

private var _cookieSettings: ImageVector? = null
