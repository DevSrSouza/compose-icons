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

public val LineAwesomeIcons.TrainSolid: ImageVector
    get() {
        if (_trainSolid != null) {
            return _trainSolid!!
        }
        _trainSolid = Builder(name = "TrainSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(12.7422f, 3.0f, 11.8477f, 3.8906f, 11.4063f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveTo(7.25f, 5.0f, 5.0f, 7.25f, 5.0f, 10.0f)
                lineTo(5.0f, 21.0f)
                curveTo(5.0f, 23.4258f, 6.4492f, 25.5234f, 8.5313f, 26.4688f)
                lineTo(6.0f, 29.0f)
                lineTo(8.3438f, 29.0f)
                lineTo(10.375f, 26.9688f)
                curveTo(10.5742f, 26.9883f, 10.793f, 27.0f, 11.0f, 27.0f)
                lineTo(21.0f, 27.0f)
                curveTo(21.207f, 27.0f, 21.4258f, 26.9883f, 21.625f, 26.9688f)
                lineTo(23.6563f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(23.4688f, 26.4688f)
                curveTo(25.5508f, 25.5234f, 27.0f, 23.4258f, 27.0f, 21.0f)
                lineTo(27.0f, 10.0f)
                curveTo(27.0f, 7.25f, 24.75f, 5.0f, 22.0f, 5.0f)
                lineTo(20.5938f, 5.0f)
                curveTo(20.1523f, 3.8906f, 19.2578f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                curveTo(18.5664f, 5.0f, 19.0f, 5.4336f, 19.0f, 6.0f)
                lineTo(19.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                curveTo(23.3203f, 7.0f, 24.4375f, 7.8281f, 24.8438f, 9.0f)
                lineTo(7.1563f, 9.0f)
                curveTo(7.5625f, 7.8281f, 8.6797f, 7.0f, 10.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 6.0f)
                curveTo(13.0f, 5.4336f, 13.4336f, 5.0f, 14.0f, 5.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(25.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(25.0f, 18.0f)
                lineTo(25.0f, 21.0f)
                curveTo(25.0f, 23.2188f, 23.2188f, 25.0f, 21.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                curveTo(8.7813f, 25.0f, 7.0f, 23.2188f, 7.0f, 21.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(14.8945f, 19.0f, 14.0f, 19.8945f, 14.0f, 21.0f)
                curveTo(14.0f, 22.1055f, 14.8945f, 23.0f, 16.0f, 23.0f)
                curveTo(17.1055f, 23.0f, 18.0f, 22.1055f, 18.0f, 21.0f)
                curveTo(18.0f, 19.8945f, 17.1055f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _trainSolid!!
    }

private var _trainSolid: ImageVector? = null
