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
                curveTo(14.742f, 2.0f, 13.848f, 2.891f, 13.406f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 4.0f)
                lineTo(18.594f, 4.0f)
                curveTo(18.152f, 2.891f, 17.258f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.555f, 4.0f, 17.0f, 4.445f, 17.0f, 5.0f)
                lineTo(17.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.445f, 15.445f, 4.0f, 16.0f, 4.0f)
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
                moveTo(21.281f, 13.281f)
                lineTo(15.0f, 19.563f)
                lineTo(11.719f, 16.281f)
                lineTo(10.281f, 17.719f)
                lineTo(14.281f, 21.719f)
                lineTo(15.0f, 22.406f)
                lineTo(15.719f, 21.719f)
                lineTo(22.719f, 14.719f)
                close()
            }
        }
        .build()
        return _clipboardCheckSolid!!
    }

private var _clipboardCheckSolid: ImageVector? = null
