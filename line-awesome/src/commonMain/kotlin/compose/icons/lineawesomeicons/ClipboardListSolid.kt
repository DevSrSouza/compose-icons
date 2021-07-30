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

public val LineAwesomeIcons.ClipboardListSolid: ImageVector
    get() {
        if (_clipboardListSolid != null) {
            return _clipboardListSolid!!
        }
        _clipboardListSolid = Builder(name = "ClipboardListSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.74f, 2.0f, 13.8502f, 2.89f, 13.4102f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 4.0f)
                lineTo(18.5898f, 4.0f)
                curveTo(18.1498f, 2.89f, 17.26f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(16.55f, 4.0f, 17.0f, 4.45f, 17.0f, 5.0f)
                lineTo(17.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(12.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 5.0f)
                curveTo(15.0f, 4.45f, 15.45f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(10.0f, 6.0f)
                lineTo(10.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(25.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(9.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                close()
                moveTo(13.0f, 17.0f)
                lineTo(13.0f, 19.0f)
                lineTo(23.0f, 19.0f)
                lineTo(23.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                close()
                moveTo(9.0f, 21.0f)
                lineTo(9.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                close()
                moveTo(13.0f, 21.0f)
                lineTo(13.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                close()
            }
        }
        .build()
        return _clipboardListSolid!!
    }

private var _clipboardListSolid: ImageVector? = null
