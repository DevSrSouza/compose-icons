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

public val MaterialDesignIcons.SunClockOutline: ImageVector
    get() {
        if (_sunClockOutline != null) {
            return _sunClockOutline!!
        }
        _sunClockOutline = Builder(name = "SunClockOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 9.32f)
                lineTo(19.65f, 6.0f)
                lineTo(15.5f, 5.64f)
                curveTo(16.1f, 6.15f, 16.63f, 6.78f, 17.05f, 7.5f)
                curveTo(17.37f, 8.05f, 17.58f, 8.63f, 17.73f, 9.22f)
                curveTo(17.18f, 9.08f, 16.6f, 9.0f, 16.0f, 9.0f)
                curveTo(15.86f, 9.0f, 15.72f, 9.0f, 15.58f, 9.0f)
                curveTo(14.81f, 7.25f, 13.06f, 6.0f, 11.0f, 6.0f)
                curveTo(8.24f, 6.0f, 6.0f, 8.24f, 6.0f, 11.0f)
                curveTo(6.0f, 13.06f, 7.25f, 14.81f, 9.0f, 15.58f)
                curveTo(9.0f, 15.72f, 9.0f, 15.86f, 9.0f, 16.0f)
                curveTo(9.0f, 19.87f, 12.13f, 23.0f, 16.0f, 23.0f)
                reflectiveCurveTo(23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 12.87f, 20.94f, 10.21f, 18.1f, 9.32f)
                moveTo(8.0f, 11.0f)
                curveTo(8.0f, 9.35f, 9.35f, 8.0f, 11.0f, 8.0f)
                curveTo(12.08f, 8.0f, 13.03f, 8.58f, 13.56f, 9.45f)
                curveTo(11.66f, 10.15f, 10.15f, 11.66f, 9.45f, 13.56f)
                curveTo(8.58f, 13.03f, 8.0f, 12.08f, 8.0f, 11.0f)
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
                moveTo(11.0f, 4.0f)
                curveTo(10.16f, 4.0f, 9.35f, 4.15f, 8.61f, 4.42f)
                lineTo(11.0f, 1.0f)
                lineTo(13.39f, 4.42f)
                curveTo(12.65f, 4.15f, 11.84f, 4.0f, 11.0f, 4.0f)
                moveTo(4.95f, 14.5f)
                curveTo(5.37f, 15.24f, 5.91f, 15.86f, 6.5f, 16.37f)
                lineTo(2.36f, 16.0f)
                lineTo(4.12f, 12.23f)
                curveTo(4.26f, 13.0f, 4.53f, 13.78f, 4.95f, 14.5f)
                moveTo(4.11f, 9.79f)
                lineTo(2.34f, 6.0f)
                lineTo(6.5f, 5.65f)
                curveTo(5.9f, 6.16f, 5.36f, 6.78f, 4.94f, 7.5f)
                curveTo(4.5f, 8.24f, 4.25f, 9.0f, 4.11f, 9.79f)
                close()
            }
        }
        .build()
        return _sunClockOutline!!
    }

private var _sunClockOutline: ImageVector? = null
