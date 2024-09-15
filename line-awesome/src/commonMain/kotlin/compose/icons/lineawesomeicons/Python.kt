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

public val LineAwesomeIcons.Python: ImageVector
    get() {
        if (_python != null) {
            return _python!!
        }
        _python = Builder(name = "Python", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(11.012f, 5.0f, 11.0f, 7.0f, 11.0f, 7.0f)
                lineTo(11.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                curveTo(7.0f, 12.0f, 4.0f, 11.539f, 4.0f, 17.0f)
                curveTo(4.0f, 22.461f, 7.0f, 22.0f, 7.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 20.375f)
                curveTo(10.0f, 17.965f, 11.965f, 16.0f, 14.375f, 16.0f)
                lineTo(17.625f, 16.0f)
                curveTo(19.484f, 16.0f, 21.0f, 15.484f, 21.0f, 13.625f)
                lineTo(21.0f, 7.0f)
                curveTo(21.0f, 7.0f, 20.988f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(13.0f, 7.0f)
                curveTo(13.551f, 7.0f, 14.0f, 7.449f, 14.0f, 8.0f)
                curveTo(14.0f, 8.551f, 13.551f, 9.0f, 13.0f, 9.0f)
                curveTo(12.449f, 9.0f, 12.0f, 8.551f, 12.0f, 8.0f)
                curveTo(12.0f, 7.449f, 12.449f, 7.0f, 13.0f, 7.0f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(22.0f, 13.625f)
                curveTo(22.0f, 16.035f, 20.035f, 17.0f, 17.625f, 17.0f)
                lineTo(14.375f, 17.0f)
                curveTo(12.516f, 17.0f, 11.0f, 18.516f, 11.0f, 20.375f)
                lineTo(11.0f, 26.0f)
                curveTo(11.0f, 26.0f, 11.063f, 28.0f, 16.0f, 28.0f)
                curveTo(20.938f, 28.0f, 21.0f, 26.0f, 21.0f, 26.0f)
                lineTo(21.0f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 21.0f)
                lineTo(25.0f, 21.0f)
                curveTo(25.0f, 21.0f, 28.0f, 21.504f, 28.0f, 16.0f)
                curveTo(28.0f, 10.496f, 25.0f, 11.0f, 25.0f, 11.0f)
                close()
                moveTo(19.0f, 24.0f)
                curveTo(19.551f, 24.0f, 20.0f, 24.449f, 20.0f, 25.0f)
                curveTo(20.0f, 25.551f, 19.551f, 26.0f, 19.0f, 26.0f)
                curveTo(18.449f, 26.0f, 18.0f, 25.551f, 18.0f, 25.0f)
                curveTo(18.0f, 24.449f, 18.449f, 24.0f, 19.0f, 24.0f)
                close()
            }
        }
        .build()
        return _python!!
    }

private var _python: ImageVector? = null
