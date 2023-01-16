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

public val MaterialDesignIcons.SunWirelessOutline: ImageVector
    get() {
        if (_sunWirelessOutline != null) {
            return _sunWirelessOutline!!
        }
        _sunWirelessOutline = Builder(name = "SunWirelessOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.0f)
                lineTo(13.39f, 4.42f)
                curveTo(12.65f, 4.15f, 11.84f, 4.0f, 11.0f, 4.0f)
                reflectiveCurveTo(9.35f, 4.15f, 8.61f, 4.42f)
                lineTo(11.0f, 1.0f)
                moveTo(2.34f, 6.0f)
                lineTo(6.5f, 5.65f)
                curveTo(5.9f, 6.16f, 5.36f, 6.78f, 4.94f, 7.5f)
                curveTo(4.5f, 8.24f, 4.25f, 9.0f, 4.11f, 9.79f)
                lineTo(2.34f, 6.0f)
                moveTo(2.36f, 16.0f)
                lineTo(4.12f, 12.23f)
                curveTo(4.26f, 13.0f, 4.53f, 13.78f, 4.95f, 14.5f)
                curveTo(5.37f, 15.24f, 5.91f, 15.86f, 6.5f, 16.37f)
                lineTo(2.36f, 16.0f)
                moveTo(19.65f, 6.0f)
                lineTo(17.88f, 9.79f)
                curveTo(17.74f, 9.0f, 17.47f, 8.23f, 17.05f, 7.5f)
                curveTo(16.63f, 6.78f, 16.1f, 6.15f, 15.5f, 5.64f)
                lineTo(19.65f, 6.0f)
                moveTo(23.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 15.05f, 20.22f, 17.1f, 18.66f, 18.66f)
                curveTo(17.09f, 20.23f, 15.05f, 21.0f, 13.0f, 21.0f)
                verticalLineTo(23.0f)
                curveTo(15.56f, 23.0f, 18.12f, 22.0f, 20.07f, 20.07f)
                reflectiveCurveTo(23.0f, 15.56f, 23.0f, 13.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 14.0f, 16.61f, 15.05f, 15.83f, 15.83f)
                curveTo(15.05f, 16.61f, 14.0f, 17.0f, 13.0f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(14.54f, 19.0f, 16.08f, 18.41f, 17.25f, 17.24f)
                curveTo(18.41f, 16.08f, 19.0f, 14.54f, 19.0f, 13.0f)
                moveTo(11.0f, 8.0f)
                curveTo(12.65f, 8.0f, 14.0f, 9.35f, 14.0f, 11.0f)
                reflectiveCurveTo(12.65f, 14.0f, 11.0f, 14.0f)
                reflectiveCurveTo(8.0f, 12.65f, 8.0f, 11.0f)
                reflectiveCurveTo(9.35f, 8.0f, 11.0f, 8.0f)
                moveTo(11.0f, 6.0f)
                curveTo(8.24f, 6.0f, 6.0f, 8.24f, 6.0f, 11.0f)
                reflectiveCurveTo(8.24f, 16.0f, 11.0f, 16.0f)
                reflectiveCurveTo(16.0f, 13.76f, 16.0f, 11.0f)
                reflectiveCurveTo(13.76f, 6.0f, 11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _sunWirelessOutline!!
    }

private var _sunWirelessOutline: ImageVector? = null
