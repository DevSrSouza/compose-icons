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

public val SimpleIcons.Opel: ImageVector
    get() {
        if (_opel != null) {
            return _opel!!
        }
        _opel = Builder(name = "Opel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.791f, 12.892f)
                curveToRelative(-0.124f, -0.008f, -2.515f, -0.16f, -2.529f, -0.162f)
                curveToRelative(0.021f, -0.257f, 0.033f, -0.514f, 0.033f, -0.771f)
                curveToRelative(-0.034f, -5.149f, -4.235f, -9.297f, -9.385f, -9.263f)
                curveToRelative(-4.306f, 0.028f, -8.033f, 3.001f, -9.016f, 7.194f)
                lineTo(0.837f, 9.89f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, -0.285f, 0.139f)
                lineToRelative(-0.514f, 0.73f)
                curveToRelative(-0.094f, 0.113f, -0.004f, 0.297f, 0.144f, 0.29f)
                curveToRelative(0.144f, 0.009f, 2.485f, 0.153f, 2.529f, 0.157f)
                arcToRelative(9.448f, 9.448f, 0.0f, false, false, -0.033f, 0.771f)
                curveToRelative(-0.001f, 5.15f, 4.173f, 9.326f, 9.323f, 9.327f)
                curveToRelative(4.349f, 0.001f, 8.121f, -3.005f, 9.092f, -7.245f)
                horizontalLineToRelative(2.056f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, false, 0.285f, -0.141f)
                lineToRelative(0.529f, -0.727f)
                curveToRelative(0.097f, -0.126f, -0.01f, -0.329f, -0.172f, -0.299f)
                close()
                moveTo(11.968f, 3.725f)
                curveToRelative(4.552f, 0.004f, 8.241f, 3.693f, 8.247f, 8.245f)
                curveToRelative(0.0f, 0.234f, -0.013f, 0.465f, -0.031f, 0.694f)
                lineToRelative(-6.893f, -0.437f)
                lineToRelative(2.992f, -2.056f)
                curveToRelative(0.124f, -0.079f, 0.061f, -0.288f, -0.087f, -0.283f)
                lineTo(3.991f, 9.888f)
                curveToRelative(0.951f, -3.628f, 4.227f, -6.159f, 7.977f, -6.163f)
                close()
                moveTo(11.968f, 20.217f)
                curveToRelative(-4.552f, -0.006f, -8.24f, -3.695f, -8.245f, -8.247f)
                curveToRelative(0.0f, -0.234f, 0.0f, -0.465f, 0.031f, -0.694f)
                lineToRelative(6.895f, 0.429f)
                lineToRelative(-2.986f, 2.056f)
                curveToRelative(-0.124f, 0.082f, -0.06f, 0.29f, 0.09f, 0.285f)
                horizontalLineToRelative(12.195f)
                curveToRelative(-0.949f, 3.631f, -4.227f, 6.166f, -7.98f, 6.171f)
                close()
            }
        }
        .build()
        return _opel!!
    }

private var _opel: ImageVector? = null
