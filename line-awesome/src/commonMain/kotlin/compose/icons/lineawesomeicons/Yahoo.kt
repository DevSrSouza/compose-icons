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

public val LineAwesomeIcons.Yahoo: ImageVector
    get() {
        if (_yahoo != null) {
            return _yahoo!!
        }
        _yahoo = Builder(name = "Yahoo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.34f, 6.027f)
                curveTo(7.34f, 6.027f, 8.125f, 6.199f, 8.781f, 6.199f)
                curveTo(9.438f, 6.199f, 10.207f, 6.016f, 10.207f, 6.016f)
                lineTo(16.0f, 15.66f)
                lineTo(21.82f, 6.0f)
                curveTo(21.82f, 6.0f, 22.449f, 6.215f, 23.234f, 6.215f)
                curveTo(24.016f, 6.215f, 24.66f, 6.016f, 24.66f, 6.016f)
                lineTo(17.215f, 18.598f)
                lineTo(17.414f, 27.973f)
                curveTo(17.414f, 27.973f, 16.629f, 27.758f, 16.0f, 27.758f)
                curveTo(15.375f, 27.758f, 14.559f, 28.0f, 14.559f, 28.0f)
                lineTo(14.785f, 18.586f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
