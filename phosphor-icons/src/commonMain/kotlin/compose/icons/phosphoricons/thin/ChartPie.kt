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

public val ThinGroup.ChartPie: ImageVector
    get() {
        if (_chartPie != null) {
            return _chartPie!!
        }
        _chartPie = Builder(name = "ChartPie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.7f, 78.2f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.1f, -0.1f, -0.2f)
                reflectiveCurveToRelative(-0.1f, -0.1f, -0.1f, -0.2f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -173.2f, 100.0f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.2f, 0.2f, 0.3f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 228.0f, 128.0f)
                arcTo(99.1f, 99.1f, 0.0f, false, false, 214.7f, 78.2f)
                close()
                moveTo(205.6f, 78.6f)
                lineTo(132.0f, 121.1f)
                verticalLineToRelative(-85.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 205.6f, 78.6f)
                close()
                moveTo(124.0f, 36.1f)
                verticalLineToRelative(89.6f)
                lineTo(46.4f, 170.5f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 124.0f, 36.1f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -77.6f, -42.6f)
                lineTo(209.6f, 85.5f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
