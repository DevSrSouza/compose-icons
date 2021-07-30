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

public val LineAwesomeIcons.PeaceSolid: ImageVector
    get() {
        if (_peaceSolid != null) {
            return _peaceSolid!!
        }
        _peaceSolid = Builder(name = "PeaceSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0508f)
                lineTo(15.0f, 15.5176f)
                lineTo(6.8008f, 22.0156f)
                curveTo(5.6653f, 20.2852f, 5.0f, 18.2196f, 5.0f, 16.0f)
                curveTo(5.0f, 10.2725f, 9.4024f, 5.5584f, 15.0f, 5.0508f)
                close()
                moveTo(17.0f, 5.0508f)
                curveTo(22.5976f, 5.5584f, 27.0f, 10.2725f, 27.0f, 16.0f)
                curveTo(27.0f, 18.2206f, 26.3336f, 20.2867f, 25.1973f, 22.0176f)
                lineTo(17.0f, 15.5176f)
                lineTo(17.0f, 5.0508f)
                close()
                moveTo(15.0f, 18.0703f)
                lineTo(15.0f, 26.9492f)
                curveTo(12.2745f, 26.7021f, 9.839f, 25.4545f, 8.0508f, 23.5801f)
                lineTo(15.0f, 18.0703f)
                close()
                moveTo(17.0f, 18.0703f)
                lineTo(23.9492f, 23.5801f)
                curveTo(22.161f, 25.4545f, 19.7255f, 26.7021f, 17.0f, 26.9492f)
                lineTo(17.0f, 18.0703f)
                close()
            }
        }
        .build()
        return _peaceSolid!!
    }

private var _peaceSolid: ImageVector? = null
