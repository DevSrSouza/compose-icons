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

public val Octicons.GitMerge16: ImageVector
    get() {
        if (_gitMerge16 != null) {
            return _gitMerge16!!
        }
        _gitMerge16 = Builder(name = "GitMerge16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.45f, 5.154f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 9.25f, 7.5f)
                horizontalLineToRelative(1.378f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(9.25f, 9.0f)
                arcTo(5.734f, 5.734f, 0.0f, false, true, 5.0f, 7.123f)
                verticalLineToRelative(3.505f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(3.5f, 5.372f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 1.95f, -0.218f)
                close()
                moveTo(4.25f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(12.75f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(5.0f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 0.005f)
                lineTo(5.0f, 3.25f)
                close()
            }
        }
        .build()
        return _gitMerge16!!
    }

private var _gitMerge16: ImageVector? = null
