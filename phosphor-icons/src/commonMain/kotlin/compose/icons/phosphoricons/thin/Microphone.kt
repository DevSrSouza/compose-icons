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

public val ThinGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(172.0f, 64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 172.0f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(203.5f, 136.4f)
                arcTo(75.8f, 75.8f, 0.0f, false, true, 132.0f, 203.9f)
                lineTo(132.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 203.9f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, -71.5f, -67.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 56.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.4f, 3.6f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 135.2f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 132.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 203.5f, 136.4f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
