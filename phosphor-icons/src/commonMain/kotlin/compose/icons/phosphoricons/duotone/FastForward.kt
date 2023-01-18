package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(241.5f, 134.7f)
                lineToRelative(-89.2f, 57.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, -6.8f)
                lineTo(140.0f, 70.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.3f, -6.8f)
                lineToRelative(89.2f, 57.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 241.5f, 134.7f)
                close()
                moveTo(129.5f, 121.3f)
                lineTo(40.3f, 63.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 70.7f)
                lineTo(28.0f, 185.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.3f, 6.8f)
                lineToRelative(89.2f, -57.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 129.5f, 121.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.9f, 114.5f)
                lineTo(156.7f, 57.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 132.0f, 70.7f)
                verticalLineToRelative(42.6f)
                lineTo(44.7f, 57.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 20.0f, 70.7f)
                lineTo(20.0f, 185.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.3f, 14.1f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 16.4f, -0.6f)
                lineTo(132.0f, 142.7f)
                verticalLineToRelative(42.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.3f, 14.1f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 16.4f, -0.6f)
                lineToRelative(89.2f, -57.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -27.0f)
                close()
                moveTo(36.0f, 185.3f)
                lineTo(36.0f, 70.7f)
                lineTo(125.2f, 128.0f)
                close()
                moveTo(148.0f, 185.3f)
                lineTo(148.0f, 70.7f)
                lineTo(237.2f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
