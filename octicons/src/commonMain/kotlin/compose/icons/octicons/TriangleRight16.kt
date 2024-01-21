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

public val Octicons.TriangleRight16: ImageVector
    get() {
        if (_triangleRight16 != null) {
            return _triangleRight16!!
        }
        _triangleRight16 = Builder(name = "TriangleRight16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.427f, 4.427f)
                lineToRelative(3.396f, 3.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.354f)
                lineToRelative(-3.396f, 3.396f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 6.0f, 11.396f)
                verticalLineTo(4.604f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, -0.177f)
                close()
            }
        }
        .build()
        return _triangleRight16!!
    }

private var _triangleRight16: ImageVector? = null
