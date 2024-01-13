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
                moveToRelative(3.401f, 4.594f)
                lineToRelative(1.025f, 0.366f)
                lineToRelative(3.08f, 0.912f)
                curveToRelative(-0.01f, 0.18f, -0.016f, 0.361f, -0.016f, 0.543f)
                curveToRelative(0.0f, 3.353f, 1.693f, 7.444f, 4.51f, 10.387f)
                curveToRelative(2.817f, -2.943f, 4.51f, -7.034f, 4.51f, -10.387f)
                curveToRelative(0.0f, -0.182f, -0.006f, -0.363f, -0.016f, -0.543f)
                lineToRelative(3.08f, -0.912f)
                lineToRelative(1.025f, -0.366f)
                lineTo(24.0f, 3.276f)
                curveTo(23.854f, 8.978f, 19.146f, 14.9f, 13.502f, 18.17f)
                curveToRelative(1.302f, 1.028f, 2.778f, 1.81f, 4.388f, 2.215f)
                verticalLineToRelative(0.114f)
                lineToRelative(0.004f, 0.001f)
                verticalLineToRelative(0.224f)
                arcToRelative(14.55f, 14.55f, 0.0f, false, true, -4.829f, -1.281f)
                arcTo(20.909f, 20.909f, 0.0f, false, true, 12.0f, 18.966f)
                curveToRelative(-0.353f, 0.17f, -0.708f, 0.329f, -1.065f, 0.477f)
                arcToRelative(14.55f, 14.55f, 0.0f, false, true, -4.829f, 1.281f)
                verticalLineTo(20.5f)
                lineToRelative(0.004f, -0.001f)
                verticalLineToRelative(-0.113f)
                curveToRelative(1.61f, -0.406f, 3.086f, -1.188f, 4.389f, -2.216f)
                curveTo(4.854f, 14.9f, 0.146f, 8.978f, 0.0f, 3.276f)
                lineToRelative(3.401f, 1.318f)
                close()
            }
        }
        .build()
        return _xmpp!!
    }

private var _xmpp: ImageVector? = null
