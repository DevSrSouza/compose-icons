package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Link24: ImageVector
    get() {
        if (_link24 != null) {
            return _link24!!
        }
        _link24 = Builder(name = "Link24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.78f, 3.653f)
                arcToRelative(3.936f, 3.936f, 0.0f, true, true, 5.567f, 5.567f)
                lineToRelative(-3.627f, 3.627f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, true, -5.88f, -0.353f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.18f, 0.928f)
                arcToRelative(5.436f, 5.436f, 0.0f, false, false, 8.12f, 0.486f)
                lineToRelative(3.628f, -3.628f)
                arcToRelative(5.436f, 5.436f, 0.0f, true, false, -7.688f, -7.688f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.061f)
                lineToRelative(3.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.28f, 11.153f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, true, 5.88f, 0.353f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.18f, -0.928f)
                arcToRelative(5.436f, 5.436f, 0.0f, false, false, -8.12f, -0.486f)
                lineTo(2.592f, 13.72f)
                arcToRelative(5.436f, 5.436f, 0.0f, true, false, 7.688f, 7.688f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(3.936f, 3.936f, 0.0f, false, true, -5.567f, -5.568f)
                lineToRelative(3.627f, -3.627f)
                close()
            }
        }
        .build()
        return _link24!!
    }

private var _link24: ImageVector? = null
