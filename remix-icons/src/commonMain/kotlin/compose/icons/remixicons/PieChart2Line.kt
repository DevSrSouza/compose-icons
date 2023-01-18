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

public val RemixIcons.PieChart2Line: ImageVector
    get() {
        if (_pieChart2Line != null) {
            return _pieChart2Line!!
        }
        _pieChart2Line = Builder(name = "PieChart2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 0.543f)
                curveToRelative(0.33f, -0.029f, 0.663f, -0.043f, 1.0f, -0.043f)
                curveTo(18.351f, 0.5f, 23.5f, 5.649f, 23.5f, 12.0f)
                curveToRelative(0.0f, 0.337f, -0.014f, 0.67f, -0.043f, 1.0f)
                horizontalLineToRelative(-1.506f)
                curveToRelative(-0.502f, 5.053f, -4.766f, 9.0f, -9.951f, 9.0f)
                curveToRelative(-5.523f, 0.0f, -10.0f, -4.477f, -10.0f, -10.0f)
                curveToRelative(0.0f, -5.185f, 3.947f, -9.449f, 9.0f, -9.95f)
                lineTo(11.0f, 0.542f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(11.0f, 4.062f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, false, 7.938f, -7.0f)
                lineTo(11.0f, 13.0f)
                close()
                moveTo(21.448f, 11.0f)
                arcTo(9.503f, 9.503f, 0.0f, false, false, 13.0f, 2.552f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(8.448f)
                close()
            }
        }
        .build()
        return _pieChart2Line!!
    }

private var _pieChart2Line: ImageVector? = null
