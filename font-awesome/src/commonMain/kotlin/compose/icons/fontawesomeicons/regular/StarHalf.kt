package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 385.3f)
                lineToRelative(-124.3f, 65.4f)
                lineToRelative(23.7f, -138.4f)
                lineToRelative(-100.6f, -98.0f)
                lineToRelative(139.0f, -20.2f)
                lineToRelative(62.2f, -126.0f)
                verticalLineTo(0.0f)
                curveToRelative(-11.4f, 0.0f, -22.8f, 5.9f, -28.7f, 17.8f)
                lineTo(194.0f, 150.2f)
                lineTo(47.9f, 171.4f)
                curveToRelative(-26.2f, 3.8f, -36.7f, 36.1f, -17.7f, 54.6f)
                lineToRelative(105.7f, 103.0f)
                lineToRelative(-25.0f, 145.5f)
                curveToRelative(-4.5f, 26.1f, 23.0f, 46.0f, 46.4f, 33.7f)
                lineTo(288.0f, 439.6f)
                verticalLineToRelative(-54.3f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
