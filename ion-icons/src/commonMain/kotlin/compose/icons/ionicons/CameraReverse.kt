package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CameraReverse: ImageVector
    get() {
        if (_cameraReverse != null) {
            return _cameraReverse!!
        }
        _cameraReverse = Builder(name = "CameraReverse", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 144.0f)
                lineTo(373.0f, 144.0f)
                curveToRelative(-3.0f, 0.0f, -6.72f, -1.94f, -9.62f, -5.0f)
                lineTo(337.44f, 98.06f)
                arcToRelative(15.52f, 15.52f, 0.0f, false, false, -1.37f, -1.85f)
                curveTo(327.11f, 85.76f, 315.0f, 80.0f, 302.0f, 80.0f)
                lineTo(210.0f, 80.0f)
                curveToRelative(-13.0f, 0.0f, -25.11f, 5.76f, -34.07f, 16.21f)
                arcToRelative(15.52f, 15.52f, 0.0f, false, false, -1.37f, 1.85f)
                lineToRelative(-25.94f, 41.0f)
                curveToRelative(-2.22f, 2.42f, -5.34f, 5.0f, -8.62f, 5.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(100.0f, 120.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(80.0f, 144.06f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, 48.0f)
                lineTo(32.0f, 384.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(432.0f, 432.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(480.0f, 192.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 432.0f, 144.0f)
                close()
                moveTo(316.84f, 346.3f)
                arcToRelative(96.06f, 96.06f, 0.0f, false, true, -155.66f, -59.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.49f, -26.43f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 0.0f)
                lineToRelative(20.0f, 20.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 288.0f)
                arcToRelative(17.31f, 17.31f, 0.0f, false, true, -2.0f, -0.14f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 102.66f, 33.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 20.21f, 24.81f)
                close()
                moveTo(367.31f, 283.3f)
                lineTo(347.31f, 303.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.09f, -27.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 215.0f, 222.64f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 194.61f, 198.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 156.0f, 59.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.72f, 26.35f)
                close()
            }
        }
        .build()
        return _cameraReverse!!
    }

private var _cameraReverse: ImageVector? = null
