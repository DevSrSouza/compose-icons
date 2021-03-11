package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Letsencrypt: ImageVector
    get() {
        if (_letsencrypt != null) {
            return _letsencrypt!!
        }
        _letsencrypt = Builder(name = "Letsencrypt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.197f, 24.0f)
                lineTo(5.804f, 24.0f)
                arcToRelative(0.965f, 0.965f, 0.0f, false, true, -0.962f, -0.962f)
                lineTo(4.842f, 13.87f)
                curveToRelative(0.0f, -0.529f, 0.433f, -0.962f, 0.962f, -0.962f)
                horizontalLineToRelative(1.164f)
                verticalLineToRelative(-1.482f)
                curveToRelative(0.0f, -2.775f, 2.258f, -5.032f, 5.032f, -5.032f)
                reflectiveCurveToRelative(5.032f, 2.258f, 5.032f, 5.032f)
                verticalLineToRelative(1.482f)
                horizontalLineToRelative(1.164f)
                curveToRelative(0.529f, 0.0f, 0.962f, 0.433f, 0.962f, 0.962f)
                verticalLineToRelative(9.168f)
                arcToRelative(0.965f, 0.965f, 0.0f, false, true, -0.962f, 0.962f)
                close()
                moveTo(12.628f, 18.928f)
                arcTo(1.274f, 1.274f, 0.0f, false, false, 12.0f, 16.544f)
                arcToRelative(1.275f, 1.275f, 0.0f, false, false, -0.628f, 2.384f)
                verticalLineToRelative(1.242f)
                arcToRelative(0.628f, 0.628f, 0.0f, true, false, 1.256f, 0.0f)
                verticalLineToRelative(-1.242f)
                close()
                moveTo(9.854f, 12.908f)
                horizontalLineToRelative(4.293f)
                verticalLineToRelative(-1.482f)
                curveToRelative(0.0f, -1.183f, -0.963f, -2.146f, -2.146f, -2.146f)
                reflectiveCurveToRelative(-2.146f, 0.963f, -2.146f, 2.146f)
                verticalLineToRelative(1.482f)
                close()
                moveTo(4.547f, 11.542f)
                horizontalLineToRelative(-2.99f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 0.0f, -1.756f)
                horizontalLineToRelative(2.99f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 0.0f, 1.756f)
                close()
                moveTo(6.654f, 6.838f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.557f, -0.2f)
                lineTo(3.732f, 4.693f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 1.116f, -1.357f)
                lineToRelative(2.365f, 1.945f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, true, -0.559f, 1.556f)
                close()
                moveTo(12.0f, 4.77f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, true, -0.878f, -0.878f)
                lineTo(11.122f, 0.878f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 1.756f, 0.0f)
                verticalLineToRelative(3.014f)
                arcTo(0.878f, 0.878f, 0.0f, false, true, 12.0f, 4.77f)
                close()
                moveTo(17.346f, 6.838f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, true, -0.559f, -1.556f)
                lineToRelative(2.365f, -1.945f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, true, 1.116f, 1.357f)
                lineToRelative(-2.365f, 1.945f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, true, -0.557f, 0.2f)
                close()
                moveTo(22.443f, 11.542f)
                horizontalLineToRelative(-3.019f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 0.0f, -1.756f)
                horizontalLineToRelative(3.019f)
                arcToRelative(0.878f, 0.878f, 0.0f, true, true, 0.0f, 1.756f)
                close()
            }
        }
        .build()
        return _letsencrypt!!
    }

private var _letsencrypt: ImageVector? = null
