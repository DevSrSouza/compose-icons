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

public val Octicons.ArrowUp16: ImageVector
    get() {
        if (_arrowUp16 != null) {
            return _arrowUp16!!
        }
        _arrowUp16 = Builder(name = "ArrowUp16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.47f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineTo(9.0f, 4.81f)
                verticalLineToRelative(7.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(4.81f)
                lineTo(4.53f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUp16!!
    }

private var _arrowUp16: ImageVector? = null
