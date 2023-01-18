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

public val RemixIcons.FilterFill: ImageVector
    get() {
        if (_filterFill != null) {
            return _filterFill!!
        }
        _filterFill = Builder(name = "FilterFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                lineTo(21.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 15.0f)
                lineTo(4.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 4.0f)
                close()
            }
        }
        .build()
        return _filterFill!!
    }

private var _filterFill: ImageVector? = null
