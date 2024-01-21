package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Blocked16: ImageVector
    get() {
        if (_blocked16 != null) {
            return _blocked16!!
        }
        _blocked16 = Builder(name = "Blocked16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.467f, 0.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(6.006f)
                curveToRelative(0.199f, 0.0f, 0.389f, 0.079f, 0.53f, 0.22f)
                lineToRelative(4.247f, 4.247f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                verticalLineToRelative(6.006f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-4.247f, 4.247f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(4.997f, 16.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, -0.22f)
                lineTo(0.22f, 11.533f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, -0.53f)
                lineTo(0.0f, 4.997f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.389f, 0.22f, -0.53f)
                close()
                moveTo(5.307f, 1.5f)
                lineTo(1.5f, 5.308f)
                verticalLineToRelative(5.384f)
                lineTo(5.308f, 14.5f)
                horizontalLineToRelative(5.384f)
                lineToRelative(3.808f, -3.808f)
                lineTo(14.5f, 5.308f)
                lineTo(10.692f, 1.5f)
                close()
                moveTo(4.0f, 7.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.75f, 7.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 7.75f)
                close()
            }
        }
        .build()
        return _blocked16!!
    }

private var _blocked16: ImageVector? = null
