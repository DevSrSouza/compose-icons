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

public val LineAwesomeIcons.Buysellads: ImageVector
    get() {
        if (_buysellads != null) {
            return _buysellads!!
        }
        _buysellads = Builder(name = "Buysellads", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.188f, 6.0f)
                lineTo(10.969f, 6.688f)
                lineTo(5.063f, 24.688f)
                lineTo(4.625f, 26.0f)
                lineTo(11.969f, 26.0f)
                lineTo(12.25f, 25.781f)
                lineTo(18.125f, 21.0f)
                lineTo(19.281f, 25.25f)
                lineTo(19.5f, 26.0f)
                lineTo(27.406f, 26.0f)
                lineTo(26.938f, 24.688f)
                lineTo(20.875f, 6.688f)
                lineTo(20.625f, 6.0f)
                close()
                moveTo(12.656f, 8.0f)
                lineTo(19.188f, 8.0f)
                lineTo(24.625f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.063f, 9.469f)
                lineTo(16.875f, 8.719f)
                lineTo(15.156f, 8.719f)
                lineTo(14.938f, 9.438f)
                lineTo(12.281f, 18.719f)
                lineTo(11.906f, 20.0f)
                lineTo(16.188f, 20.0f)
                lineTo(11.281f, 24.0f)
                lineTo(7.375f, 24.0f)
                close()
                moveTo(15.969f, 13.094f)
                lineTo(17.313f, 18.0f)
                lineTo(14.563f, 18.0f)
                close()
            }
        }
        .build()
        return _buysellads!!
    }

private var _buysellads: ImageVector? = null
