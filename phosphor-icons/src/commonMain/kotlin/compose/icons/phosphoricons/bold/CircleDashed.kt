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

public val BoldGroup.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.6f, 51.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, -21.7f, 37.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -11.6f, 9.0f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, true, -3.1f, -0.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.5f, -14.6f)
                arcTo(107.8f, 107.8f, 0.0f, false, true, 51.6f, 51.6f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 68.6f, 51.6f)
                close()
                moveTo(46.9f, 149.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 23.7f, 156.0f)
                arcToRelative(108.8f, 108.8f, 0.0f, false, false, 27.9f, 48.4f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, -20.5f)
                arcTo(83.7f, 83.7f, 0.0f, false, true, 46.9f, 149.7f)
                close()
                moveTo(149.7f, 209.2f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, true, -43.4f, -0.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.7f, 8.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.4f, 14.7f)
                arcToRelative(107.4f, 107.4f, 0.0f, false, false, 28.1f, 3.7f)
                arcToRelative(105.3f, 105.3f, 0.0f, false, false, 27.9f, -3.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.3f, -23.1f)
                close()
                moveTo(223.8f, 141.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -14.6f, 8.5f)
                arcToRelative(84.6f, 84.6f, 0.0f, false, true, -21.8f, 37.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 20.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.5f, -3.5f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 232.3f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 223.8f, 141.3f)
                close()
                moveTo(209.1f, 106.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 11.6f, 8.9f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 3.1f, -0.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.5f, -14.7f)
                arcToRelative(108.6f, 108.6f, 0.0f, false, false, -27.9f, -48.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                arcTo(83.7f, 83.7f, 0.0f, false, true, 209.1f, 106.3f)
                close()
                moveTo(106.3f, 46.8f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, true, 43.4f, 0.1f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 3.2f, 0.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 23.7f)
                arcToRelative(108.5f, 108.5f, 0.0f, false, false, -56.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 6.3f, 23.1f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
