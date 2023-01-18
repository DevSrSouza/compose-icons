package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) {
            return _bellSimpleRinging!!
        }
        _bellSimpleRinging = Builder(name = "BellSimpleRinging", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
                moveTo(217.4f, 177.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, 12.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.4f, 6.0f)
                lineTo(49.0f, 196.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, -12.1f)
                curveToRelative(6.2f, -10.6f, 13.6f, -30.7f, 13.6f, -65.9f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 128.0f, 36.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(75.6f, 75.6f, 0.0f, false, true, 75.2f, 76.0f)
                curveTo(203.8f, 147.2f, 211.2f, 167.3f, 217.4f, 177.9f)
                close()
                moveTo(210.4f, 182.0f)
                curveToRelative(-6.6f, -11.5f, -14.6f, -33.0f, -14.6f, -70.0f)
                arcToRelative(67.6f, 67.6f, 0.0f, false, false, -67.3f, -68.0f)
                lineTo(128.0f, 44.0f)
                arcToRelative(67.9f, 67.9f, 0.0f, false, false, -67.8f, 68.0f)
                curveToRelative(0.0f, 37.0f, -8.0f, 58.5f, -14.6f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.1f, 4.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                lineTo(207.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, -2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.4f, 182.0f)
                close()
                moveTo(224.9f, 64.3f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, false, -39.3f, -43.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.3f, 6.8f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, true, 36.5f, 40.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.6f, 2.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.7f, -0.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.9f, 64.3f)
                close()
                moveTo(38.2f, 67.9f)
                arcTo(100.4f, 100.4f, 0.0f, false, true, 74.7f, 27.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.3f, -6.8f)
                arcTo(108.3f, 108.3f, 0.0f, false, false, 31.1f, 64.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.8f, 5.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.7f, 0.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 38.2f, 67.9f)
                close()
            }
        }
        .build()
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
