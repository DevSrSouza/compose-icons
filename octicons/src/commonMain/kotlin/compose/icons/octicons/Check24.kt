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

public val Octicons.Check24: ImageVector
    get() {
        if (_check24 != null) {
            return _check24!!
        }
        _check24 = Builder(name = "Check24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.03f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-11.5f, 11.5f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.072f, -0.012f)
                lineToRelative(-5.5f, -5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.084f, -1.036f)
                lineToRelative(4.97f, 5.195f)
                lineTo(19.97f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        .build()
        return _check24!!
    }

private var _check24: ImageVector? = null
