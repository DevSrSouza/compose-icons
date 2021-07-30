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

public val SimpleIcons.Daserste: ImageVector
    get() {
        if (_daserste != null) {
            return _daserste!!
        }
        _daserste = Builder(name = "Daserste", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.646f, 0.005f)
                curveTo(5.158f, 0.2f, -0.001f, 5.57f, 0.0f, 12.127f)
                curveTo(0.135f, 18.724f, 5.468f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(11.865f, -5.276f, 12.0f, -11.873f)
                curveTo(24.001f, 5.291f, 18.41f, -0.195f, 11.645f, 0.005f)
                close()
                moveTo(16.784f, 4.935f)
                lineTo(16.784f, 16.96f)
                lineTo(8.78f, 19.92f)
                verticalLineToRelative(-9.08f)
                lineToRelative(-3.9f, 1.386f)
                lineTo(4.88f, 9.263f)
                lineToRelative(11.903f, -4.328f)
                close()
            }
        }
        .build()
        return _daserste!!
    }

private var _daserste: ImageVector? = null
