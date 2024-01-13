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

public val SimpleIcons.Gitextensions: ImageVector
    get() {
        if (_gitextensions != null) {
            return _gitextensions!!
        }
        _gitextensions = Builder(name = "Gitextensions", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.504f, 0.0f)
                lineToRelative(-4.631f, 4.875f)
                lineToRelative(2.533f, 0.004f)
                curveToRelative(0.0f, 2.604f, -1.327f, 4.58f, -3.32f, 6.16f)
                lineToRelative(-6.393f, 5.065f)
                curveToRelative(-2.559f, 2.027f, -3.859f, 4.392f, -3.859f, 7.886f)
                curveToRelative(0.01f, -0.009f, 4.283f, 0.026f, 4.283f, 0.0f)
                curveToRelative(0.0f, -1.91f, 0.73f, -3.581f, 2.223f, -4.793f)
                lineToRelative(6.723f, -5.455f)
                curveToRelative(2.57f, -2.085f, 4.514f, -4.86f, 4.517f, -8.867f)
                horizontalLineToRelative(2.586f)
                close()
                moveTo(1.834f, 4.873f)
                curveToRelative(0.0f, 3.78f, 1.833f, 6.398f, 4.148f, 8.518f)
                lineToRelative(1.11f, 0.88f)
                lineToRelative(3.222f, -2.554f)
                lineToRelative(-1.078f, -0.858f)
                curveTo(7.43f, 9.22f, 6.117f, 7.383f, 6.117f, 4.873f)
                curveToRelative(-1.423f, -0.004f, -2.856f, 0.0f, -4.283f, 0.0f)
                close()
                moveTo(14.426f, 14.988f)
                lineToRelative(-3.178f, 2.58f)
                lineToRelative(0.992f, 0.787f)
                curveToRelative(1.82f, 1.593f, 3.166f, 3.33f, 3.166f, 5.635f)
                horizontalLineToRelative(4.166f)
                curveToRelative(-0.009f, -3.633f, -1.788f, -6.1f, -4.066f, -8.144f)
                curveToRelative(-0.356f, -0.28f, -0.722f, -0.572f, -1.08f, -0.858f)
                close()
            }
        }
        .build()
        return _gitextensions!!
    }

private var _gitextensions: ImageVector? = null
