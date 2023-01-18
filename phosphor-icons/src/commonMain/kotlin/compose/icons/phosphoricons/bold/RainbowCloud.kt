package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) {
            return _rainbowCloud!!
        }
        _rainbowCloud = Builder(name = "RainbowCloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 108.0f)
                arcToRelative(52.2f, 52.2f, 0.0f, false, false, -47.2f, 30.2f)
                lineTo(156.0f, 138.2f)
                curveToRelative(-19.9f, 0.0f, -36.0f, 16.6f, -36.0f, 36.9f)
                reflectiveCurveTo(136.1f, 212.0f, 156.0f, 212.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(156.0f, 188.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.8f, -12.0f, -12.9f)
                reflectiveCurveToRelative(5.4f, -12.9f, 12.0f, -12.9f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, 4.3f, 0.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 10.2f, -0.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.1f, -8.1f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 204.0f, 188.0f)
                close()
                moveTo(109.2f, 136.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.1f, 16.9f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 104.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(80.0f, 160.0f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, true, 12.4f, -25.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 109.2f, 136.8f)
                close()
                moveTo(136.7f, 118.8f)
                arcTo(48.8f, 48.8f, 0.0f, false, false, 112.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, 48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(40.0f, 160.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 149.0f, 98.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.3f, 20.6f)
                close()
                moveTo(24.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(0.0f, 160.0f)
                arcTo(112.0f, 112.0f, 0.0f, false, true, 185.5f, 75.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.8f, 18.1f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f)
                close()
            }
        }
        .build()
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
