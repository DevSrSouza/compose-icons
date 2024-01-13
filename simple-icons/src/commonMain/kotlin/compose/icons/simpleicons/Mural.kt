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

public val SimpleIcons.Mural: ImageVector
    get() {
        if (_mural != null) {
            return _mural!!
        }
        _mural = Builder(name = "Mural", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.53f, 8.118f)
                lineTo(24.0f, 8.118f)
                verticalLineToRelative(13.258f)
                horizontalLineToRelative(-3.47f)
                lineTo(20.53f, 8.118f)
                close()
                moveTo(5.497f, 6.094f)
                arcTo(2.03f, 2.03f, 0.0f, false, true, 7.524f, 8.12f)
                horizontalLineToRelative(3.47f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, -5.497f, -5.497f)
                arcTo(5.503f, 5.503f, 0.0f, false, false, 0.0f, 8.121f)
                horizontalLineToRelative(3.47f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 2.027f, -2.027f)
                close()
                moveTo(7.524f, 21.379f)
                lineTo(10.994f, 21.377f)
                lineTo(10.994f, 8.12f)
                horizontalLineToRelative(-3.47f)
                verticalLineToRelative(13.258f)
                close()
                moveTo(16.476f, 21.374f)
                verticalLineToRelative(-3.468f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(-2.013f, 0.001f)
                verticalLineToRelative(3.47f)
                lineToRelative(5.483f, -0.003f)
                close()
                moveTo(16.476f, 8.118f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 2.027f, -2.027f)
                lineTo(18.503f, 2.62f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, -5.497f, 5.497f)
                verticalLineToRelative(9.788f)
                horizontalLineToRelative(3.47f)
                lineTo(16.476f, 8.118f)
                close()
                moveTo(20.531f, 8.118f)
                lineTo(24.0f, 8.118f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, -5.497f, -5.497f)
                verticalLineToRelative(3.47f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, 2.027f, 2.027f)
                close()
                moveTo(0.0f, 21.378f)
                horizontalLineToRelative(3.47f)
                lineTo(3.47f, 8.122f)
                lineTo(0.0f, 8.122f)
                lineTo(0.0f, 21.38f)
                close()
            }
        }
        .build()
        return _mural!!
    }

private var _mural: ImageVector? = null
