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

public val RemixIcons.WindowsFill: ImageVector
    get() {
        if (_windowsFill != null) {
            return _windowsFill!!
        }
        _windowsFill = Builder(name = "WindowsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.479f)
                lineToRelative(7.377f, -1.016f)
                verticalLineToRelative(7.127f)
                lineTo(3.0f, 11.59f)
                lineTo(3.0f, 5.48f)
                close()
                moveTo(3.0f, 18.521f)
                lineToRelative(7.377f, 1.017f)
                verticalLineToRelative(-7.04f)
                lineTo(3.0f, 12.498f)
                verticalLineToRelative(6.023f)
                close()
                moveTo(11.188f, 19.646f)
                lineTo(21.0f, 21.0f)
                verticalLineToRelative(-8.502f)
                horizontalLineToRelative(-9.812f)
                verticalLineToRelative(7.148f)
                close()
                moveTo(11.188f, 4.354f)
                verticalLineToRelative(7.236f)
                lineTo(21.0f, 11.59f)
                lineTo(21.0f, 3.0f)
                lineToRelative(-9.812f, 1.354f)
                close()
            }
        }
        .build()
        return _windowsFill!!
    }

private var _windowsFill: ImageVector? = null
