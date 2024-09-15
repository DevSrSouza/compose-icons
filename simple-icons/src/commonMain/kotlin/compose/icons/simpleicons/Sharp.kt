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

public val SimpleIcons.Sharp: ImageVector
    get() {
        if (_sharp != null) {
            return _sharp!!
        }
        _sharp = Builder(name = "Sharp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.221f, 0.087f)
                verticalLineToRelative(5.961f)
                lineToRelative(-3.743f, 0.501f)
                verticalLineToRelative(3.523f)
                lineToRelative(3.743f, -0.501f)
                verticalLineToRelative(3.573f)
                lineToRelative(3.492f, -0.467f)
                lineTo(17.713f, 9.105f)
                lineTo(24.0f, 8.263f)
                lineToRelative(-0.463f, -3.461f)
                lineToRelative(-5.824f, 0.779f)
                lineTo(17.713f, 0.087f)
                close()
                moveTo(6.287f, 1.145f)
                verticalLineToRelative(5.962f)
                lineTo(0.0f, 7.948f)
                lineToRelative(0.463f, 3.461f)
                lineToRelative(5.851f, -0.783f)
                lineToRelative(3.464f, -0.464f)
                lineTo(9.779f, 1.145f)
                close()
                moveTo(9.807f, 10.864f)
                lineToRelative(-3.492f, 0.468f)
                verticalLineToRelative(3.578f)
                lineToRelative(-6.183f, 0.828f)
                lineToRelative(0.463f, 3.461f)
                lineToRelative(5.824f, -0.78f)
                verticalLineToRelative(5.494f)
                horizontalLineToRelative(3.492f)
                verticalLineToRelative(-5.962f)
                lineToRelative(3.611f, -0.483f)
                lineTo(13.522f, 13.944f)
                lineToRelative(-3.716f, 0.497f)
                close()
                moveTo(23.537f, 12.604f)
                lineToRelative(-5.824f, 0.779f)
                lineToRelative(-3.492f, 0.467f)
                verticalLineToRelative(9.018f)
                horizontalLineToRelative(3.492f)
                verticalLineToRelative(-5.962f)
                lineTo(24.0f, 16.065f)
                close()
            }
        }
        .build()
        return _sharp!!
    }

private var _sharp: ImageVector? = null
