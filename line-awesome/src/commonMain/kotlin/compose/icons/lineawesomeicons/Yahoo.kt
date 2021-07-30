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
                moveTo(7.3398f, 6.0273f)
                curveTo(7.3398f, 6.0273f, 8.125f, 6.1992f, 8.7813f, 6.1992f)
                curveTo(9.4375f, 6.1992f, 10.207f, 6.0156f, 10.207f, 6.0156f)
                lineTo(16.0f, 15.6602f)
                lineTo(21.8203f, 6.0f)
                curveTo(21.8203f, 6.0f, 22.4492f, 6.2148f, 23.2344f, 6.2148f)
                curveTo(24.0156f, 6.2148f, 24.6602f, 6.0156f, 24.6602f, 6.0156f)
                lineTo(17.2148f, 18.5977f)
                lineTo(17.4141f, 27.9727f)
                curveTo(17.4141f, 27.9727f, 16.6289f, 27.7578f, 16.0f, 27.7578f)
                curveTo(15.375f, 27.7578f, 14.5586f, 28.0f, 14.5586f, 28.0f)
                lineTo(14.7852f, 18.5859f)
                close()
            }
        }
        .build()
        return _yahoo!!
    }

private var _yahoo: ImageVector? = null
