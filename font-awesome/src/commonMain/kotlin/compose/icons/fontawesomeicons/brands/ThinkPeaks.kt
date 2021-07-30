package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.ThinkPeaks: ImageVector
    get() {
        if (_thinkPeaks != null) {
            return _thinkPeaks!!
        }
        _thinkPeaks = Builder(name = "ThinkPeaks", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.4f, 409.4f)
                lineToRelative(87.1f, -150.2f)
                lineToRelative(-32.0f, -0.3f)
                lineToRelative(-55.1f, 95.0f)
                lineTo(259.2f, 0.0f)
                lineTo(23.0f, 407.4f)
                lineToRelative(32.0f, 0.3f)
                lineTo(259.2f, 55.6f)
                close()
                moveTo(110.1f, 365.3f)
                horizontalLineToRelative(32.1f)
                lineToRelative(117.4f, -202.5f)
                lineTo(463.0f, 511.9f)
                lineToRelative(32.5f, 0.1f)
                lineToRelative(-235.8f, -404.6f)
                close()
            }
        }
        .build()
        return _thinkPeaks!!
    }

private var _thinkPeaks: ImageVector? = null
