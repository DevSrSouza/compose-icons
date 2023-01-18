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

public val LightGroup.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) {
            return _shareNetwork!!
        }
        _shareNetwork = Builder(name = "ShareNetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 162.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, -28.3f, 12.7f)
                lineTo(98.8f, 143.2f)
                arcToRelative(37.7f, 37.7f, 0.0f, false, false, 0.0f, -30.4f)
                lineToRelative(48.9f, -31.5f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 138.0f, 56.0f)
                arcToRelative(36.6f, 36.6f, 0.0f, false, false, 3.2f, 15.2f)
                lineTo(92.3f, 102.7f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.0f, 50.6f)
                lineToRelative(48.9f, 31.5f)
                arcTo(36.6f, 36.6f, 0.0f, false, false, 138.0f, 200.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, -38.0f)
                close()
                moveTo(176.0f, 30.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 176.0f, 30.0f)
                close()
                moveTo(64.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 64.0f, 154.0f)
                close()
                moveTo(176.0f, 226.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 176.0f, 226.0f)
                close()
            }
        }
        .build()
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
