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

public val RemixIcons.PieChartLine: ImageVector
    get() {
        if (_pieChartLine != null) {
            return _pieChartLine!!
        }
        _pieChartLine = Builder(name = "PieChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveToRelative(0.0f, -4.478f, 2.943f, -8.268f, 7.0f, -9.542f)
                verticalLineToRelative(2.124f)
                arcTo(8.003f, 8.003f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, 7.418f, -5.0f)
                horizontalLineToRelative(2.124f)
                curveToRelative(-1.274f, 4.057f, -5.064f, 7.0f, -9.542f, 7.0f)
                close()
                moveTo(21.95f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 2.05f)
                curveToRelative(0.329f, -0.033f, 0.663f, -0.05f, 1.0f, -0.05f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.337f, -0.017f, 0.671f, -0.05f, 1.0f)
                close()
                moveTo(13.0f, 4.062f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(6.938f)
                arcTo(8.004f, 8.004f, 0.0f, false, false, 13.0f, 4.062f)
                close()
            }
        }
        .build()
        return _pieChartLine!!
    }

private var _pieChartLine: ImageVector? = null
