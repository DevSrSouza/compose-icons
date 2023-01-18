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

public val DuotoneGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(164.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 216.0f)
                lineTo(164.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 208.0f)
                lineTo(156.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(56.0f, 40.0f)
                lineTo(92.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 48.0f)
                lineTo(100.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                lineTo(164.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(148.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 32.0f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(164.0f, 208.0f)
                lineTo(164.0f, 48.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(92.0f, 32.0f)
                lineTo(56.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(92.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(108.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 92.0f, 32.0f)
                close()
                moveTo(92.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                lineTo(56.0f, 48.0f)
                lineTo(92.0f, 48.0f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
