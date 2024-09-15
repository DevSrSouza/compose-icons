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

public val LineAwesomeIcons.CrosshairsSolid: ImageVector
    get() {
        if (_crosshairsSolid != null) {
            return _crosshairsSolid!!
        }
        _crosshairsSolid = Builder(name = "CrosshairsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.063f)
                curveTo(9.734f, 5.539f, 5.539f, 9.734f, 5.063f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(5.063f, 17.0f)
                curveTo(5.539f, 22.266f, 9.734f, 26.461f, 15.0f, 26.938f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 26.938f)
                curveTo(22.266f, 26.461f, 26.461f, 22.266f, 26.938f, 17.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                lineTo(26.938f, 15.0f)
                curveTo(26.461f, 9.734f, 22.266f, 5.539f, 17.0f, 5.063f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(15.0f, 7.031f)
                lineTo(15.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                lineTo(17.0f, 7.031f)
                curveTo(21.191f, 7.484f, 24.516f, 10.809f, 24.969f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 17.0f)
                lineTo(24.969f, 17.0f)
                curveTo(24.516f, 21.191f, 21.191f, 24.516f, 17.0f, 24.969f)
                lineTo(17.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 24.969f)
                curveTo(10.809f, 24.516f, 7.484f, 21.191f, 7.031f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 15.0f)
                lineTo(7.031f, 15.0f)
                curveTo(7.484f, 10.809f, 10.809f, 7.484f, 15.0f, 7.031f)
                close()
            }
        }
        .build()
        return _crosshairsSolid!!
    }

private var _crosshairsSolid: ImageVector? = null
