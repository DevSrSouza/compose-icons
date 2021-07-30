package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Slash: ImageVector
    get() {
        if (_slash != null) {
            return _slash!!
        }
        _slash = Builder(name = "Slash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(594.53f, 508.63f)
                lineTo(6.18f, 53.9f)
                curveToRelative(-6.97f, -5.42f, -8.23f, -15.47f, -2.81f, -22.45f)
                lineTo(23.01f, 6.18f)
                curveTo(28.43f, -0.8f, 38.49f, -2.06f, 45.47f, 3.37f)
                lineTo(633.82f, 458.1f)
                curveToRelative(6.97f, 5.42f, 8.23f, 15.47f, 2.81f, 22.45f)
                lineToRelative(-19.64f, 25.27f)
                curveToRelative(-5.42f, 6.98f, -15.48f, 8.23f, -22.46f, 2.81f)
                close()
            }
        }
        .build()
        return _slash!!
    }

private var _slash: ImageVector? = null
