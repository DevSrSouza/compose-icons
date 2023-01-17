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

public val Octicons.PersonFill24: ImageVector
    get() {
        if (_personFill24 != null) {
            return _personFill24!!
        }
        _personFill24 = Builder(name = "PersonFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, -2.519f, 9.857f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, false, -6.477f, 8.37f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.727f, 0.773f)
                horizontalLineTo(20.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.727f, -0.772f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, false, -6.477f, -8.37f)
                arcTo(5.25f, 5.25f, 0.0f, false, false, 12.0f, 2.5f)
                close()
            }
        }
        .build()
        return _personFill24!!
    }

private var _personFill24: ImageVector? = null
