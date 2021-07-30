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

public val SimpleIcons.Codeberg: ImageVector
    get() {
        if (_codeberg != null) {
            return _codeberg!!
        }
        _codeberg = Builder(name = "Codeberg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.955f, 0.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.832f, 6.373f)
                lineTo(11.838f, 5.928f)
                arcToRelative(0.187f, 0.14f, 0.0f, false, true, 0.324f, 0.0f)
                lineToRelative(10.006f, 12.935f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 12.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.045f, 0.0f)
                close()
                moveTo(12.33f, 6.957f)
                lineToRelative(4.416f, 16.553f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.137f, -4.213f)
                close()
            }
        }
        .build()
        return _codeberg!!
    }

private var _codeberg: ImageVector? = null
