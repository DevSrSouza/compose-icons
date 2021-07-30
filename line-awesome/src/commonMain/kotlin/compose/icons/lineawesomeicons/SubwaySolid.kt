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

public val LineAwesomeIcons.SubwaySolid: ImageVector
    get() {
        if (_subwaySolid != null) {
            return _subwaySolid!!
        }
        _subwaySolid = Builder(name = "SubwaySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveTo(7.25f, 4.0f, 5.0f, 6.25f, 5.0f, 9.0f)
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
                lineTo(27.0f, 9.0f)
                curveTo(27.0f, 6.25f, 24.75f, 4.0f, 22.0f, 4.0f)
                close()
                moveTo(10.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                curveTo(23.3203f, 6.0f, 24.4375f, 6.8281f, 24.8438f, 8.0f)
                lineTo(7.1563f, 8.0f)
                curveTo(7.5625f, 6.8281f, 8.6797f, 6.0f, 10.0f, 6.0f)
                close()
                moveTo(7.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(25.0f, 18.0f)
                lineTo(25.0f, 21.0f)
                curveTo(25.0f, 23.2188f, 23.2188f, 25.0f, 21.0f, 25.0f)
                lineTo(11.0f, 25.0f)
                curveTo(8.7813f, 25.0f, 7.0f, 23.2188f, 7.0f, 21.0f)
                close()
                moveTo(10.5f, 20.0f)
                curveTo(9.6719f, 20.0f, 9.0f, 20.6719f, 9.0f, 21.5f)
                curveTo(9.0f, 22.3281f, 9.6719f, 23.0f, 10.5f, 23.0f)
                curveTo(11.3281f, 23.0f, 12.0f, 22.3281f, 12.0f, 21.5f)
                curveTo(12.0f, 20.6719f, 11.3281f, 20.0f, 10.5f, 20.0f)
                close()
                moveTo(21.5f, 20.0f)
                curveTo(20.6719f, 20.0f, 20.0f, 20.6719f, 20.0f, 21.5f)
                curveTo(20.0f, 22.3281f, 20.6719f, 23.0f, 21.5f, 23.0f)
                curveTo(22.3281f, 23.0f, 23.0f, 22.3281f, 23.0f, 21.5f)
                curveTo(23.0f, 20.6719f, 22.3281f, 20.0f, 21.5f, 20.0f)
                close()
            }
        }
        .build()
        return _subwaySolid!!
    }

private var _subwaySolid: ImageVector? = null
