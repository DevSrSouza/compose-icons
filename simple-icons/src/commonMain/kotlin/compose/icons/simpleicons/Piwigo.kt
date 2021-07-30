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

public val SimpleIcons.Piwigo: ImageVector
    get() {
        if (_piwigo != null) {
            return _piwigo!!
        }
        _piwigo = Builder(name = "Piwigo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.712f, 12.777f)
                arcTo(4.713f, 4.713f, 0.0f, false, true, 12.0f, 17.49f)
                arcToRelative(4.713f, 4.713f, 0.0f, false, true, -4.713f, -4.713f)
                arcTo(4.713f, 4.713f, 0.0f, false, true, 12.0f, 8.066f)
                arcToRelative(4.713f, 4.713f, 0.0f, false, true, 4.712f, 4.711f)
                close()
                moveTo(19.112f, 0.001f)
                curveToRelative(-2.572f, 0.058f, -2.358f, 1.544f, -8.237f, 1.555f)
                horizontalLineToRelative(-4.15f)
                arcTo(5.947f, 5.947f, 0.0f, false, false, 0.777f, 7.503f)
                verticalLineToRelative(10.55f)
                arcTo(5.947f, 5.947f, 0.0f, false, false, 6.725f, 24.0f)
                horizontalLineToRelative(10.55f)
                arcToRelative(5.947f, 5.947f, 0.0f, false, false, 5.948f, -5.947f)
                lineTo(23.223f, 4.081f)
                lineToRelative(-0.008f, -0.018f)
                curveToRelative(0.0f, -0.014f, 0.004f, -0.028f, 0.004f, -0.043f)
                curveToRelative(0.0f, -2.227f, -1.88f, -4.02f, -4.108f, -4.02f)
                close()
                moveTo(19.202f, 2.546f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, 1.407f, 1.41f)
                arcTo(1.409f, 1.409f, 0.0f, false, true, 19.2f, 5.364f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, -1.41f, -1.408f)
                arcToRelative(1.409f, 1.409f, 0.0f, false, true, 1.41f, -1.41f)
                close()
                moveTo(12.0f, 6.12f)
                arcToRelative(6.656f, 6.656f, 0.0f, false, true, 6.656f, 6.655f)
                arcTo(6.656f, 6.656f, 0.0f, false, true, 12.0f, 19.434f)
                arcToRelative(6.656f, 6.656f, 0.0f, false, true, -6.656f, -6.657f)
                arcTo(6.656f, 6.656f, 0.0f, false, true, 12.0f, 6.122f)
                close()
            }
        }
        .build()
        return _piwigo!!
    }

private var _piwigo: ImageVector? = null
