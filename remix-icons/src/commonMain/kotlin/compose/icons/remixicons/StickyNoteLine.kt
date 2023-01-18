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

public val RemixIcons.StickyNoteLine: ImageVector
    get() {
        if (_stickyNoteLine != null) {
            return _stickyNoteLine!!
        }
        _stickyNoteLine = Builder(name = "StickyNoteLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                lineToRelative(-6.0f, 5.996f)
                lineTo(4.002f, 21.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 3.0f, 20.007f)
                lineTo(3.0f, 3.993f)
                curveTo(3.0f, 3.445f, 3.445f, 3.0f, 3.993f, 3.0f)
                horizontalLineToRelative(16.014f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.456f, 0.993f, 1.002f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, -0.993f)
                lineTo(14.0f, 13.0f)
                lineToRelative(5.0f, -0.001f)
                lineTo(19.0f, 5.0f)
                close()
                moveTo(18.171f, 14.999f)
                lineTo(15.0f, 15.0f)
                verticalLineToRelative(3.169f)
                lineToRelative(3.171f, -3.17f)
                close()
            }
        }
        .build()
        return _stickyNoteLine!!
    }

private var _stickyNoteLine: ImageVector? = null
