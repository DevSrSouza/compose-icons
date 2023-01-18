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

public val RemixIcons.VuejsFill: ImageVector
    get() {
        if (_vuejsFill != null) {
            return _vuejsFill!!
        }
        _vuejsFill = Builder(name = "VuejsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(7.0f, 12.0f)
                lineToRelative(7.0f, -12.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 22.0f)
                lineTo(1.0f, 3.0f)
                close()
                moveTo(9.667f, 3.0f)
                lineTo(12.0f, 7.0f)
                lineToRelative(2.333f, -4.0f)
                horizontalLineToRelative(4.035f)
                lineTo(12.0f, 14.0f)
                lineTo(5.632f, 3.0f)
                horizontalLineToRelative(4.035f)
                close()
            }
        }
        .build()
        return _vuejsFill!!
    }

private var _vuejsFill: ImageVector? = null
