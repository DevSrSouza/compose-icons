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

public val MaterialDesignIcons.BikeFast: ImageVector
    get() {
        if (_bikeFast != null) {
            return _bikeFast!!
        }
        _bikeFast = Builder(name = "BikeFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.2f)
                curveTo(15.0f, 1.2f, 14.2f, 2.0f, 14.2f, 3.0f)
                reflectiveCurveTo(15.0f, 4.8f, 16.0f, 4.8f)
                reflectiveCurveTo(17.8f, 4.0f, 17.8f, 3.0f)
                reflectiveCurveTo(17.0f, 1.2f, 16.0f, 1.2f)
                moveTo(12.4f, 4.1f)
                curveTo(11.93f, 4.1f, 11.5f, 4.29f, 11.2f, 4.6f)
                lineTo(7.5f, 8.29f)
                curveTo(7.19f, 8.6f, 7.0f, 9.0f, 7.0f, 9.5f)
                curveTo(7.0f, 10.13f, 7.33f, 10.66f, 7.85f, 10.97f)
                lineTo(11.2f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5f)
                lineTo(10.75f, 9.85f)
                lineTo(13.07f, 7.5f)
                lineTo(14.8f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.2f)
                horizontalLineTo(15.8f)
                lineTo(13.86f, 4.93f)
                curveTo(13.57f, 4.43f, 13.0f, 4.1f, 12.4f, 4.1f)
                moveTo(10.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 3.0f, 2.0f, 2.55f, 2.0f, 2.0f)
                reflectiveCurveTo(2.45f, 1.0f, 3.0f, 1.0f)
                horizontalLineTo(12.79f)
                curveTo(12.58f, 1.34f, 12.41f, 1.71f, 12.32f, 2.11f)
                curveTo(11.46f, 2.13f, 10.65f, 2.45f, 10.0f, 3.0f)
                moveTo(5.0f, 12.0f)
                curveTo(2.24f, 12.0f, 0.0f, 14.24f, 0.0f, 17.0f)
                reflectiveCurveTo(2.24f, 22.0f, 5.0f, 22.0f)
                reflectiveCurveTo(10.0f, 19.76f, 10.0f, 17.0f)
                reflectiveCurveTo(7.76f, 12.0f, 5.0f, 12.0f)
                moveTo(5.0f, 20.5f)
                curveTo(3.07f, 20.5f, 1.5f, 18.93f, 1.5f, 17.0f)
                reflectiveCurveTo(3.07f, 13.5f, 5.0f, 13.5f)
                reflectiveCurveTo(8.5f, 15.07f, 8.5f, 17.0f)
                reflectiveCurveTo(6.93f, 20.5f, 5.0f, 20.5f)
                moveTo(19.0f, 12.0f)
                curveTo(16.24f, 12.0f, 14.0f, 14.24f, 14.0f, 17.0f)
                reflectiveCurveTo(16.24f, 22.0f, 19.0f, 22.0f)
                reflectiveCurveTo(24.0f, 19.76f, 24.0f, 17.0f)
                reflectiveCurveTo(21.76f, 12.0f, 19.0f, 12.0f)
                moveTo(19.0f, 20.5f)
                curveTo(17.07f, 20.5f, 15.5f, 18.93f, 15.5f, 17.0f)
                reflectiveCurveTo(17.07f, 13.5f, 19.0f, 13.5f)
                reflectiveCurveTo(22.5f, 15.07f, 22.5f, 17.0f)
                reflectiveCurveTo(20.93f, 20.5f, 19.0f, 20.5f)
                moveTo(5.32f, 11.0f)
                horizontalLineTo(1.0f)
                curveTo(0.448f, 11.0f, 0.0f, 10.55f, 0.0f, 10.0f)
                reflectiveCurveTo(0.448f, 9.0f, 1.0f, 9.0f)
                horizontalLineTo(5.05f)
                curveTo(5.03f, 9.16f, 5.0f, 9.33f, 5.0f, 9.5f)
                curveTo(5.0f, 10.03f, 5.12f, 10.54f, 5.32f, 11.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 7.0f, 1.0f, 6.55f, 1.0f, 6.0f)
                reflectiveCurveTo(1.45f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(7.97f)
                lineTo(6.09f, 6.87f)
                curveTo(6.05f, 6.91f, 6.0f, 6.96f, 6.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bikeFast!!
    }

private var _bikeFast: ImageVector? = null
