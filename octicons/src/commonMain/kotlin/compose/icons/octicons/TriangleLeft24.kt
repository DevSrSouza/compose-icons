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

public val Octicons.TriangleLeft24: ImageVector
    get() {
        if (_triangleLeft24 != null) {
            return _triangleLeft24!!
        }
        _triangleLeft24 = Builder(name = "TriangleLeft24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.854f, 11.646f)
                lineToRelative(5.792f, -5.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.854f, 0.353f)
                verticalLineToRelative(11.586f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.854f, 0.353f)
                lineToRelative(-5.792f, -5.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.708f)
                close()
            }
        }
        .build()
        return _triangleLeft24!!
    }

private var _triangleLeft24: ImageVector? = null
