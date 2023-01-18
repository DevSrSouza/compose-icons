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

public val RemixIcons.EmpathizeFill: ImageVector
    get() {
        if (_empathizeFill != null) {
            return _empathizeFill!!
        }
        _empathizeFill = Builder(name = "EmpathizeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 10.98f)
                curveToRelative(1.562f, 1.561f, 1.562f, 4.094f, 0.0f, 5.656f)
                lineToRelative(-5.657f, 5.657f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                lineToRelative(-5.657f, -5.657f)
                curveToRelative(-1.562f, -1.562f, -1.562f, -4.095f, 0.0f, -5.657f)
                curveToRelative(1.562f, -1.562f, 4.095f, -1.562f, 5.657f, 0.0f)
                lineToRelative(0.706f, 0.707f)
                lineToRelative(0.708f, -0.707f)
                curveToRelative(1.562f, -1.562f, 4.095f, -1.562f, 5.657f, 0.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _empathizeFill!!
    }

private var _empathizeFill: ImageVector? = null
