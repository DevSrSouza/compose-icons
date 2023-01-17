package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 120.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveTo(178.5f, 120.0f, 152.0f, 120.0f)
                close()
                moveTo(447.1f, 32.0f)
                horizontalLineToRelative(-384.0f)
                curveTo(28.65f, 32.0f, -0.009f, 60.65f, -0.009f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 63.1f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(511.1f, 60.65f, 483.3f, 32.0f, 447.1f, 32.0f)
                close()
                moveTo(463.1f, 409.3f)
                lineToRelative(-136.8f, -185.9f)
                curveTo(323.8f, 218.8f, 318.1f, 216.0f, 312.0f, 216.0f)
                curveToRelative(-6.113f, 0.0f, -11.82f, 2.768f, -15.21f, 7.379f)
                lineToRelative(-106.6f, 144.1f)
                lineToRelative(-37.09f, -46.1f)
                curveToRelative(-3.441f, -4.279f, -8.934f, -6.809f, -14.77f, -6.809f)
                curveToRelative(-5.842f, 0.0f, -11.33f, 2.529f, -14.78f, 6.809f)
                lineToRelative(-75.52f, 93.81f)
                curveToRelative(0.0f, -0.029f, 0.0f, 0.029f, 0.0f, 0.0f)
                lineTo(47.99f, 96.0f)
                curveToRelative(0.0f, -8.822f, 7.178f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(8.822f, 0.0f, 16.0f, 7.178f, 16.0f, 16.0f)
                verticalLineTo(409.3f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
