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

public val ThinGroup.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) {
            return _shareNetwork!!
        }
        _shareNetwork = Builder(name = "ShareNetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 164.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -27.9f, 13.3f)
                lineTo(96.2f, 144.0f)
                arcToRelative(35.6f, 35.6f, 0.0f, false, false, 0.0f, -32.0f)
                lineToRelative(51.9f, -33.3f)
                arcToRelative(36.4f, 36.4f, 0.0f, true, false, -4.3f, -6.7f)
                lineTo(91.9f, 105.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 45.4f)
                lineTo(143.8f, 184.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 176.0f, 164.0f)
                close()
                moveTo(176.0f, 28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 176.0f, 28.0f)
                close()
                moveTo(64.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 64.0f, 156.0f)
                close()
                moveTo(176.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 176.0f, 228.0f)
                close()
            }
        }
        .build()
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
