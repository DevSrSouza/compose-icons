package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) {
            return _bellSimpleRinging!!
        }
        _bellSimpleRinging = Builder(name = "BellSimpleRinging", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.9f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 165.9f, 224.0f)
                close()
                moveTo(219.1f, 176.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 14.1f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -12.1f, 7.0f)
                lineTo(49.0f, 198.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -12.1f, -7.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -14.1f)
                curveTo(43.0f, 166.5f, 50.2f, 146.8f, 50.2f, 112.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 128.0f, 34.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, true, 77.2f, 78.0f)
                curveTo(205.8f, 146.8f, 213.0f, 166.5f, 219.1f, 176.9f)
                close()
                moveTo(208.7f, 183.0f)
                curveToRelative(-6.8f, -11.7f, -14.9f, -33.5f, -14.9f, -71.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, false, -19.0f, -46.6f)
                arcTo(65.2f, 65.2f, 0.0f, false, false, 128.5f, 46.0f)
                lineTo(128.0f, 46.0f)
                arcToRelative(65.9f, 65.9f, 0.0f, false, false, -65.8f, 66.0f)
                curveToRelative(0.0f, 37.5f, -8.1f, 59.3f, -14.9f, 71.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.7f, 1.0f)
                lineTo(207.0f, 186.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.7f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 208.7f, 183.0f)
                close()
                moveTo(226.7f, 63.5f)
                arcToRelative(109.9f, 109.9f, 0.0f, false, false, -40.1f, -44.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.2f, 1.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.8f, 8.3f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 216.0f, 68.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.4f, 3.3f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 2.6f, -0.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 226.7f, 63.5f)
                close()
                moveTo(40.0f, 68.8f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 75.8f, 29.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.8f, -8.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.2f, -1.9f)
                arcTo(109.9f, 109.9f, 0.0f, false, false, 29.3f, 63.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 2.7f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 2.6f, 0.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 40.0f, 68.8f)
                close()
            }
        }
        .build()
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
