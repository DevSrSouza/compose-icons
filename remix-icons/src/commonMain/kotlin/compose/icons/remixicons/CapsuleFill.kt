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

public val RemixIcons.CapsuleFill: ImageVector
    get() {
        if (_capsuleFill != null) {
            return _capsuleFill!!
        }
        _capsuleFill = Builder(name = "CapsuleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.778f, 4.222f)
                curveToRelative(2.343f, 2.343f, 2.343f, 6.142f, 0.0f, 8.485f)
                lineToRelative(-2.122f, 2.12f)
                lineToRelative(-4.949f, 4.951f)
                curveToRelative(-2.343f, 2.343f, -6.142f, 2.343f, -8.485f, 0.0f)
                curveToRelative(-2.343f, -2.343f, -2.343f, -6.142f, 0.0f, -8.485f)
                lineToRelative(7.07f, -7.071f)
                curveToRelative(2.344f, -2.343f, 6.143f, -2.343f, 8.486f, 0.0f)
                close()
                moveTo(14.828f, 14.828f)
                lineTo(9.172f, 9.172f)
                lineToRelative(-3.536f, 3.535f)
                curveToRelative(-1.562f, 1.562f, -1.562f, 4.095f, 0.0f, 5.657f)
                curveToRelative(1.562f, 1.562f, 4.095f, 1.562f, 5.657f, 0.0f)
                lineToRelative(3.535f, -3.536f)
                close()
            }
        }
        .build()
        return _capsuleFill!!
    }

private var _capsuleFill: ImageVector? = null
