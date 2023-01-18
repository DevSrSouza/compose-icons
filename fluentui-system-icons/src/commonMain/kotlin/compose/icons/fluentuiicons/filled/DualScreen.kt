package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) {
            return _dualScreen!!
        }
        _dualScreen = Builder(name = "DualScreen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2451f, 4.0024f)
                curveTo(21.2116f, 4.0024f, 21.9951f, 4.7859f, 21.9951f, 5.7524f)
                verticalLineTo(18.2476f)
                curveTo(21.9951f, 19.2141f, 21.2116f, 19.9976f, 20.2451f, 19.9976f)
                horizontalLineTo(12.9976f)
                curveTo(12.9108f, 19.9976f, 12.8255f, 19.9912f, 12.7421f, 19.9791f)
                lineTo(12.742f, 4.021f)
                curveTo(12.8254f, 4.0088f, 12.9108f, 4.0024f, 12.9976f, 4.0024f)
                horizontalLineTo(20.2451f)
                close()
                moveTo(10.9976f, 4.0f)
                curveTo(11.0809f, 4.0f, 11.1629f, 4.0058f, 11.2431f, 4.0171f)
                lineTo(11.2428f, 19.9781f)
                curveTo(11.1627f, 19.9893f, 11.0808f, 19.9951f, 10.9976f, 19.9951f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 19.9951f, 2.0f, 19.2116f, 2.0f, 18.2451f)
                verticalLineTo(5.75f)
                curveTo(2.0f, 4.7835f, 2.7835f, 4.0f, 3.75f, 4.0f)
                horizontalLineTo(10.9976f)
                close()
                moveTo(9.2429f, 15.4988f)
                horizontalLineTo(7.7412f)
                lineTo(7.6394f, 15.5056f)
                curveTo(7.2733f, 15.5553f, 6.9912f, 15.8691f, 6.9912f, 16.2488f)
                curveTo(6.9912f, 16.6285f, 7.2733f, 16.9423f, 7.6394f, 16.9919f)
                lineTo(7.7412f, 16.9988f)
                horizontalLineTo(9.2429f)
                lineTo(9.3447f, 16.9919f)
                curveTo(9.7107f, 16.9423f, 9.9929f, 16.6285f, 9.9929f, 16.2488f)
                curveTo(9.9929f, 15.8691f, 9.7107f, 15.5553f, 9.3447f, 15.5056f)
                lineTo(9.2429f, 15.4988f)
                close()
                moveTo(16.2387f, 15.4988f)
                horizontalLineTo(14.7387f)
                lineTo(14.637f, 15.5056f)
                curveTo(14.2709f, 15.5553f, 13.9887f, 15.8691f, 13.9887f, 16.2488f)
                curveTo(13.9887f, 16.6285f, 14.2709f, 16.9423f, 14.637f, 16.9919f)
                lineTo(14.7387f, 16.9988f)
                horizontalLineTo(16.2387f)
                lineTo(16.3405f, 16.9919f)
                curveTo(16.7066f, 16.9423f, 16.9887f, 16.6285f, 16.9887f, 16.2488f)
                curveTo(16.9887f, 15.8691f, 16.7066f, 15.5553f, 16.3405f, 15.5056f)
                lineTo(16.2387f, 15.4988f)
                close()
            }
        }
        .build()
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
