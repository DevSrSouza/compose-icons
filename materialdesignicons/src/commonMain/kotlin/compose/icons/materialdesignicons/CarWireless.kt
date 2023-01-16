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

public val MaterialDesignIcons.CarWireless: ImageVector
    get() {
        if (_carWireless != null) {
            return _carWireless!!
        }
        _carWireless = Builder(name = "CarWireless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(10.9f, 5.0f, 10.0f, 5.9f, 10.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 8.0f, 5.28f, 8.42f, 5.08f, 9.0f)
                lineTo(3.0f, 15.0f)
                verticalLineTo(23.0f)
                curveTo(3.0f, 23.55f, 3.45f, 24.0f, 4.0f, 24.0f)
                horizontalLineTo(5.0f)
                curveTo(5.55f, 24.0f, 6.0f, 23.55f, 6.0f, 23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                curveTo(18.0f, 23.55f, 18.45f, 24.0f, 19.0f, 24.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 24.0f, 21.0f, 23.55f, 21.0f, 23.0f)
                verticalLineTo(15.0f)
                lineTo(18.92f, 9.0f)
                curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                curveTo(14.0f, 5.9f, 13.11f, 5.0f, 12.0f, 5.0f)
                moveTo(6.5f, 9.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 14.0f)
                horizontalLineTo(5.0f)
                lineTo(6.5f, 9.5f)
                moveTo(6.5f, 16.0f)
                curveTo(7.33f, 16.0f, 8.0f, 16.67f, 8.0f, 17.5f)
                reflectiveCurveTo(7.33f, 19.0f, 6.5f, 19.0f)
                reflectiveCurveTo(5.0f, 18.33f, 5.0f, 17.5f)
                reflectiveCurveTo(5.67f, 16.0f, 6.5f, 16.0f)
                moveTo(17.5f, 16.0f)
                curveTo(18.33f, 16.0f, 19.0f, 16.67f, 19.0f, 17.5f)
                reflectiveCurveTo(18.33f, 19.0f, 17.5f, 19.0f)
                reflectiveCurveTo(16.0f, 18.33f, 16.0f, 17.5f)
                reflectiveCurveTo(16.67f, 16.0f, 17.5f, 16.0f)
                moveTo(16.2f, 3.4f)
                curveTo(15.0f, 2.3f, 13.5f, 1.7f, 12.0f, 1.7f)
                reflectiveCurveTo(9.0f, 2.3f, 7.8f, 3.4f)
                lineTo(7.0f, 2.6f)
                curveTo(8.4f, 1.2f, 10.2f, 0.5f, 12.0f, 0.5f)
                reflectiveCurveTo(15.6f, 1.2f, 17.0f, 2.6f)
                lineTo(16.2f, 3.4f)
                moveTo(15.3f, 4.2f)
                lineTo(14.5f, 5.0f)
                curveTo(13.8f, 4.3f, 12.9f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(10.2f, 4.3f, 9.5f, 5.0f)
                lineTo(8.7f, 4.2f)
                curveTo(9.6f, 3.3f, 10.8f, 2.8f, 12.0f, 2.8f)
                reflectiveCurveTo(14.4f, 3.3f, 15.3f, 4.2f)
            }
        }
        .build()
        return _carWireless!!
    }

private var _carWireless: ImageVector? = null
