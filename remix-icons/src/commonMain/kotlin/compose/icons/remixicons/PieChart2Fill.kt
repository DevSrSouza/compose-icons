package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PieChart2Fill: ImageVector
    get() {
        if (_pieChart2Fill != null) {
            return _pieChart2Fill!!
        }
        _pieChart2Fill = Builder(name = "PieChart2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.05f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(10.95f)
                curveToRelative(-0.501f, 5.053f, -4.765f, 9.0f, -9.95f, 9.0f)
                curveToRelative(-5.523f, 0.0f, -10.0f, -4.477f, -10.0f, -10.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                close()
                moveTo(13.0f, 0.543f)
                curveTo(18.553f, 1.02f, 22.979f, 5.447f, 23.457f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 0.543f)
                close()
            }
        }
        .build()
        return _pieChart2Fill!!
    }

private var _pieChart2Fill: ImageVector? = null
