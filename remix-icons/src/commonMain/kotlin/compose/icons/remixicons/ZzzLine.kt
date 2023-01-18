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

public val RemixIcons.ZzzLine: ImageVector
    get() {
        if (_zzzLine != null) {
            return _zzzLine!!
        }
        _zzzLine = Builder(name = "ZzzLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-5.327f, 6.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(5.326f, -6.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-5.327f, 6.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(5.326f, -6.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _zzzLine!!
    }

private var _zzzLine: ImageVector? = null
