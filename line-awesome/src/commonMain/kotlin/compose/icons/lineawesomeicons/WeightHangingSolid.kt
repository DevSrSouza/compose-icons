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

public val LineAwesomeIcons.WeightHangingSolid: ImageVector
    get() {
        if (_weightHangingSolid != null) {
            return _weightHangingSolid!!
        }
        _weightHangingSolid = Builder(name = "WeightHangingSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(14.3555f, 5.0f, 13.0f, 6.3555f, 13.0f, 8.0f)
                curveTo(13.0f, 8.3516f, 13.0742f, 8.6836f, 13.1875f, 9.0f)
                lineTo(8.1875f, 9.0f)
                lineTo(8.0313f, 9.8125f)
                lineTo(5.0313f, 24.8125f)
                lineTo(5.0f, 24.9063f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 24.9063f)
                lineTo(26.9688f, 24.8125f)
                lineTo(23.9688f, 9.8125f)
                lineTo(23.8125f, 9.0f)
                lineTo(18.8125f, 9.0f)
                curveTo(18.9258f, 8.6836f, 19.0f, 8.3516f, 19.0f, 8.0f)
                curveTo(19.0f, 6.3555f, 17.6445f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.5625f, 7.0f, 17.0f, 7.4375f, 17.0f, 8.0f)
                curveTo(17.0f, 8.5625f, 16.5625f, 9.0f, 16.0f, 9.0f)
                curveTo(15.4375f, 9.0f, 15.0f, 8.5625f, 15.0f, 8.0f)
                curveTo(15.0f, 7.4375f, 15.4375f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.8125f, 11.0f)
                lineTo(22.1875f, 11.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _weightHangingSolid!!
    }

private var _weightHangingSolid: ImageVector? = null
