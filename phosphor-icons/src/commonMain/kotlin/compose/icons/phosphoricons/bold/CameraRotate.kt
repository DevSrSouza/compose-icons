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

public val BoldGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 52.0f)
                lineTo(182.4f, 52.0f)
                lineTo(170.0f, 33.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 160.0f, 28.0f)
                lineTo(96.0f, 28.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.0f, 5.3f)
                lineTo(73.6f, 52.0f)
                lineTo(48.0f, 52.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 20.0f, 80.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(236.0f, 80.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 208.0f, 52.0f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 76.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.0f, -5.3f)
                lineTo(102.4f, 52.0f)
                horizontalLineToRelative(51.2f)
                lineTo(166.0f, 70.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 176.0f, 76.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(164.8f, 151.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -72.9f, 0.6f)
                verticalLineToRelative(0.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 80.0f, 180.0f)
                lineToRelative(-2.0f, -0.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 68.2f, 166.0f)
                lineToRelative(4.0f, -24.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 9.8f, -9.8f)
                lineToRelative(24.0f, -4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, 23.6f)
                lineToRelative(-1.5f, 0.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.3f, -0.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.8f, 151.8f)
                close()
                moveTo(187.8f, 98.0f)
                lineTo(183.8f, 122.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.8f, 9.8f)
                lineToRelative(-24.0f, 4.0f)
                lineToRelative(-2.0f, 0.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.0f, -23.8f)
                lineToRelative(1.5f, -0.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.3f, 0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 72.9f, -0.6f)
                lineTo(164.1f, 94.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.6f, 4.0f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
