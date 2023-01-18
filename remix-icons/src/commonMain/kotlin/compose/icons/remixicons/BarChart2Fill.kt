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

public val RemixIcons.BarChart2Fill: ImageVector
    get() {
        if (_barChart2Fill != null) {
            return _barChart2Fill!!
        }
        _barChart2Fill = Builder(name = "BarChart2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(18.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _barChart2Fill!!
    }

private var _barChart2Fill: ImageVector? = null
