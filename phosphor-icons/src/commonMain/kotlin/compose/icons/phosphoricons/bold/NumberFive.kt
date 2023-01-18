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

public val BoldGroup.NumberFive: ImageVector
    get() {
        if (_numberFive != null) {
            return _numberFive!!
        }
        _numberFive = Builder(name = "NumberFive", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 119.9f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, true, 0.0f, 96.2f)
                arcToRelative(68.4f, 68.4f, 0.0f, false, true, -96.5f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, -62.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.3f, -10.4f)
                lineTo(83.8f, 30.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 95.7f, 20.0f)
                horizontalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(105.9f)
                lineToRelative(-9.8f, 60.2f)
                arcTo(68.5f, 68.5f, 0.0f, false, true, 168.0f, 119.9f)
                close()
            }
        }
        .build()
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
