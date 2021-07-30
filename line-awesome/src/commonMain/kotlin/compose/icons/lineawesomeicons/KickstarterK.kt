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

public val LineAwesomeIcons.KickstarterK: ImageVector
    get() {
        if (_kickstarterK != null) {
            return _kickstarterK!!
        }
        _kickstarterK = Builder(name = "KickstarterK", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                curveTo(9.343f, 5.0f, 8.0f, 6.343f, 8.0f, 8.0f)
                lineTo(8.0f, 24.0f)
                curveTo(8.0f, 25.657f, 9.343f, 27.0f, 11.0f, 27.0f)
                curveTo(12.657f, 27.0f, 14.0f, 25.657f, 14.0f, 24.0f)
                lineTo(14.0f, 19.4141f)
                lineTo(19.7422f, 25.9766f)
                curveTo(20.3352f, 26.6536f, 21.167f, 27.0f, 22.002f, 27.0f)
                curveTo(22.703f, 27.0f, 23.4066f, 26.7558f, 23.9766f, 26.2578f)
                curveTo(25.2236f, 25.1668f, 25.3488f, 23.2724f, 24.2578f, 22.0254f)
                lineTo(18.8594f, 15.8555f)
                lineTo(23.4004f, 9.8008f)
                curveTo(24.3944f, 8.4758f, 24.1268f, 6.5936f, 22.8008f, 5.5996f)
                curveTo(21.4758f, 4.6056f, 19.5936f, 4.8732f, 18.5996f, 6.1992f)
                lineTo(14.0f, 12.334f)
                lineTo(14.0f, 8.0f)
                curveTo(14.0f, 6.343f, 12.657f, 5.0f, 11.0f, 5.0f)
                close()
            }
        }
        .build()
        return _kickstarterK!!
    }

private var _kickstarterK: ImageVector? = null
