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

public val FillGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 72.0f, 72.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, false, 25.6f, -12.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.2f, -1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.6f, 11.2f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -57.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.6f, 11.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.2f, -1.6f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
