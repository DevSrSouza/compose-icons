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

public val MaterialDesignIcons.RouterWirelessOff: ImageVector
    get() {
        if (_routerWirelessOff != null) {
            return _routerWirelessOff!!
        }
        _routerWirelessOff = Builder(name = "RouterWirelessOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8f, 5.9f)
                lineTo(11.0f, 5.1f)
                curveTo(12.4f, 3.7f, 14.2f, 3.0f, 16.0f, 3.0f)
                reflectiveCurveTo(19.6f, 3.7f, 21.0f, 5.1f)
                lineTo(20.2f, 5.9f)
                curveTo(19.0f, 4.8f, 17.5f, 4.2f, 16.0f, 4.2f)
                reflectiveCurveTo(13.0f, 4.8f, 11.8f, 5.9f)
                moveTo(21.0f, 15.0f)
                curveTo(21.0f, 13.9f, 20.1f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.8f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(15.0f)
                moveTo(18.5f, 7.5f)
                lineTo(19.3f, 6.7f)
                curveTo(18.4f, 5.8f, 17.2f, 5.3f, 16.0f, 5.3f)
                reflectiveCurveTo(13.6f, 5.8f, 12.7f, 6.7f)
                lineTo(13.5f, 7.5f)
                curveTo(14.2f, 6.8f, 15.1f, 6.5f, 16.0f, 6.5f)
                curveTo(16.9f, 6.5f, 17.8f, 6.8f, 18.5f, 7.5f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(19.1f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 13.9f, 3.9f, 13.0f, 5.0f, 13.0f)
                horizontalLineTo(11.1f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(8.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                moveTo(11.5f, 16.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 16.9f)
                lineTo(14.1f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.9f)
                close()
            }
        }
        .build()
        return _routerWirelessOff!!
    }

private var _routerWirelessOff: ImageVector? = null
