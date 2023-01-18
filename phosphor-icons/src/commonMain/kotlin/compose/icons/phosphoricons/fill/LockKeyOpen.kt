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

public val FillGroup.LockKeyOpen: ImageVector
    get() {
        if (_lockKeyOpen != null) {
            return _lockKeyOpen!!
        }
        _lockKeyOpen = Builder(name = "LockKeyOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 140.0f)
                close()
                moveTo(224.0f, 96.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 80.0f)
                lineTo(84.0f, 80.0f)
                lineTo(84.0f, 52.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                lineTo(100.0f, 80.0f)
                lineTo(208.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 96.0f)
                close()
                moveTo(156.0f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -36.0f, 26.8f)
                lineTo(120.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 166.8f)
                arcTo(27.9f, 27.9f, 0.0f, false, false, 156.0f, 140.0f)
                close()
            }
        }
        .build()
        return _lockKeyOpen!!
    }

private var _lockKeyOpen: ImageVector? = null
