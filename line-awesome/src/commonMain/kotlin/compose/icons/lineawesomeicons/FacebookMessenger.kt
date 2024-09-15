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

public val LineAwesomeIcons.FacebookMessenger: ImageVector
    get() {
        if (_facebookMessenger != null) {
            return _facebookMessenger!!
        }
        _facebookMessenger = Builder(name = "FacebookMessenger", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.41f, 4.0f, 4.0f, 9.137f, 4.0f, 15.5f)
                curveTo(4.0f, 18.891f, 5.57f, 21.902f, 8.0f, 24.0f)
                lineTo(8.0f, 28.625f)
                lineTo(12.438f, 26.406f)
                curveTo(13.566f, 26.746f, 14.746f, 27.0f, 16.0f, 27.0f)
                curveTo(22.59f, 27.0f, 28.0f, 21.863f, 28.0f, 15.5f)
                curveTo(28.0f, 9.137f, 22.59f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.559f, 6.0f, 26.0f, 10.266f, 26.0f, 15.5f)
                curveTo(26.0f, 20.734f, 21.559f, 25.0f, 16.0f, 25.0f)
                curveTo(14.805f, 25.0f, 13.664f, 24.773f, 12.594f, 24.406f)
                lineTo(12.188f, 24.281f)
                lineTo(10.0f, 25.375f)
                lineTo(10.0f, 23.125f)
                lineTo(9.625f, 22.813f)
                curveTo(7.406f, 21.063f, 6.0f, 18.441f, 6.0f, 15.5f)
                curveTo(6.0f, 10.266f, 10.441f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.875f, 12.344f)
                lineTo(8.844f, 18.719f)
                lineTo(14.25f, 15.719f)
                lineTo(17.125f, 18.813f)
                lineTo(23.094f, 12.344f)
                lineTo(17.813f, 15.313f)
                close()
            }
        }
        .build()
        return _facebookMessenger!!
    }

private var _facebookMessenger: ImageVector? = null
