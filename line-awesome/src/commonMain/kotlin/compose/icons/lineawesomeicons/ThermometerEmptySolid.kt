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

public val LineAwesomeIcons.ThermometerEmptySolid: ImageVector
    get() {
        if (_thermometerEmptySolid != null) {
            return _thermometerEmptySolid!!
        }
        _thermometerEmptySolid = Builder(name = "ThermometerEmptySolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                lineTo(13.0f, 16.0f)
                curveTo(11.2617f, 17.0508f, 10.0f, 18.8281f, 10.0f, 21.0f)
                curveTo(10.0f, 24.3008f, 12.6992f, 27.0f, 16.0f, 27.0f)
                curveTo(19.3008f, 27.0f, 22.0f, 24.3008f, 22.0f, 21.0f)
                curveTo(22.0f, 18.8281f, 20.7383f, 17.0508f, 19.0f, 16.0f)
                lineTo(19.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 5.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 17.0625f)
                lineTo(17.5938f, 17.3438f)
                curveTo(19.0039f, 17.9609f, 20.0f, 19.3516f, 20.0f, 21.0f)
                curveTo(20.0f, 23.2188f, 18.2188f, 25.0f, 16.0f, 25.0f)
                curveTo(13.7813f, 25.0f, 12.0f, 23.2188f, 12.0f, 21.0f)
                curveTo(12.0f, 19.3516f, 12.9961f, 17.9609f, 14.4063f, 17.3438f)
                lineTo(15.0f, 17.0625f)
                close()
            }
        }
        .build()
        return _thermometerEmptySolid!!
    }

private var _thermometerEmptySolid: ImageVector? = null
