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

public val Octicons.Accessibility16: ImageVector
    get() {
        if (_accessibility16 != null) {
            return _accessibility16!!
        }
        _accessibility16 = Builder(name = "Accessibility16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.923f, 5.302f)
                curveToRelative(0.063f, 0.063f, 0.122f, 0.129f, 0.178f, 0.198f)
                horizontalLineTo(14.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 14.0f, 7.0f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(0.578f, 5.163f)
                lineToRelative(0.362f, 2.997f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, 0.18f)
                lineTo(9.868f, 13.0f)
                horizontalLineTo(6.132f)
                lineToRelative(-0.282f, 2.34f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, -0.18f)
                lineToRelative(0.362f, -2.997f)
                lineTo(5.3f, 7.0f)
                horizontalLineTo(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.9f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, true, 0.176f, -0.198f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.847f, 0.0f)
                close()
                moveTo(9.2f, 7.073f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, false, -2.398f, 0.0f)
                lineTo(6.305f, 11.5f)
                horizontalLineToRelative(3.39f)
                close()
                moveTo(9.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 3.0f)
                close()
            }
        }
        .build()
        return _accessibility16!!
    }

private var _accessibility16: ImageVector? = null
