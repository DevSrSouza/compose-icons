package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EBike2Fill: ImageVector
    get() {
        if (_eBike2Fill != null) {
            return _eBike2Fill!!
        }
        _eBike2Fill = Builder(name = "EBike2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.0f)
                curveTo(16.5523f, 1.0f, 17.0f, 1.4477f, 17.0f, 2.0f)
                lineTo(17.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                lineTo(22.0f, 9.0f)
                lineTo(19.981f, 9.0f)
                lineTo(22.7271f, 16.5448f)
                curveTo(22.9033f, 16.9958f, 23.0f, 17.4866f, 23.0f, 18.0f)
                curveTo(23.0f, 20.2091f, 21.2091f, 22.0f, 19.0f, 22.0f)
                curveTo(17.1362f, 22.0f, 15.5701f, 20.7252f, 15.126f, 19.0f)
                lineTo(10.874f, 19.0f)
                curveTo(10.4299f, 20.7252f, 8.8638f, 22.0f, 7.0f, 22.0f)
                curveTo(5.0555f, 22.0f, 3.4351f, 20.6125f, 3.0747f, 18.7736f)
                curveTo(2.436f, 18.4396f, 2.0f, 17.7707f, 2.0f, 17.0f)
                lineTo(2.0f, 7.0f)
                curveTo(2.0f, 6.4477f, 2.4477f, 6.0f, 3.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                curveTo(10.5523f, 6.0f, 11.0f, 6.4477f, 11.0f, 7.0f)
                lineTo(11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                curveTo(14.5523f, 13.0f, 15.0f, 12.5523f, 15.0f, 12.0f)
                lineTo(15.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                lineTo(12.0f, 1.0f)
                lineTo(16.0f, 1.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveTo(17.8954f, 16.0f, 17.0f, 16.8954f, 17.0f, 18.0f)
                curveTo(17.0f, 19.1046f, 17.8954f, 20.0f, 19.0f, 20.0f)
                curveTo(20.1046f, 20.0f, 21.0f, 19.1046f, 21.0f, 18.0f)
                curveTo(21.0f, 17.7597f, 20.9576f, 17.5292f, 20.8799f, 17.3158f)
                lineTo(20.8635f, 17.2724f)
                curveTo(20.5725f, 16.5276f, 19.8479f, 16.0f, 19.0f, 16.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(5.8954f, 16.0f, 5.0f, 16.8954f, 5.0f, 18.0f)
                curveTo(5.0f, 19.1046f, 5.8954f, 20.0f, 7.0f, 20.0f)
                curveTo(8.1046f, 20.0f, 9.0f, 19.1046f, 9.0f, 18.0f)
                curveTo(9.0f, 16.8954f, 8.1046f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(9.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 8.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 5.0f)
                close()
            }
        }
        .build()
        return _eBike2Fill!!
    }

private var _eBike2Fill: ImageVector? = null
