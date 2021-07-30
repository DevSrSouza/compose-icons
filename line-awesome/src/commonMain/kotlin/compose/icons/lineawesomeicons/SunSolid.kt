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

public val LineAwesomeIcons.SunSolid: ImageVector
    get() {
        if (_sunSolid != null) {
            return _sunSolid!!
        }
        _sunSolid = Builder(name = "SunSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(7.5f, 6.0938f)
                lineTo(6.0938f, 7.5f)
                lineTo(9.625f, 11.0625f)
                lineTo(11.0625f, 9.625f)
                close()
                moveTo(24.5f, 6.0938f)
                lineTo(20.9375f, 9.625f)
                lineTo(22.375f, 11.0625f)
                lineTo(25.9063f, 7.5f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(12.1445f, 9.0f, 9.0f, 12.1445f, 9.0f, 16.0f)
                curveTo(9.0f, 19.8555f, 12.1445f, 23.0f, 16.0f, 23.0f)
                curveTo(19.8555f, 23.0f, 23.0f, 19.8555f, 23.0f, 16.0f)
                curveTo(23.0f, 12.1445f, 19.8555f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.7734f, 11.0f, 21.0f, 13.2266f, 21.0f, 16.0f)
                curveTo(21.0f, 18.7734f, 18.7734f, 21.0f, 16.0f, 21.0f)
                curveTo(13.2266f, 21.0f, 11.0f, 18.7734f, 11.0f, 16.0f)
                curveTo(11.0f, 13.2266f, 13.2266f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(24.0f, 17.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                close()
                moveTo(9.625f, 20.9375f)
                lineTo(6.0938f, 24.5f)
                lineTo(7.5f, 25.9063f)
                lineTo(11.0625f, 22.375f)
                close()
                moveTo(22.375f, 20.9375f)
                lineTo(20.9375f, 22.375f)
                lineTo(24.5f, 25.9063f)
                lineTo(25.9063f, 24.5f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 24.0f)
                close()
            }
        }
        .build()
        return _sunSolid!!
    }

private var _sunSolid: ImageVector? = null
