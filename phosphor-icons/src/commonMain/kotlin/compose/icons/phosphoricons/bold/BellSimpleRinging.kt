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

public val BoldGroup.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) {
            return _bellSimpleRinging!!
        }
        _bellSimpleRinging = Builder(name = "BellSimpleRinging", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 228.0f)
                close()
                moveTo(224.3f, 169.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 0.0f, 20.1f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 207.0f, 200.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -17.3f, -10.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 0.0f, -20.1f)
                curveToRelative(4.1f, -6.9f, 12.5f, -21.4f, 12.5f, -57.9f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 128.0f, 28.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, true, 83.2f, 84.0f)
                curveTo(211.8f, 148.5f, 220.2f, 163.0f, 224.3f, 169.9f)
                close()
                moveTo(200.3f, 176.0f)
                curveToRelative(-6.6f, -13.0f, -12.5f, -31.5f, -12.5f, -64.0f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, false, -59.3f, -60.0f)
                lineTo(128.0f, 52.0f)
                arcTo(59.3f, 59.3f, 0.0f, false, false, 85.9f, 69.3f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 68.2f, 112.0f)
                curveToRelative(0.0f, 32.5f, -5.9f, 51.0f, -12.5f, 64.0f)
                close()
                moveTo(239.3f, 57.3f)
                arcTo(123.7f, 123.7f, 0.0f, false, false, 194.1f, 7.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, 20.3f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, true, 36.5f, 40.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.7f, 6.7f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 5.3f, -1.3f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 239.3f, 57.3f)
                close()
                moveTo(38.2f, 67.9f)
                arcTo(100.4f, 100.4f, 0.0f, false, true, 74.7f, 27.4f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 61.9f, 7.1f)
                arcTo(123.7f, 123.7f, 0.0f, false, false, 16.7f, 57.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 5.5f, 16.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 5.3f, 1.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 38.2f, 67.9f)
                close()
            }
        }
        .build()
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
