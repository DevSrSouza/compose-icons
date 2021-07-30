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

public val LineAwesomeIcons.ItalicSolid: ImageVector
    get() {
        if (_italicSolid != null) {
            return _italicSolid!!
        }
        _italicSolid = Builder(name = "ItalicSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 5.0f)
                lineTo(11.6875f, 5.9375f)
                lineTo(11.5f, 8.9375f)
                lineTo(11.4375f, 10.0f)
                lineTo(13.4375f, 10.0f)
                lineTo(12.5625f, 22.0f)
                lineTo(10.5625f, 22.0f)
                lineTo(10.5f, 22.9375f)
                lineTo(10.3125f, 25.9375f)
                lineTo(10.2188f, 27.0f)
                lineTo(20.25f, 27.0f)
                lineTo(20.3125f, 26.0625f)
                lineTo(20.5f, 23.0625f)
                lineTo(20.5625f, 22.0f)
                lineTo(18.5625f, 22.0f)
                lineTo(19.4375f, 10.0f)
                lineTo(21.4375f, 10.0f)
                lineTo(21.5f, 9.0625f)
                lineTo(21.6875f, 6.0625f)
                lineTo(21.7813f, 5.0f)
                close()
                moveTo(13.625f, 7.0f)
                lineTo(19.625f, 7.0f)
                lineTo(19.5625f, 8.0f)
                lineTo(17.5625f, 8.0f)
                lineTo(17.5f, 8.9375f)
                lineTo(16.5f, 22.9375f)
                lineTo(16.4375f, 24.0f)
                lineTo(18.4375f, 24.0f)
                lineTo(18.375f, 25.0f)
                lineTo(12.375f, 25.0f)
                lineTo(12.4375f, 24.0f)
                lineTo(14.4375f, 24.0f)
                lineTo(14.5f, 23.0625f)
                lineTo(15.5f, 9.0625f)
                lineTo(15.5625f, 8.0f)
                lineTo(13.5625f, 8.0f)
                close()
            }
        }
        .build()
        return _italicSolid!!
    }

private var _italicSolid: ImageVector? = null
