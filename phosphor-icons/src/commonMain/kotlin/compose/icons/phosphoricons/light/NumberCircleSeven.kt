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

public val LightGroup.NumberCircleSeven: ImageVector
    get() {
        if (_numberCircleSeven != null) {
            return _numberCircleSeven!!
        }
        _numberCircleSeven = Builder(name = "NumberCircleSeven", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(156.9f, 80.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.8f, 5.4f)
                lineToRelative(-32.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 120.0f, 186.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, -0.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -3.8f, -7.6f)
                lineTo(143.7f, 90.0f)
                lineTo(104.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 156.9f, 80.5f)
                close()
            }
        }
        .build()
        return _numberCircleSeven!!
    }

private var _numberCircleSeven: ImageVector? = null
