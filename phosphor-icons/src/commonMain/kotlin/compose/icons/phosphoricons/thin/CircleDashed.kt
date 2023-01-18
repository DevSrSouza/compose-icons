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

public val ThinGroup.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.9f, 57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.7f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, false, -23.8f, 41.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 3.0f)
                lineToRelative(-1.1f, -0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -4.9f)
                arcTo(99.9f, 99.9f, 0.0f, false, true, 57.3f, 57.3f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 62.9f, 57.3f)
                close()
                moveTo(39.1f, 151.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.9f, -2.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.8f, 4.9f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 25.9f, 44.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                arcTo(93.4f, 93.4f, 0.0f, false, true, 39.1f, 151.8f)
                close()
                moveTo(151.8f, 216.9f)
                arcToRelative(91.5f, 91.5f, 0.0f, false, true, -47.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.1f, 7.7f)
                arcToRelative(99.8f, 99.8f, 0.0f, false, false, 26.0f, 3.4f)
                arcToRelative(97.8f, 97.8f, 0.0f, false, false, 25.8f, -3.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.1f, -7.7f)
                close()
                moveTo(221.8f, 149.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.9f, 2.8f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, true, -23.8f, 41.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 25.9f, -44.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 221.8f, 149.0f)
                close()
                moveTo(216.9f, 104.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.8f, 3.0f)
                lineToRelative(1.1f, -0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -4.9f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, -25.9f, -44.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, 5.6f)
                arcTo(93.4f, 93.4f, 0.0f, false, true, 216.9f, 104.2f)
                close()
                moveTo(104.2f, 39.1f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, true, 47.6f, 0.0f)
                lineToRelative(1.1f, 0.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, -7.9f)
                arcToRelative(101.1f, 101.1f, 0.0f, false, false, -51.8f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 7.7f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
