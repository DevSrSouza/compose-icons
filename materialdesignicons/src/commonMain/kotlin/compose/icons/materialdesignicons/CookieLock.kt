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

public val MaterialDesignIcons.CookieLock: ImageVector
    get() {
        if (_cookieLock != null) {
            return _cookieLock!!
        }
        _cookieLock = Builder(name = "CookieLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveTo(19.42f, 11.0f, 20.27f, 11.29f, 21.0f, 11.77f)
                curveTo(21.0f, 11.35f, 20.95f, 10.92f, 20.87f, 10.5f)
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
                curveTo(12.34f, 21.0f, 12.67f, 21.0f, 13.0f, 20.94f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 16.08f, 13.42f, 15.26f, 14.07f, 14.71f)
                curveTo(14.45f, 12.6f, 16.29f, 11.0f, 18.5f, 11.0f)
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
                moveTo(21.0f, 16.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 14.12f, 19.88f, 13.0f, 18.5f, 13.0f)
                reflectiveCurveTo(16.0f, 14.12f, 16.0f, 15.5f)
                verticalLineTo(16.0f)
                curveTo(15.45f, 16.0f, 15.0f, 16.45f, 15.0f, 17.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.55f, 15.45f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 22.0f, 22.0f, 21.55f, 22.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 16.45f, 21.55f, 16.0f, 21.0f, 16.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 14.67f, 17.67f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(20.0f, 14.67f, 20.0f, 15.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cookieLock!!
    }

private var _cookieLock: ImageVector? = null
