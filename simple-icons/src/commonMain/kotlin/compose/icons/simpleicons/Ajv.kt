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

public val SimpleIcons.Ajv: ImageVector
    get() {
        if (_ajv != null) {
            return _ajv!!
        }
        _ajv = Builder(name = "Ajv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.705f, 4.718f)
                arcToRelative(980.02f, 980.02f, 0.0f, false, true, 1.211f, 3.19f)
                lineToRelative(2.962f, 7.886f)
                curveToRelative(0.198f, 0.526f, -0.054f, 1.17f, -0.583f, 1.366f)
                curveToRelative(-0.311f, 0.116f, -0.655f, 0.06f, -0.926f, -0.11f)
                lineToRelative(-1.454f, 1.418f)
                curveToRelative(0.81f, 0.775f, 1.985f, 1.034f, 3.116f, 0.614f)
                curveToRelative(1.602f, -0.593f, 2.387f, -2.416f, 1.79f, -4.008f)
                lineTo(10.984f, 4.718f)
                close()
                moveTo(12.858f, 4.731f)
                lineTo(17.428f, 16.451f)
                lineTo(19.352f, 16.459f)
                lineTo(24.0f, 4.783f)
                lineToRelative(-2.404f, -0.011f)
                lineToRelative(-3.193f, 8.832f)
                lineToRelative(-3.141f, -8.861f)
                close()
                moveTo(4.549f, 4.744f)
                lineTo(0.0f, 16.421f)
                lineToRelative(2.354f, 0.01f)
                lineToRelative(1.092f, -2.91f)
                lineToRelative(4.112f, 0.019f)
                lineToRelative(1.08f, 2.92f)
                lineToRelative(2.355f, 0.012f)
                lineTo(6.572f, 4.754f)
                close()
                moveTo(5.548f, 7.336f)
                lineTo(7.15f, 11.94f)
                lineToRelative(-3.316f, -0.016f)
                close()
            }
        }
        .build()
        return _ajv!!
    }

private var _ajv: ImageVector? = null
