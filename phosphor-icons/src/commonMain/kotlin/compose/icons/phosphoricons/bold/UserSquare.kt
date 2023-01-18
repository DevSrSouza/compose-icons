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

public val BoldGroup.UserSquare: ImageVector
    get() {
        if (_userSquare != null) {
            return _userSquare!!
        }
        _userSquare = Builder(name = "UserSquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(204.0f, 196.2f)
                arcToRelative(82.4f, 82.4f, 0.0f, false, false, -39.1f, -39.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -73.8f, 0.0f)
                arcTo(82.4f, 82.4f, 0.0f, false, false, 52.0f, 196.2f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(100.0f, 120.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 100.0f, 120.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, true, 37.7f, 13.3f)
                arcTo(61.7f, 61.7f, 0.0f, false, true, 181.1f, 204.0f)
                lineTo(74.9f, 204.0f)
                arcToRelative(61.7f, 61.7f, 0.0f, false, true, 15.4f, -18.7f)
                arcTo(59.4f, 59.4f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
