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
                moveTo(14.2209f, 0.0875f)
                verticalLineToRelative(5.9613f)
                lineToRelative(-3.7433f, 0.5012f)
                verticalLineToRelative(3.5233f)
                lineToRelative(3.7433f, -0.5012f)
                verticalLineToRelative(3.5735f)
                lineToRelative(3.492f, -0.4672f)
                lineTo(17.7129f, 9.1047f)
                lineTo(24.0f, 8.2634f)
                lineToRelative(-0.4631f, -3.4613f)
                lineToRelative(-5.824f, 0.7794f)
                lineTo(17.7129f, 0.0875f)
                close()
                moveTo(6.287f, 1.145f)
                verticalLineToRelative(5.9618f)
                lineTo(0.0f, 7.9483f)
                lineToRelative(0.4634f, 3.4613f)
                lineToRelative(5.8514f, -0.7834f)
                lineToRelative(3.4644f, -0.4637f)
                lineTo(9.7792f, 1.145f)
                close()
                moveTo(9.8068f, 10.8635f)
                lineToRelative(-3.492f, 0.4675f)
                verticalLineToRelative(3.578f)
                lineToRelative(-6.183f, 0.8276f)
                lineToRelative(0.4633f, 3.4613f)
                lineToRelative(5.8239f, -0.7796f)
                verticalLineToRelative(5.4942f)
                horizontalLineToRelative(3.492f)
                verticalLineToRelative(-5.962f)
                lineToRelative(3.6114f, -0.4834f)
                lineTo(13.5224f, 13.944f)
                lineToRelative(-3.7156f, 0.4973f)
                close()
                moveTo(23.5368f, 12.604f)
                lineToRelative(-5.824f, 0.779f)
                lineToRelative(-3.492f, 0.4673f)
                verticalLineToRelative(9.0179f)
                horizontalLineToRelative(3.492f)
                verticalLineToRelative(-5.9618f)
                lineTo(24.0f, 16.0652f)
                close()
            }
        }
        .build()
        return _sharp!!
    }

private var _sharp: ImageVector? = null
