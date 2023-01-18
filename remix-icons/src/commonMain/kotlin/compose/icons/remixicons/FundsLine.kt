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

public val RemixIcons.FundsLine: ImageVector
    get() {
        if (_fundsLine != null) {
            return _fundsLine!!
        }
        _fundsLine = Builder(name = "FundsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.406f, 14.523f)
                lineToRelative(3.402f, -3.402f)
                lineToRelative(2.828f, 2.829f)
                lineToRelative(3.157f, -3.157f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-4.571f, 4.571f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(-2.475f, 2.474f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -0.927f, -1.9f)
                close()
                moveTo(2.868f, 16.081f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(0.004f, -0.004f)
                arcTo(9.965f, 9.965f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-4.07f, 0.0f, -7.57f, -2.43f, -9.132f, -5.919f)
                close()
            }
        }
        .build()
        return _fundsLine!!
    }

private var _fundsLine: ImageVector? = null
