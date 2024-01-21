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

public val Octicons.GitBranch16: ImageVector
    get() {
        if (_gitBranch16 != null) {
            return _gitBranch16!!
        }
        _gitBranch16 = Builder(name = "GitBranch16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 3.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 3.0f, 2.122f)
                lineTo(12.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 8.5f)
                lineTo(6.0f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.128f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(3.5f, 5.372f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 1.5f, 0.0f)
                verticalLineToRelative(1.836f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 6.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-0.628f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 9.5f, 3.25f)
                close()
                moveTo(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
                moveTo(11.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(4.25f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _gitBranch16!!
    }

private var _gitBranch16: ImageVector? = null
