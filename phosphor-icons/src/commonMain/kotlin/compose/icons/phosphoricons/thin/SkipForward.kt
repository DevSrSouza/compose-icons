package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = Builder(name = "SkipForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(84.1f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -5.1f, -6.3f)
                lineTo(70.3f, 44.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -12.2f, -0.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 54.3f)
                lineTo(52.0f, 201.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.1f, 10.5f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, 5.9f, 1.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.3f, -1.8f)
                lineToRelative(120.6f, -73.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 5.1f, -6.3f)
                lineTo(196.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(186.7f, 131.4f)
                lineTo(66.1f, 205.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.1f, -3.4f)
                lineTo(60.0f, 54.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.0f, -3.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 2.0f, -0.6f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 2.1f, 0.7f)
                lineToRelative(120.6f, 73.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 6.8f)
                close()
            }
        }
        .build()
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
