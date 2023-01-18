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

public val BoldGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 212.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 224.0f)
                close()
                moveTo(228.0f, 144.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 144.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                lineTo(97.2f, 124.0f)
                lineTo(82.5f, 55.5f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 117.7f, 12.0f)
                horizontalLineToRelative(20.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 35.2f, 43.5f)
                lineTo(158.8f, 124.0f)
                lineTo(208.0f, 124.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 144.0f)
                close()
                moveTo(121.7f, 124.0f)
                horizontalLineToRelative(12.6f)
                lineTo(150.0f, 50.5f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -2.4f, -10.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -9.3f, -4.5f)
                lineTo(117.7f, 36.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -9.3f, 4.5f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -2.4f, 10.0f)
                close()
                moveTo(204.0f, 148.0f)
                lineTo(52.0f, 148.0f)
                verticalLineToRelative(24.0f)
                lineTo(204.0f, 172.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
