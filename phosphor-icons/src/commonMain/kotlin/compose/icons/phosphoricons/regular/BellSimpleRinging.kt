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

public val RegularGroup.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) {
            return _bellSimpleRinging!!
        }
        _bellSimpleRinging = Builder(name = "BellSimpleRinging", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(220.8f, 175.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 0.1f, 16.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, 8.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, -8.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 0.1f, -16.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                arcToRelative(79.8f, 79.8f, 0.0f, true, true, 159.6f, 0.0f)
                curveTo(207.8f, 146.3f, 214.9f, 165.7f, 220.8f, 175.9f)
                close()
                moveTo(207.0f, 184.0f)
                curveToRelative(-6.9f, -11.9f, -15.2f, -34.1f, -15.2f, -72.0f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, -18.5f, -45.1f)
                arcTo(62.9f, 62.9f, 0.0f, false, false, 128.5f, 48.0f)
                lineTo(128.0f, 48.0f)
                arcToRelative(63.8f, 63.8f, 0.0f, false, false, -63.8f, 64.0f)
                curveToRelative(0.0f, 37.9f, -8.3f, 60.1f, -15.2f, 72.0f)
                close()
                moveTo(228.5f, 62.6f)
                arcToRelative(111.7f, 111.7f, 0.0f, false, false, -40.8f, -45.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.5f, 13.6f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, 35.0f, 38.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.2f, 4.5f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 3.5f, -0.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.5f, 62.6f)
                close()
                moveTo(41.8f, 69.6f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, 35.0f, -38.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.5f, -13.6f)
                arcTo(111.7f, 111.7f, 0.0f, false, false, 27.5f, 62.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.6f, 10.7f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 3.5f, 0.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 41.8f, 69.6f)
                close()
            }
        }
        .build()
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
