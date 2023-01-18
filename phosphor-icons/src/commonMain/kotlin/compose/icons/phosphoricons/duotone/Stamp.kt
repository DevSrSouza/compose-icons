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

public val DuotoneGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(161.8f, 53.0f)
                lineTo(144.0f, 136.0f)
                horizontalLineTo(112.0f)
                lineTo(94.2f, 53.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 23.5f, -29.0f)
                horizontalLineToRelative(20.6f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 161.8f, 53.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 224.0f)
                close()
                moveTo(224.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(54.1f)
                lineTo(86.4f, 54.7f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 117.7f, 16.0f)
                horizontalLineToRelative(20.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 31.3f, 38.7f)
                lineTo(153.9f, 128.0f)
                lineTo(208.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 144.0f)
                close()
                moveTo(118.5f, 128.0f)
                horizontalLineToRelative(19.0f)
                lineTo(154.0f, 51.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 138.3f, 32.0f)
                lineTo(117.7f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 102.0f, 51.4f)
                close()
                moveTo(208.0f, 184.0f)
                lineTo(208.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
