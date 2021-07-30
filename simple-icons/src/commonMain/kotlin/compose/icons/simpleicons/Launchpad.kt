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

public val SimpleIcons.Launchpad: ImageVector
    get() {
        if (_launchpad != null) {
            return _launchpad!!
        }
        _launchpad = Builder(name = "Launchpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.999f, 18.676f)
                lineToRelative(-4.432f, -2.556f)
                lineToRelative(-4.783f, 2.764f)
                lineTo(12.784f, 24.0f)
                lineToRelative(9.215f, -5.324f)
                close()
                moveTo(11.216f, 24.0f)
                verticalLineToRelative(-5.119f)
                lineToRelative(-4.785f, -2.762f)
                lineToRelative(-4.43f, 2.557f)
                lineTo(11.216f, 24.0f)
                close()
                moveTo(11.995f, 17.525f)
                lineToRelative(4.789f, -2.765f)
                lineTo(16.784f, 9.236f)
                lineToRelative(-4.785f, -2.76f)
                lineToRelative(-4.783f, 2.76f)
                verticalLineToRelative(5.527f)
                lineToRelative(4.781f, 2.761f)
                lineToRelative(-0.002f, 0.001f)
                close()
                moveTo(1.22f, 6.682f)
                verticalLineToRelative(10.641f)
                lineToRelative(4.432f, -2.559f)
                lineTo(5.652f, 9.239f)
                lineTo(1.219f, 6.68f)
                lineToRelative(0.001f, 0.002f)
                close()
                moveTo(20.835f, 7.803f)
                lineToRelative(-2.484f, 1.436f)
                verticalLineToRelative(5.522f)
                lineToRelative(4.43f, 2.559f)
                lineTo(22.781f, 6.678f)
                lineToRelative(-1.946f, 1.125f)
                close()
                moveTo(2.001f, 5.324f)
                lineToRelative(4.435f, 2.559f)
                lineToRelative(4.781f, -2.762f)
                lineTo(11.217f, 0.003f)
                lineTo(2.001f, 5.324f)
                close()
                moveTo(17.567f, 7.883f)
                lineToRelative(4.434f, -2.559f)
                lineTo(12.782f, 0.0f)
                verticalLineToRelative(5.121f)
                lineToRelative(4.785f, 2.762f)
                close()
            }
        }
        .build()
        return _launchpad!!
    }

private var _launchpad: ImageVector? = null
