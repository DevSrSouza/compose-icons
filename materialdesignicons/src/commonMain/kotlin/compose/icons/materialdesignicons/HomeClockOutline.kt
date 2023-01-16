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

public val MaterialDesignIcons.HomeClockOutline: ImageVector
    get() {
        if (_homeClockOutline != null) {
            return _homeClockOutline!!
        }
        _homeClockOutline = Builder(name = "HomeClockOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.87f, 19.87f, 23.0f, 16.0f, 23.0f)
                curveTo(13.62f, 23.0f, 11.53f, 21.81f, 10.26f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.0f)
                lineTo(11.0f, 3.0f)
                lineTo(18.0f, 9.29f)
                curveTo(20.89f, 10.15f, 23.0f, 12.83f, 23.0f, 16.0f)
                moveTo(9.29f, 18.0f)
                curveTo(9.11f, 17.37f, 9.0f, 16.7f, 9.0f, 16.0f)
                curveTo(9.0f, 12.54f, 11.5f, 9.68f, 14.8f, 9.11f)
                lineTo(11.0f, 5.69f)
                lineTo(6.0f, 10.19f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.29f)
                moveTo(21.0f, 16.0f)
                curveTo(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(11.0f, 13.24f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 21.0f, 16.0f, 21.0f)
                reflectiveCurveTo(21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _homeClockOutline!!
    }

private var _homeClockOutline: ImageVector? = null
