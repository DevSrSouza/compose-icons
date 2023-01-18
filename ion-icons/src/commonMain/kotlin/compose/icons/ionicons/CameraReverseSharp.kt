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

public val IonIcons.CameraReverseSharp: ImageVector
    get() {
        if (_cameraReverseSharp != null) {
            return _cameraReverseSharp!!
        }
        _cameraReverseSharp = Builder(name = "CameraReverseSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 144.0f)
                lineTo(373.0f, 144.0f)
                curveToRelative(-3.0f, 0.0f, -6.72f, -1.94f, -9.62f, -5.0f)
                lineTo(336.07f, 96.21f)
                curveTo(326.0f, 80.0f, 320.0f, 80.0f, 302.0f, 80.0f)
                lineTo(210.0f, 80.0f)
                curveToRelative(-18.0f, 0.0f, -23.0f, 0.0f, -34.07f, 16.21f)
                lineTo(148.62f, 139.0f)
                curveToRelative(-2.22f, 2.42f, -5.34f, 5.0f, -8.62f, 5.0f)
                lineTo(140.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(92.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(56.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                lineTo(32.0f, 408.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(456.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(480.0f, 168.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 456.0f, 144.0f)
                close()
                moveTo(256.0f, 368.0f)
                curveToRelative(-47.82f, 0.0f, -87.76f, -34.23f, -95.0f, -80.0f)
                lineTo(117.37f, 288.0f)
                lineTo(176.0f, 229.37f)
                lineTo(234.63f, 288.0f)
                lineTo(194.0f, 288.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 102.63f, 33.49f)
                lineTo(320.0f, 343.0f)
                lineToRelative(-3.68f, 3.72f)
                arcTo(96.64f, 96.64f, 0.0f, false, true, 256.0f, 368.0f)
                close()
                moveTo(336.0f, 314.16f)
                lineTo(277.11f, 256.0f)
                lineTo(318.0f, 256.0f)
                arcToRelative(64.26f, 64.26f, 0.0f, false, false, -103.0f, -33.36f)
                lineTo(192.0f, 200.0f)
                lineToRelative(3.14f, -2.45f)
                arcTo(96.19f, 96.19f, 0.0f, false, true, 255.76f, 176.0f)
                curveToRelative(47.85f, 0.0f, 87.0f, 34.19f, 94.24f, 80.0f)
                horizontalLineToRelative(44.92f)
                close()
            }
        }
        .build()
        return _cameraReverseSharp!!
    }

private var _cameraReverseSharp: ImageVector? = null
