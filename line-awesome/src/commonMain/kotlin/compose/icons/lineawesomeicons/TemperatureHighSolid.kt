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

public val LineAwesomeIcons.TemperatureHighSolid: ImageVector
    get() {
        if (_temperatureHighSolid != null) {
            return _temperatureHighSolid!!
        }
        _temperatureHighSolid = Builder(name = "TemperatureHighSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 15.4688f)
                curveTo(7.25f, 16.7377f, 6.0f, 18.676f, 6.0f, 21.0f)
                curveTo(6.0f, 24.855f, 9.145f, 28.0f, 13.0f, 28.0f)
                curveTo(16.855f, 28.0f, 20.0f, 24.855f, 20.0f, 21.0f)
                curveTo(20.0f, 18.676f, 18.75f, 16.7377f, 17.0f, 15.4688f)
                lineTo(17.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(24.5f, 4.0f)
                curveTo(22.57f, 4.0f, 21.0f, 5.57f, 21.0f, 7.5f)
                curveTo(21.0f, 9.43f, 22.57f, 11.0f, 24.5f, 11.0f)
                curveTo(26.43f, 11.0f, 28.0f, 9.43f, 28.0f, 7.5f)
                curveTo(28.0f, 5.57f, 26.43f, 4.0f, 24.5f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 16.4063f)
                lineTo(15.5f, 16.6875f)
                curveTo(16.996f, 17.5555f, 18.0f, 19.148f, 18.0f, 21.0f)
                curveTo(18.0f, 23.773f, 15.773f, 26.0f, 13.0f, 26.0f)
                curveTo(10.227f, 26.0f, 8.0f, 23.773f, 8.0f, 21.0f)
                curveTo(8.0f, 19.148f, 9.004f, 17.5555f, 10.5f, 16.6875f)
                lineTo(11.0f, 16.4063f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(24.5f, 6.0f)
                curveTo(25.327f, 6.0f, 26.0f, 6.673f, 26.0f, 7.5f)
                curveTo(26.0f, 8.327f, 25.327f, 9.0f, 24.5f, 9.0f)
                curveTo(23.673f, 9.0f, 23.0f, 8.327f, 23.0f, 7.5f)
                curveTo(23.0f, 6.673f, 23.673f, 6.0f, 24.5f, 6.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 18.1875f)
                curveTo(10.84f, 18.6015f, 10.0f, 19.701f, 10.0f, 21.002f)
                curveTo(10.0f, 22.658f, 11.344f, 24.002f, 13.0f, 24.002f)
                curveTo(14.656f, 24.002f, 16.0f, 22.658f, 16.0f, 21.002f)
                curveTo(16.0f, 19.701f, 15.16f, 18.6025f, 14.0f, 18.1875f)
                lineTo(14.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _temperatureHighSolid!!
    }

private var _temperatureHighSolid: ImageVector? = null
