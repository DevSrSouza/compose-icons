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

public val LineAwesomeIcons.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(2.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 5.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(28.0f, 7.0f)
                lineTo(28.0f, 20.906f)
                lineTo(22.719f, 15.594f)
                lineTo(22.0f, 14.875f)
                lineTo(17.469f, 19.406f)
                lineTo(11.719f, 13.594f)
                lineTo(11.0f, 12.875f)
                lineTo(4.0f, 19.875f)
                close()
                moveTo(24.0f, 9.0f)
                curveTo(22.895f, 9.0f, 22.0f, 9.895f, 22.0f, 11.0f)
                curveTo(22.0f, 12.105f, 22.895f, 13.0f, 24.0f, 13.0f)
                curveTo(25.105f, 13.0f, 26.0f, 12.105f, 26.0f, 11.0f)
                curveTo(26.0f, 9.895f, 25.105f, 9.0f, 24.0f, 9.0f)
                close()
                moveTo(11.0f, 15.719f)
                lineTo(20.188f, 25.0f)
                lineTo(4.0f, 25.0f)
                lineTo(4.0f, 22.719f)
                close()
                moveTo(22.0f, 17.719f)
                lineTo(28.0f, 23.719f)
                lineTo(28.0f, 25.0f)
                lineTo(23.031f, 25.0f)
                lineTo(18.875f, 20.813f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
