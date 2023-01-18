package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 24.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 24.0f, 128.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 3.4f, -6.6f)
                lineToRelative(40.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, -0.5f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 124.0f, 100.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 3.4f, -6.6f)
                lineToRelative(40.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.3f, -0.5f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 180.0f, 100.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -4.6f, -1.4f)
                lineToRelative(-40.0f, -28.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 124.0f, 128.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -4.6f, -1.4f)
                lineToRelative(-40.0f, -28.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 68.0f, 128.0f)
                close()
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
