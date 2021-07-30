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

public val SimpleIcons.Showtime: ImageVector
    get() {
        if (_showtime != null) {
            return _showtime!!
        }
        _showtime = Builder(name = "Showtime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.99f, 12.167f)
                curveToRelative(0.0f, -4.808f, 1.779f, -7.84f, 3.903f, -8.16f)
                curveTo(18.769f, 1.397f, 15.221f, 0.0f, 11.999f, 0.0f)
                curveTo(8.451f, 0.0f, 5.265f, 1.54f, 3.07f, 3.985f)
                curveToRelative(2.094f, 0.416f, 2.806f, 2.174f, 2.806f, 4.892f)
                lineTo(3.314f, 8.877f)
                curveToRelative(0.0f, -1.605f, -0.334f, -2.436f, -1.284f, -2.436f)
                curveToRelative(-0.427f, 0.0f, -0.758f, 0.217f, -0.954f, 0.587f)
                curveToRelative(-0.027f, 0.06f, -0.057f, 0.122f, -0.084f, 0.184f)
                arcToRelative(2.115f, 2.115f, 0.0f, false, false, -0.114f, 0.71f)
                curveToRelative(0.0f, 3.324f, 5.46f, 3.159f, 5.46f, 8.27f)
                curveToRelative(0.0f, 1.995f, -1.53f, 3.855f, -3.252f, 3.855f)
                curveTo(5.35f, 22.52f, 8.441f, 24.0f, 12.0f, 24.0f)
                curveToRelative(3.46f, 0.0f, 6.577f, -1.464f, 8.766f, -3.808f)
                curveToRelative(-2.018f, -0.509f, -3.776f, -3.413f, -3.776f, -8.025f)
                close()
                moveTo(15.848f, 20.088f)
                horizontalLineToRelative(-2.746f)
                lineTo(13.102f, 13.26f)
                horizontalLineToRelative(-2.967f)
                verticalLineToRelative(6.83f)
                lineTo(7.384f, 20.09f)
                lineTo(7.384f, 4.327f)
                horizontalLineToRelative(2.746f)
                verticalLineToRelative(6.348f)
                horizontalLineToRelative(2.972f)
                lineTo(13.102f, 4.327f)
                horizontalLineToRelative(2.746f)
                verticalLineToRelative(15.761f)
                close()
                moveTo(2.372f, 17.58f)
                curveToRelative(-1.32f, 0.0f, -2.399f, -2.32f, -2.372f, -5.8f)
                curveToRelative(1.905f, 1.72f, 3.681f, 2.11f, 3.681f, 4.145f)
                curveToRelative(0.0f, 0.981f, -0.543f, 1.655f, -1.309f, 1.655f)
                close()
                moveTo(24.0f, 12.002f)
                curveToRelative(0.0f, 2.844f, -0.896f, 5.409f, -2.1f, 5.409f)
                curveToRelative(-1.445f, 0.0f, -2.181f, -2.703f, -2.181f, -5.498f)
                curveToRelative(0.0f, -2.654f, 0.771f, -5.308f, 2.181f, -5.308f)
                curveToRelative(1.676f, 0.0f, 2.1f, 4.102f, 2.1f, 5.397f)
                close()
            }
        }
        .build()
        return _showtime!!
    }

private var _showtime: ImageVector? = null
