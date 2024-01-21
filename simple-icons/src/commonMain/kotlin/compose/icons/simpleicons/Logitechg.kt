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

public val SimpleIcons.Logitechg: ImageVector
    get() {
        if (_logitechg != null) {
            return _logitechg!!
        }
        _logitechg = Builder(name = "Logitechg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5664f, 0.0f)
                curveTo(10.9101f, 0.0f, 9.352f, 0.3143f, 7.8887f, 0.9414f)
                curveToRelative(-1.4794f, 0.6271f, -2.766f, 1.483f, -3.8594f, 2.5684f)
                curveToRelative(-1.0935f, 1.0854f, -1.9549f, 2.359f, -2.582f, 3.8222f)
                curveToRelative(-0.6432f, 1.4473f, -0.9575f, 3.0f, -0.9414f, 4.6563f)
                curveToRelative(0.0f, 1.6563f, 0.3142f, 3.2164f, 0.9414f, 4.6797f)
                curveToRelative(0.8537f, 1.9702f, 2.6764f, 4.7711f, 6.4414f, 6.3672f)
                curveTo(9.352f, 23.6784f, 10.91f, 24.0f, 12.5664f, 24.0f)
                verticalLineToRelative(-4.9922f)
                curveToRelative(-0.9809f, 0.0f, -1.8977f, -0.1848f, -2.75f, -0.5547f)
                curveToRelative(-1.6852f, -0.7313f, -2.9903f, -2.0167f, -3.7383f, -3.7402f)
                curveToRelative(-0.7467f, -1.7207f, -0.736f, -3.755f, 0.0f, -5.4512f)
                curveToRelative(0.737f, -1.6981f, 2.0318f, -2.9977f, 3.7383f, -3.7383f)
                curveToRelative(0.8523f, -0.3698f, 1.7691f, -0.5546f, 2.75f, -0.5546f)
                close()
                moveTo(12.7364f, 9.8418f)
                verticalLineToRelative(4.9434f)
                horizontalLineToRelative(5.8124f)
                verticalLineToRelative(5.8144f)
                horizontalLineToRelative(4.9453f)
                lineTo(23.4941f, 9.8418f)
                close()
            }
        }
        .build()
        return _logitechg!!
    }

private var _logitechg: ImageVector? = null
