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

public val SolidGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(283.21f, 512.0f)
                curveToRelative(78.96f, 0.0f, 151.08f, -35.92f, 198.86f, -94.79f)
                curveToRelative(7.07f, -8.71f, -0.64f, -21.43f, -11.56f, -19.35f)
                curveToRelative(-124.2f, 23.65f, -238.26f, -71.58f, -238.26f, -196.95f)
                curveToRelative(0.0f, -72.22f, 38.66f, -138.63f, 101.5f, -174.39f)
                curveToRelative(9.69f, -5.51f, 7.25f, -20.2f, -3.76f, -22.23f)
                arcTo(258.16f, 258.16f, 0.0f, false, false, 283.21f, 0.0f)
                curveToRelative(-141.31f, 0.0f, -256.0f, 114.51f, -256.0f, 256.0f)
                curveToRelative(0.0f, 141.31f, 114.51f, 256.0f, 256.0f, 256.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
