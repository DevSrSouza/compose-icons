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
                moveTo(5.1f, 9.2f)
                curveTo(13.3f, -1.2f, 28.4f, -3.1f, 38.8f, 5.1f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 12.3f, 23.3f, 4.1f, 33.7f)
                reflectiveCurveToRelative(-23.3f, 12.3f, -33.7f, 4.1f)
                lineTo(9.2f, 42.9f)
                curveTo(-1.2f, 34.7f, -3.1f, 19.6f, 5.1f, 9.2f)
                close()
            }
        }
        .build()
        return _slash!!
    }

private var _slash: ImageVector? = null
