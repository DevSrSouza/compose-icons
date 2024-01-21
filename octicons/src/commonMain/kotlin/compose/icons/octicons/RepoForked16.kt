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

public val Octicons.RepoForked16: ImageVector
    get() {
        if (_repoForked16 != null) {
            return _repoForked16!!
        }
        _repoForked16 = Builder(name = "RepoForked16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.372f)
                verticalLineToRelative(0.878f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.878f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 1.5f, 0.0f)
                verticalLineToRelative(0.878f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.25f, 2.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.128f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(7.25f, 8.5f)
                horizontalLineToRelative(-1.5f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 3.5f, 6.25f)
                verticalLineToRelative(-0.878f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 1.5f, 0.0f)
                close()
                moveTo(5.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(11.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(8.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _repoForked16!!
    }

private var _repoForked16: ImageVector? = null
