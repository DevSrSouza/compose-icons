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
                curveTo(14.355f, 5.0f, 13.0f, 6.355f, 13.0f, 8.0f)
                curveTo(13.0f, 8.352f, 13.074f, 8.684f, 13.188f, 9.0f)
                lineTo(8.188f, 9.0f)
                lineTo(8.031f, 9.813f)
                lineTo(5.031f, 24.813f)
                lineTo(5.0f, 24.906f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 24.906f)
                lineTo(26.969f, 24.813f)
                lineTo(23.969f, 9.813f)
                lineTo(23.813f, 9.0f)
                lineTo(18.813f, 9.0f)
                curveTo(18.926f, 8.684f, 19.0f, 8.352f, 19.0f, 8.0f)
                curveTo(19.0f, 6.355f, 17.645f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.563f, 7.0f, 17.0f, 7.438f, 17.0f, 8.0f)
                curveTo(17.0f, 8.563f, 16.563f, 9.0f, 16.0f, 9.0f)
                curveTo(15.438f, 9.0f, 15.0f, 8.563f, 15.0f, 8.0f)
                curveTo(15.0f, 7.438f, 15.438f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.813f, 11.0f)
                lineTo(22.188f, 11.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _weightHangingSolid!!
    }

private var _weightHangingSolid: ImageVector? = null
