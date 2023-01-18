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

public val RemixIcons.ShirtLine: ImageVector
    get() {
        if (_shirtLine != null) {
            return _shirtLine!!
        }
        _shirtLine = Builder(name = "ShirtLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(-4.0f, -1.6f)
                lineTo(13.0f, 20.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(11.0f, 9.4f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineToRelative(3.5f, -3.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _shirtLine!!
    }

private var _shirtLine: ImageVector? = null
