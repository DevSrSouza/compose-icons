package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 58.0f)
                lineTo(179.2f, 58.0f)
                lineTo(165.0f, 36.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, -2.7f)
                lineTo(96.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 2.7f)
                lineTo(76.8f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(208.0f, 214.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(230.0f, 80.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 208.0f, 58.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(80.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -2.7f)
                lineTo(99.2f, 46.0f)
                horizontalLineToRelative(57.6f)
                lineTo(171.0f, 67.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 2.7f)
                horizontalLineToRelative(32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(160.5f, 156.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, true, -65.0f, 0.0f)
                horizontalLineToRelative(-0.1f)
                lineTo(88.0f, 156.7f)
                lineTo(85.9f, 169.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f)
                lineTo(79.0f, 174.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.9f, -6.9f)
                lineToRelative(4.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 4.9f, -4.9f)
                lineToRelative(24.0f, -4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 11.8f)
                lineTo(96.2f, 148.0f)
                lineToRelative(7.8f, 8.1f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, 48.0f, -0.1f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 160.5f, 156.0f)
                close()
                moveTo(181.9f, 97.0f)
                lineTo(177.9f, 121.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.9f, 4.9f)
                lineToRelative(-24.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, -5.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 4.9f, -6.9f)
                lineToRelative(12.8f, -2.1f)
                lineToRelative(-7.8f, -8.1f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, -48.0f, 0.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, true, 65.0f, 0.0f)
                horizontalLineToRelative(0.1f)
                lineToRelative(7.4f, 7.8f)
                lineTo(170.1f, 95.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.8f, 2.0f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
