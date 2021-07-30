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

public val SimpleIcons.Spinnaker: ImageVector
    get() {
        if (_spinnaker != null) {
            return _spinnaker!!
        }
        _spinnaker = Builder(name = "Spinnaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.343f, 0.0f)
                curveTo(17.785f, 8.741f, 11.317f, 21.987f, 0.815f, 23.882f)
                curveToRelative(10.806f, 1.064f, 19.481f, -5.327f, 21.646f, -8.066f)
                curveTo(24.627f, 13.076f, 21.343f, 0.0f, 21.343f, 0.0f)
                close()
                moveTo(0.815f, 23.882f)
                lineTo(0.8f, 23.88f)
                verticalLineToRelative(0.004f)
                lineToRelative(0.015f, -0.003f)
                close()
                moveTo(17.182f, 5.8f)
                curveTo(15.409f, 10.988f, 10.477f, 18.547f, 5.4f, 20.39f)
                curveToRelative(0.885f, 0.033f, 1.74f, -0.019f, 2.561f, -0.132f)
                curveToRelative(3.989f, -3.221f, 7.14f, -8.037f, 9.577f, -12.771f)
                curveToRelative(-0.193f, -0.981f, -0.356f, -1.687f, -0.356f, -1.687f)
                close()
            }
        }
        .build()
        return _spinnaker!!
    }

private var _spinnaker: ImageVector? = null
