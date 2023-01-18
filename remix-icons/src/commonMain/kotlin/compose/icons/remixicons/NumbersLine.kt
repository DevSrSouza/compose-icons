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

public val RemixIcons.NumbersLine: ImageVector
    get() {
        if (_numbersLine != null) {
            return _numbersLine!!
        }
        _numbersLine = Builder(name = "NumbersLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 16.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(19.0f, 16.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _numbersLine!!
    }

private var _numbersLine: ImageVector? = null
