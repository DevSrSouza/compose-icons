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

public val MaterialDesignIcons.RouterWirelessSettings: ImageVector
    get() {
        if (_routerWirelessSettings != null) {
            return _routerWirelessSettings!!
        }
        _routerWirelessSettings = Builder(name = "RouterWirelessSettings", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2f, 4.9f)
                curveTo(19.0f, 3.8f, 17.5f, 3.2f, 16.0f, 3.2f)
                curveTo(14.5f, 3.2f, 13.0f, 3.8f, 11.8f, 4.9f)
                lineTo(11.0f, 4.1f)
                curveTo(12.4f, 2.7f, 14.2f, 2.0f, 16.0f, 2.0f)
                curveTo(17.8f, 2.0f, 19.6f, 2.7f, 21.0f, 4.1f)
                lineTo(20.2f, 4.9f)
                moveTo(19.3f, 5.7f)
                lineTo(18.5f, 6.5f)
                curveTo(17.8f, 5.8f, 16.9f, 5.5f, 16.0f, 5.5f)
                curveTo(15.1f, 5.5f, 14.2f, 5.8f, 13.5f, 6.5f)
                lineTo(12.7f, 5.7f)
                curveTo(13.6f, 4.8f, 14.8f, 4.3f, 16.0f, 4.3f)
                curveTo(17.2f, 4.3f, 18.4f, 4.8f, 19.3f, 5.7f)
                moveTo(19.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 18.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                moveTo(8.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                moveTo(11.5f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.5f)
                moveTo(15.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _routerWirelessSettings!!
    }

private var _routerWirelessSettings: ImageVector? = null
