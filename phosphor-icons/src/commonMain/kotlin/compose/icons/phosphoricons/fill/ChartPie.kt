package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.3f, 76.4f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.2f, -0.4f)
                lineToRelative(-0.4f, -0.5f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -180.0f, 104.1f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(0.3f, 0.4f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 180.1f, -104.0f)
                close()
                moveTo(199.9f, 77.3f)
                lineTo(136.0f, 114.1f)
                lineTo(136.0f, 40.4f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 199.9f, 77.3f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -71.9f, -37.3f)
                lineTo(207.9f, 91.1f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
