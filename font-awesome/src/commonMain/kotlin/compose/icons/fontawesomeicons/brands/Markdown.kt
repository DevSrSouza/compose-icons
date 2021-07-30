package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Markdown: ImageVector
    get() {
        if (_markdown != null) {
            return _markdown!!
        }
        _markdown = Builder(name = "Markdown", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(593.8f, 59.1f)
                lineTo(46.2f, 59.1f)
                curveTo(20.7f, 59.1f, 0.0f, 79.8f, 0.0f, 105.2f)
                verticalLineToRelative(301.5f)
                curveToRelative(0.0f, 25.5f, 20.7f, 46.2f, 46.2f, 46.2f)
                horizontalLineToRelative(547.7f)
                curveToRelative(25.5f, 0.0f, 46.2f, -20.7f, 46.1f, -46.1f)
                lineTo(640.0f, 105.2f)
                curveToRelative(0.0f, -25.4f, -20.7f, -46.1f, -46.2f, -46.1f)
                close()
                moveTo(338.5f, 360.6f)
                lineTo(277.0f, 360.6f)
                verticalLineToRelative(-120.0f)
                lineToRelative(-61.5f, 76.9f)
                lineToRelative(-61.5f, -76.9f)
                verticalLineToRelative(120.0f)
                lineTo(92.3f, 360.6f)
                lineTo(92.3f, 151.4f)
                horizontalLineToRelative(61.5f)
                lineToRelative(61.5f, 76.9f)
                lineToRelative(61.5f, -76.9f)
                horizontalLineToRelative(61.5f)
                verticalLineToRelative(209.2f)
                close()
                moveTo(473.8f, 363.7f)
                lineTo(381.5f, 256.0f)
                lineTo(443.0f, 256.0f)
                lineTo(443.0f, 151.4f)
                horizontalLineToRelative(61.5f)
                lineTo(504.5f, 256.0f)
                lineTo(566.0f, 256.0f)
                close()
            }
        }
        .build()
        return _markdown!!
    }

private var _markdown: ImageVector? = null
