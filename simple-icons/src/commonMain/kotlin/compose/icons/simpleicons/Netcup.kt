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

public val SimpleIcons.Netcup: ImageVector
    get() {
        if (_netcup != null) {
            return _netcup!!
        }
        _netcup = Builder(name = "Netcup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 0.0f)
                arcTo(5.239f, 5.239f, 0.0f, false, false, 0.0f, 5.25f)
                verticalLineToRelative(13.5f)
                arcTo(5.239f, 5.239f, 0.0f, false, false, 5.25f, 24.0f)
                horizontalLineToRelative(13.5f)
                arcTo(5.239f, 5.239f, 0.0f, false, false, 24.0f, 18.75f)
                lineTo(24.0f, 5.25f)
                arcTo(5.239f, 5.239f, 0.0f, false, false, 18.75f, 0.0f)
                lineTo(5.25f, 0.0f)
                close()
                moveTo(5.205f, 5.102f)
                horizontalLineToRelative(9.482f)
                curveToRelative(1.745f, 0.0f, 2.631f, 0.907f, 2.631f, 2.753f)
                verticalLineToRelative(8.352f)
                horizontalLineToRelative(1.477f)
                verticalLineToRelative(2.691f)
                horizontalLineToRelative(-4.666f)
                lineTo(14.129f, 8.58f)
                curveToRelative(0.0f, -0.514f, -0.298f, -0.785f, -0.889f, -0.785f)
                lineTo(9.873f, 7.795f)
                verticalLineToRelative(11.103f)
                lineTo(6.682f, 18.898f)
                lineTo(6.682f, 7.795f)
                lineTo(5.205f, 7.795f)
                lineTo(5.205f, 5.102f)
                close()
            }
        }
        .build()
        return _netcup!!
    }

private var _netcup: ImageVector? = null
