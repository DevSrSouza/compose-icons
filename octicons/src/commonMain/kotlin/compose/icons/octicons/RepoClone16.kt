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

public val Octicons.RepoClone16: ImageVector
    get() {
        if (_repoClone16 != null) {
            return _repoClone16!!
        }
        _repoClone16 = Builder(name = "RepoClone16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.5f, 14.0f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.356f, 0.0f, -0.694f, 0.074f, -1.0f, 0.208f)
                verticalLineTo(2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.058f)
                curveTo(8.0f, 7.023f, 8.75f, 6.0f, 9.887f, 6.0f)
                horizontalLineToRelative(5.363f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 8.0f, 13.75f)
                close()
                moveTo(14.5f, 11.5f)
                verticalLineToRelative(-4.0f)
                lineTo(9.887f, 7.5f)
                curveToRelative(-0.07f, 0.0f, -0.156f, 0.031f, -0.238f, 0.125f)
                arcToRelative(0.663f, 0.663f, 0.0f, false, false, -0.149f, 0.433f)
                verticalLineToRelative(3.57f)
                curveToRelative(0.235f, -0.083f, 0.487f, -0.128f, 0.75f, -0.128f)
                close()
                moveTo(9.5f, 13.75f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.25f)
                lineTo(14.5f, 13.0f)
                horizontalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
            }
        }
        .build()
        return _repoClone16!!
    }

private var _repoClone16: ImageVector? = null
