package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 104.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, false, -19.5f, 3.0f)
                lineToRelative(42.4f, -70.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.8f, -8.2f)
                lineToRelative(-64.5f, 108.0f)
                lineToRelative(-0.2f, 0.5f)
                arcTo(63.0f, 63.0f, 0.0f, false, false, 64.0f, 168.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, -64.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(48.1f, 48.1f, 0.0f, false, true, -41.2f, -72.7f)
                lineToRelative(0.2f, -0.3f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 41.0f, 73.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
