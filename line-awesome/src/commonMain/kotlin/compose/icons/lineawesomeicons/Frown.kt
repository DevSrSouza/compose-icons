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

public val LineAwesomeIcons.Frown: ImageVector
    get() {
        if (_frown != null) {
            return _frown!!
        }
        _frown = Builder(name = "Frown", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 12.0f)
                curveTo(10.6719f, 12.0f, 10.0f, 12.6719f, 10.0f, 13.5f)
                curveTo(10.0f, 14.3281f, 10.6719f, 15.0f, 11.5f, 15.0f)
                curveTo(12.3281f, 15.0f, 13.0f, 14.3281f, 13.0f, 13.5f)
                curveTo(13.0f, 12.6719f, 12.3281f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                curveTo(19.6719f, 12.0f, 19.0f, 12.6719f, 19.0f, 13.5f)
                curveTo(19.0f, 14.3281f, 19.6719f, 15.0f, 20.5f, 15.0f)
                curveTo(21.3281f, 15.0f, 22.0f, 14.3281f, 22.0f, 13.5f)
                curveTo(22.0f, 12.6719f, 21.3281f, 12.0f, 20.5f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(13.332f, 18.0f, 10.9805f, 19.3359f, 9.5313f, 21.3438f)
                lineTo(11.1563f, 22.5f)
                curveTo(12.2461f, 20.9844f, 13.9922f, 20.0f, 16.0f, 20.0f)
                curveTo(18.0078f, 20.0f, 19.7539f, 20.9844f, 20.8438f, 22.5f)
                lineTo(22.4688f, 21.3438f)
                curveTo(21.0195f, 19.3359f, 18.668f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _frown!!
    }

private var _frown: ImageVector? = null
