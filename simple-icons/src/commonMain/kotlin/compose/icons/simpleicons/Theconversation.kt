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

public val SimpleIcons.Theconversation: ImageVector
    get() {
        if (_theconversation != null) {
            return _theconversation!!
        }
        _theconversation = Builder(name = "Theconversation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.996f, 10.543f)
                curveToRelative(-0.131f, -4.91f, -4.289f, -8.773f, -9.2f, -8.773f)
                lineTo(9.005f, 1.77f)
                arcToRelative(8.997f, 8.997f, 0.0f, false, false, -5.957f, 15.746f)
                lineTo(1.05f, 22.23f)
                lineToRelative(4.942f, -2.98f)
                curveToRelative(0.95f, 0.36f, 1.964f, 0.524f, 3.012f, 0.524f)
                horizontalLineToRelative(6.024f)
                curveToRelative(5.04f, 0.0f, 9.099f, -4.156f, 8.969f, -9.23f)
                close()
                moveTo(15.059f, 16.501f)
                lineTo(9.07f, 16.501f)
                curveToRelative(-2.587f, 0.0f, -5.205f, -2.03f, -5.696f, -4.583f)
                arcToRelative(5.724f, 5.724f, 0.0f, false, true, 5.63f, -6.874f)
                horizontalLineToRelative(5.99f)
                curveToRelative(2.586f, 0.0f, 5.205f, 2.03f, 5.696f, 4.582f)
                curveToRelative(0.688f, 3.667f, -2.095f, 6.875f, -5.63f, 6.875f)
                close()
            }
        }
        .build()
        return _theconversation!!
    }

private var _theconversation: ImageVector? = null
