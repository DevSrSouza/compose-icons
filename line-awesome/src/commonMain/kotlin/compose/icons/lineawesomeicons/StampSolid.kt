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

public val LineAwesomeIcons.StampSolid: ImageVector
    get() {
        if (_stampSolid != null) {
            return _stampSolid!!
        }
        _stampSolid = Builder(name = "StampSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.9063f)
                curveTo(12.7266f, 2.9063f, 10.0625f, 5.5703f, 10.0625f, 8.8438f)
                curveTo(10.0625f, 10.7891f, 10.9688f, 12.168f, 11.7188f, 13.2188f)
                curveTo(12.4688f, 14.2695f, 13.0f, 14.9922f, 13.0f, 16.0313f)
                lineTo(13.0f, 19.2188f)
                lineTo(4.7813f, 21.0313f)
                lineTo(4.0f, 21.1875f)
                lineTo(4.0f, 26.0f)
                lineTo(5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                curveTo(5.0f, 27.5742f, 5.2539f, 28.1172f, 5.6563f, 28.4688f)
                curveTo(6.0586f, 28.8203f, 6.5742f, 29.0f, 7.0938f, 29.0f)
                lineTo(24.9063f, 29.0f)
                curveTo(25.4258f, 29.0f, 25.9414f, 28.8203f, 26.3438f, 28.4688f)
                curveTo(26.7461f, 28.1172f, 27.0f, 27.5742f, 27.0f, 27.0f)
                lineTo(27.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 21.1875f)
                lineTo(27.2188f, 21.0313f)
                lineTo(19.0f, 19.2188f)
                lineTo(19.0f, 16.0313f)
                curveTo(19.0f, 14.9922f, 19.5313f, 14.2695f, 20.2813f, 13.2188f)
                curveTo(21.0313f, 12.168f, 21.9375f, 10.7891f, 21.9375f, 8.8438f)
                curveTo(21.9375f, 5.5703f, 19.2734f, 2.9063f, 16.0f, 2.9063f)
                close()
                moveTo(16.0f, 4.9063f)
                curveTo(18.1953f, 4.9063f, 19.9375f, 6.6484f, 19.9375f, 8.8438f)
                curveTo(19.9375f, 10.1953f, 19.3828f, 11.043f, 18.6563f, 12.0625f)
                curveTo(17.9297f, 13.082f, 17.0f, 14.2852f, 17.0f, 16.0313f)
                lineTo(17.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 16.0313f)
                curveTo(15.0f, 14.2852f, 14.0703f, 13.082f, 13.3438f, 12.0625f)
                curveTo(12.6172f, 11.043f, 12.0625f, 10.1953f, 12.0625f, 8.8438f)
                curveTo(12.0625f, 6.6484f, 13.8047f, 4.9063f, 16.0f, 4.9063f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(26.0f, 22.7813f)
                lineTo(26.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 22.7813f)
                close()
                moveTo(7.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 26.9688f)
                curveTo(24.9883f, 26.9766f, 24.9727f, 27.0f, 24.9063f, 27.0f)
                lineTo(7.0938f, 27.0f)
                curveTo(7.0273f, 27.0f, 7.0117f, 26.9766f, 7.0f, 26.9688f)
                close()
            }
        }
        .build()
        return _stampSolid!!
    }

private var _stampSolid: ImageVector? = null
