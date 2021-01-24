package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(283.211f, 512.0f)
                curveToRelative(78.962f, 0.0f, 151.079f, -35.925f, 198.857f, -94.792f)
                curveToRelative(7.068f, -8.708f, -0.639f, -21.43f, -11.562f, -19.35f)
                curveToRelative(-124.203f, 23.654f, -238.262f, -71.576f, -238.262f, -196.954f)
                curveToRelative(0.0f, -72.222f, 38.662f, -138.635f, 101.498f, -174.394f)
                curveToRelative(9.686f, -5.512f, 7.25f, -20.197f, -3.756f, -22.23f)
                arcTo(258.156f, 258.156f, 0.0f, false, false, 283.211f, 0.0f)
                curveToRelative(-141.309f, 0.0f, -256.0f, 114.511f, -256.0f, 256.0f)
                curveToRelative(0.0f, 141.309f, 114.511f, 256.0f, 256.0f, 256.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
