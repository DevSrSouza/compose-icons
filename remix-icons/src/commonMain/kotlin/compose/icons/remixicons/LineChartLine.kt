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

public val RemixIcons.LineChartLine: ImageVector
    get() {
        if (_lineChartLine != null) {
            return _lineChartLine!!
        }
        _lineChartLine = Builder(name = "LineChartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.293f, 6.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(16.0f, 13.414f)
                lineToRelative(-3.0f, -2.999f)
                lineToRelative(-4.293f, 4.292f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(13.0f, 7.586f)
                lineToRelative(3.0f, 2.999f)
                lineToRelative(4.293f, -4.292f)
                close()
            }
        }
        .build()
        return _lineChartLine!!
    }

private var _lineChartLine: ImageVector? = null
