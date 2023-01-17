package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.8f, 304.8f)
                lineTo(1.0f, 35.7f)
                curveToRelative(-0.7f, -2.5f, -1.0f, -5.0f, -1.0f, -7.5f)
                curveTo(0.0f, 12.6f, 12.6f, 0.0f, 28.2f, 0.0f)
                horizontalLineTo(482.4f)
                curveTo(498.8f, 0.0f, 512.0f, 13.2f, 512.0f, 29.6f)
                curveToRelative(0.0f, 1.6f, -0.1f, 3.3f, -0.4f, 4.9f)
                lineTo(434.6f, 496.1f)
                curveToRelative(-1.5f, 9.2f, -9.5f, 15.9f, -18.8f, 15.9f)
                curveToRelative(-9.2f, 0.0f, -17.1f, -6.6f, -18.7f, -15.6f)
                lineTo(336.0f, 160.0f)
                lineTo(307.2f, 303.9f)
                curveToRelative(-1.9f, 9.3f, -10.1f, 16.1f, -19.6f, 16.1f)
                curveToRelative(-9.2f, 0.0f, -17.2f, -6.2f, -19.4f, -15.1f)
                lineTo(240.0f, 192.0f)
                lineTo(210.6f, 368.2f)
                curveToRelative(-1.5f, 9.1f, -9.4f, 15.8f, -18.6f, 15.8f)
                reflectiveCurveToRelative(-17.1f, -6.7f, -18.6f, -15.8f)
                lineTo(144.0f, 192.0f)
                lineTo(115.9f, 304.3f)
                curveToRelative(-2.3f, 9.2f, -10.6f, 15.7f, -20.1f, 15.7f)
                curveToRelative(-9.3f, 0.0f, -17.5f, -6.2f, -20.0f, -15.2f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
