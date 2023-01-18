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

public val RemixIcons.Filter2Line: ImageVector
    get() {
        if (_filter2Line != null) {
            return _filter2Line!!
        }
        _filter2Line = Builder(name = "Filter2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-4.0f, 2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(4.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-6.0f, 9.0f)
                close()
                moveTo(6.404f, 5.0f)
                lineTo(12.0f, 13.394f)
                lineTo(17.596f, 5.0f)
                horizontalLineTo(6.404f)
                close()
            }
        }
        .build()
        return _filter2Line!!
    }

private var _filter2Line: ImageVector? = null
