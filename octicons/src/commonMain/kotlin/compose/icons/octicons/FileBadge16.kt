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

public val Octicons.FileBadge16: ImageVector
    get() {
        if (_fileBadge16 != null) {
            return _fileBadge16!!
        }
        _fileBadge16 = Builder(name = "FileBadge16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 13.25f)
                verticalLineTo(1.75f)
                curveTo(1.0f, 0.784f, 1.784f, 0.0f, 2.75f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.508f, 0.862f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.289f, 0.768f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.219f, -0.13f)
                horizontalLineToRelative(-8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0f)
                arcToRelative(3.999f, 3.999f, 0.0f, false, true, 7.605f, -1.733f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.115f, 4.863f)
                lineToRelative(0.995f, 4.973f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.991f, 0.852f)
                lineToRelative(-2.409f, -0.876f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.17f, 0.0f)
                lineToRelative(-2.409f, 0.876f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.991f, -0.852f)
                lineToRelative(0.994f, -4.973f)
                arcTo(3.994f, 3.994f, 0.0f, false, true, 8.0f, 7.0f)
                close()
                moveTo(12.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-0.373f, 0.0f, -0.745f, -0.051f, -1.104f, -0.154f)
                lineToRelative(-0.649f, 3.243f)
                lineToRelative(1.155f, -0.42f)
                curveToRelative(0.386f, -0.14f, 0.81f, -0.14f, 1.196f, 0.0f)
                lineToRelative(1.155f, 0.42f)
                lineToRelative(-0.649f, -3.243f)
                arcTo(4.004f, 4.004f, 0.0f, false, true, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _fileBadge16!!
    }

private var _fileBadge16: ImageVector? = null
