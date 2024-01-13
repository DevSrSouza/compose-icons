package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PersonFill16: ImageVector
    get() {
        if (_personFill16 != null) {
            return _personFill16!!
        }
        _personFill16 = Builder(name = "PersonFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.243f, 4.757f)
                arcToRelative(3.757f, 3.757f, 0.0f, true, true, 5.851f, 3.119f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 3.9f, 5.339f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.715f, 0.784f)
                horizontalLineTo(2.721f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.714f, -0.784f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 3.9f, -5.34f)
                arcToRelative(3.753f, 3.753f, 0.0f, false, true, -1.664f, -3.118f)
                close()
            }
        }
        .build()
        return _personFill16!!
    }

private var _personFill16: ImageVector? = null
