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

public val LineAwesomeIcons.Amilia: ImageVector
    get() {
        if (_amilia != null) {
            return _amilia!!
        }
        _amilia = Builder(name = "Amilia", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.43f, 6.0f)
                curveTo(13.667f, 6.0f, 10.697f, 6.281f, 8.344f, 8.0f)
                curveTo(8.116f, 8.138f, 7.937f, 8.41f, 8.021f, 8.865f)
                curveTo(8.07f, 9.093f, 8.25f, 10.09f, 8.477f, 10.635f)
                curveTo(8.66f, 11.09f, 9.111f, 11.089f, 9.383f, 10.906f)
                curveTo(10.835f, 9.911f, 13.904f, 9.0f, 16.395f, 9.0f)
                curveTo(18.98f, 9.0f, 19.023f, 10.519f, 19.023f, 12.514f)
                lineTo(19.023f, 14.232f)
                curveTo(15.121f, 14.736f, 8.773f, 15.776f, 7.367f, 16.365f)
                curveTo(5.782f, 17.093f, 6.012f, 20.199f, 6.012f, 21.016f)
                curveTo(6.012f, 22.282f, 6.691f, 26.0f, 11.588f, 26.0f)
                curveTo(13.722f, 26.0f, 17.438f, 25.076f, 19.205f, 24.121f)
                lineTo(19.205f, 25.504f)
                curveTo(19.205f, 25.638f, 19.301f, 25.868f, 19.479f, 25.908f)
                curveTo(19.617f, 25.953f, 21.392f, 25.998f, 21.803f, 25.998f)
                curveTo(22.214f, 25.998f, 24.592f, 26.011f, 24.771f, 25.967f)
                curveTo(24.954f, 25.922f, 25.0f, 25.695f, 25.0f, 25.561f)
                lineTo(25.0f, 12.07f)
                curveTo(24.996f, 8.486f, 22.416f, 6.0f, 16.43f, 6.0f)
                close()
                moveTo(19.02f, 16.771f)
                lineTo(19.02f, 21.869f)
                curveTo(18.065f, 22.458f, 16.298f, 22.957f, 14.941f, 22.957f)
                curveTo(12.584f, 22.957f, 11.963f, 21.129f, 11.959f, 20.629f)
                curveTo(11.959f, 20.084f, 11.824f, 18.724f, 12.775f, 18.268f)
                curveTo(13.86f, 17.679f, 17.024f, 16.954f, 19.02f, 16.771f)
                close()
            }
        }
        .build()
        return _amilia!!
    }

private var _amilia: ImageVector? = null
