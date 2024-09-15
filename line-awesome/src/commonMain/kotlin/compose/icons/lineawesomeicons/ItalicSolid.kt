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
                lineTo(11.688f, 5.938f)
                lineTo(11.5f, 8.938f)
                lineTo(11.438f, 10.0f)
                lineTo(13.438f, 10.0f)
                lineTo(12.563f, 22.0f)
                lineTo(10.563f, 22.0f)
                lineTo(10.5f, 22.938f)
                lineTo(10.313f, 25.938f)
                lineTo(10.219f, 27.0f)
                lineTo(20.25f, 27.0f)
                lineTo(20.313f, 26.063f)
                lineTo(20.5f, 23.063f)
                lineTo(20.563f, 22.0f)
                lineTo(18.563f, 22.0f)
                lineTo(19.438f, 10.0f)
                lineTo(21.438f, 10.0f)
                lineTo(21.5f, 9.063f)
                lineTo(21.688f, 6.063f)
                lineTo(21.781f, 5.0f)
                close()
                moveTo(13.625f, 7.0f)
                lineTo(19.625f, 7.0f)
                lineTo(19.563f, 8.0f)
                lineTo(17.563f, 8.0f)
                lineTo(17.5f, 8.938f)
                lineTo(16.5f, 22.938f)
                lineTo(16.438f, 24.0f)
                lineTo(18.438f, 24.0f)
                lineTo(18.375f, 25.0f)
                lineTo(12.375f, 25.0f)
                lineTo(12.438f, 24.0f)
                lineTo(14.438f, 24.0f)
                lineTo(14.5f, 23.063f)
                lineTo(15.5f, 9.063f)
                lineTo(15.563f, 8.0f)
                lineTo(13.563f, 8.0f)
                close()
            }
        }
        .build()
        return _italicSolid!!
    }

private var _italicSolid: ImageVector? = null
