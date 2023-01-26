package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) {
            return _heartBroken!!
        }
        _heartBroken = Builder(name = "HeartBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.57f, 3.95f)
                curveToRelative(-1.92f, -1.29f, -4.08f, -1.17f, -5.8f, -0.26f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f)
                lineToRelative(-1.82f, 6.07f)
                curveToRelative(-0.09f, 0.29f, -0.52f, 0.2f, -0.49f, -0.1f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(-0.66f, 0.0f, -1.14f, -0.64f, -0.96f, -1.27f)
                lineToRelative(1.18f, -4.11f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveTo(9.7f, 2.89f, 6.71f, 2.32f, 4.27f, 4.04f)
                curveTo(2.82f, 5.07f, 2.0f, 6.7f, 2.0f, 8.49f)
                curveToRelative(-0.01f, 3.81f, 3.53f, 6.71f, 8.66f, 11.3f)
                curveToRelative(0.76f, 0.68f, 1.92f, 0.69f, 2.69f, 0.01f)
                curveToRelative(4.98f, -4.42f, 8.87f, -7.58f, 8.64f, -11.62f)
                curveTo(21.9f, 6.45f, 21.0f, 4.92f, 19.57f, 3.95f)
                close()
            }
        }
        .build()
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
