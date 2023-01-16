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

public val MaterialDesignIcons.CookieOff: ImageVector
    get() {
        if (_cookieOff != null) {
            return _cookieOff!!
        }
        _cookieOff = Builder(name = "CookieOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 6.05f)
                lineTo(7.45f, 4.25f)
                curveTo(8.79f, 3.46f, 10.34f, 3.0f, 12.0f, 3.0f)
                curveTo(12.0f, 3.0f, 13.0f, 3.0f, 13.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 6.0f, 15.0f, 6.0f, 15.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 8.0f, 18.0f, 8.0f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 10.0f, 20.6f, 10.0f, 20.87f, 10.5f)
                curveTo(20.96f, 11.0f, 21.0f, 11.5f, 21.0f, 12.0f)
                curveTo(21.0f, 13.66f, 20.54f, 15.22f, 19.75f, 16.55f)
                lineTo(17.95f, 14.75f)
                curveTo(17.97f, 14.67f, 18.0f, 14.59f, 18.0f, 14.5f)
                curveTo(18.0f, 13.67f, 17.33f, 13.0f, 16.5f, 13.0f)
                curveTo(16.41f, 13.0f, 16.33f, 13.03f, 16.25f, 13.05f)
                lineTo(10.95f, 7.75f)
                curveTo(10.97f, 7.67f, 11.0f, 7.59f, 11.0f, 7.5f)
                curveTo(11.0f, 6.67f, 10.33f, 6.0f, 9.5f, 6.0f)
                curveTo(9.41f, 6.0f, 9.33f, 6.03f, 9.25f, 6.05f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.34f, 19.23f)
                curveTo(15.85f, 20.34f, 14.0f, 21.0f, 12.0f, 21.0f)
                curveTo(7.03f, 21.0f, 3.0f, 16.97f, 3.0f, 12.0f)
                curveTo(3.0f, 10.0f, 3.66f, 8.15f, 4.77f, 6.66f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.0f, 11.5f)
                curveTo(8.0f, 10.67f, 7.33f, 10.0f, 6.5f, 10.0f)
                reflectiveCurveTo(5.0f, 10.67f, 5.0f, 11.5f)
                reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f)
                reflectiveCurveTo(8.0f, 12.33f, 8.0f, 11.5f)
                moveTo(10.0f, 12.5f)
                curveTo(10.0f, 13.33f, 10.67f, 14.0f, 11.5f, 14.0f)
                curveTo(11.68f, 14.0f, 11.85f, 13.96f, 12.0f, 13.9f)
                lineTo(10.1f, 12.0f)
                curveTo(10.04f, 12.15f, 10.0f, 12.32f, 10.0f, 12.5f)
                moveTo(12.5f, 17.5f)
                curveTo(12.5f, 16.67f, 11.83f, 16.0f, 11.0f, 16.0f)
                reflectiveCurveTo(9.5f, 16.67f, 9.5f, 17.5f)
                reflectiveCurveTo(10.17f, 19.0f, 11.0f, 19.0f)
                reflectiveCurveTo(12.5f, 18.33f, 12.5f, 17.5f)
                close()
            }
        }
        .build()
        return _cookieOff!!
    }

private var _cookieOff: ImageVector? = null
