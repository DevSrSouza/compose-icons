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

public val RemixIcons.Scales3Line: ImageVector
    get() {
        if (_scales3Line != null) {
            return _scales3Line!!
        }
        _scales3Line = Builder(name = "Scales3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(1.278f)
                lineToRelative(5.0f, 1.668f)
                lineToRelative(3.632f, -1.21f)
                lineToRelative(0.633f, 1.896f)
                lineToRelative(-3.032f, 1.011f)
                lineToRelative(3.096f, 8.512f)
                curveTo(21.237f, 16.292f, 19.7f, 17.0f, 18.0f, 17.0f)
                curveToRelative(-1.701f, 0.0f, -3.237f, -0.708f, -4.329f, -1.845f)
                lineToRelative(3.094f, -8.512f)
                lineTo(13.0f, 5.387f)
                lineTo(13.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 5.387f)
                lineTo(7.232f, 6.643f)
                lineToRelative(3.096f, 8.512f)
                curveTo(9.237f, 16.292f, 7.7f, 17.0f, 6.0f, 17.0f)
                curveToRelative(-1.701f, 0.0f, -3.237f, -0.708f, -4.329f, -1.845f)
                lineToRelative(3.094f, -8.512f)
                lineToRelative(-3.03f, -1.01f)
                lineToRelative(0.633f, -1.898f)
                lineTo(6.0f, 4.945f)
                lineToRelative(5.0f, -1.667f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 9.103f)
                lineToRelative(-1.958f, 5.386f)
                curveToRelative(0.587f, 0.331f, 1.257f, 0.511f, 1.958f, 0.511f)
                curveToRelative(0.7f, 0.0f, 1.37f, -0.18f, 1.958f, -0.51f)
                lineTo(18.0f, 9.102f)
                close()
                moveTo(6.0f, 9.103f)
                lineToRelative(-1.958f, 5.386f)
                curveTo(4.629f, 14.82f, 5.299f, 15.0f, 6.0f, 15.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, -0.18f, 1.958f, -0.51f)
                lineTo(6.0f, 9.102f)
                close()
            }
        }
        .build()
        return _scales3Line!!
    }

private var _scales3Line: ImageVector? = null
