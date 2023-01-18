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

public val FillGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.6f, 81.4f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.2f, 93.2f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.2f, -93.2f)
                close()
                moveTo(32.0f, 96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 158.0f, 80.1f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 80.1f, 158.0f)
                arcTo(64.2f, 64.2f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, -62.0f, -48.1f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 175.9f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
