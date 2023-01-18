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

public val RemixIcons.BarChartHorizontalFill: ImageVector
    get() {
        if (_barChartHorizontalFill != null) {
            return _barChartHorizontalFill!!
        }
        _barChartHorizontalFill = Builder(name = "BarChartHorizontalFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(16.0f, 17.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(19.0f)
                close()
            }
        }
        .build()
        return _barChartHorizontalFill!!
    }

private var _barChartHorizontalFill: ImageVector? = null
