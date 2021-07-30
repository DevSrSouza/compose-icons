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

public val LineAwesomeIcons.ClipboardSolid: ImageVector
    get() {
        if (_clipboardSolid != null) {
            return _clipboardSolid!!
        }
        _clipboardSolid = Builder(name = "ClipboardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.7422f, 3.0f, 12.8477f, 3.8906f, 12.4063f, 5.0f)
                lineTo(5.0f, 5.0f)
                lineTo(5.0f, 28.0f)
                lineTo(13.0f, 28.0f)
                lineTo(13.0f, 30.0f)
                lineTo(27.0f, 30.0f)
                lineTo(27.0f, 14.0f)
                lineTo(25.0f, 14.0f)
                lineTo(25.0f, 5.0f)
                lineTo(17.5938f, 5.0f)
                curveTo(17.1523f, 3.8906f, 16.2578f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                curveTo(15.5547f, 5.0f, 16.0f, 5.4453f, 16.0f, 6.0f)
                lineTo(16.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.4453f, 14.4453f, 5.0f, 15.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                close()
                moveTo(15.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 28.0f)
                lineTo(15.0f, 28.0f)
                close()
            }
        }
        .build()
        return _clipboardSolid!!
    }

private var _clipboardSolid: ImageVector? = null
