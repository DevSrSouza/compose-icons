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

public val RemixIcons.Heart2Fill: ImageVector
    get() {
        if (_heart2Fill != null) {
            return _heart2Fill!!
        }
        _heart2Fill = Builder(name = "Heart2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.243f, 4.757f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.236f)
                lineToRelative(-8.48f, 8.492f)
                lineToRelative(-8.478f, -8.492f)
                curveToRelative(-2.104f, -2.356f, -2.025f, -5.974f, 0.236f, -8.236f)
                curveTo(5.515f, 3.0f, 8.093f, 2.56f, 10.261f, 3.44f)
                lineTo(6.343f, 7.358f)
                lineToRelative(1.414f, 1.415f)
                lineTo(12.0f, 4.53f)
                lineToRelative(-0.013f, -0.014f)
                lineToRelative(0.014f, 0.013f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _heart2Fill!!
    }

private var _heart2Fill: ImageVector? = null
