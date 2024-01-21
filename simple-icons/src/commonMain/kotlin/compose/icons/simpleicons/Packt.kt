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

public val SimpleIcons.Packt: ImageVector
    get() {
        if (_packt != null) {
            return _packt!!
        }
        _packt = Builder(name = "Packt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.965f, 4.898f)
                curveToRelative(-0.707f, 0.0f, -1.344f, 0.152f, -1.908f, 0.452f)
                arcToRelative(3.901f, 3.901f, 0.0f, false, false, -0.891f, 0.642f)
                verticalLineToRelative(-0.937f)
                lineTo(7.488f, 5.055f)
                verticalLineToRelative(14.047f)
                horizontalLineToRelative(2.657f)
                lineTo(10.145f, 14.1f)
                curveToRelative(0.26f, 0.249f, 0.559f, 0.463f, 0.898f, 0.638f)
                curveToRelative(0.572f, 0.294f, 1.213f, 0.44f, 1.92f, 0.44f)
                curveToRelative(0.914f, 0.0f, 1.73f, -0.224f, 2.453f, -0.674f)
                curveToRelative(1.237f, -0.77f, 2.328f, -2.27f, 2.328f, -4.453f)
                curveToRelative(0.0f, -2.206f, -1.09f, -3.704f, -2.328f, -4.477f)
                curveToRelative(-0.721f, -0.45f, -1.537f, -0.676f, -2.451f, -0.676f)
                close()
                moveTo(3.8f, 5.055f)
                lineTo(0.0f, 9.79f)
                lineToRelative(3.822f, 5.133f)
                lineTo(7.09f, 14.923f)
                lineTo(3.012f, 9.79f)
                lineToRelative(3.875f, -4.736f)
                close()
                moveTo(17.112f, 5.055f)
                lineTo(20.987f, 9.791f)
                lineTo(16.909f, 14.924f)
                horizontalLineToRelative(3.268f)
                lineTo(24.0f, 9.79f)
                lineToRelative(-3.8f, -4.736f)
                close()
                moveTo(12.493f, 7.373f)
                curveToRelative(1.007f, 0.0f, 1.788f, 0.493f, 2.2f, 1.275f)
                curveToRelative(0.452f, 0.86f, 0.395f, 2.034f, 0.0f, 2.78f)
                curveToRelative(-0.221f, 0.419f, -0.84f, 1.277f, -2.2f, 1.277f)
                curveToRelative(-0.49f, 0.0f, -0.925f, -0.11f, -1.299f, -0.336f)
                arcToRelative(2.338f, 2.338f, 0.0f, false, true, -0.879f, -0.941f)
                curveToRelative(-0.211f, -0.403f, -0.316f, -0.869f, -0.316f, -1.399f)
                reflectiveCurveToRelative(0.105f, -0.978f, 0.316f, -1.38f)
                curveToRelative(0.393f, -0.748f, 1.156f, -1.276f, 2.178f, -1.276f)
                close()
            }
        }
        .build()
        return _packt!!
    }

private var _packt: ImageVector? = null
