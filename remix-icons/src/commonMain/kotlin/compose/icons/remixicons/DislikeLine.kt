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

public val RemixIcons.DislikeLine: ImageVector
    get() {
        if (_dislikeLine != null) {
            return _dislikeLine!!
        }
        _dislikeLine = Builder(name = "DislikeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.808f, 1.393f)
                lineToRelative(18.384f, 18.385f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.747f, -3.747f)
                lineTo(12.0f, 21.485f)
                lineTo(3.52f, 12.993f)
                curveToRelative(-2.04f, -2.284f, -2.028f, -5.753f, 0.034f, -8.023f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                close()
                moveTo(4.98f, 11.623f)
                lineTo(12.0f, 18.654f)
                lineToRelative(2.617f, -2.623f)
                lineToRelative(-9.645f, -9.645f)
                curveToRelative(-1.294f, 1.497f, -1.3f, 3.735f, 0.008f, 5.237f)
                close()
                moveTo(20.243f, 4.757f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.236f)
                lineToRelative(-1.635f, 1.636f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.59f, -1.592f)
                curveToRelative(1.374f, -1.576f, 1.299f, -3.958f, -0.193f, -5.453f)
                curveToRelative(-1.5f, -1.502f, -3.92f, -1.563f, -5.49f, -0.153f)
                lineToRelative(-1.335f, 1.198f)
                lineToRelative(-1.336f, -1.197f)
                curveToRelative(-0.35f, -0.314f, -0.741f, -0.555f, -1.155f, -0.723f)
                lineToRelative(-2.25f, -2.25f)
                curveToRelative(1.668f, -0.206f, 3.407f, 0.289f, 4.74f, 1.484f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _dislikeLine!!
    }

private var _dislikeLine: ImageVector? = null
