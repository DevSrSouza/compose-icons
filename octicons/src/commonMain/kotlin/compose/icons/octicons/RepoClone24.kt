package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.RepoClone24: ImageVector
    get() {
        if (_repoClone24 != null) {
            return _repoClone24!!
        }
        _repoClone24 = Builder(name = "RepoClone24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.375f, 0.375f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(15.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(5.187f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineTo(4.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.687f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineTo(4.375f)
                curveToRelative(-0.356f, 0.0f, -0.694f, 0.074f, -1.0f, 0.208f)
                verticalLineTo(2.875f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(13.25f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.375f, 12.087f)
                curveToRelative(0.0f, -1.396f, 1.005f, -2.712f, 2.456f, -2.712f)
                horizontalLineToRelative(8.044f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(22.125f, 17.625f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-7.294f)
                curveToRelative(-0.433f, 0.0f, -0.956f, 0.441f, -0.956f, 1.212f)
                verticalLineToRelative(5.939f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 1.5f, -0.401f)
                close()
                moveTo(13.875f, 20.625f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _repoClone24!!
    }

private var _repoClone24: ImageVector? = null
