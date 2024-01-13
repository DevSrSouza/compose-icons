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

public val SimpleIcons.Openmined: ImageVector
    get() {
        if (_openmined != null) {
            return _openmined!!
        }
        _openmined = Builder(name = "Openmined", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.486f, 0.0f, -0.972f, 0.242f, -1.25f, 0.725f)
                lineTo(7.082f, 7.082f)
                lineTo(0.725f, 10.75f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 0.0f, 2.5f)
                lineToRelative(6.357f, 3.668f)
                lineToRelative(3.668f, 6.357f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 2.5f, 0.0f)
                lineToRelative(3.668f, -6.357f)
                lineToRelative(6.357f, -3.668f)
                curveToRelative(0.967f, -0.544f, 0.967f, -1.945f, 0.0f, -2.5f)
                lineToRelative(-6.357f, -3.668f)
                lineTo(13.25f, 0.725f)
                arcTo(1.429f, 1.429f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.006f, 4.237f)
                lineToRelative(7.757f, 7.769f)
                lineToRelative(-7.769f, 7.757f)
                lineToRelative(-7.757f, -7.757f)
                close()
                moveTo(11.994f, 7.349f)
                lineToRelative(-4.656f, 4.657f)
                lineToRelative(4.656f, 4.656f)
                lineToRelative(4.657f, -4.656f)
                close()
            }
        }
        .build()
        return _openmined!!
    }

private var _openmined: ImageVector? = null
