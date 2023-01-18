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

public val ThinGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.5f, 214.0f)
                arcToRelative(116.5f, 116.5f, 0.0f, false, false, -74.8f, -55.1f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -51.4f, 0.0f)
                arcTo(116.5f, 116.5f, 0.0f, false, false, 27.5f, 214.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, 4.0f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, true, 187.0f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.0f, -0.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 228.5f, 214.0f)
                close()
                moveTo(68.0f, 96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
