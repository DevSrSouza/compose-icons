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

public val BoldGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 74.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.4f)
                lineToRelative(-0.3f, -0.5f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 34.3f, 181.6f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(0.2f, 0.4f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 236.0f, 128.0f)
                arcTo(107.1f, 107.1f, 0.0f, false, false, 221.7f, 74.4f)
                close()
                moveTo(194.0f, 76.1f)
                lineToRelative(-54.0f, 31.1f)
                verticalLineTo(44.9f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 194.0f, 76.1f)
                close()
                moveTo(116.0f, 44.9f)
                verticalLineToRelative(76.2f)
                lineTo(50.0f, 159.2f)
                arcTo(85.3f, 85.3f, 0.0f, false, true, 44.0f, 128.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 116.0f, 44.9f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, -65.9f, -32.1f)
                lineTo(206.0f, 96.8f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
