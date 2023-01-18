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

public val RemixIcons.ShuffleFill: ImageVector
    get() {
        if (_shuffleFill != null) {
            return _shuffleFill!!
        }
        _shuffleFill = Builder(name = "ShuffleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.883f)
                verticalLineTo(16.0f)
                lineToRelative(5.0f, 3.0f)
                lineToRelative(-5.0f, 3.0f)
                verticalLineToRelative(-2.09f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -6.997f, -5.365f)
                lineTo(11.0f, 14.54f)
                lineToRelative(-0.003f, 0.006f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 2.725f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.725f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 6.434f, -4.243f)
                lineTo(9.912f, 12.0f)
                lineToRelative(-0.753f, -1.757f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 2.725f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(0.725f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 8.272f, 5.455f)
                lineTo(11.0f, 9.46f)
                lineToRelative(0.003f, -0.006f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 18.0f, 4.09f)
                verticalLineTo(2.0f)
                lineToRelative(5.0f, 3.0f)
                lineToRelative(-5.0f, 3.0f)
                verticalLineTo(6.117f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.159f, 4.126f)
                lineTo(12.088f, 12.0f)
                lineToRelative(0.753f, 1.757f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 18.0f, 17.883f)
                close()
            }
        }
        .build()
        return _shuffleFill!!
    }

private var _shuffleFill: ImageVector? = null
