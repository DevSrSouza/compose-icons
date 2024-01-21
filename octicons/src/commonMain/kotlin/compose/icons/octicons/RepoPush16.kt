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

public val Octicons.RepoPush16: ImageVector
    get() {
        if (_repoPush16 != null) {
            return _repoPush16!!
        }
        _repoPush16 = Builder(name = "RepoPush16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 1.5f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.708f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 3.5f, 9.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.5f, 10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 1.0f, 11.5f)
                close()
                moveTo(14.23f, 10.29f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-1.224f, -1.224f)
                verticalLineToRelative(6.184f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.505f, 9.066f)
                lineTo(10.28f, 10.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.061f)
                lineToRelative(2.505f, -2.504f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineTo(15.29f, 9.23f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                close()
            }
        }
        .build()
        return _repoPush16!!
    }

private var _repoPush16: ImageVector? = null
