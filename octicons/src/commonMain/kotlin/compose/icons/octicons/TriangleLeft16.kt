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

public val Octicons.TriangleLeft16: ImageVector
    get() {
        if (_triangleLeft16 != null) {
            return _triangleLeft16!!
        }
        _triangleLeft16 = Builder(name = "TriangleLeft16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.573f, 4.427f)
                lineTo(6.177f, 7.823f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.354f)
                lineToRelative(3.396f, 3.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.427f, -0.177f)
                verticalLineTo(4.604f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.427f, -0.177f)
                close()
            }
        }
        .build()
        return _triangleLeft16!!
    }

private var _triangleLeft16: ImageVector? = null
