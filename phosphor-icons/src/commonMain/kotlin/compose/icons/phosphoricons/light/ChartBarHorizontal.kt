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

public val LightGroup.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) {
            return _chartBarHorizontal!!
        }
        _chartBarHorizontal = Builder(name = "ChartBarHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 98.0f)
                lineTo(174.0f, 98.0f)
                lineTo(174.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(46.0f, 50.0f)
                lineTo(46.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(46.0f, 206.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(142.0f, 158.0f)
                horizontalLineToRelative(74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(222.0f, 104.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 98.0f)
                close()
                moveTo(162.0f, 62.0f)
                lineTo(162.0f, 98.0f)
                lineTo(46.0f, 98.0f)
                lineTo(46.0f, 62.0f)
                close()
                moveTo(130.0f, 194.0f)
                lineTo(46.0f, 194.0f)
                lineTo(46.0f, 158.0f)
                horizontalLineToRelative(84.0f)
                close()
                moveTo(210.0f, 146.0f)
                lineTo(46.0f, 146.0f)
                lineTo(46.0f, 110.0f)
                lineTo(210.0f, 110.0f)
                close()
            }
        }
        .build()
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
