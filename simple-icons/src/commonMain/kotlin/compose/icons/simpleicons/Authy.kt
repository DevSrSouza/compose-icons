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

public val SimpleIcons.Authy: ImageVector
    get() {
        if (_authy != null) {
            return _authy!!
        }
        _authy = Builder(name = "Authy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(15.42f, 5.338f)
                curveToRelative(0.274f, 0.0f, 0.551f, 0.105f, 0.769f, 0.315f)
                lineToRelative(2.862f, 2.862f)
                curveToRelative(2.054f, 2.039f, 2.084f, 5.35f, 0.105f, 7.449f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, true, -0.045f, 0.06f)
                lineToRelative(-0.03f, 0.03f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.015f, 0.015f, -0.045f, 0.03f, -0.06f, 0.045f)
                curveToRelative(-2.098f, 1.978f, -5.41f, 1.948f, -7.463f, -0.105f)
                lineToRelative(-2.863f, -2.863f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 0.0f, -1.499f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 1.5f, 0.0f)
                lineToRelative(2.861f, 2.863f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, false, 4.542f, 0.03f)
                arcToRelative(3.244f, 3.244f, 0.0f, false, false, -0.03f, -4.541f)
                lineToRelative(-2.863f, -2.862f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 0.0f, -1.5f)
                curveToRelative(0.203f, -0.209f, 0.472f, -0.314f, 0.746f, -0.314f)
                close()
                moveTo(8.758f, 6.397f)
                arcToRelative(5.33f, 5.33f, 0.0f, false, true, 3.715f, 1.564f)
                lineToRelative(2.863f, 2.862f)
                curveToRelative(0.42f, 0.42f, 0.42f, 1.08f, 0.0f, 1.5f)
                curveToRelative(-0.42f, 0.419f, -1.08f, 0.419f, -1.5f, 0.0f)
                lineTo(10.975f, 9.46f)
                arcToRelative(3.249f, 3.249f, 0.0f, false, false, -4.558f, -0.015f)
                arcToRelative(3.243f, 3.243f, 0.0f, false, false, 0.03f, 4.54f)
                lineToRelative(2.863f, 2.863f)
                curveToRelative(0.42f, 0.42f, 0.42f, 1.08f, 0.0f, 1.499f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, -1.499f, 0.0f)
                lineTo(4.95f, 15.484f)
                curveToRelative(-2.054f, -2.053f, -2.084f, -5.365f, -0.105f, -7.463f)
                curveToRelative(0.015f, -0.03f, 0.03f, -0.045f, 0.045f, -0.06f)
                lineToRelative(0.03f, -0.03f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.015f, -0.015f, 0.045f, -0.03f, 0.06f, -0.045f)
                arcToRelative(5.355f, 5.355f, 0.0f, false, true, 3.748f, -1.46f)
                close()
            }
        }
        .build()
        return _authy!!
    }

private var _authy: ImageVector? = null
