package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -92.2f, 38.2f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-60.0f, -67.7f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 0.0f, 59.6f)
                lineToRelative(8.5f, -9.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.0f, 7.9f)
                lineToRelative(-8.7f, 9.8f)
                lineToRelative(-0.2f, 0.3f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, true, 0.0f, -76.4f)
                lineToRelative(0.2f, 0.3f)
                lineToRelative(60.0f, 67.7f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 0.0f, -59.6f)
                lineToRelative(-8.5f, 9.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.0f, -7.9f)
                lineToRelative(8.7f, -9.8f)
                lineToRelative(0.2f, -0.3f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 246.0f, 128.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
