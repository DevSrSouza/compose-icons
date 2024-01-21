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

public val Octicons.GitCommit24: ImageVector
    get() {
        if (_gitCommit24 != null) {
            return _gitCommit24!!
        }
        _gitCommit24 = Builder(name = "GitCommit24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.944f, 11.0f)
                horizontalLineToRelative(4.306f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.306f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, -9.888f, 0.0f)
                lineTo(2.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.306f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 9.888f, 0.0f)
                close()
                moveTo(15.5f, 11.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gitCommit24!!
    }

private var _gitCommit24: ImageVector? = null
