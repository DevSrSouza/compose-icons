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

public val LineAwesomeIcons.PaperclipSolid: ImageVector
    get() {
        if (_paperclipSolid != null) {
            return _paperclipSolid!!
        }
        _paperclipSolid = Builder(name = "PaperclipSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveTo(19.609f, 4.0f, 18.242f, 4.539f, 17.188f, 5.594f)
                lineTo(7.813f, 14.969f)
                curveTo(4.84f, 17.941f, 4.84f, 22.777f, 7.813f, 25.75f)
                curveTo(10.785f, 28.723f, 15.621f, 28.723f, 18.594f, 25.75f)
                lineTo(24.844f, 19.5f)
                lineTo(23.438f, 18.094f)
                lineTo(17.188f, 24.344f)
                curveTo(14.98f, 26.551f, 11.426f, 26.551f, 9.219f, 24.344f)
                curveTo(7.012f, 22.137f, 7.012f, 18.582f, 9.219f, 16.375f)
                lineTo(18.594f, 7.0f)
                curveTo(19.938f, 5.656f, 22.094f, 5.656f, 23.438f, 7.0f)
                curveTo(24.781f, 8.344f, 24.781f, 10.5f, 23.438f, 11.844f)
                lineTo(14.063f, 21.219f)
                curveTo(13.582f, 21.699f, 12.824f, 21.699f, 12.344f, 21.219f)
                curveTo(11.863f, 20.738f, 11.863f, 19.98f, 12.344f, 19.5f)
                lineTo(20.938f, 10.906f)
                lineTo(19.531f, 9.5f)
                lineTo(10.938f, 18.094f)
                curveTo(9.691f, 19.34f, 9.691f, 21.379f, 10.938f, 22.625f)
                curveTo(12.184f, 23.871f, 14.223f, 23.871f, 15.469f, 22.625f)
                lineTo(24.844f, 13.25f)
                curveTo(26.953f, 11.141f, 26.953f, 7.703f, 24.844f, 5.594f)
                curveTo(23.789f, 4.539f, 22.391f, 4.0f, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _paperclipSolid!!
    }

private var _paperclipSolid: ImageVector? = null
