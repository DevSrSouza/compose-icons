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

public val MaterialDesignIcons.CookieAlert: ImageVector
    get() {
        if (_cookieAlert != null) {
            return _cookieAlert!!
        }
        _cookieAlert = Builder(name = "CookieAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 8.0f, 15.0f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.0f, 12.0f, 6.0f, 12.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.0f, 10.0f, 3.0f, 10.0f, 3.0f)
                curveTo(5.0f, 3.0f, 1.0f, 7.0f, 1.0f, 12.0f)
                reflectiveCurveTo(5.0f, 21.0f, 10.0f, 21.0f)
                reflectiveCurveTo(19.0f, 17.0f, 19.0f, 12.0f)
                curveTo(19.0f, 11.5f, 19.0f, 11.0f, 18.9f, 10.5f)
                curveTo(18.6f, 10.0f, 18.0f, 10.0f, 18.0f, 10.0f)
                moveTo(4.5f, 13.0f)
                curveTo(3.7f, 13.0f, 3.0f, 12.3f, 3.0f, 11.5f)
                reflectiveCurveTo(3.7f, 10.0f, 4.5f, 10.0f)
                reflectiveCurveTo(6.0f, 10.7f, 6.0f, 11.5f)
                reflectiveCurveTo(5.3f, 13.0f, 4.5f, 13.0f)
                moveTo(6.0f, 7.5f)
                curveTo(6.0f, 6.7f, 6.7f, 6.0f, 7.5f, 6.0f)
                reflectiveCurveTo(9.0f, 6.7f, 9.0f, 7.5f)
                reflectiveCurveTo(8.3f, 9.0f, 7.5f, 9.0f)
                reflectiveCurveTo(6.0f, 8.3f, 6.0f, 7.5f)
                moveTo(9.0f, 19.0f)
                curveTo(8.2f, 19.0f, 7.5f, 18.3f, 7.5f, 17.5f)
                reflectiveCurveTo(8.2f, 16.0f, 9.0f, 16.0f)
                reflectiveCurveTo(10.5f, 16.7f, 10.5f, 17.5f)
                reflectiveCurveTo(9.8f, 19.0f, 9.0f, 19.0f)
                moveTo(9.5f, 14.0f)
                curveTo(8.7f, 14.0f, 8.0f, 13.3f, 8.0f, 12.5f)
                reflectiveCurveTo(8.7f, 11.0f, 9.5f, 11.0f)
                reflectiveCurveTo(11.0f, 11.7f, 11.0f, 12.5f)
                reflectiveCurveTo(10.3f, 14.0f, 9.5f, 14.0f)
                moveTo(14.5f, 16.0f)
                curveTo(13.7f, 16.0f, 13.0f, 15.3f, 13.0f, 14.5f)
                reflectiveCurveTo(13.7f, 13.0f, 14.5f, 13.0f)
                curveTo(15.3f, 13.0f, 16.0f, 13.7f, 16.0f, 14.5f)
                reflectiveCurveTo(15.3f, 16.0f, 14.5f, 16.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                moveTo(23.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _cookieAlert!!
    }

private var _cookieAlert: ImageVector? = null
