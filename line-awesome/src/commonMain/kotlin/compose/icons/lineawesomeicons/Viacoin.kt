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

public val LineAwesomeIcons.Viacoin: ImageVector
    get() {
        if (_viacoin != null) {
            return _viacoin!!
        }
        _viacoin = Builder(name = "Viacoin", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.281f, 6.0f)
                lineTo(8.844f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 14.0f)
                lineTo(9.688f, 14.0f)
                lineTo(10.531f, 16.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 18.0f)
                lineTo(11.406f, 18.0f)
                lineTo(15.875f, 28.531f)
                lineTo(20.469f, 18.0f)
                lineTo(27.0f, 18.0f)
                lineTo(27.0f, 16.0f)
                lineTo(21.344f, 16.0f)
                lineTo(22.219f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 12.0f)
                lineTo(23.094f, 12.0f)
                lineTo(25.719f, 6.0f)
                lineTo(23.531f, 6.0f)
                lineTo(19.156f, 16.0f)
                lineTo(12.719f, 16.0f)
                lineTo(8.438f, 6.0f)
                close()
                moveTo(13.563f, 18.0f)
                lineTo(18.281f, 18.0f)
                lineTo(15.906f, 23.469f)
                close()
            }
        }
        .build()
        return _viacoin!!
    }

private var _viacoin: ImageVector? = null
