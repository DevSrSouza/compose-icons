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

public val RemixIcons.HonorOfKingsFill: ImageVector
    get() {
        if (_honorOfKingsFill != null) {
            return _honorOfKingsFill!!
        }
        _honorOfKingsFill = Builder(name = "HonorOfKingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.158f, 4.258f)
                curveToRelative(0.034f, 3.5f, 0.591f, 4.811f, 0.788f, 6.701f)
                curveToRelative(0.301f, 2.894f, -0.657f, 5.894f, -2.875f, 8.112f)
                curveToRelative(-3.666f, 3.666f, -9.471f, 3.89f, -13.4f, 0.673f)
                lineToRelative(2.852f, -2.853f)
                curveToRelative(2.344f, 1.67f, 5.617f, 1.454f, 7.72f, -0.648f)
                curveToRelative(2.102f, -2.103f, 2.318f, -5.377f, 0.648f, -7.72f)
                lineToRelative(4.267f, -4.265f)
                close()
                moveTo(18.328f, 4.256f)
                lineToRelative(-2.851f, 2.853f)
                curveToRelative(-2.344f, -1.67f, -5.617f, -1.454f, -7.72f, 0.648f)
                curveToRelative(-2.102f, 2.103f, -2.318f, 5.376f, -0.648f, 7.72f)
                lineToRelative(-4.267f, 4.265f)
                curveToRelative(-0.034f, -3.5f, -0.591f, -4.811f, -0.788f, -6.701f)
                curveToRelative(-0.301f, -2.894f, 0.657f, -5.894f, 2.875f, -8.112f)
                curveToRelative(3.666f, -3.666f, 9.471f, -3.89f, 13.4f, -0.673f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _honorOfKingsFill!!
    }

private var _honorOfKingsFill: ImageVector? = null
