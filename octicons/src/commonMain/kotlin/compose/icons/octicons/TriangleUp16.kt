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

public val Octicons.TriangleUp16: ImageVector
    get() {
        if (_triangleUp16 != null) {
            return _triangleUp16!!
        }
        _triangleUp16 = Builder(name = "TriangleUp16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.427f, 9.573f)
                lineToRelative(3.396f, -3.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.354f, 0.0f)
                lineToRelative(3.396f, 3.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, 0.427f)
                horizontalLineTo(4.604f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, -0.427f)
                close()
            }
        }
        .build()
        return _triangleUp16!!
    }

private var _triangleUp16: ImageVector? = null
