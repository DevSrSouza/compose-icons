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

public val LightGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 106.0f)
                arcToRelative(60.7f, 60.7f, 0.0f, false, false, -24.1f, 4.9f)
                lineToRelative(45.3f, -75.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -10.4f, -6.2f)
                lineToRelative(-64.4f, 108.0f)
                lineToRelative(-0.3f, 0.5f)
                arcTo(62.0f, 62.0f, 0.0f, true, false, 128.0f, 106.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, -42.8f, -75.8f)
                lineTo(85.2f, 142.0f)
                arcTo(50.0f, 50.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
