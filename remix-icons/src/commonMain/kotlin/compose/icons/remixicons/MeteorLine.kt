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

public val RemixIcons.MeteorLine: ImageVector
    get() {
        if (_meteorLine != null) {
            return _meteorLine!!
        }
        _meteorLine = Builder(name = "MeteorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 7.375f, 5.278f)
                lineTo(14.0f, 1.453f)
                verticalLineToRelative(2.77f)
                lineTo(21.0f, 1.0f)
                close()
                moveTo(19.0f, 4.122f)
                lineToRelative(-7.0f, 3.224f)
                verticalLineToRelative(-2.43f)
                lineTo(8.597f, 6.881f)
                arcToRelative(6.997f, 6.997f, 0.0f, false, false, -3.592f, 5.845f)
                lineTo(5.0f, 13.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 13.996f, 0.24f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 4.122f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _meteorLine!!
    }

private var _meteorLine: ImageVector? = null
