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

public val RemixIcons.GobletLine: ImageVector
    get() {
        if (_gobletLine != null) {
            return _gobletLine!!
        }
        _gobletLine = Builder(name = "GobletLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                verticalLineToRelative(-5.111f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-8.0f, 8.889f)
                lineTo(13.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.49f, 7.0f)
                horizontalLineToRelative(9.02f)
                lineToRelative(1.8f, -2.0f)
                lineTo(5.69f, 5.0f)
                lineToRelative(1.8f, 2.0f)
                close()
                moveTo(9.29f, 9.0f)
                lineTo(12.0f, 12.01f)
                lineTo(14.71f, 9.0f)
                lineTo(9.29f, 9.0f)
                close()
            }
        }
        .build()
        return _gobletLine!!
    }

private var _gobletLine: ImageVector? = null
