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

public val LineAwesomeIcons.WonSignSolid: ImageVector
    get() {
        if (_wonSignSolid != null) {
            return _wonSignSolid!!
        }
        _wonSignSolid = Builder(name = "WonSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(5.8125f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 14.0f)
                lineTo(6.4063f, 14.0f)
                lineTo(7.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                lineTo(4.0f, 18.0f)
                lineTo(7.5938f, 18.0f)
                lineTo(10.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(14.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(20.0f, 26.0f)
                lineTo(22.0f, 26.0f)
                lineTo(24.4063f, 18.0f)
                lineTo(28.0f, 18.0f)
                lineTo(28.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.5938f, 14.0f)
                lineTo(28.0f, 14.0f)
                lineTo(28.0f, 12.0f)
                lineTo(26.1875f, 12.0f)
                lineTo(28.0f, 6.0f)
                lineTo(26.0f, 6.0f)
                lineTo(24.1875f, 12.0f)
                lineTo(18.5f, 12.0f)
                lineTo(17.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(13.5f, 12.0f)
                lineTo(7.8125f, 12.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(16.0f, 10.0f)
                lineTo(16.5f, 12.0f)
                lineTo(15.5f, 12.0f)
                close()
                moveTo(8.4063f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(12.5f, 16.0f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.5f, 16.0f)
                lineTo(14.5f, 16.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(23.5938f, 14.0f)
                lineTo(23.0f, 16.0f)
                lineTo(19.5f, 16.0f)
                close()
                moveTo(9.5938f, 18.0f)
                lineTo(12.0f, 18.0f)
                lineTo(10.9063f, 22.375f)
                close()
                moveTo(20.0f, 18.0f)
                lineTo(22.4063f, 18.0f)
                lineTo(21.0938f, 22.375f)
                close()
            }
        }
        .build()
        return _wonSignSolid!!
    }

private var _wonSignSolid: ImageVector? = null
