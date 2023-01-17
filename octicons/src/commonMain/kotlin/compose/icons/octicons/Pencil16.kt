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

public val Octicons.Pencil16: ImageVector
    get() {
        if (_pencil16 != null) {
            return _pencil16!!
        }
        _pencil16 = Builder(name = "Pencil16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.013f, 1.427f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.474f, 0.0f)
                lineToRelative(1.086f, 1.086f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.474f)
                lineToRelative(-8.61f, 8.61f)
                curveToRelative(-0.21f, 0.21f, -0.47f, 0.364f, -0.756f, 0.445f)
                lineToRelative(-3.251f, 0.93f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.927f, -0.928f)
                lineToRelative(0.929f, -3.25f)
                curveToRelative(0.081f, -0.286f, 0.235f, -0.547f, 0.445f, -0.758f)
                lineToRelative(8.61f, -8.61f)
                close()
                moveTo(11.189f, 6.25f)
                lineTo(9.75f, 4.81f)
                lineToRelative(-6.286f, 6.287f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.064f, 0.108f)
                lineToRelative(-0.558f, 1.953f)
                lineToRelative(1.953f, -0.558f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.108f, -0.064f)
                close()
                moveTo(12.427f, 2.487f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.354f, 0.0f)
                lineTo(10.811f, 3.75f)
                lineToRelative(1.439f, 1.44f)
                lineToRelative(1.263f, -1.263f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.354f)
                close()
            }
        }
        .build()
        return _pencil16!!
    }

private var _pencil16: ImageVector? = null
