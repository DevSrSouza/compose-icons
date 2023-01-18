package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NumberSix: ImageVector
    get() {
        if (_numberSix != null) {
            return _numberSix!!
        }
        _numberSix = Builder(name = "NumberSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 108.0f)
                arcToRelative(59.6f, 59.6f, 0.0f, false, false, -29.3f, 7.7f)
                lineToRelative(48.7f, -81.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.8f, -4.2f)
                lineToRelative(-63.9f, 107.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.6f, 1.1f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.1f, -0.1f, 0.2f)
                arcTo(59.0f, 59.0f, 0.0f, false, false, 68.0f, 168.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, -60.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f)
                arcToRelative(51.0f, 51.0f, 0.0f, false, true, 7.5f, -26.8f)
                lineTo(83.5f, 141.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
