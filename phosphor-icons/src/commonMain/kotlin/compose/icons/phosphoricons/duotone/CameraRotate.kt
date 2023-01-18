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

public val DuotoneGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 64.0f)
                horizontalLineTo(80.0f)
                lineTo(96.0f, 40.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(16.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 56.0f)
                lineTo(180.3f, 56.0f)
                lineTo(166.7f, 35.6f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 160.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.7f, 3.6f)
                lineTo(75.7f, 56.0f)
                lineTo(48.0f, 56.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 24.0f, 80.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 80.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 208.0f, 56.0f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(80.0f, 72.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.7f, -3.6f)
                lineTo(100.3f, 48.0f)
                horizontalLineToRelative(55.4f)
                lineToRelative(13.6f, 20.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 176.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(161.9f, 154.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, true, -67.8f, 0.0f)
                lineTo(94.0f, 165.9f)
                lineTo(89.3f, 161.0f)
                lineToRelative(-1.4f, 8.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 80.0f, 176.0f)
                lineTo(78.7f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.6f, -9.2f)
                lineToRelative(4.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 6.6f, -6.6f)
                lineToRelative(24.0f, -4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.6f, 15.8f)
                lineToRelative(-9.0f, 1.5f)
                lineToRelative(5.1f, 5.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 164.0f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, 22.6f, -9.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 161.9f, 154.6f)
                close()
                moveTo(183.9f, 97.3f)
                lineTo(179.9f, 121.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -6.6f, 6.6f)
                lineToRelative(-24.0f, 4.0f)
                lineTo(148.0f, 131.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.9f, -6.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.6f, -9.2f)
                lineToRelative(9.0f, -1.5f)
                lineToRelative(-5.1f, -5.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 100.0f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, -22.6f, 9.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, -11.3f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, true, 67.8f, 0.0f)
                curveToRelative(0.1f, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f)
                lineToRelative(4.7f, 4.8f)
                lineToRelative(1.4f, -8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.8f, 2.6f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
