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

public val RemixIcons.CopyleftLine: ImageVector
    get() {
        if (_copyleftLine != null) {
            return _copyleftLine!!
        }
        _copyleftLine = Builder(name = "CopyleftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.48f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.82f, 0.0f, -3.413f, -0.973f, -4.288f, -2.428f)
                lineToRelative(1.714f, -1.029f)
                curveTo(9.951f, 14.416f, 10.907f, 15.0f, 12.0f, 15.0f)
                curveToRelative(1.658f, 0.0f, 3.0f, -1.342f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.342f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.093f, 0.0f, -2.048f, 0.583f, -2.573f, 1.456f)
                lineTo(7.712f, 9.428f)
                curveTo(8.587f, 7.973f, 10.18f, 7.0f, 12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _copyleftLine!!
    }

private var _copyleftLine: ImageVector? = null
