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

public val SimpleIcons.Auth0: ImageVector
    get() {
        if (_auth0 != null) {
            return _auth0!!
        }
        _auth0 = Builder(name = "Auth0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.98f, 7.448f)
                lineTo(19.62f, 0.0f)
                horizontalLineTo(4.347f)
                lineTo(2.02f, 7.448f)
                curveToRelative(-1.352f, 4.312f, 0.03f, 9.206f, 3.815f, 12.015f)
                lineTo(12.007f, 24.0f)
                lineToRelative(6.157f, -4.552f)
                curveToRelative(3.755f, -2.81f, 5.182f, -7.688f, 3.815f, -12.015f)
                lineToRelative(-6.16f, 4.58f)
                lineToRelative(2.343f, 7.45f)
                lineToRelative(-6.157f, -4.597f)
                lineToRelative(-6.158f, 4.58f)
                lineToRelative(2.358f, -7.433f)
                lineToRelative(-6.188f, -4.55f)
                lineToRelative(7.63f, -0.045f)
                lineTo(12.008f, 0.0f)
                lineToRelative(2.356f, 7.404f)
                lineToRelative(7.615f, 0.044f)
                close()
            }
        }
        .build()
        return _auth0!!
    }

private var _auth0: ImageVector? = null
