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

public val LineAwesomeIcons.TabletSolid: ImageVector
    get() {
        if (_tabletSolid != null) {
            return _tabletSolid!!
        }
        _tabletSolid = Builder(name = "TabletSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.555f, 8.0f, 28.0f, 8.445f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.555f, 27.555f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.445f, 24.0f, 4.0f, 23.555f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.445f, 4.445f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(5.449f, 15.0f, 5.0f, 15.449f, 5.0f, 16.0f)
                curveTo(5.0f, 16.551f, 5.449f, 17.0f, 6.0f, 17.0f)
                curveTo(6.551f, 17.0f, 7.0f, 16.551f, 7.0f, 16.0f)
                curveTo(7.0f, 15.449f, 6.551f, 15.0f, 6.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tabletSolid!!
    }

private var _tabletSolid: ImageVector? = null
