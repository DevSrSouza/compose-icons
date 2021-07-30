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

public val SimpleIcons.Xmpp: ImageVector
    get() {
        if (_xmpp != null) {
            return _xmpp!!
        }
        _xmpp = Builder(name = "Xmpp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.186f)
                lineToRelative(-3.217f, 1.248f)
                lineToRelative(-0.976f, 0.325f)
                lineToRelative(-3.122f, 0.925f)
                curveToRelative(0.014f, 0.18f, 0.014f, 0.361f, 0.014f, 0.555f)
                curveToRelative(0.0f, 3.422f, -1.744f, 7.59f, -4.63f, 10.573f)
                curveToRelative(-2.805f, -2.972f, -4.49f, -7.066f, -4.49f, -10.434f)
                curveToRelative(0.0f, -0.194f, 0.0f, -0.375f, 0.014f, -0.555f)
                lineToRelative(-3.11f, -0.921f)
                verticalLineToRelative(-0.009f)
                lineToRelative(-0.861f, -0.306f)
                lineTo(0.0f, 3.172f)
                curveToRelative(0.146f, 5.747f, 4.867f, 11.701f, 10.542f, 15.02f)
                curveToRelative(-1.3f, 1.014f, -2.766f, 1.788f, -4.365f, 2.192f)
                verticalLineToRelative(0.319f)
                curveToRelative(0.434f, -0.054f, 0.852f, -0.14f, 1.271f, -0.225f)
                curveToRelative(0.15f, -0.027f, 0.3f, -0.048f, 0.451f, -0.08f)
                lineToRelative(0.047f, -0.012f)
                curveToRelative(1.36f, -0.29f, 2.722f, -0.776f, 4.052f, -1.408f)
                curveToRelative(0.397f, 0.195f, 0.797f, 0.38f, 1.2f, 0.548f)
                curveToRelative(0.109f, 0.05f, 0.22f, 0.095f, 0.33f, 0.142f)
                curveToRelative(0.201f, 0.086f, 0.407f, 0.159f, 0.612f, 0.236f)
                curveToRelative(1.25f, 0.474f, 2.568f, 0.809f, 3.96f, 0.924f)
                verticalLineToRelative(-0.305f)
                curveToRelative(-1.68f, -0.425f, -3.211f, -1.264f, -4.56f, -2.355f)
                curveTo(19.194f, 14.904f, 23.853f, 8.975f, 24.0f, 3.186f)
                close()
            }
        }
        .build()
        return _xmpp!!
    }

private var _xmpp: ImageVector? = null
