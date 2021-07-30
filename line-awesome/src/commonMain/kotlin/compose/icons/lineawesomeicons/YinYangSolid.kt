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

public val LineAwesomeIcons.YinYangSolid: ImageVector
    get() {
        if (_yinYangSolid != null) {
            return _yinYangSolid!!
        }
        _yinYangSolid = Builder(name = "YinYangSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(16.0859f, 28.0f, 16.1641f, 28.0f, 16.25f, 28.0f)
                curveTo(16.3359f, 28.0039f, 16.4141f, 28.0f, 16.5f, 28.0f)
                lineTo(16.5f, 27.9688f)
                curveTo(22.8828f, 27.7031f, 28.0f, 22.4453f, 28.0f, 16.0f)
                curveTo(28.0f, 10.125f, 23.7422f, 5.2422f, 18.1563f, 4.2188f)
                curveTo(17.6289f, 4.0781f, 17.0703f, 4.0f, 16.5f, 4.0f)
                lineTo(16.5f, 4.0313f)
                curveTo(16.332f, 4.0234f, 16.168f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.3477f, 6.0f, 16.6953f, 6.0273f, 17.0313f, 6.0625f)
                curveTo(17.1563f, 6.0781f, 17.2852f, 6.0703f, 17.4063f, 6.0938f)
                curveTo(17.4375f, 6.0977f, 17.4688f, 6.1211f, 17.5f, 6.125f)
                curveTo(19.5078f, 6.5781f, 21.0f, 8.3477f, 21.0f, 10.5f)
                curveTo(21.0f, 12.9961f, 18.9961f, 15.0f, 16.5f, 15.0f)
                curveTo(12.9219f, 15.0f, 10.0f, 17.9219f, 10.0f, 21.5f)
                curveTo(10.0f, 22.5703f, 10.2578f, 23.5781f, 10.7188f, 24.4688f)
                curveTo(7.8867f, 22.707f, 6.0f, 19.5898f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(22.7188f, 8.625f)
                curveTo(24.7266f, 10.4531f, 26.0f, 13.0625f, 26.0f, 16.0f)
                curveTo(26.0f, 21.4297f, 21.6992f, 25.8047f, 16.3125f, 25.9688f)
                curveTo(13.9063f, 25.8672f, 12.0f, 23.9336f, 12.0f, 21.5f)
                curveTo(12.0f, 19.0039f, 14.0039f, 17.0f, 16.5f, 17.0f)
                curveTo(20.0781f, 17.0f, 23.0f, 14.0781f, 23.0f, 10.5f)
                curveTo(23.0f, 9.8516f, 22.8984f, 9.2188f, 22.7188f, 8.625f)
                close()
                moveTo(16.5f, 9.0f)
                curveTo(15.6719f, 9.0f, 15.0f, 9.6719f, 15.0f, 10.5f)
                curveTo(15.0f, 11.3281f, 15.6719f, 12.0f, 16.5f, 12.0f)
                curveTo(17.3281f, 12.0f, 18.0f, 11.3281f, 18.0f, 10.5f)
                curveTo(18.0f, 9.6719f, 17.3281f, 9.0f, 16.5f, 9.0f)
                close()
                moveTo(16.5f, 20.0f)
                curveTo(15.6719f, 20.0f, 15.0f, 20.6719f, 15.0f, 21.5f)
                curveTo(15.0f, 22.3281f, 15.6719f, 23.0f, 16.5f, 23.0f)
                curveTo(17.3281f, 23.0f, 18.0f, 22.3281f, 18.0f, 21.5f)
                curveTo(18.0f, 20.6719f, 17.3281f, 20.0f, 16.5f, 20.0f)
                close()
            }
        }
        .build()
        return _yinYangSolid!!
    }

private var _yinYangSolid: ImageVector? = null
