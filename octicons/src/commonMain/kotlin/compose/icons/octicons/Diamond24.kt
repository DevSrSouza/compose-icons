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

public val Octicons.Diamond24: ImageVector
    get() {
        if (_diamond24 != null) {
            return _diamond24!!
        }
        _diamond24 = Builder(name = "Diamond24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.527f, 13.237f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -2.474f)
                lineToRelative(9.272f, -9.273f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.475f, 0.0f)
                lineToRelative(9.272f, 9.273f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 2.474f)
                lineToRelative(-9.272f, 9.272f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.475f, 0.0f)
                close()
                moveTo(2.587f, 11.823f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.354f)
                lineToRelative(9.273f, 9.272f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.353f, 0.0f)
                lineToRelative(9.272f, -9.272f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.354f)
                lineToRelative(-9.272f, -9.272f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.353f, 0.0f)
                close()
            }
        }
        .build()
        return _diamond24!!
    }

private var _diamond24: ImageVector? = null
