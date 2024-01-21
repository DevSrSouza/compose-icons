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

public val SimpleIcons.Wondershare: ImageVector
    get() {
        if (_wondershare != null) {
            return _wondershare!!
        }
        _wondershare = Builder(name = "Wondershare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.216f, 17.814f)
                lineTo(7.704f, 9.368f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.391f, 0.239f, 0.91f, 0.19f, 1.249f, -0.147f)
                lineToRelative(3.041f, -3.016f)
                lineToRelative(7.241f, 7.184f)
                curveToRelative(0.397f, 0.394f, 0.402f, 1.029f, 0.005f, 1.426f)
                lineToRelative(-3.044f, 3.019f)
                close()
                moveTo(10.963f, 14.797f)
                lineTo(7.933f, 17.814f)
                lineTo(0.0f, 9.915f)
                lineToRelative(3.746f, -3.73f)
                lineToRelative(7.217f, 7.187f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, true, 0.0f, 1.425f)
                close()
                moveTo(24.0f, 9.913f)
                lineToRelative(-3.725f, 3.727f)
                lineTo(16.0f, 9.367f)
                lineToRelative(0.02f, -0.021f)
                curveToRelative(0.388f, 0.239f, 0.903f, 0.19f, 1.239f, -0.146f)
                lineToRelative(3.014f, -3.015f)
                lineTo(24.0f, 9.913f)
                close()
            }
        }
        .build()
        return _wondershare!!
    }

private var _wondershare: ImageVector? = null
