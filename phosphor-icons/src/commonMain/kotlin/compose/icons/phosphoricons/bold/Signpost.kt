package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.9f, 104.0f)
                lineToRelative(-36.0f, -40.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -8.9f, -4.0f)
                lineTo(140.0f, 60.0f)
                lineTo(140.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 80.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 164.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.9f, -4.0f)
                lineToRelative(36.0f, -40.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 248.9f, 104.0f)
                close()
                moveTo(198.7f, 140.0f)
                lineTo(44.0f, 140.0f)
                lineTo(44.0f, 84.0f)
                lineTo(198.7f, 84.0f)
                lineToRelative(25.2f, 28.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
