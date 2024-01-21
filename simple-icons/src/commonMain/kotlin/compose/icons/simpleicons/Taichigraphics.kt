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

public val SimpleIcons.Taichigraphics: ImageVector
    get() {
        if (_taichigraphics != null) {
            return _taichigraphics!!
        }
        _taichigraphics = Builder(name = "Taichigraphics", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.343f, 20.672f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 1.94f, -1.94f)
                arcToRelative(1.94f, 1.94f, 0.0f, true, false, -3.88f, 0.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 1.94f, 1.94f)
                close()
                moveTo(9.058f, 12.796f)
                arcToRelative(6.858f, 6.858f, 0.0f, true, false, -2.324f, -9.67f)
                curveToRelative(-0.062f, 0.099f, -0.125f, 0.198f, -0.185f, 0.3f)
                curveToRelative(-0.06f, 0.103f, -0.11f, 0.205f, -0.167f, 0.31f)
                arcToRelative(6.858f, 6.858f, 0.0f, false, false, 2.676f, 9.06f)
                close()
                moveTo(9.058f, 12.793f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(-2.113f, 3.663f)
                lineToRelative(2.114f, 3.667f)
                horizontalLineToRelative(4.229f)
                lineToRelative(2.116f, -3.667f)
                close()
                moveTo(9.058f, 20.123f)
                lineTo(6.82f, 23.999f)
                horizontalLineToRelative(4.48f)
                close()
            }
        }
        .build()
        return _taichigraphics!!
    }

private var _taichigraphics: ImageVector? = null
