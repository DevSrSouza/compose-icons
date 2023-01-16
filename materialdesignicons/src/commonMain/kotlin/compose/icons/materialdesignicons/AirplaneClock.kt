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

public val MaterialDesignIcons.AirplaneClock: ImageVector
    get() {
        if (_airplaneClock != null) {
            return _airplaneClock!!
        }
        _airplaneClock = Builder(name = "AirplaneClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(15.09f, 9.0f, 14.23f, 9.18f, 13.43f, 9.5f)
                lineTo(12.73f, 6.45f)
                lineTo(16.62f, 2.56f)
                curveTo(17.2f, 2.0f, 17.2f, 1.03f, 16.62f, 0.44f)
                reflectiveCurveTo(15.08f, -0.146f, 14.5f, 0.44f)
                lineTo(10.61f, 4.33f)
                lineTo(1.41f, 2.21f)
                lineTo(0.0f, 3.62f)
                lineTo(7.43f, 7.5f)
                lineTo(3.54f, 11.4f)
                lineTo(1.06f, 11.05f)
                lineTo(0.0f, 12.11f)
                lineTo(3.18f, 13.87f)
                lineTo(4.95f, 17.06f)
                lineTo(6.0f, 16.0f)
                lineTo(5.66f, 13.5f)
                lineTo(9.55f, 9.63f)
                lineTo(10.57f, 11.59f)
                curveTo(9.59f, 12.79f, 9.0f, 14.33f, 9.0f, 16.0f)
                curveTo(9.0f, 19.87f, 12.13f, 23.0f, 16.0f, 23.0f)
                reflectiveCurveTo(23.0f, 19.87f, 23.0f, 16.0f)
                reflectiveCurveTo(19.87f, 9.0f, 16.0f, 9.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                moveTo(16.5f, 16.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                close()
            }
        }
        .build()
        return _airplaneClock!!
    }

private var _airplaneClock: ImageVector? = null
