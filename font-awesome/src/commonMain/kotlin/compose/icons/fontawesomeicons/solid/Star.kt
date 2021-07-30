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

public val SolidGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(259.3f, 17.8f)
                lineTo(194.0f, 150.2f)
                lineTo(47.9f, 171.5f)
                curveToRelative(-26.2f, 3.8f, -36.7f, 36.1f, -17.7f, 54.6f)
                lineToRelative(105.7f, 103.0f)
                lineToRelative(-25.0f, 145.5f)
                curveToRelative(-4.5f, 26.3f, 23.2f, 46.0f, 46.4f, 33.7f)
                lineTo(288.0f, 439.6f)
                lineToRelative(130.7f, 68.7f)
                curveToRelative(23.2f, 12.2f, 50.9f, -7.4f, 46.4f, -33.7f)
                lineToRelative(-25.0f, -145.5f)
                lineToRelative(105.7f, -103.0f)
                curveToRelative(19.0f, -18.5f, 8.5f, -50.8f, -17.7f, -54.6f)
                lineTo(382.0f, 150.2f)
                lineTo(316.7f, 17.8f)
                curveToRelative(-11.7f, -23.6f, -45.6f, -23.9f, -57.4f, 0.0f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
