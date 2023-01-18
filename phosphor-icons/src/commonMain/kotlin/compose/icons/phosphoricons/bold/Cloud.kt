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

public val BoldGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 220.0f)
                horizontalLineTo(72.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 72.0f, 84.0f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, true, 7.0f, 0.4f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 160.0f, 220.0f)
                close()
                moveTo(70.2f, 108.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 72.0f, 196.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -68.0f, -68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcTo(94.3f, 94.3f, 0.0f, false, true, 70.2f, 108.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
