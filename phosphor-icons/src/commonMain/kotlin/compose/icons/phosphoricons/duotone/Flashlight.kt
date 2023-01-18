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

public val DuotoneGroup.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 77.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.6f, 4.8f)
                lineToRelative(-20.8f, 27.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.6f, 4.8f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(114.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.6f, -4.8f)
                lineTo(65.6f, 82.1f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 64.0f, 77.3f)
                verticalLineTo(64.0f)
                horizontalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 16.0f)
                lineTo(72.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 32.0f)
                lineTo(56.0f, 77.3f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 3.2f, 9.6f)
                lineTo(80.0f, 114.7f)
                lineTo(80.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(176.0f, 114.7f)
                lineToRelative(20.8f, -27.8f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 3.2f, -9.6f)
                lineTo(200.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 16.0f)
                close()
                moveTo(72.0f, 32.0f)
                lineTo(184.0f, 32.0f)
                lineTo(184.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                lineTo(72.0f, 32.0f)
                close()
                moveTo(163.2f, 105.1f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -3.2f, 9.6f)
                lineTo(160.0f, 224.0f)
                lineTo(96.0f, 224.0f)
                lineTo(96.0f, 114.7f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -3.2f, -9.6f)
                lineTo(72.0f, 77.3f)
                lineTo(72.0f, 72.0f)
                lineTo(184.0f, 72.0f)
                verticalLineToRelative(5.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
