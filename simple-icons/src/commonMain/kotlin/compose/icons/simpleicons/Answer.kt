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

public val SimpleIcons.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.486f, 0.0f)
                curveToRelative(-1.92f, 0.0f, -2.881f, 0.0f, -3.615f, 0.373f)
                arcTo(3.428f, 3.428f, 0.0f, false, false, 0.373f, 1.871f)
                curveTo(-0.001f, 2.605f, 0.0f, 3.566f, 0.0f, 5.486f)
                verticalLineToRelative(9.6f)
                curveToRelative(0.0f, 1.92f, 0.0f, 2.88f, 0.373f, 3.613f)
                curveToRelative(0.329f, 0.645f, 0.853f, 1.17f, 1.498f, 1.498f)
                curveToRelative(0.734f, 0.374f, 1.695f, 0.375f, 3.615f, 0.375f)
                horizontalLineToRelative(11.657f)
                lineTo(17.143f, 24.0f)
                lineToRelative(0.793f, -0.396f)
                curveToRelative(2.201f, -1.101f, 3.3f, -1.652f, 4.105f, -2.473f)
                arcToRelative(6.852f, 6.852f, 0.0f, false, false, 1.584f, -2.56f)
                curveTo(24.0f, 17.483f, 24.0f, 16.251f, 24.0f, 13.79f)
                lineTo(24.0f, 5.486f)
                curveToRelative(0.0f, -1.92f, 0.0f, -2.881f, -0.373f, -3.615f)
                arcTo(3.428f, 3.428f, 0.0f, false, false, 22.129f, 0.373f)
                curveTo(21.395f, -0.001f, 20.434f, 0.0f, 18.514f, 0.0f)
                lineTo(5.486f, 0.0f)
                close()
                moveTo(6.857f, 10.285f)
                horizontalLineToRelative(10.286f)
                arcToRelative(5.142f, 5.142f, 0.0f, false, true, -10.286f, 0.024f)
                verticalLineToRelative(-0.024f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
