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

public val Octicons.TriangleUp24: ImageVector
    get() {
        if (_triangleUp24 != null) {
            return _triangleUp24!!
        }
        _triangleUp24 = Builder(name = "TriangleUp24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.354f, 8.854f)
                lineToRelative(5.792f, 5.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, 0.854f)
                horizontalLineTo(6.207f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, -0.854f)
                lineToRelative(5.792f, -5.792f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return _triangleUp24!!
    }

private var _triangleUp24: ImageVector? = null
