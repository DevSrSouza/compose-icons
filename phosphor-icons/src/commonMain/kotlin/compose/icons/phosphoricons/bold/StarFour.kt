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

public val BoldGroup.StarFour: ImageVector
    get() {
        if (_starFour != null) {
            return _starFour!!
        }
        _starFour = Builder(name = "StarFour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 109.2f)
                lineToRelative(-62.0f, -22.6f)
                lineToRelative(-22.6f, -62.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -37.6f, 0.0f)
                lineToRelative(-22.6f, 62.0f)
                lineToRelative(-62.0f, 22.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 37.6f)
                lineToRelative(62.0f, 22.6f)
                lineToRelative(22.6f, 62.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 37.6f, 0.0f)
                lineToRelative(22.6f, -62.0f)
                lineToRelative(62.0f, -22.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -37.6f)
                close()
                moveTo(159.4f, 147.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, -12.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 212.9f)
                lineToRelative(-19.4f, -53.5f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(43.1f, 128.0f)
                lineToRelative(53.5f, -19.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(128.0f, 43.1f)
                lineToRelative(19.4f, 53.5f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(212.9f, 128.0f)
                close()
            }
        }
        .build()
        return _starFour!!
    }

private var _starFour: ImageVector? = null
