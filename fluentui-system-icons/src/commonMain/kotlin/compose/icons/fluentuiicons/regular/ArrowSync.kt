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

public val RegularGroup.ArrowSync: ImageVector
    get() {
        if (_arrowSync != null) {
            return _arrowSync!!
        }
        _arrowSync = Builder(name = "ArrowSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2506f, 5.1801f)
                curveTo(15.9994f, 5.5095f, 16.0627f, 5.9801f, 16.3921f, 6.2313f)
                curveTo(18.1804f, 7.5951f, 19.25f, 9.7082f, 19.25f, 12.0f)
                curveTo(19.25f, 15.736f, 16.4242f, 18.812f, 12.7933f, 19.2071f)
                lineTo(13.4697f, 18.5303f)
                curveTo(13.7626f, 18.2374f, 13.7626f, 17.7626f, 13.4697f, 17.4697f)
                curveTo(13.2034f, 17.2034f, 12.7867f, 17.1792f, 12.4931f, 17.3971f)
                lineTo(12.409f, 17.4697f)
                lineTo(10.409f, 19.4697f)
                curveTo(10.1427f, 19.7359f, 10.1185f, 20.1526f, 10.3364f, 20.4462f)
                lineTo(10.409f, 20.5303f)
                lineTo(12.409f, 22.5303f)
                curveTo(12.7019f, 22.8232f, 13.1768f, 22.8232f, 13.4697f, 22.5303f)
                curveTo(13.7359f, 22.2641f, 13.7601f, 21.8474f, 13.5423f, 21.5538f)
                lineTo(13.4697f, 21.4697f)
                lineTo(12.7194f, 20.7208f)
                curveTo(17.2154f, 20.355f, 20.75f, 16.5903f, 20.75f, 12.0f)
                curveTo(20.75f, 9.2353f, 19.4582f, 6.6832f, 17.3017f, 5.0386f)
                curveTo(16.9724f, 4.7874f, 16.5017f, 4.8507f, 16.2506f, 5.1801f)
                close()
                moveTo(10.5303f, 1.4697f)
                curveTo(10.2374f, 1.7626f, 10.2374f, 2.2374f, 10.5303f, 2.5303f)
                lineTo(11.2796f, 3.2792f)
                curveTo(6.7841f, 3.6456f, 3.25f, 7.4101f, 3.25f, 12.0f)
                curveTo(3.25f, 14.6445f, 4.4313f, 17.0974f, 6.4308f, 18.7491f)
                curveTo(6.7502f, 19.0129f, 7.2229f, 18.9679f, 7.4867f, 18.6485f)
                curveTo(7.7505f, 18.3292f, 7.7055f, 17.8564f, 7.3861f, 17.5926f)
                curveTo(5.7279f, 16.2229f, 4.75f, 14.1922f, 4.75f, 12.0f)
                curveTo(4.75f, 8.2644f, 7.5753f, 5.1886f, 11.2057f, 4.793f)
                lineTo(10.5303f, 5.4697f)
                curveTo(10.2374f, 5.7626f, 10.2374f, 6.2374f, 10.5303f, 6.5303f)
                curveTo(10.8232f, 6.8232f, 11.2981f, 6.8232f, 11.591f, 6.5303f)
                lineTo(13.591f, 4.5303f)
                curveTo(13.8839f, 4.2374f, 13.8839f, 3.7626f, 13.591f, 3.4697f)
                lineTo(11.591f, 1.4697f)
                curveTo(11.2981f, 1.1768f, 10.8232f, 1.1768f, 10.5303f, 1.4697f)
                close()
            }
        }
        .build()
        return _arrowSync!!
    }

private var _arrowSync: ImageVector? = null
