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

public val LightGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.2f, 213.0f)
                arcToRelative(118.3f, 118.3f, 0.0f, false, false, -70.5f, -54.6f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, false, -63.4f, 0.0f)
                arcTo(118.3f, 118.3f, 0.0f, false, false, 25.8f, 213.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 2.2f, 8.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.2f, -2.2f)
                arcToRelative(106.0f, 106.0f, 0.0f, false, true, 183.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 3.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 3.0f, -0.8f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 230.2f, 213.0f)
                close()
                moveTo(70.0f, 96.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 58.0f, 58.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 70.0f, 96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
