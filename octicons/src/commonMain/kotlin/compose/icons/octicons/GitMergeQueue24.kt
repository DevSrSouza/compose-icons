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

public val Octicons.GitMergeQueue24: ImageVector
    get() {
        if (_gitMergeQueue24 != null) {
            return _gitMergeQueue24!!
        }
        _gitMergeQueue24 = Builder(name = "GitMergeQueue24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.001f, -3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 5.75f, 6.5f)
                close()
                moveTo(9.5f, 8.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.501f, 0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.5f, 8.75f)
                close()
                moveTo(5.75f, 22.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -0.745f, -6.414f)
                arcTo(0.81f, 0.81f, 0.0f, false, true, 5.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.005f, 0.086f)
                arcTo(3.252f, 3.252f, 0.0f, false, true, 5.75f, 22.5f)
                close()
                moveTo(4.0f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.501f, -0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.0f, 19.25f)
                close()
                moveTo(15.0f, 12.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(18.25f, 14.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 3.5f)
                close()
            }
        }
        .build()
        return _gitMergeQueue24!!
    }

private var _gitMergeQueue24: ImageVector? = null
