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

public val Octicons.Key16: ImageVector
    get() {
        if (_key16 != null) {
            return _key16!!
        }
        _key16 = Builder(name = "Key16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 0.0f)
                arcToRelative(5.499f, 5.499f, 0.0f, true, true, -1.288f, 10.848f)
                lineToRelative(-0.932f, 0.932f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.22f, 0.53f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.53f, 0.22f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.199f, 0.079f, -0.389f, 0.22f, -0.53f)
                lineToRelative(4.932f, -4.932f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 10.5f, 0.0f)
                close()
                moveTo(6.5f, 5.5f)
                curveToRelative(-0.001f, 0.431f, 0.069f, 0.86f, 0.205f, 1.269f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.181f, 0.768f)
                lineTo(1.5f, 12.56f)
                verticalLineToRelative(1.69f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.69f)
                lineToRelative(0.06f, -0.06f)
                verticalLineToRelative(-1.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.19f)
                lineToRelative(0.06f, -0.06f)
                verticalLineToRelative(-1.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.19f)
                lineToRelative(1.023f, -1.025f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.768f, -0.18f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 6.5f, 5.5f)
                close()
                moveTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _key16!!
    }

private var _key16: ImageVector? = null
