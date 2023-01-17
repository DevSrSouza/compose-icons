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

public val Octicons.Pulse24: ImageVector
    get() {
        if (_pulse24 != null) {
            return _pulse24!!
        }
        _pulse24 = Builder(name = "Pulse24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.002f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.691f, 0.464f)
                lineToRelative(6.302f, 15.305f)
                lineToRelative(2.56f, -6.301f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.695f, -0.468f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.495f)
                lineToRelative(-3.06f, 7.532f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.389f, 0.004f)
                lineTo(8.997f, 5.21f)
                lineToRelative(-3.054f, 7.329f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.25f, 13.0f)
                horizontalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.558f, -8.538f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.694f, -0.462f)
                close()
            }
        }
        .build()
        return _pulse24!!
    }

private var _pulse24: ImageVector? = null
