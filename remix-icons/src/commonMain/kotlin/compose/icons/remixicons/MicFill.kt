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

public val RemixIcons.MicFill: ImageVector
    get() {
        if (_micFill != null) {
            return _micFill!!
        }
        _micFill = Builder(name = "MicFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                verticalLineTo(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(3.055f, 11.0f)
                horizontalLineTo(5.07f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 13.858f, 0.0f)
                horizontalLineToRelative(2.016f)
                arcTo(9.004f, 9.004f, 0.0f, false, true, 13.0f, 18.945f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.055f)
                arcTo(9.004f, 9.004f, 0.0f, false, true, 3.055f, 11.0f)
                close()
            }
        }
        .build()
        return _micFill!!
    }

private var _micFill: ImageVector? = null
