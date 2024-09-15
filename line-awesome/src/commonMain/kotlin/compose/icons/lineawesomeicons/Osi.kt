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

public val LineAwesomeIcons.Osi: ImageVector
    get() {
        if (_osi != null) {
            return _osi!!
        }
        _osi = Builder(name = "Osi", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 21.125f, 7.215f, 25.504f, 11.75f, 27.219f)
                lineTo(12.688f, 27.594f)
                lineTo(13.063f, 26.656f)
                lineTo(15.531f, 20.094f)
                lineTo(15.875f, 19.156f)
                lineTo(14.938f, 18.813f)
                curveTo(13.805f, 18.383f, 13.0f, 17.293f, 13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                curveTo(19.0f, 17.293f, 18.195f, 18.383f, 17.063f, 18.813f)
                lineTo(16.125f, 19.156f)
                lineTo(16.469f, 20.094f)
                lineTo(18.938f, 26.656f)
                lineTo(19.313f, 27.594f)
                lineTo(20.25f, 27.219f)
                curveTo(24.785f, 25.504f, 28.0f, 21.125f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 19.922f, 23.684f, 23.203f, 20.406f, 24.844f)
                lineTo(18.594f, 20.063f)
                curveTo(19.977f, 19.172f, 21.0f, 17.758f, 21.0f, 16.0f)
                curveTo(21.0f, 13.25f, 18.75f, 11.0f, 16.0f, 11.0f)
                curveTo(13.25f, 11.0f, 11.0f, 13.25f, 11.0f, 16.0f)
                curveTo(11.0f, 17.758f, 12.023f, 19.172f, 13.406f, 20.063f)
                lineTo(11.594f, 24.844f)
                curveTo(8.316f, 23.203f, 6.0f, 19.922f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _osi!!
    }

private var _osi: ImageVector? = null
