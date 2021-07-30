package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Pencil24: ImageVector
    get() {
        if (_pencil24 != null) {
            return _pencil24!!
        }
        _pencil24 = Builder(name = "Pencil24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.263f, 2.177f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.474f, 0.0f)
                lineToRelative(2.586f, 2.586f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.474f)
                lineTo(19.53f, 10.03f)
                lineToRelative(-0.012f, 0.013f)
                lineTo(8.69f, 20.378f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.699f, 0.409f)
                lineToRelative(-5.523f, 1.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.935f, -0.935f)
                lineToRelative(1.673f, -5.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.466f, -0.756f)
                lineTo(14.476f, 4.963f)
                lineToRelative(2.787f, -2.786f)
                close()
                moveTo(14.988f, 6.548f)
                lineToRelative(-10.28f, 9.813f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.067f, 0.108f)
                lineToRelative(-1.264f, 4.154f)
                lineToRelative(4.177f, -1.271f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.1f, -0.059f)
                lineToRelative(10.273f, -9.806f)
                lineToRelative(-2.94f, -2.939f)
                close()
                moveTo(19.0f, 8.44f)
                lineToRelative(2.263f, -2.262f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.354f)
                lineToRelative(-2.586f, -2.586f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.354f, 0.0f)
                lineTo(16.061f, 5.5f)
                lineTo(19.0f, 8.44f)
                close()
            }
        }
        .build()
        return _pencil24!!
    }

private var _pencil24: ImageVector? = null
