package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FlaskLine: ImageVector
    get() {
        if (_flaskLine != null) {
            return _flaskLine!!
        }
        _flaskLine = Builder(name = "FlaskLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.243f)
                curveToRelative(0.0f, 1.158f, 0.251f, 2.301f, 0.736f, 3.352f)
                lineToRelative(4.282f, 9.276f)
                curveToRelative(0.347f, 0.753f, 0.018f, 1.644f, -0.734f, 1.99f)
                curveToRelative(-0.197f, 0.092f, -0.411f, 0.139f, -0.628f, 0.139f)
                lineTo(5.344f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.217f, 0.047f, -0.432f, 0.138f, -0.629f)
                lineToRelative(4.282f, -9.276f)
                curveTo(8.749f, 9.545f, 9.0f, 8.401f, 9.0f, 7.243f)
                lineTo(9.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(13.388f, 10.001f)
                horizontalLineToRelative(-2.776f)
                curveToRelative(-0.104f, 0.363f, -0.23f, 0.721f, -0.374f, 1.071f)
                lineToRelative(-0.158f, 0.361f)
                lineTo(6.125f, 20.0f)
                horizontalLineToRelative(11.749f)
                lineToRelative(-3.954f, -8.567f)
                curveToRelative(-0.214f, -0.464f, -0.392f, -0.943f, -0.532f, -1.432f)
                close()
                moveTo(11.0f, 7.243f)
                curveToRelative(0.0f, 0.253f, -0.01f, 0.506f, -0.029f, 0.758f)
                horizontalLineToRelative(2.058f)
                curveToRelative(-0.01f, -0.121f, -0.016f, -0.242f, -0.021f, -0.364f)
                lineTo(13.0f, 7.243f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.243f)
                close()
            }
        }
        .build()
        return _flaskLine!!
    }

private var _flaskLine: ImageVector? = null
