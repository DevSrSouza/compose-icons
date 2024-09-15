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
                moveTo(16.0f, 4.656f)
                lineTo(15.344f, 5.25f)
                lineTo(7.625f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                lineTo(14.0f, 23.0f)
                curveTo(14.0f, 21.883f, 14.883f, 21.0f, 16.0f, 21.0f)
                curveTo(17.117f, 21.0f, 18.0f, 21.883f, 18.0f, 23.0f)
                lineTo(18.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 12.0f)
                lineTo(24.375f, 12.0f)
                lineTo(16.656f, 5.25f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(5.418f, 7.875f, 4.0f, 8.008f, 4.0f, 9.656f)
                curveTo(4.0f, 10.582f, 4.656f, 11.0f, 4.656f, 11.0f)
                lineTo(7.344f, 11.0f)
                curveTo(7.344f, 11.0f, 8.0f, 10.582f, 8.0f, 9.656f)
                curveTo(8.0f, 7.922f, 6.656f, 7.848f, 6.0f, 7.0f)
                close()
                moveTo(26.0f, 7.0f)
                curveTo(25.418f, 7.875f, 24.0f, 8.5f, 24.0f, 9.656f)
                curveTo(24.0f, 10.582f, 24.656f, 11.0f, 24.656f, 11.0f)
                lineTo(27.344f, 11.0f)
                curveTo(27.344f, 11.0f, 28.0f, 10.582f, 28.0f, 9.656f)
                curveTo(28.0f, 8.414f, 26.656f, 7.848f, 26.0f, 7.0f)
                close()
                moveTo(16.0f, 7.313f)
                lineTo(23.344f, 13.75f)
                lineTo(23.625f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 23.0f)
                curveTo(20.0f, 20.801f, 18.199f, 19.0f, 16.0f, 19.0f)
                curveTo(13.801f, 19.0f, 12.0f, 20.801f, 12.0f, 23.0f)
                lineTo(12.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                lineTo(6.0f, 14.0f)
                lineTo(8.375f, 14.0f)
                lineTo(8.656f, 13.75f)
                close()
                moveTo(16.0f, 11.469f)
                lineTo(15.125f, 12.969f)
                lineTo(13.406f, 12.969f)
                lineTo(14.25f, 14.469f)
                lineTo(13.406f, 15.969f)
                lineTo(15.125f, 15.969f)
                lineTo(16.0f, 17.5f)
                lineTo(16.875f, 15.969f)
                lineTo(18.594f, 15.969f)
                lineTo(17.75f, 14.469f)
                lineTo(18.594f, 12.969f)
                lineTo(16.875f, 12.969f)
                close()
            }
        }
        .build()
        return _synagogueSolid!!
    }

private var _synagogueSolid: ImageVector? = null
