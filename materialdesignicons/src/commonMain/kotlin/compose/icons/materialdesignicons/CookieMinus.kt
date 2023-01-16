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

public val MaterialDesignIcons.CookieMinus: ImageVector
    get() {
        if (_cookieMinus != null) {
            return _cookieMinus!!
        }
        _cookieMinus = Builder(name = "CookieMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.53f)
                curveTo(15.0f, 14.5f, 15.0f, 14.5f, 15.0f, 14.5f)
                curveTo(15.0f, 13.67f, 15.67f, 13.0f, 16.5f, 13.0f)
                curveTo(16.8f, 13.0f, 17.08f, 13.09f, 17.32f, 13.24f)
                curveTo(17.85f, 13.09f, 18.42f, 13.0f, 19.0f, 13.0f)
                curveTo(19.66f, 13.0f, 20.3f, 13.12f, 20.89f, 13.32f)
                curveTo(20.96f, 12.89f, 21.0f, 12.45f, 21.0f, 12.0f)
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
                curveTo(12.45f, 21.0f, 12.89f, 20.96f, 13.32f, 20.89f)
                curveTo(13.12f, 20.3f, 13.0f, 19.66f, 13.0f, 19.0f)
                curveTo(13.0f, 17.22f, 13.78f, 15.63f, 15.0f, 14.53f)
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
                moveTo(11.0f, 19.0f)
                curveTo(10.17f, 19.0f, 9.5f, 18.33f, 9.5f, 17.5f)
                reflectiveCurveTo(10.17f, 16.0f, 11.0f, 16.0f)
                reflectiveCurveTo(12.5f, 16.67f, 12.5f, 17.5f)
                reflectiveCurveTo(11.83f, 19.0f, 11.0f, 19.0f)
                moveTo(11.5f, 14.0f)
                curveTo(10.67f, 14.0f, 10.0f, 13.33f, 10.0f, 12.5f)
                reflectiveCurveTo(10.67f, 11.0f, 11.5f, 11.0f)
                reflectiveCurveTo(13.0f, 11.67f, 13.0f, 12.5f)
                reflectiveCurveTo(12.33f, 14.0f, 11.5f, 14.0f)
                moveTo(23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _cookieMinus!!
    }

private var _cookieMinus: ImageVector? = null
