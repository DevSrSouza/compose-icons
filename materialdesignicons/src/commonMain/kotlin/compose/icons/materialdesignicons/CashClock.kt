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

public val MaterialDesignIcons.CashClock: ImageVector
    get() {
        if (_cashClock != null) {
            return _cashClock!!
        }
        _cashClock = Builder(name = "CashClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16.0f, 17.69f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                moveTo(24.0f, 17.0f)
                curveTo(24.0f, 20.87f, 20.87f, 24.0f, 17.0f, 24.0f)
                reflectiveCurveTo(10.0f, 20.87f, 10.0f, 17.0f)
                curveTo(10.0f, 16.66f, 10.03f, 16.33f, 10.08f, 16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.68f)
                curveTo(22.36f, 11.81f, 24.0f, 14.21f, 24.0f, 17.0f)
                moveTo(10.68f, 14.0f)
                curveTo(10.86f, 13.64f, 11.05f, 13.3f, 11.28f, 12.97f)
                curveTo(11.19f, 13.0f, 11.1f, 13.0f, 11.0f, 13.0f)
                curveTo(9.34f, 13.0f, 8.0f, 11.66f, 8.0f, 10.0f)
                reflectiveCurveTo(9.34f, 7.0f, 11.0f, 7.0f)
                reflectiveCurveTo(14.0f, 8.34f, 14.0f, 10.0f)
                curveTo(14.0f, 10.25f, 13.96f, 10.5f, 13.9f, 10.73f)
                curveTo(14.84f, 10.27f, 15.89f, 10.0f, 17.0f, 10.0f)
                curveTo(17.34f, 10.0f, 17.67f, 10.03f, 18.0f, 10.08f)
                verticalLineTo(8.0f)
                curveTo(16.9f, 8.0f, 16.0f, 7.11f, 16.0f, 6.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 7.11f, 5.11f, 8.0f, 4.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(5.11f, 12.0f, 6.0f, 12.9f, 6.0f, 14.0f)
                horizontalLineTo(10.68f)
                moveTo(22.0f, 17.0f)
                curveTo(22.0f, 14.24f, 19.76f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(12.0f, 14.24f, 12.0f, 17.0f)
                reflectiveCurveTo(14.24f, 22.0f, 17.0f, 22.0f)
                reflectiveCurveTo(22.0f, 19.76f, 22.0f, 17.0f)
                close()
            }
        }
        .build()
        return _cashClock!!
    }

private var _cashClock: ImageVector? = null
