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
        _chartPie = Builder(name = "ChartPie", defaultWidth = 544.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 544.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(527.79f, 288.0f)
                lineTo(290.5f, 288.0f)
                lineToRelative(158.03f, 158.03f)
                curveToRelative(6.04f, 6.04f, 15.98f, 6.53f, 22.19f, 0.68f)
                curveToRelative(38.7f, -36.46f, 65.32f, -85.61f, 73.13f, -140.86f)
                curveToRelative(1.34f, -9.46f, -6.51f, -17.85f, -16.06f, -17.85f)
                close()
                moveTo(511.96f, 223.2f)
                curveTo(503.72f, 103.74f, 408.26f, 8.28f, 288.8f, 0.04f)
                curveTo(279.68f, -0.59f, 272.0f, 7.1f, 272.0f, 16.24f)
                lineTo(272.0f, 240.0f)
                horizontalLineToRelative(223.77f)
                curveToRelative(9.14f, 0.0f, 16.82f, -7.68f, 16.19f, -16.8f)
                close()
                moveTo(224.0f, 288.0f)
                lineTo(224.0f, 50.71f)
                curveToRelative(0.0f, -9.55f, -8.39f, -17.4f, -17.84f, -16.06f)
                curveTo(86.99f, 51.49f, -4.1f, 155.6f, 0.14f, 280.37f)
                curveTo(4.5f, 408.51f, 114.83f, 513.59f, 243.03f, 511.98f)
                curveToRelative(50.4f, -0.63f, 96.97f, -16.87f, 135.26f, -44.03f)
                curveToRelative(7.9f, -5.6f, 8.42f, -17.23f, 1.57f, -24.08f)
                lineTo(224.0f, 288.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
