package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 78.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 78.0f, 178.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 178.0f, 78.0f)
                close()
                moveTo(110.0f, 126.9f)
                lineTo(129.1f, 146.0f)
                arcToRelative(59.0f, 59.0f, 0.0f, false, true, -28.9f, 9.8f)
                arcTo(59.0f, 59.0f, 0.0f, false, true, 110.0f, 126.9f)
                close()
                moveTo(146.0f, 129.1f)
                lineTo(126.9f, 110.0f)
                arcToRelative(59.0f, 59.0f, 0.0f, false, true, 28.9f, -9.8f)
                arcTo(59.0f, 59.0f, 0.0f, false, true, 146.0f, 129.1f)
                close()
                moveTo(36.0f, 96.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 152.7f, 76.3f)
                arcToRelative(84.4f, 84.4f, 0.0f, false, false, -76.4f, 76.4f)
                arcTo(60.2f, 60.2f, 0.0f, false, true, 36.0f, 96.0f)
                close()
                moveTo(160.0f, 220.0f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, true, -56.7f, -40.3f)
                arcToRelative(84.4f, 84.4f, 0.0f, false, false, 76.4f, -76.4f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 160.0f, 220.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
