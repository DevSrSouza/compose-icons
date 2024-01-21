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

public val Octicons.ArrowUpLeft16: ImageVector
    get() {
        if (_arrowUpLeft16 != null) {
            return _arrowUpLeft16!!
        }
        _arrowUpLeft16 = Builder(name = "ArrowUpLeft16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.96f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.71f, 4.0f)
                horizontalLineToRelative(6.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.2f)
                lineToRelative(5.26f, 5.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.061f)
                lineToRelative(-5.26f, -5.26f)
                verticalLineToRelative(4.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeft16!!
    }

private var _arrowUpLeft16: ImageVector? = null
