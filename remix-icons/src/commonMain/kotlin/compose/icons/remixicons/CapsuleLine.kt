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

public val RemixIcons.CapsuleLine: ImageVector
    get() {
        if (_capsuleLine != null) {
            return _capsuleLine!!
        }
        _capsuleLine = Builder(name = "CapsuleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 4.222f)
                curveToRelative(2.343f, 2.343f, 2.343f, 6.142f, 0.0f, 8.485f)
                lineToRelative(-7.07f, 7.071f)
                curveToRelative(-2.344f, 2.343f, -6.143f, 2.343f, -8.486f, 0.0f)
                curveToRelative(-2.343f, -2.343f, -2.343f, -6.142f, 0.0f, -8.485f)
                lineToRelative(7.07f, -7.071f)
                curveToRelative(2.344f, -2.343f, 6.143f, -2.343f, 8.486f, 0.0f)
                close()
                moveTo(14.122f, 15.535f)
                lineTo(8.465f, 9.878f)
                lineToRelative(-2.829f, 2.83f)
                curveToRelative(-1.562f, 1.561f, -1.562f, 4.094f, 0.0f, 5.656f)
                curveToRelative(1.562f, 1.562f, 4.095f, 1.562f, 5.657f, 0.0f)
                lineToRelative(2.829f, -2.83f)
                close()
                moveTo(18.364f, 5.636f)
                curveToRelative(-1.562f, -1.562f, -4.095f, -1.562f, -5.657f, 0.0f)
                lineTo(9.88f, 8.464f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(2.828f, -2.828f)
                curveToRelative(1.562f, -1.562f, 1.562f, -4.095f, 0.0f, -5.657f)
                close()
            }
        }
        .build()
        return _capsuleLine!!
    }

private var _capsuleLine: ImageVector? = null
