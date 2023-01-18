package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PingPongFill: ImageVector
    get() {
        if (_pingPongFill != null) {
            return _pingPongFill!!
        }
        _pingPongFill = Builder(name = "PingPongFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 9.5f, 9.5f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, -1.003f, 4.254f)
                lineToRelative(2.463f, 2.464f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-2.828f, 2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-2.464f, -2.463f)
                arcTo(9.46f, 9.46f, 0.0f, false, true, 11.5f, 21.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 0.0f, -19.0f)
                close()
                moveTo(16.803f, 15.388f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.536f, 3.535f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-3.536f, -3.535f)
                close()
                moveTo(18.667f, 9.283f)
                lineToRelative(-9.384f, 9.384f)
                curveToRelative(0.7f, 0.216f, 1.445f, 0.333f, 2.217f, 0.333f)
                arcToRelative(7.48f, 7.48f, 0.0f, false, false, 2.74f, -0.516f)
                lineToRelative(-0.972f, -0.974f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(2.828f, -2.828f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(0.974f, 0.972f)
                arcTo(7.48f, 7.48f, 0.0f, false, false, 19.0f, 11.5f)
                curveToRelative(0.0f, -0.772f, -0.117f, -1.516f, -0.333f, -2.217f)
                close()
            }
        }
        .build()
        return _pingPongFill!!
    }

private var _pingPongFill: ImageVector? = null
