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

public val RemixIcons.LineChartFill: ImageVector
    get() {
        if (_lineChartFill != null) {
            return _lineChartFill!!
        }
        _lineChartFill = Builder(name = "LineChartFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(19.94f, 5.94f)
                lineToRelative(2.12f, 2.12f)
                lineTo(16.0f, 14.122f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-3.94f, 3.94f)
                lineToRelative(-2.12f, -2.122f)
                lineTo(13.0f, 6.88f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.94f, -3.94f)
                close()
            }
        }
        .build()
        return _lineChartFill!!
    }

private var _lineChartFill: ImageVector? = null
