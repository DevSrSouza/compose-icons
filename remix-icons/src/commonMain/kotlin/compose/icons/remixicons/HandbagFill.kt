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

public val RemixIcons.HandbagFill: ImageVector
    get() {
        if (_handbagFill != null) {
            return _handbagFill!!
        }
        _handbagFill = Builder(name = "HandbagFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                horizontalLineToRelative(1.074f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.997f, 0.923f)
                lineToRelative(0.846f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.92f, 1.074f)
                lineTo(20.92f, 22.0f)
                lineTo(3.08f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineToRelative(0.003f, -0.077f)
                lineToRelative(0.846f, -11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.926f, 9.0f)
                lineTo(5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, -7.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.995f, 4.783f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.783f, -4.995f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _handbagFill!!
    }

private var _handbagFill: ImageVector? = null
