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

public val LineAwesomeIcons.PooSolid: ImageVector
    get() {
        if (_pooSolid != null) {
            return _pooSolid!!
        }
        _pooSolid = Builder(name = "PooSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(14.162f, 6.0f, 11.0f, 8.613f, 11.0f, 12.363f)
                lineTo(11.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                curveTo(7.794f, 13.0f, 6.0f, 14.794f, 6.0f, 17.0f)
                curveTo(6.0f, 17.408f, 6.064f, 17.811f, 6.188f, 18.195f)
                curveTo(4.345f, 18.758f, 3.0f, 20.475f, 3.0f, 22.5f)
                curveTo(3.0f, 24.981f, 5.019f, 27.0f, 7.5f, 27.0f)
                lineTo(24.5f, 27.0f)
                curveTo(26.981f, 27.0f, 29.0f, 24.981f, 29.0f, 22.5f)
                curveTo(29.0f, 20.475f, 27.656f, 18.757f, 25.813f, 18.193f)
                curveTo(25.937f, 17.809f, 26.0f, 17.406f, 26.0f, 16.998f)
                curveTo(26.0f, 14.792f, 24.206f, 12.998f, 22.0f, 12.998f)
                lineTo(20.932f, 12.998f)
                curveTo(20.675f, 11.225f, 19.738f, 10.532f, 19.025f, 10.004f)
                curveTo(18.278f, 9.45f, 17.785f, 9.082f, 17.994f, 7.105f)
                lineTo(18.111f, 6.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(15.953f, 8.188f)
                curveTo(16.026f, 10.092f, 16.853f, 10.88f, 17.836f, 11.609f)
                curveTo(18.537f, 12.13f, 19.0f, 12.474f, 19.0f, 14.0f)
                lineTo(19.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                curveTo(23.103f, 15.0f, 24.0f, 15.897f, 24.0f, 17.0f)
                curveTo(24.0f, 17.483f, 23.814f, 17.954f, 23.477f, 18.328f)
                lineTo(21.965f, 20.0f)
                lineTo(24.5f, 20.0f)
                curveTo(25.879f, 20.0f, 27.0f, 21.121f, 27.0f, 22.5f)
                curveTo(27.0f, 23.879f, 25.879f, 25.0f, 24.5f, 25.0f)
                lineTo(7.5f, 25.0f)
                curveTo(6.121f, 25.0f, 5.0f, 23.879f, 5.0f, 22.5f)
                curveTo(5.0f, 21.121f, 6.121f, 20.0f, 7.5f, 20.0f)
                lineTo(10.035f, 20.0f)
                lineTo(8.523f, 18.328f)
                curveTo(8.186f, 17.954f, 8.0f, 17.483f, 8.0f, 17.0f)
                curveTo(8.0f, 15.897f, 8.897f, 15.0f, 10.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 12.363f)
                curveTo(13.0f, 10.362f, 14.426f, 8.727f, 15.953f, 8.188f)
                close()
                moveTo(12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 17.0f)
                close()
                moveTo(14.0f, 20.0f)
                curveTo(14.0f, 21.105f, 14.895f, 22.0f, 16.0f, 22.0f)
                curveTo(17.105f, 22.0f, 18.0f, 21.105f, 18.0f, 20.0f)
                lineTo(14.0f, 20.0f)
                close()
            }
        }
        .build()
        return _pooSolid!!
    }

private var _pooSolid: ImageVector? = null
