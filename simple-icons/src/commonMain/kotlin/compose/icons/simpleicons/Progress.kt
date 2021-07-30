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

public val SimpleIcons.Progress: ImageVector
    get() {
        if (_progress != null) {
            return _progress!!
        }
        _progress = Builder(name = "Progress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.235f, 6.825f)
                verticalLineToRelative(11.997f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -0.419f, 0.725f)
                lineToRelative(-0.393f, 0.235f)
                curveToRelative(-1.961f, 1.135f, -3.687f, 2.134f, -5.431f, 3.14f)
                lineTo(16.992f, 9.948f)
                lineTo(5.759f, 3.454f)
                curveTo(7.703f, 2.338f, 9.64f, 1.211f, 11.586f, 0.1f)
                arcToRelative(0.927f, 0.927f, 0.0f, false, true, 0.837f, 0.0f)
                lineToRelative(10.81f, 6.243f)
                verticalLineToRelative(0.482f)
                close()
                moveTo(14.494f, 11.387f)
                arcTo(9631.706f, 9631.706f, 0.0f, false, false, 6.8f, 6.943f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, -0.837f, 0.0f)
                curveToRelative(-1.733f, 1.001f, -3.467f, 2.0f, -5.199f, 3.004f)
                lineToRelative(8.113f, 4.684f)
                lineTo(8.877f, 24.0f)
                curveToRelative(1.732f, -0.999f, 3.46f, -2.006f, 5.197f, -2.995f)
                arcToRelative(0.927f, 0.927f, 0.0f, false, false, 0.419f, -0.724f)
                close()
                moveTo(0.765f, 19.317f)
                lineToRelative(5.613f, 3.241f)
                lineTo(6.378f, 16.07f)
                close()
            }
        }
        .build()
        return _progress!!
    }

private var _progress: ImageVector? = null
