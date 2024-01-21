package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ebox: ImageVector
    get() {
        if (_ebox != null) {
            return _ebox!!
        }
        _ebox = Builder(name = "Ebox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.939f, 14.973f)
                lineToRelative(10.97f, 6.4f)
                lineTo(11.909f, 24.0f)
                lineTo(0.94f, 17.6f)
                verticalLineToRelative(-2.626f)
                close()
                moveTo(23.062f, 14.973f)
                verticalLineToRelative(2.626f)
                lineToRelative(-10.971f, 6.4f)
                verticalLineToRelative(-2.626f)
                lineToRelative(10.97f, -6.401f)
                close()
                moveTo(0.939f, 10.66f)
                lineToRelative(10.97f, 6.4f)
                verticalLineToRelative(2.627f)
                lineToRelative(-7.223f, -4.214f)
                lineToRelative(-1.068f, 0.622f)
                lineToRelative(-2.253f, -1.313f)
                lineToRelative(1.07f, -0.623f)
                lineToRelative(-1.496f, -0.873f)
                lineTo(0.939f, 10.66f)
                close()
                moveTo(23.062f, 10.66f)
                verticalLineToRelative(2.626f)
                lineToRelative(-1.496f, 0.873f)
                lineToRelative(1.07f, 0.624f)
                lineToRelative(-2.253f, 1.313f)
                lineToRelative(-1.07f, -0.623f)
                lineToRelative(-7.224f, 4.214f)
                lineTo(12.089f, 17.06f)
                lineToRelative(10.972f, -6.4f)
                close()
                moveTo(0.939f, 6.347f)
                lineToRelative(10.97f, 6.4f)
                verticalLineToRelative(2.627f)
                lineToRelative(-3.525f, -2.057f)
                lineToRelative(-1.067f, 0.622f)
                lineToRelative(-2.252f, -1.314f)
                lineToRelative(1.067f, -0.622f)
                lineToRelative(-1.429f, -0.833f)
                lineToRelative(-1.066f, 0.622f)
                lineToRelative(-2.253f, -1.314f)
                lineToRelative(1.068f, -0.622f)
                lineToRelative(-1.514f, -0.883f)
                close()
                moveTo(23.062f, 6.347f)
                verticalLineToRelative(2.626f)
                lineToRelative(-1.514f, 0.883f)
                lineToRelative(1.07f, 0.622f)
                lineToRelative(-2.254f, 1.315f)
                lineToRelative(-1.068f, -0.623f)
                lineToRelative(-1.428f, 0.833f)
                lineToRelative(1.068f, 0.622f)
                lineToRelative(-2.252f, 1.314f)
                lineToRelative(-1.07f, -0.622f)
                lineToRelative(-3.525f, 2.057f)
                verticalLineToRelative(-2.627f)
                lineToRelative(10.972f, -6.4f)
                close()
                moveTo(12.0f, 8.584f)
                lineToRelative(3.236f, 1.885f)
                lineToRelative(-2.252f, 1.314f)
                lineToRelative(-0.983f, -0.573f)
                lineToRelative(-0.982f, 0.573f)
                lineToRelative(-2.252f, -1.314f)
                lineToRelative(3.235f, -1.885f)
                close()
                moveTo(12.0f, 4.291f)
                lineTo(18.916f, 8.321f)
                lineTo(16.664f, 9.636f)
                lineTo(12.0f, 6.918f)
                lineTo(7.338f, 9.635f)
                lineTo(5.085f, 8.321f)
                close()
                moveTo(12.0f, 0.0f)
                lineToRelative(10.597f, 6.175f)
                lineToRelative(-2.252f, 1.314f)
                lineTo(12.0f, 2.627f)
                lineTo(3.657f, 7.489f)
                lineTo(1.405f, 6.175f)
                lineTo(12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _ebox!!
    }

private var _ebox: ImageVector? = null
