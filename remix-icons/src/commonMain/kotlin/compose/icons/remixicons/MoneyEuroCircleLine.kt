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

public val RemixIcons.MoneyEuroCircleLine: ImageVector
    get() {
        if (_moneyEuroCircleLine != null) {
            return _moneyEuroCircleLine!!
        }
        _moneyEuroCircleLine = Builder(name = "MoneyEuroCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(10.05f, 11.0f)
                lineTo(15.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.064f, 1.41f)
                lineToRelative(1.7f, 1.133f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 8.028f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 7.788f, -2.543f)
                lineTo(14.114f, 9.59f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.05f, 11.0f)
                close()
            }
        }
        .build()
        return _moneyEuroCircleLine!!
    }

private var _moneyEuroCircleLine: ImageVector? = null
