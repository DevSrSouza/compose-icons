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

public val BoldGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 55.0f, 207.5f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 1.6f, 1.5f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, false, 142.8f, 0.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 1.6f, -1.5f)
                arcTo(107.7f, 107.7f, 0.0f, false, false, 236.0f, 128.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 149.9f, 51.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 165.0f, 156.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -74.0f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -28.9f, 23.4f)
                arcTo(83.4f, 83.4f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(100.0f, 120.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 100.0f, 120.0f)
                close()
                moveTo(79.6f, 196.6f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 96.8f, 0.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, -96.8f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
