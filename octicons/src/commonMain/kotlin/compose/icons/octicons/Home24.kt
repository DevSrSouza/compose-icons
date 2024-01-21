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

public val Octicons.Home24: ImageVector
    get() {
        if (_home24 != null) {
            return _home24!!
        }
        _home24 = Builder(name = "Home24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.03f, 2.59f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 1.94f, 0.0f)
                lineToRelative(7.5f, 6.363f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.53f, 1.144f)
                verticalLineTo(19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-9.403f)
                curveToRelative(0.0f, -0.44f, 0.194f, -0.859f, 0.53f, -1.144f)
                close()
                moveTo(12.0f, 3.734f)
                lineToRelative(-7.5f, 6.363f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.403f)
                close()
            }
        }
        .build()
        return _home24!!
    }

private var _home24: ImageVector? = null
