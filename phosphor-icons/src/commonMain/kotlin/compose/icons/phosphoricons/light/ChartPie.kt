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

public val LightGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 77.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.4f)
                lineToRelative(-0.3f, -0.5f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 39.5f, 178.6f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(0.2f, 0.3f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 230.0f, 128.0f)
                arcTo(100.9f, 100.9f, 0.0f, false, false, 216.5f, 77.4f)
                close()
                moveTo(202.7f, 77.9f)
                lineTo(134.0f, 117.6f)
                lineTo(134.0f, 38.2f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 202.7f, 77.9f)
                close()
                moveTo(122.0f, 38.2f)
                verticalLineToRelative(86.3f)
                lineTo(47.2f, 167.7f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, -74.7f, -39.9f)
                lineTo(208.8f, 88.3f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
