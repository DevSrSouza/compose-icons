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

public val RemixIcons.PieChartBoxFill: ImageVector
    get() {
        if (_pieChartBoxFill != null) {
            return _pieChartBoxFill!!
        }
        _pieChartBoxFill = Builder(name = "PieChartBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(16.9f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 7.1f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 1.0f, 9.9f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 4.9f, -4.0f)
                close()
                moveTo(16.9f, 11.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 13.0f, 7.1f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(3.9f)
                close()
            }
        }
        .build()
        return _pieChartBoxFill!!
    }

private var _pieChartBoxFill: ImageVector? = null
