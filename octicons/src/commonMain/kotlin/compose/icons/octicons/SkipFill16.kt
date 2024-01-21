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

public val Octicons.SkipFill16: ImageVector
    get() {
        if (_skipFill16 != null) {
            return _skipFill16!!
        }
        _skipFill16 = Builder(name = "SkipFill16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(11.333f, 5.833f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, -1.166f, -1.166f)
                lineToRelative(-5.5f, 5.5f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, 1.166f, 1.166f)
                close()
            }
        }
        .build()
        return _skipFill16!!
    }

private var _skipFill16: ImageVector? = null
