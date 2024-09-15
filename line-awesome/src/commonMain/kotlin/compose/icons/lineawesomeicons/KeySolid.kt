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

public val LineAwesomeIcons.KeySolid: ImageVector
    get() {
        if (_keySolid != null) {
            return _keySolid!!
        }
        _keySolid = Builder(name = "KeySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(15.055f, 3.0f, 11.0f, 7.055f, 11.0f, 12.0f)
                curveTo(11.0f, 12.52f, 11.086f, 12.977f, 11.156f, 13.438f)
                lineTo(3.281f, 21.281f)
                lineTo(3.0f, 21.594f)
                lineTo(3.0f, 29.0f)
                lineTo(10.0f, 29.0f)
                lineTo(10.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(16.0f, 20.031f)
                curveTo(17.18f, 20.609f, 18.555f, 21.0f, 20.0f, 21.0f)
                curveTo(24.945f, 21.0f, 29.0f, 16.945f, 29.0f, 12.0f)
                curveTo(29.0f, 7.055f, 24.945f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 5.0f)
                curveTo(23.855f, 5.0f, 27.0f, 8.145f, 27.0f, 12.0f)
                curveTo(27.0f, 15.855f, 23.855f, 19.0f, 20.0f, 19.0f)
                curveTo(18.789f, 19.0f, 17.543f, 18.645f, 16.594f, 18.125f)
                lineTo(16.344f, 18.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                lineTo(5.0f, 22.438f)
                lineTo(12.906f, 14.5f)
                lineTo(13.281f, 14.156f)
                lineTo(13.188f, 13.625f)
                curveTo(13.086f, 13.023f, 13.0f, 12.488f, 13.0f, 12.0f)
                curveTo(13.0f, 8.145f, 16.145f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveTo(20.895f, 8.0f, 20.0f, 8.895f, 20.0f, 10.0f)
                curveTo(20.0f, 11.105f, 20.895f, 12.0f, 22.0f, 12.0f)
                curveTo(23.105f, 12.0f, 24.0f, 11.105f, 24.0f, 10.0f)
                curveTo(24.0f, 8.895f, 23.105f, 8.0f, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _keySolid!!
    }

private var _keySolid: ImageVector? = null
