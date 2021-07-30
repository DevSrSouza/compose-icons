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

public val LineAwesomeIcons.SuperscriptSolid: ImageVector
    get() {
        if (_superscriptSolid != null) {
            return _superscriptSolid!!
        }
        _superscriptSolid = Builder(name = "SuperscriptSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.9688f, 3.0f)
                curveTo(23.3438f, 3.0f, 22.0f, 4.3438f, 22.0f, 5.9688f)
                lineTo(22.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 5.9688f)
                curveTo(24.0f, 5.4219f, 24.4219f, 5.0f, 24.9688f, 5.0f)
                lineTo(25.0313f, 5.0f)
                curveTo(25.5781f, 5.0f, 26.0f, 5.4219f, 26.0f, 5.9688f)
                curveTo(26.0f, 6.2852f, 25.8555f, 6.5703f, 25.5938f, 6.75f)
                lineTo(23.4688f, 8.2188f)
                curveTo(22.5547f, 8.8477f, 22.0f, 9.8906f, 22.0f, 11.0f)
                lineTo(22.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 10.0f)
                lineTo(24.5313f, 10.0f)
                curveTo(24.5703f, 9.9688f, 24.5508f, 9.9023f, 24.5938f, 9.875f)
                lineTo(26.7188f, 8.4063f)
                curveTo(27.5234f, 7.8516f, 28.0f, 6.9453f, 28.0f, 5.9688f)
                curveTo(28.0f, 4.3438f, 26.6563f, 3.0f, 25.0313f, 3.0f)
                close()
                moveTo(4.1563f, 8.0f)
                lineTo(5.1563f, 9.5313f)
                lineTo(9.3125f, 16.0f)
                lineTo(5.1563f, 22.4688f)
                lineTo(4.1563f, 24.0f)
                lineTo(10.5313f, 24.0f)
                lineTo(10.8438f, 23.5313f)
                lineTo(12.5f, 20.9688f)
                lineTo(14.1563f, 23.5313f)
                lineTo(14.4688f, 24.0f)
                lineTo(20.8438f, 24.0f)
                lineTo(19.8438f, 22.4688f)
                lineTo(15.6875f, 16.0f)
                lineTo(19.8438f, 9.5313f)
                lineTo(20.8438f, 8.0f)
                lineTo(14.4688f, 8.0f)
                lineTo(14.1563f, 8.4688f)
                lineTo(12.5f, 11.0313f)
                lineTo(10.8438f, 8.4688f)
                lineTo(10.5313f, 8.0f)
                close()
                moveTo(7.8125f, 10.0f)
                lineTo(9.4688f, 10.0f)
                lineTo(11.6563f, 13.4375f)
                lineTo(12.5f, 14.75f)
                lineTo(13.3438f, 13.4375f)
                lineTo(15.5313f, 10.0f)
                lineTo(17.1875f, 10.0f)
                lineTo(13.6563f, 15.4688f)
                lineTo(13.3125f, 16.0f)
                lineTo(13.6563f, 16.5313f)
                lineTo(17.1875f, 22.0f)
                lineTo(15.5313f, 22.0f)
                lineTo(13.3438f, 18.5625f)
                lineTo(12.5f, 17.25f)
                lineTo(11.6563f, 18.5625f)
                lineTo(9.4688f, 22.0f)
                lineTo(7.8125f, 22.0f)
                lineTo(11.3438f, 16.5313f)
                lineTo(11.6875f, 16.0f)
                lineTo(11.3438f, 15.4688f)
                close()
            }
        }
        .build()
        return _superscriptSolid!!
    }

private var _superscriptSolid: ImageVector? = null
