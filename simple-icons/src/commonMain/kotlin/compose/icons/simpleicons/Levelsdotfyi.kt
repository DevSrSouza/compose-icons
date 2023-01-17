package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Levelsdotfyi: ImageVector
    get() {
        if (_levelsdotfyi != null) {
            return _levelsdotfyi!!
        }
        _levelsdotfyi = Builder(name = "Levelsdotfyi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.494f, 18.913f)
                horizontalLineToRelative(3.52f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0.0f, -0.43f, 0.35f, -0.78f, 0.781f, -0.78f)
                horizontalLineToRelative(3.52f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0.0f, -0.432f, 0.35f, -0.783f, 0.781f, -0.783f)
                horizontalLineToRelative(3.52f)
                verticalLineTo(6.791f)
                curveToRelative(0.0f, -0.432f, 0.35f, -0.782f, 0.782f, -0.782f)
                horizontalLineToRelative(3.519f)
                verticalLineTo(2.49f)
                curveToRelative(0.0f, -0.432f, 0.35f, -0.782f, 0.782f, -0.782f)
                horizontalLineToRelative(3.52f)
                curveToRelative(0.43f, 0.0f, 0.781f, 0.35f, 0.781f, 0.782f)
                verticalLineToRelative(20.724f)
                curveToRelative(0.0f, 0.432f, -0.35f, 0.782f, -0.782f, 0.782f)
                horizontalLineTo(2.494f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.782f, -0.782f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0.0f, -0.43f, 0.35f, -0.78f, 0.782f, -0.78f)
                close()
                moveTo(0.172f, 15.928f)
                arcToRelative(0.587f, 0.587f, 0.0f, false, true, 0.0f, -0.83f)
                lineTo(15.102f, 0.168f)
                arcToRelative(0.587f, 0.587f, 0.0f, false, true, 0.83f, 0.83f)
                lineToRelative(-14.93f, 14.93f)
                curveToRelative(-0.23f, 0.23f, -0.6f, 0.23f, -0.83f, 0.0f)
                close()
            }
        }
        .build()
        return _levelsdotfyi!!
    }

private var _levelsdotfyi: ImageVector? = null
