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

public val SimpleIcons.Googleadsense: ImageVector
    get() {
        if (_googleadsense != null) {
            return _googleadsense!!
        }
        _googleadsense = Builder(name = "Googleadsense", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.056f, 8.447f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, -5.313f, 1.419f)
                lineToRelative(-3.889f, 6.72f)
                arcToRelative(3.874f, 3.874f, 0.0f, false, false, 1.415f, 5.293f)
                lineToRelative(0.01f, 0.005f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, 5.312f, -1.42f)
                lineToRelative(3.889f, -6.718f)
                arcToRelative(3.875f, 3.875f, 0.0f, false, false, -1.416f, -5.294f)
                lineToRelative(-0.008f, -0.005f)
                moveToRelative(-14.7f, 12.168f)
                curveToRelative(-1.08f, 1.888f, -3.514f, 2.583f, -5.384f, 1.493f)
                curveToRelative(-1.87f, -1.09f, -2.533f, -3.455f, -1.453f, -5.343f)
                reflectiveCurveToRelative(3.494f, -2.586f, 5.365f, -1.496f)
                curveToRelative(1.87f, 1.09f, 2.554f, 3.457f, 1.474f, 5.344f)
                moveToRelative(4.131f, -19.228f)
                arcToRelative(3.935f, 3.935f, 0.0f, false, false, -3.267f, 2.189f)
                lineToRelative(-3.67f, 6.279f)
                arcToRelative(4.638f, 4.638f, 0.0f, false, false, -0.227f, 0.387f)
                lineToRelative(-2.746f, 4.737f)
                curveToRelative(1.345f, -0.86f, 3.09f, -0.993f, 4.55f, -0.143f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, 2.22f, 4.041f)
                lineToRelative(2.77f, -4.763f)
                curveToRelative(0.082f, -0.124f, 0.157f, -0.252f, 0.224f, -0.385f)
                lineToRelative(3.67f, -6.281f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -1.283f, -5.55f)
                arcToRelative(3.958f, 3.958f, 0.0f, false, false, -2.24f, -0.511f)
                close()
            }
        }
        .build()
        return _googleadsense!!
    }

private var _googleadsense: ImageVector? = null
