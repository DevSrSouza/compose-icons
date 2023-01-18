package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) {
            return _rainbowCloud!!
        }
        _rainbowCloud = Builder(name = "RainbowCloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 112.0f)
                arcToRelative(48.4f, 48.4f, 0.0f, false, false, -44.7f, 30.4f)
                lineToRelative(-3.3f, -0.2f)
                curveToRelative(-17.6f, 0.0f, -32.0f, 14.8f, -32.0f, 32.9f)
                reflectiveCurveTo(134.4f, 208.0f, 152.0f, 208.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                close()
                moveTo(200.0f, 192.0f)
                lineTo(152.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.6f, -16.0f, -16.9f)
                reflectiveCurveToRelative(7.2f, -16.9f, 16.0f, -16.9f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 5.8f, 1.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 6.8f, -0.4f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 4.0f, -5.4f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 200.0f, 192.0f)
                close()
                moveTo(24.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(8.0f, 160.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 184.5f, 85.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.2f, 11.5f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f)
                close()
                moveTo(56.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 72.0f, -72.0f)
                arcToRelative(70.9f, 70.9f, 0.0f, false, true, 42.6f, 14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.5f, 12.8f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 56.0f, 160.0f)
                close()
                moveTo(117.6f, 136.6f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -5.6f, -0.6f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(72.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                arcToRelative(42.2f, 42.2f, 0.0f, false, true, 9.3f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.7f, 15.5f)
                close()
            }
        }
        .build()
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
