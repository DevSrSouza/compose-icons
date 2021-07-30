package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Kaios: ImageVector
    get() {
        if (_kaios != null) {
            return _kaios!!
        }
        _kaios = Builder(name = "Kaios", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3419f, 1.0E-4f)
                arcToRelative(3.6735f, 3.6735f, 0.0f, false, false, -3.647f, 3.6735f)
                arcToRelative(3.6727f, 3.6727f, 0.0f, false, false, 3.6735f, 3.6734f)
                arcToRelative(3.6735f, 3.6735f, 0.0f, true, false, -0.0265f, -7.3469f)
                close()
                moveTo(4.6233f, 0.16f)
                arcToRelative(2.7459f, 2.7459f, 0.0f, false, false, -2.7475f, 2.7473f)
                verticalLineToRelative(18.167f)
                arcToRelative(2.7474f, 2.7474f, 0.0f, true, false, 5.4942f, 0.0f)
                lineTo(7.37f, 2.9071f)
                arcTo(2.749f, 2.749f, 0.0f, false, false, 4.6233f, 0.16f)
                close()
                moveTo(11.5727f, 7.3678f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, -2.237f, 4.2947f)
                lineToRelative(7.8107f, 11.1541f)
                arcToRelative(2.729f, 2.729f, 0.0f, true, false, 4.4706f, -3.1307f)
                lineTo(13.8062f, 8.5311f)
                arcToRelative(2.729f, 2.729f, 0.0f, false, false, -2.2335f, -1.1634f)
                close()
            }
        }
        .build()
        return _kaios!!
    }

private var _kaios: ImageVector? = null
