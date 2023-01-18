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

public val RemixIcons.Building2Fill: ImageVector
    get() {
        if (_building2Fill != null) {
            return _building2Fill!!
        }
        _building2Fill = Builder(name = "Building2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                lineToRelative(6.394f, 2.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.606f, 0.92f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.594f, -0.914f)
                lineToRelative(7.703f, -3.424f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 1.77f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _building2Fill!!
    }

private var _building2Fill: ImageVector? = null
