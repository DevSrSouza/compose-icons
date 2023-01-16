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

public val MaterialDesignIcons.AirHumidifier: ImageVector
    get() {
        if (_airHumidifier != null) {
            return _airHumidifier!!
        }
        _airHumidifier = Builder(name = "AirHumidifier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                curveTo(8.79f, 9.0f, 7.0f, 10.79f, 7.0f, 13.0f)
                reflectiveCurveTo(8.79f, 17.0f, 11.0f, 17.0f)
                reflectiveCurveTo(15.0f, 15.21f, 15.0f, 13.0f)
                reflectiveCurveTo(13.21f, 9.0f, 11.0f, 9.0f)
                moveTo(11.0f, 15.0f)
                curveTo(9.9f, 15.0f, 9.0f, 14.11f, 9.0f, 13.0f)
                reflectiveCurveTo(9.9f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveTo(13.0f, 11.9f, 13.0f, 13.0f)
                reflectiveCurveTo(12.11f, 15.0f, 11.0f, 15.0f)
                moveTo(7.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(16.21f, 4.0f, 18.0f, 5.79f, 18.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.9f, 15.11f, 6.0f, 14.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 5.79f, 4.79f, 4.0f, 7.0f, 4.0f)
                moveTo(19.0f, 10.5f)
                curveTo(19.0f, 10.5f, 21.0f, 12.67f, 21.0f, 14.0f)
                curveTo(21.0f, 15.1f, 20.1f, 16.0f, 19.0f, 16.0f)
                reflectiveCurveTo(17.0f, 15.1f, 17.0f, 14.0f)
                curveTo(17.0f, 12.67f, 19.0f, 10.5f, 19.0f, 10.5f)
            }
        }
        .build()
        return _airHumidifier!!
    }

private var _airHumidifier: ImageVector? = null
