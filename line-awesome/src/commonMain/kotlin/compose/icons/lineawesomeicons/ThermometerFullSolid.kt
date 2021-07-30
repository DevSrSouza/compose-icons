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

public val LineAwesomeIcons.ThermometerFullSolid: ImageVector
    get() {
        if (_thermometerFullSolid != null) {
            return _thermometerFullSolid!!
        }
        _thermometerFullSolid = Builder(name = "ThermometerFullSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(12.0f, 15.4688f)
                curveTo(10.25f, 16.7383f, 9.0f, 18.6758f, 9.0f, 21.0f)
                curveTo(9.0f, 24.8555f, 12.1445f, 28.0f, 16.0f, 28.0f)
                curveTo(19.8555f, 28.0f, 23.0f, 24.8555f, 23.0f, 21.0f)
                curveTo(23.0f, 18.6758f, 21.75f, 16.7383f, 20.0f, 15.4688f)
                lineTo(20.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 16.4063f)
                lineTo(18.5f, 16.6875f)
                curveTo(19.9961f, 17.5547f, 21.0f, 19.1484f, 21.0f, 21.0f)
                curveTo(21.0f, 23.7734f, 18.7734f, 26.0f, 16.0f, 26.0f)
                curveTo(13.2266f, 26.0f, 11.0f, 23.7734f, 11.0f, 21.0f)
                curveTo(11.0f, 19.1484f, 12.0039f, 17.5547f, 13.5f, 16.6875f)
                lineTo(14.0f, 16.4063f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 18.1875f)
                curveTo(13.8398f, 18.6016f, 13.0f, 19.6992f, 13.0f, 21.0f)
                curveTo(13.0f, 22.6563f, 14.3438f, 24.0f, 16.0f, 24.0f)
                curveTo(17.6563f, 24.0f, 19.0f, 22.6563f, 19.0f, 21.0f)
                curveTo(19.0f, 19.6992f, 18.1602f, 18.6016f, 17.0f, 18.1875f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _thermometerFullSolid!!
    }

private var _thermometerFullSolid: ImageVector? = null
