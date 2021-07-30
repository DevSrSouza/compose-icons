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

public val SimpleIcons.Resurrectionremixos: ImageVector
    get() {
        if (_resurrectionremixos != null) {
            return _resurrectionremixos!!
        }
        _resurrectionremixos = Builder(name = "Resurrectionremixos", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.53f)
                lineToRelative(-9.952f, 0.078f)
                curveTo(9.142f, 3.647f, 6.994f, 8.265f, 0.0f, 16.345f)
                curveToRelative(1.569f, 0.753f, 3.323f, 1.24f, 4.338f, 0.119f)
                curveToRelative(1.703f, -1.883f, 4.275f, -5.48f, 7.154f, -8.346f)
                curveToRelative(1.793f, -1.784f, 6.01f, -0.865f, 9.95f, -1.23f)
                curveToRelative(1.351f, -0.125f, 2.41f, -2.48f, 2.558f, -3.359f)
                close()
                moveTo(23.853f, 9.606f)
                lineToRelative(-7.326f, 0.044f)
                curveToRelative(-4.39f, 0.0f, -5.38f, 2.492f, -11.91f, 10.24f)
                curveToRelative(1.194f, 0.563f, 3.28f, 0.84f, 3.763f, 0.257f)
                curveToRelative(1.78f, -2.158f, 2.506f, -3.51f, 5.36f, -6.362f)
                curveToRelative(1.657f, -1.658f, 4.39f, -0.687f, 7.86f, -1.01f)
                curveToRelative(1.267f, -0.12f, 2.132f, -2.449f, 2.253f, -3.169f)
                close()
            }
        }
        .build()
        return _resurrectionremixos!!
    }

private var _resurrectionremixos: ImageVector? = null
