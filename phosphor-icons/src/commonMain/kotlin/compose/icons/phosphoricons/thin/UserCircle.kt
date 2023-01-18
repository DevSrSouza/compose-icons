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

public val ThinGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 60.7f, 201.9f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 0.9f, 0.8f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 132.9f, 0.0f)
                lineToRelative(0.8f, -0.8f)
                arcTo(99.6f, 99.6f, 0.0f, false, false, 228.0f, 128.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 157.2f, 64.9f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, -44.5f, -34.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -41.4f, 0.0f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, -44.5f, 34.1f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
                moveTo(68.9f, 198.4f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 118.2f, 0.0f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, -118.2f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
