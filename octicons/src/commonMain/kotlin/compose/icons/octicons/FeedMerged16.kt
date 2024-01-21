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

public val Octicons.FeedMerged16: ImageVector
    get() {
        if (_feedMerged16 != null) {
            return _feedMerged16!!
        }
        _feedMerged16 = Builder(name = "FeedMerged16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(8.25f, 4.75f)
                arcTo(1.75f, 1.75f, 0.0f, true, false, 6.0f, 6.428f)
                verticalLineToRelative(3.144f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 1.0f, 0.0f)
                lineTo(7.0f, 8.236f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 9.0f, 9.0f)
                horizontalLineToRelative(0.571f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(9.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.957f, -1.586f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 8.25f, 4.75f)
                close()
            }
        }
        .build()
        return _feedMerged16!!
    }

private var _feedMerged16: ImageVector? = null
