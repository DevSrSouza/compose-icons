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

public val LineAwesomeIcons.SynagogueSolid: ImageVector
    get() {
        if (_synagogueSolid != null) {
            return _synagogueSolid!!
        }
        _synagogueSolid = Builder(name = "SynagogueSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.6563f)
                lineTo(15.3438f, 5.25f)
                lineTo(7.625f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                lineTo(14.0f, 23.0f)
                curveTo(14.0f, 21.8828f, 14.8828f, 21.0f, 16.0f, 21.0f)
                curveTo(17.1172f, 21.0f, 18.0f, 21.8828f, 18.0f, 23.0f)
                lineTo(18.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 12.0f)
                lineTo(24.375f, 12.0f)
                lineTo(16.6563f, 5.25f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(5.418f, 7.875f, 4.0f, 8.0078f, 4.0f, 9.6563f)
                curveTo(4.0f, 10.582f, 4.6563f, 11.0f, 4.6563f, 11.0f)
                lineTo(7.3438f, 11.0f)
                curveTo(7.3438f, 11.0f, 8.0f, 10.582f, 8.0f, 9.6563f)
                curveTo(8.0f, 7.9219f, 6.6563f, 7.8477f, 6.0f, 7.0f)
                close()
                moveTo(26.0f, 7.0f)
                curveTo(25.418f, 7.875f, 24.0f, 8.5f, 24.0f, 9.6563f)
                curveTo(24.0f, 10.582f, 24.6563f, 11.0f, 24.6563f, 11.0f)
                lineTo(27.3438f, 11.0f)
                curveTo(27.3438f, 11.0f, 28.0f, 10.582f, 28.0f, 9.6563f)
                curveTo(28.0f, 8.4141f, 26.6563f, 7.8477f, 26.0f, 7.0f)
                close()
                moveTo(16.0f, 7.3125f)
                lineTo(23.3438f, 13.75f)
                lineTo(23.625f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 23.0f)
                curveTo(20.0f, 20.8008f, 18.1992f, 19.0f, 16.0f, 19.0f)
                curveTo(13.8008f, 19.0f, 12.0f, 20.8008f, 12.0f, 23.0f)
                lineTo(12.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                lineTo(6.0f, 14.0f)
                lineTo(8.375f, 14.0f)
                lineTo(8.6563f, 13.75f)
                close()
                moveTo(16.0f, 11.4688f)
                lineTo(15.125f, 12.9688f)
                lineTo(13.4063f, 12.9688f)
                lineTo(14.25f, 14.4688f)
                lineTo(13.4063f, 15.9688f)
                lineTo(15.125f, 15.9688f)
                lineTo(16.0f, 17.5f)
                lineTo(16.875f, 15.9688f)
                lineTo(18.5938f, 15.9688f)
                lineTo(17.75f, 14.4688f)
                lineTo(18.5938f, 12.9688f)
                lineTo(16.875f, 12.9688f)
                close()
            }
        }
        .build()
        return _synagogueSolid!!
    }

private var _synagogueSolid: ImageVector? = null
