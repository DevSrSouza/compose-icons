package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ThumbsDownSolid: ImageVector
    get() {
        if (_thumbsDownSolid != null) {
            return _thumbsDownSolid!!
        }
        _thumbsDownSolid = Builder(name = "ThumbsDownSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1563f, 6.0f)
                curveTo(8.7461f, 6.0f, 7.5156f, 6.9961f, 7.2188f, 8.375f)
                lineTo(5.0625f, 18.375f)
                curveTo(4.668f, 20.2227f, 6.1133f, 22.0f, 8.0f, 22.0f)
                lineTo(13.75f, 22.0f)
                lineTo(13.5625f, 22.75f)
                curveTo(13.3594f, 22.9063f, 13.2305f, 22.9727f, 12.9375f, 23.375f)
                curveTo(12.4688f, 24.0156f, 12.0f, 25.0078f, 12.0f, 26.3438f)
                curveTo(12.0f, 27.7695f, 13.2891f, 29.0f, 14.9063f, 29.0f)
                lineTo(15.3125f, 29.0f)
                lineTo(15.625f, 28.7188f)
                lineTo(22.4063f, 22.0f)
                lineTo(27.0f, 22.0f)
                lineTo(27.0f, 6.0f)
                close()
                moveTo(10.1563f, 8.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.0f, 20.5938f)
                lineTo(14.5938f, 26.9063f)
                curveTo(14.1719f, 26.8242f, 14.0f, 26.6523f, 14.0f, 26.3438f)
                curveTo(14.0f, 25.4414f, 14.2734f, 24.8828f, 14.5313f, 24.5313f)
                curveTo(14.7891f, 24.1797f, 14.9688f, 24.0938f, 14.9688f, 24.0938f)
                lineTo(15.3125f, 23.9063f)
                lineTo(15.4375f, 23.5f)
                lineTo(16.0313f, 21.25f)
                lineTo(16.3438f, 20.0f)
                lineTo(8.0f, 20.0f)
                curveTo(7.3398f, 20.0f, 6.8945f, 19.4258f, 7.0313f, 18.7813f)
                lineTo(9.1563f, 8.7813f)
                curveTo(9.2578f, 8.3125f, 9.6797f, 8.0f, 10.1563f, 8.0f)
                close()
                moveTo(23.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _thumbsDownSolid!!
    }

private var _thumbsDownSolid: ImageVector? = null
