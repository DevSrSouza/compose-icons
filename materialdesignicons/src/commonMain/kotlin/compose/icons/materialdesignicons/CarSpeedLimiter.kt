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

public val MaterialDesignIcons.CarSpeedLimiter: ImageVector
    get() {
        if (_carSpeedLimiter != null) {
            return _carSpeedLimiter!!
        }
        _carSpeedLimiter = Builder(name = "CarSpeedLimiter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                curveTo(18.0f, 17.6f, 16.8f, 19.9f, 14.9f, 21.3f)
                lineTo(14.4f, 20.8f)
                lineTo(12.3f, 18.7f)
                lineTo(13.7f, 17.3f)
                lineTo(14.9f, 18.5f)
                curveTo(15.4f, 17.8f, 15.8f, 16.9f, 15.9f, 16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.9f)
                curveTo(15.7f, 13.1f, 15.4f, 12.3f, 14.9f, 11.5f)
                lineTo(13.7f, 12.7f)
                lineTo(12.3f, 11.3f)
                lineTo(13.5f, 10.1f)
                curveTo(12.8f, 9.6f, 11.9f, 9.2f, 11.0f, 9.1f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.1f)
                curveTo(8.1f, 9.3f, 7.3f, 9.6f, 6.5f, 10.1f)
                lineTo(9.5f, 13.1f)
                curveTo(9.7f, 13.1f, 9.8f, 13.0f, 10.0f, 13.0f)
                curveTo(11.11f, 13.0f, 12.0f, 13.9f, 12.0f, 15.0f)
                reflectiveCurveTo(11.11f, 17.0f, 10.0f, 17.0f)
                reflectiveCurveTo(8.0f, 16.11f, 8.0f, 15.0f)
                curveTo(8.0f, 14.8f, 8.0f, 14.7f, 8.1f, 14.5f)
                lineTo(5.1f, 11.5f)
                curveTo(4.6f, 12.2f, 4.2f, 13.1f, 4.1f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.1f)
                curveTo(4.3f, 16.9f, 4.6f, 17.7f, 5.1f, 18.5f)
                lineTo(6.3f, 17.3f)
                lineTo(7.7f, 18.7f)
                lineTo(5.1f, 21.3f)
                curveTo(3.2f, 19.9f, 2.0f, 17.6f, 2.0f, 15.0f)
                curveTo(2.0f, 10.58f, 5.58f, 7.0f, 10.0f, 7.0f)
                reflectiveCurveTo(18.0f, 10.58f, 18.0f, 15.0f)
                moveTo(23.0f, 5.0f)
                curveTo(23.0f, 3.34f, 21.66f, 2.0f, 20.0f, 2.0f)
                reflectiveCurveTo(17.0f, 3.34f, 17.0f, 5.0f)
                curveTo(17.0f, 6.3f, 17.84f, 7.4f, 19.0f, 7.82f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.82f)
                curveTo(22.16f, 7.4f, 23.0f, 6.3f, 23.0f, 5.0f)
                moveTo(20.0f, 6.0f)
                curveTo(19.45f, 6.0f, 19.0f, 5.55f, 19.0f, 5.0f)
                reflectiveCurveTo(19.45f, 4.0f, 20.0f, 4.0f)
                reflectiveCurveTo(21.0f, 4.45f, 21.0f, 5.0f)
                reflectiveCurveTo(20.55f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _carSpeedLimiter!!
    }

private var _carSpeedLimiter: ImageVector? = null
