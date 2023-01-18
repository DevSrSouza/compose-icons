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

public val RemixIcons.H4: ImageVector
    get() {
        if (_h4 != null) {
            return _h4!!
        }
        _h4 = Builder(name = "H4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                lineTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-1.34f)
                lineToRelative(5.0f, -8.66f)
                lineTo(22.0f, 8.0f)
                close()
                moveTo(20.0f, 11.133f)
                lineTo(17.19f, 16.0f)
                lineTo(20.0f, 16.0f)
                verticalLineToRelative(-4.867f)
                close()
            }
        }
        .build()
        return _h4!!
    }

private var _h4: ImageVector? = null
