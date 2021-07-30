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

public val SimpleIcons.Byte: ImageVector
    get() {
        if (_byte != null) {
            return _byte!!
        }
        _byte = Builder(name = "Byte", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(16.114f)
                horizontalLineToRelative(16.14f)
                lineTo(16.14f, 9.838f)
                curveToRelative(-0.025f, -0.633f, -0.579f, -1.082f, -1.317f, -1.082f)
                curveToRelative(-0.739f, 0.0f, -1.294f, 0.449f, -1.32f, 1.108f)
                verticalLineToRelative(3.614f)
                curveToRelative(-1.712f, -0.002f, -3.435f, 0.003f, -5.142f, -0.002f)
                arcToRelative(6.536f, 6.536f, 0.0f, false, true, 6.435f, -5.248f)
                curveToRelative(3.64f, 0.027f, 6.567f, 2.955f, 6.567f, 6.568f)
                arcToRelative(6.552f, 6.552f, 0.0f, false, true, -12.369f, 3.032f)
                lineToRelative(-0.053f, -0.104f)
                curveToRelative(-0.396f, -0.818f, -0.739f, -1.188f, -1.583f, -1.24f)
                curveToRelative(-0.844f, -0.027f, -1.503f, 0.447f, -1.292f, 1.133f)
                arcTo(9.175f, 9.175f, 0.0f, false, false, 14.796f, 24.0f)
                arcTo(9.195f, 9.195f, 0.0f, false, false, 24.0f, 14.796f)
                curveToRelative(0.0f, -4.537f, -3.428f, -8.466f, -7.886f, -9.1f)
                lineTo(16.114f, 0.0f)
                close()
                moveTo(2.638f, 2.638f)
                horizontalLineToRelative(10.84f)
                verticalLineToRelative(3.059f)
                arcToRelative(9.175f, 9.175f, 0.0f, false, false, -7.781f, 7.78f)
                curveToRelative(-1.013f, 0.002f, -2.04f, 0.0f, -3.06f, 0.0f)
                close()
            }
        }
        .build()
        return _byte!!
    }

private var _byte: ImageVector? = null
