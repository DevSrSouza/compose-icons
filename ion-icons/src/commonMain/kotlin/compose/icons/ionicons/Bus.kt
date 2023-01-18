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

public val IonIcons.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(112.0f, 32.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 64.0f, 80.0f)
                lineTo(64.0f, 400.0f)
                arcToRelative(47.91f, 47.91f, 0.0f, false, false, 16.0f, 35.74f)
                lineTo(80.0f, 454.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f)
                verticalLineToRelative(-6.0f)
                lineTo(352.0f, 448.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f)
                lineTo(432.0f, 435.74f)
                arcTo(47.91f, 47.91f, 0.0f, false, false, 448.0f, 400.0f)
                lineTo(448.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 400.0f, 32.0f)
                close()
                moveTo(147.47f, 399.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 28.35f, -28.35f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 147.47f, 399.82f)
                close()
                moveTo(236.0f, 288.0f)
                lineTo(112.0f, 288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(236.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(240.0f, 284.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 288.0f)
                close()
                moveTo(256.0f, 96.0f)
                lineTo(112.46f, 96.0f)
                curveToRelative(-8.6f, 0.0f, -16.0f, -6.6f, -16.44f, -15.19f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 64.0f)
                lineTo(399.54f, 64.0f)
                curveToRelative(8.6f, 0.0f, 16.0f, 6.6f, 16.44f, 15.19f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 400.0f, 96.0f)
                lineTo(256.0f, 96.0f)
                close()
                moveTo(276.0f, 128.0f)
                lineTo(400.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(416.0f, 272.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(276.0f, 288.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(272.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 276.0f, 128.0f)
                close()
                moveTo(336.18f, 371.47f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 28.35f, 28.35f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 336.18f, 371.47f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
