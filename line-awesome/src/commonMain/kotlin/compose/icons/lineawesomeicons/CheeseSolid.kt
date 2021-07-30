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

public val LineAwesomeIcons.CheeseSolid: ImageVector
    get() {
        if (_cheeseSolid != null) {
            return _cheeseSolid!!
        }
        _cheeseSolid = Builder(name = "CheeseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0938f, 5.9688f)
                lineTo(10.7813f, 6.0313f)
                curveTo(4.3125f, 7.4688f, 3.0313f, 13.8125f, 3.0313f, 13.8125f)
                lineTo(3.0f, 13.9063f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                curveTo(27.4336f, 20.0f, 27.0f, 19.5664f, 27.0f, 19.0f)
                curveTo(27.0f, 18.4336f, 27.4336f, 18.0f, 28.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 13.3438f)
                lineTo(28.375f, 13.0625f)
                lineTo(11.375f, 6.0625f)
                close()
                moveTo(10.9688f, 8.0938f)
                lineTo(13.75f, 9.25f)
                curveTo(13.3086f, 9.4336f, 13.0f, 9.6914f, 13.0f, 10.0f)
                curveTo(13.0f, 10.5508f, 13.8945f, 11.0f, 15.0f, 11.0f)
                curveTo(15.7578f, 11.0f, 16.4102f, 10.7813f, 16.75f, 10.4688f)
                lineTo(22.9063f, 13.0f)
                lineTo(5.375f, 13.0f)
                curveTo(5.9766f, 11.5195f, 7.4688f, 9.0f, 10.9688f, 8.0938f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(8.0938f, 15.0f)
                curveTo(8.0391f, 15.1563f, 8.0f, 15.3281f, 8.0f, 15.5f)
                curveTo(8.0f, 16.3281f, 8.6719f, 17.0f, 9.5f, 17.0f)
                curveTo(10.3281f, 17.0f, 11.0f, 16.3281f, 11.0f, 15.5f)
                curveTo(11.0f, 15.3281f, 10.9609f, 15.1563f, 10.9063f, 15.0f)
                lineTo(27.0f, 15.0f)
                lineTo(27.0f, 16.4063f)
                curveTo(25.8906f, 16.8477f, 25.0f, 17.7422f, 25.0f, 19.0f)
                curveTo(25.0f, 20.2578f, 25.8906f, 21.1523f, 27.0f, 21.5938f)
                lineTo(27.0f, 24.0f)
                lineTo(14.7188f, 24.0f)
                curveTo(14.8906f, 23.707f, 15.0f, 23.3633f, 15.0f, 23.0f)
                curveTo(15.0f, 21.8945f, 14.1055f, 21.0f, 13.0f, 21.0f)
                curveTo(11.8945f, 21.0f, 11.0f, 21.8945f, 11.0f, 23.0f)
                curveTo(11.0f, 23.3633f, 11.1094f, 23.707f, 11.2813f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(19.5f, 17.0f)
                curveTo(18.6719f, 17.0f, 18.0f, 17.6719f, 18.0f, 18.5f)
                curveTo(18.0f, 19.3281f, 18.6719f, 20.0f, 19.5f, 20.0f)
                curveTo(20.3281f, 20.0f, 21.0f, 19.3281f, 21.0f, 18.5f)
                curveTo(21.0f, 17.6719f, 20.3281f, 17.0f, 19.5f, 17.0f)
                close()
            }
        }
        .build()
        return _cheeseSolid!!
    }

private var _cheeseSolid: ImageVector? = null
