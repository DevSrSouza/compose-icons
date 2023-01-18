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

public val LightGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 59.2f, 203.3f)
                lineToRelative(1.2f, 1.0f)
                arcToRelative(101.8f, 101.8f, 0.0f, false, false, 135.2f, 0.0f)
                lineToRelative(1.2f, -1.0f)
                arcTo(101.8f, 101.8f, 0.0f, false, false, 230.0f, 128.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 155.5f, 61.6f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, false, -40.0f, -31.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, false, -40.0f, 31.3f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(94.0f, 120.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 94.0f, 120.0f)
                close()
                moveTo(71.4f, 198.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, true, 113.2f, 0.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, -113.2f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
