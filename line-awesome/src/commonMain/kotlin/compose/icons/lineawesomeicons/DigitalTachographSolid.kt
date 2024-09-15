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

public val LineAwesomeIcons.DigitalTachographSolid: ImageVector
    get() {
        if (_digitalTachographSolid != null) {
            return _digitalTachographSolid!!
        }
        _digitalTachographSolid = Builder(name = "DigitalTachographSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.018f, 7.0f)
                curveTo(2.903f, 7.0f, 2.0f, 7.903f, 2.0f, 9.018f)
                lineTo(2.0f, 22.982f)
                curveTo(2.0f, 24.097f, 2.903f, 25.0f, 4.018f, 25.0f)
                lineTo(26.982f, 25.0f)
                curveTo(28.097f, 25.0f, 29.0f, 24.097f, 29.0f, 22.982f)
                lineTo(29.0f, 9.018f)
                curveTo(29.0f, 7.903f, 28.097f, 7.0f, 26.982f, 7.0f)
                lineTo(4.018f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(26.982f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                lineTo(16.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(6.0f, 15.0f)
                lineTo(6.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(10.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineTo(16.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                close()
                moveTo(6.0f, 19.0f)
                lineTo(6.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                lineTo(16.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 21.0f)
                lineTo(25.0f, 21.0f)
                lineTo(25.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _digitalTachographSolid!!
    }

private var _digitalTachographSolid: ImageVector? = null
