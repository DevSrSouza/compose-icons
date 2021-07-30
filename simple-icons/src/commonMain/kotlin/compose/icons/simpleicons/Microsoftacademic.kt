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

public val SimpleIcons.Microsoftacademic: ImageVector
    get() {
        if (_microsoftacademic != null) {
            return _microsoftacademic!!
        }
        _microsoftacademic = Builder(name = "Microsoftacademic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.056f, 23.992f)
                curveToRelative(-4.018f, -2.966f, -10.695f, -8.022f, -19.0f, -9.125f)
                lineToRelative(3.55f, -3.472f)
                curveToRelative(10.19f, 3.935f, 15.45f, 12.597f, 15.45f, 12.597f)
                close()
                moveTo(0.48f, 18.437f)
                lineToRelative(2.77f, -2.217f)
                curveTo(11.334f, 18.208f, 18.19f, 24.0f, 18.19f, 24.0f)
                curveTo(15.303f, 22.37f, 7.113f, 18.36f, 0.48f, 18.437f)
                close()
                moveTo(3.023f, 10.395f)
                lineToRelative(9.25f, -8.23f)
                lineToRelative(1.992f, 1.153f)
                lineTo(9.78f, 8.41f)
                curveToRelative(4.83f, 3.983f, 10.19f, 8.22f, 9.71f, 15.127f)
                curveTo(14.734f, 16.799f, 9.127f, 11.98f, 3.024f, 10.395f)
                close()
                moveTo(10.93f, 8.264f)
                lineTo(18.035f, 0.0f)
                curveToRelative(3.791f, 3.1f, 5.91f, 7.913f, 5.91f, 10.513f)
                curveToRelative(-0.309f, 3.322f, -3.558f, 11.35f, -3.858f, 12.236f)
                curveToRelative(-0.225f, -2.007f, 1.434f, -5.56f, -9.157f, -14.485f)
                close()
            }
        }
        .build()
        return _microsoftacademic!!
    }

private var _microsoftacademic: ImageVector? = null
