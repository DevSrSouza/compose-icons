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

public val RemixIcons.CoinLine: ImageVector
    get() {
        if (_coinLine != null) {
            return _coinLine!!
        }
        _coinLine = Builder(name = "CoinLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 2.686f, 11.0f, 6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.314f, -4.925f, 6.0f, -11.0f, 6.0f)
                curveToRelative(-5.967f, 0.0f, -10.824f, -2.591f, -10.995f, -5.823f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.314f, 4.925f, -6.0f, 11.0f, -6.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-3.72f, 0.0f, -7.01f, -1.007f, -9.0f, -2.55f)
                lineTo(3.0f, 14.0f)
                curveToRelative(0.0f, 1.882f, 3.883f, 4.0f, 9.0f, 4.0f)
                curveToRelative(5.01f, 0.0f, 8.838f, -2.03f, 8.995f, -3.882f)
                lineTo(21.0f, 14.0f)
                lineToRelative(0.001f, -0.55f)
                curveTo(19.011f, 14.992f, 15.721f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-5.117f, 0.0f, -9.0f, 2.118f, -9.0f, 4.0f)
                curveToRelative(0.0f, 1.882f, 3.883f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveToRelative(9.0f, -2.118f, 9.0f, -4.0f)
                curveToRelative(0.0f, -1.882f, -3.883f, -4.0f, -9.0f, -4.0f)
                close()
            }
        }
        .build()
        return _coinLine!!
    }

private var _coinLine: ImageVector? = null
