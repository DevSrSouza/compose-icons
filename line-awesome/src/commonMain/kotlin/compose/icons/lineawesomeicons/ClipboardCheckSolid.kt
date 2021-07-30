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

public val LineAwesomeIcons.ClipboardCheckSolid: ImageVector
    get() {
        if (_clipboardCheckSolid != null) {
            return _clipboardCheckSolid!!
        }
        _clipboardCheckSolid = Builder(name = "ClipboardCheckSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.7422f, 2.0f, 13.8477f, 2.8906f, 13.4063f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 4.0f)
                lineTo(18.5938f, 4.0f)
                curveTo(18.1523f, 2.8906f, 17.2578f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.5547f, 4.0f, 17.0f, 4.4453f, 17.0f, 5.0f)
                lineTo(17.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.4453f, 15.4453f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(25.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                close()
                moveTo(21.2813f, 13.2813f)
                lineTo(15.0f, 19.5625f)
                lineTo(11.7188f, 16.2813f)
                lineTo(10.2813f, 17.7188f)
                lineTo(14.2813f, 21.7188f)
                lineTo(15.0f, 22.4063f)
                lineTo(15.7188f, 21.7188f)
                lineTo(22.7188f, 14.7188f)
                close()
            }
        }
        .build()
        return _clipboardCheckSolid!!
    }

private var _clipboardCheckSolid: ImageVector? = null
