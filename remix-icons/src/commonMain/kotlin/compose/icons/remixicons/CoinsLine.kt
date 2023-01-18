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

public val RemixIcons.CoinsLine: ImageVector
    get() {
        if (_coinsLine != null) {
            return _coinsLine!!
        }
        _coinsLine = Builder(name = "CoinsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.292f, 15.293f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 6.706f, 6.707f)
                arcTo(8.003f, 8.003f, 0.0f, false, true, 14.0f, 2.0f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(11.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.09f, 0.992f)
                lineTo(9.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.09f, -0.992f)
                lineTo(11.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                lineTo(9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(5.985f, 5.985f, 0.0f, false, false, -4.484f, 2.013f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.47f, 8.471f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _coinsLine!!
    }

private var _coinsLine: ImageVector? = null
