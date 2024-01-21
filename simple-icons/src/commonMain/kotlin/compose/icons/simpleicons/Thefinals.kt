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

public val SimpleIcons.Thefinals: ImageVector
    get() {
        if (_thefinals != null) {
            return _thefinals!!
        }
        _thefinals = Builder(name = "Thefinals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.523f, 19.319f)
                lineTo(24.0f, 19.319f)
                lineTo(14.965f, 6.295f)
                curveToRelative(-0.626f, -0.904f, -1.51f, -1.614f, -2.847f, -1.614f)
                curveToRelative(-1.38f, 0.0f, -2.264f, 0.775f, -2.889f, 1.614f)
                lineTo(0.0f, 19.319f)
                horizontalLineToRelative(5.261f)
                lineToRelative(3.372f, -4.759f)
                lineToRelative(3.256f, 4.759f)
                horizontalLineToRelative(5.478f)
                lineToRelative(-5.934f, -8.712f)
                lineToRelative(0.599f, -0.846f)
                lineToRelative(6.491f, 9.558f)
                close()
                moveTo(18.523f, 19.319f)
            }
        }
        .build()
        return _thefinals!!
    }

private var _thefinals: ImageVector? = null
