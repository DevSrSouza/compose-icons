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

public val BoldGroup.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 84.0f, -84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, 60.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, false, 1.2f, 11.9f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, -60.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, false, -1.2f, -11.9f)
                arcTo(83.9f, 83.9f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(144.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 176.0f)
                close()
                moveTo(112.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 80.0f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
