package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.3f, 154.9f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 101.0f, 31.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 10.3f, 8.1f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -0.3f, 1.8f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 214.3f, 145.0f)
                lineToRelative(2.2f, -0.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.8f, 5.7f)
                arcTo(7.2f, 7.2f, 0.0f, false, true, 224.3f, 154.9f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
