package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 240.0f)
                lineTo(304.0f, 16.6f)
                curveToRelative(0.0f, -9.0f, 7.0f, -16.6f, 16.0f, -16.6f)
                curveTo(443.7f, 0.0f, 544.0f, 100.3f, 544.0f, 224.0f)
                curveToRelative(0.0f, 9.0f, -7.6f, 16.0f, -16.6f, 16.0f)
                lineTo(304.0f, 240.0f)
                close()
                moveTo(32.0f, 272.0f)
                curveTo(32.0f, 150.7f, 122.1f, 50.3f, 239.0f, 34.3f)
                curveToRelative(9.2f, -1.3f, 17.0f, 6.1f, 17.0f, 15.4f)
                lineTo(256.0f, 288.0f)
                lineTo(412.5f, 444.5f)
                curveToRelative(6.7f, 6.7f, 6.2f, 17.7f, -1.5f, 23.1f)
                curveTo(371.8f, 495.6f, 323.8f, 512.0f, 272.0f, 512.0f)
                curveTo(139.5f, 512.0f, 32.0f, 404.6f, 32.0f, 272.0f)
                close()
                moveTo(558.4f, 288.0f)
                curveToRelative(9.3f, 0.0f, 16.6f, 7.8f, 15.4f, 17.0f)
                curveToRelative(-7.7f, 55.9f, -34.6f, 105.6f, -73.9f, 142.3f)
                curveToRelative(-6.0f, 5.6f, -15.4f, 5.2f, -21.2f, -0.7f)
                lineTo(320.0f, 288.0f)
                lineTo(558.4f, 288.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
