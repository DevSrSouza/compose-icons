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

public val Octicons.Person24: ImageVector
    get() {
        if (_person24 != null) {
            return _person24!!
        }
        _person24 = Builder(name = "Person24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 3.096f, 10.047f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, true, 5.9f, 8.181f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.499f, 0.044f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -14.993f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, -0.045f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, true, 5.9f, -8.18f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 12.0f, 2.5f)
                close()
                moveTo(8.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _person24!!
    }

private var _person24: ImageVector? = null
