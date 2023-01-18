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

public val RemixIcons.MoneyEuroBoxFill: ImageVector
    get() {
        if (_moneyEuroBoxFill != null) {
            return _moneyEuroBoxFill!!
        }
        _moneyEuroBoxFill = Builder(name = "MoneyEuroBoxFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(10.05f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.064f, -1.41f)
                lineToRelative(1.701f, -1.133f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.028f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 7.788f, 2.543f)
                lineToRelative(-1.701f, -1.134f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.05f, 13.0f)
                lineToRelative(4.95f, 0.001f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.95f)
                close()
            }
        }
        .build()
        return _moneyEuroBoxFill!!
    }

private var _moneyEuroBoxFill: ImageVector? = null
