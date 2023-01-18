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

public val RemixIcons.QqFill: ImageVector
    get() {
        if (_qqFill != null) {
            return _qqFill!!
        }
        _qqFill = Builder(name = "QqFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.913f, 14.529f)
                arcToRelative(31.977f, 31.977f, 0.0f, false, false, -0.675f, -1.886f)
                lineToRelative(-0.91f, -2.246f)
                curveToRelative(0.0f, -0.026f, 0.012f, -0.468f, 0.012f, -0.696f)
                curveTo(18.34f, 5.86f, 16.507f, 2.0f, 12.0f, 2.0f)
                curveTo(7.493f, 2.0f, 5.66f, 5.86f, 5.66f, 9.7f)
                curveToRelative(0.0f, 0.229f, 0.011f, 0.671f, 0.012f, 0.697f)
                lineToRelative(-0.91f, 2.246f)
                curveToRelative(-0.248f, 0.643f, -0.495f, 1.312f, -0.675f, 1.886f)
                curveToRelative(-0.86f, 2.737f, -0.581f, 3.87f, -0.369f, 3.895f)
                curveToRelative(0.455f, 0.054f, 1.771f, -2.06f, 1.771f, -2.06f)
                curveToRelative(0.0f, 1.224f, 0.637f, 2.822f, 2.016f, 3.976f)
                curveToRelative(-0.515f, 0.157f, -1.147f, 0.399f, -1.554f, 0.695f)
                curveToRelative(-0.365f, 0.267f, -0.319f, 0.54f, -0.253f, 0.65f)
                curveToRelative(0.289f, 0.481f, 4.955f, 0.307f, 6.303f, 0.157f)
                curveToRelative(1.347f, 0.15f, 6.014f, 0.324f, 6.302f, -0.158f)
                curveToRelative(0.066f, -0.11f, 0.112f, -0.382f, -0.253f, -0.649f)
                curveToRelative(-0.407f, -0.296f, -1.039f, -0.538f, -1.555f, -0.696f)
                curveToRelative(1.379f, -1.153f, 2.016f, -2.751f, 2.016f, -3.976f)
                curveToRelative(0.0f, 0.0f, 1.316f, 2.115f, 1.771f, 2.06f)
                curveToRelative(0.212f, -0.025f, 0.49f, -1.157f, -0.37f, -3.894f)
            }
        }
        .build()
        return _qqFill!!
    }

private var _qqFill: ImageVector? = null
