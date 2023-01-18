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

public val RemixIcons.Refund2Line: ImageVector
    get() {
        if (_refund2Line != null) {
            return _refund2Line!!
        }
        _refund2Line = Builder(name = "Refund2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.671f, 4.257f)
                curveToRelative(3.928f, -3.219f, 9.733f, -2.995f, 13.4f, 0.672f)
                curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0.0f, 14.142f)
                curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0.0f)
                arcTo(9.993f, 9.993f, 0.0f, false, true, 2.25f, 9.767f)
                lineToRelative(0.077f, -0.313f)
                lineToRelative(1.934f, 0.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 3.053f, -4.45f)
                lineToRelative(-0.221f, 0.166f)
                lineToRelative(1.017f, 1.017f)
                lineToRelative(-4.596f, 1.06f)
                lineToRelative(1.06f, -4.596f)
                lineToRelative(1.096f, 1.096f)
                close()
                moveTo(13.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.09f, 0.992f)
                lineTo(10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.09f, -0.992f)
                lineTo(14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _refund2Line!!
    }

private var _refund2Line: ImageVector? = null
