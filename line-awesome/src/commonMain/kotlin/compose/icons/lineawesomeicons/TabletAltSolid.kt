package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.TabletAltSolid: ImageVector
    get() {
        if (_tabletAltSolid != null) {
            return _tabletAltSolid!!
        }
        _tabletAltSolid = Builder(name = "TabletAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.3555f, 6.0f, 2.0f, 7.3555f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.6445f, 3.3555f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.6445f, 26.0f, 30.0f, 24.6445f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.3555f, 28.6445f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.5547f, 8.0f, 28.0f, 8.4453f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.5547f, 27.5547f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.4453f, 24.0f, 4.0f, 23.5547f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.4453f, 4.4453f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(5.4492f, 15.0f, 5.0f, 15.4492f, 5.0f, 16.0f)
                curveTo(5.0f, 16.5508f, 5.4492f, 17.0f, 6.0f, 17.0f)
                curveTo(6.5508f, 17.0f, 7.0f, 16.5508f, 7.0f, 16.0f)
                curveTo(7.0f, 15.4492f, 6.5508f, 15.0f, 6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tabletAltSolid!!
    }

private var _tabletAltSolid: ImageVector? = null
