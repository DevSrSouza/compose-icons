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

public val Octicons.RepoForked24: ImageVector
    get() {
        if (_repoForked24 != null) {
            return _repoForked24!!
        }
        _repoForked24 = Builder(name = "RepoForked24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(15.0f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(2.5f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(5.75f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.75f, 6.5f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.0f, 21.0f)
                close()
                moveTo(18.25f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 18.25f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 7.75f)
                verticalLineToRelative(1.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.75f, 11.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, 3.75f)
                horizontalLineToRelative(-6.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 5.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 16.25f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _repoForked24!!
    }

private var _repoForked24: ImageVector? = null
