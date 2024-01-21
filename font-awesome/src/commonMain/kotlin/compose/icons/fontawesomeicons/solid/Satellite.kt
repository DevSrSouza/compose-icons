package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 7.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(89.4f, 89.4f)
                lineToRelative(-15.5f, 15.5f)
                curveTo(152.3f, 230.4f, 124.9f, 224.0f, 96.0f, 224.0f)
                curveToRelative(-31.7f, 0.0f, -61.5f, 7.7f, -87.8f, 21.2f)
                curveToRelative(-9.0f, 4.7f, -10.3f, 16.7f, -3.1f, 23.8f)
                lineTo(112.7f, 376.7f)
                lineTo(96.3f, 393.1f)
                curveToRelative(-2.6f, -0.7f, -5.4f, -1.1f, -8.3f, -1.1f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -2.9f, -0.4f, -5.6f, -1.1f, -8.3f)
                lineToRelative(16.4f, -16.4f)
                lineTo(242.9f, 506.9f)
                curveToRelative(7.2f, 7.2f, 19.2f, 5.9f, 23.8f, -3.1f)
                curveTo(280.3f, 477.5f, 288.0f, 447.7f, 288.0f, 416.0f)
                curveToRelative(0.0f, -28.9f, -6.4f, -56.3f, -17.8f, -80.9f)
                lineToRelative(15.5f, -15.5f)
                lineTo(375.0f, 409.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-89.4f, -89.4f)
                lineToRelative(55.0f, -55.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-48.0f, -48.0f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-55.0f, 55.0f)
                lineTo(233.0f, 7.0f)
                close()
                moveTo(392.0f, 358.0f)
                lineToRelative(-72.4f, -72.4f)
                lineToRelative(62.1f, -62.1f)
                lineTo(454.1f, 296.0f)
                lineTo(392.0f, 358.1f)
                close()
                moveTo(226.3f, 192.4f)
                lineTo(153.9f, 120.0f)
                lineTo(216.0f, 57.9f)
                lineToRelative(72.4f, 72.4f)
                lineToRelative(-62.1f, 62.1f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
