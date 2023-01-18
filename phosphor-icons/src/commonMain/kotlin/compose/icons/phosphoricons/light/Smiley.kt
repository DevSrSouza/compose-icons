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

public val LightGroup.Smiley: ImageVector
    get() {
        if (_smiley != null) {
            return _smiley!!
        }
        _smiley = Builder(name = "Smiley", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(154.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 154.0f, 108.0f)
                close()
                moveTo(174.8f, 155.0f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, true, -93.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.2f, -8.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.2f, 2.2f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 72.8f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.2f, -2.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.8f, 155.0f)
                close()
            }
        }
        .build()
        return _smiley!!
    }

private var _smiley: ImageVector? = null
