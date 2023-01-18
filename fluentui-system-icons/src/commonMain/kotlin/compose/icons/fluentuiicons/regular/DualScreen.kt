package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) {
            return _dualScreen!!
        }
        _dualScreen = Builder(name = "DualScreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7476f, 4.0f)
                lineTo(12.747f, 4.002f)
                lineTo(20.2451f, 4.0024f)
                curveTo(21.2116f, 4.0024f, 21.9951f, 4.7859f, 21.9951f, 5.7524f)
                verticalLineTo(18.2476f)
                curveTo(21.9951f, 19.2141f, 21.2116f, 19.9976f, 20.2451f, 19.9976f)
                horizontalLineTo(11.2476f)
                lineTo(11.247f, 19.995f)
                lineTo(3.75f, 19.9951f)
                curveTo(2.7835f, 19.9951f, 2.0f, 19.2116f, 2.0f, 18.2451f)
                verticalLineTo(5.75f)
                curveTo(2.0f, 4.7835f, 2.7835f, 4.0f, 3.75f, 4.0f)
                horizontalLineTo(12.7476f)
                close()
                moveTo(20.2451f, 5.5024f)
                horizontalLineTo(12.7476f)
                verticalLineTo(18.4976f)
                horizontalLineTo(20.2451f)
                curveTo(20.3832f, 18.4976f, 20.4951f, 18.3856f, 20.4951f, 18.2476f)
                verticalLineTo(5.7524f)
                curveTo(20.4951f, 5.6144f, 20.3832f, 5.5024f, 20.2451f, 5.5024f)
                close()
                moveTo(11.2476f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 5.5f, 3.5f, 5.6119f, 3.5f, 5.75f)
                verticalLineTo(18.2451f)
                curveTo(3.5f, 18.3832f, 3.6119f, 18.4951f, 3.75f, 18.4951f)
                horizontalLineTo(11.2476f)
                verticalLineTo(5.5f)
                close()
                moveTo(14.7387f, 15.4988f)
                horizontalLineTo(16.2387f)
                curveTo(16.6529f, 15.4988f, 16.9887f, 15.8346f, 16.9887f, 16.2488f)
                curveTo(16.9887f, 16.6285f, 16.7066f, 16.9423f, 16.3405f, 16.9919f)
                lineTo(16.2387f, 16.9988f)
                horizontalLineTo(14.7387f)
                curveTo(14.3245f, 16.9988f, 13.9887f, 16.663f, 13.9887f, 16.2488f)
                curveTo(13.9887f, 15.8691f, 14.2709f, 15.5553f, 14.637f, 15.5056f)
                lineTo(14.7387f, 15.4988f)
                horizontalLineTo(16.2387f)
                horizontalLineTo(14.7387f)
                close()
                moveTo(7.7412f, 15.4988f)
                horizontalLineTo(9.2429f)
                curveTo(9.6571f, 15.4988f, 9.9929f, 15.8346f, 9.9929f, 16.2488f)
                curveTo(9.9929f, 16.6285f, 9.7107f, 16.9423f, 9.3447f, 16.9919f)
                lineTo(9.2429f, 16.9988f)
                horizontalLineTo(7.7412f)
                curveTo(7.327f, 16.9988f, 6.9912f, 16.663f, 6.9912f, 16.2488f)
                curveTo(6.9912f, 15.8691f, 7.2733f, 15.5553f, 7.6394f, 15.5056f)
                lineTo(7.7412f, 15.4988f)
                horizontalLineTo(9.2429f)
                horizontalLineTo(7.7412f)
                close()
            }
        }
        .build()
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
