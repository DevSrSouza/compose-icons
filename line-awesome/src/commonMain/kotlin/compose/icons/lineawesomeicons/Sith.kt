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

public val LineAwesomeIcons.Sith: ImageVector
    get() {
        if (_sith != null) {
            return _sith!!
        }
        _sith = Builder(name = "Sith", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(7.734f, 10.361f)
                lineTo(5.0f, 10.0f)
                lineTo(8.248f, 14.059f)
                curveTo(8.092f, 14.682f, 8.0f, 15.329f, 8.0f, 16.0f)
                curveTo(8.0f, 16.671f, 8.092f, 17.318f, 8.248f, 17.941f)
                lineTo(5.0f, 22.0f)
                lineTo(7.734f, 21.639f)
                lineTo(4.0f, 28.0f)
                lineTo(10.361f, 24.266f)
                lineTo(10.0f, 27.0f)
                lineTo(14.059f, 23.752f)
                curveTo(14.682f, 23.908f, 15.329f, 24.0f, 16.0f, 24.0f)
                curveTo(16.671f, 24.0f, 17.318f, 23.908f, 17.941f, 23.752f)
                lineTo(22.0f, 27.0f)
                lineTo(21.639f, 24.266f)
                lineTo(28.0f, 28.0f)
                lineTo(24.266f, 21.639f)
                lineTo(27.0f, 22.0f)
                lineTo(23.752f, 17.941f)
                curveTo(23.908f, 17.318f, 24.0f, 16.671f, 24.0f, 16.0f)
                curveTo(24.0f, 15.329f, 23.908f, 14.682f, 23.752f, 14.059f)
                lineTo(27.0f, 10.0f)
                lineTo(24.266f, 10.361f)
                lineTo(28.0f, 4.0f)
                lineTo(21.639f, 7.734f)
                lineTo(22.0f, 5.0f)
                lineTo(17.941f, 8.248f)
                curveTo(17.318f, 8.092f, 16.671f, 8.0f, 16.0f, 8.0f)
                curveTo(15.329f, 8.0f, 14.682f, 8.092f, 14.059f, 8.248f)
                lineTo(10.0f, 5.0f)
                lineTo(10.361f, 7.734f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(19.309f, 10.0f, 22.0f, 12.691f, 22.0f, 16.0f)
                curveTo(22.0f, 19.309f, 19.309f, 22.0f, 16.0f, 22.0f)
                curveTo(12.691f, 22.0f, 10.0f, 19.309f, 10.0f, 16.0f)
                curveTo(10.0f, 12.691f, 12.691f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sith!!
    }

private var _sith: ImageVector? = null
