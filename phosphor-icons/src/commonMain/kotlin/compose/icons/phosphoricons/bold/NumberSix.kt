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

public val BoldGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 100.0f)
                arcToRelative(69.5f, 69.5f, 0.0f, false, false, -11.2f, 0.9f)
                lineToRelative(37.5f, -62.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.6f, -12.4f)
                lineTo(69.2f, 133.9f)
                lineToRelative(-0.3f, 0.5f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 128.0f, 100.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                arcToRelative(43.4f, 43.4f, 0.0f, false, true, 6.3f, -22.6f)
                verticalLineToRelative(-0.3f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
