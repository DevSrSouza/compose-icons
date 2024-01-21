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

public val SimpleIcons.Akaunting: ImageVector
    get() {
        if (_akaunting != null) {
            return _akaunting!!
        }
        _akaunting = Builder(name = "Akaunting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.146f, 18.673f)
                arcToRelative(7.352f, 7.352f, 0.0f, false, true, -3.148f, 0.704f)
                arcToRelative(7.344f, 7.344f, 0.0f, false, true, -4.538f, -1.561f)
                lineToRelative(-3.013f, 3.511f)
                arcTo(11.956f, 11.956f, 0.0f, false, false, 11.998f, 24.0f)
                curveToRelative(1.913f, 0.0f, 3.721f, -0.448f, 5.326f, -1.244f)
                lineToRelative(-2.178f, -4.083f)
                close()
                moveTo(19.375f, 21.465f)
                lineTo(19.375f, 24.0f)
                horizontalLineToRelative(4.623f)
                lineTo(23.998f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.372f, -12.0f, -12.0f, -12.0f)
                curveTo(5.473f, 0.0f, 0.165f, 5.208f, 0.002f, 11.693f)
                horizontalLineToRelative(4.626f)
                arcToRelative(7.377f, 7.377f, 0.0f, true, true, 11.034f, 6.711f)
                lineToRelative(2.177f, 4.081f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.536f, -1.02f)
                close()
                moveTo(7.016f, 17.44f)
                arcToRelative(7.352f, 7.352f, 0.0f, false, true, -2.389f, -5.165f)
                lineTo(0.002f, 12.275f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, false, 4.002f, 8.675f)
                lineToRelative(3.012f, -3.51f)
                close()
            }
        }
        .build()
        return _akaunting!!
    }

private var _akaunting: ImageVector? = null
