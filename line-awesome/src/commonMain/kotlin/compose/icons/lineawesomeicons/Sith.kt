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
                lineTo(7.7344f, 10.3613f)
                lineTo(5.0f, 10.0f)
                lineTo(8.248f, 14.0586f)
                curveTo(8.0918f, 14.6815f, 8.0f, 15.3293f, 8.0f, 16.0f)
                curveTo(8.0f, 16.6707f, 8.0918f, 17.3185f, 8.248f, 17.9414f)
                lineTo(5.0f, 22.0f)
                lineTo(7.7344f, 21.6387f)
                lineTo(4.0f, 28.0f)
                lineTo(10.3613f, 24.2656f)
                lineTo(10.0f, 27.0f)
                lineTo(14.0586f, 23.752f)
                curveTo(14.6815f, 23.9082f, 15.3293f, 24.0f, 16.0f, 24.0f)
                curveTo(16.6707f, 24.0f, 17.3185f, 23.9082f, 17.9414f, 23.752f)
                lineTo(22.0f, 27.0f)
                lineTo(21.6387f, 24.2656f)
                lineTo(28.0f, 28.0f)
                lineTo(24.2656f, 21.6387f)
                lineTo(27.0f, 22.0f)
                lineTo(23.752f, 17.9414f)
                curveTo(23.9082f, 17.3185f, 24.0f, 16.6707f, 24.0f, 16.0f)
                curveTo(24.0f, 15.3293f, 23.9082f, 14.6815f, 23.752f, 14.0586f)
                lineTo(27.0f, 10.0f)
                lineTo(24.2656f, 10.3613f)
                lineTo(28.0f, 4.0f)
                lineTo(21.6387f, 7.7344f)
                lineTo(22.0f, 5.0f)
                lineTo(17.9414f, 8.248f)
                curveTo(17.3185f, 8.0918f, 16.6707f, 8.0f, 16.0f, 8.0f)
                curveTo(15.3293f, 8.0f, 14.6815f, 8.0918f, 14.0586f, 8.248f)
                lineTo(10.0f, 5.0f)
                lineTo(10.3613f, 7.7344f)
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
