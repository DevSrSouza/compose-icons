package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.NavigationFill: ImageVector
    get() {
        if (_navigationFill != null) {
            return _navigationFill!!
        }
        _navigationFill = Builder(name = "NavigationFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9f, 2.3f)
                lineToRelative(18.805f, 6.268f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.028f, 0.939f)
                lineTo(13.0f, 13.0f)
                lineToRelative(-4.425f, 8.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.928f, -0.086f)
                lineTo(2.26f, 2.911f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.9f, 2.3f)
                close()
            }
        }
        .build()
        return _navigationFill!!
    }

private var _navigationFill: ImageVector? = null
