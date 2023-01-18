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

public val RemixIcons.DislikeFill: ImageVector
    get() {
        if (_dislikeFill != null) {
            return _dislikeFill!!
        }
        _dislikeFill = Builder(name = "DislikeFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(20.243f, 4.757f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.236f)
                lineToRelative(-1.635f, 1.636f)
                lineTo(7.26f, 3.046f)
                curveToRelative(1.67f, -0.207f, 3.408f, 0.288f, 4.741f, 1.483f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _dislikeFill!!
    }

private var _dislikeFill: ImageVector? = null
