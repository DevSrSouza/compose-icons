package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PortableWifiOff: ImageVector
    get() {
        if (_portableWifiOff != null) {
            return _portableWifiOff!!
        }
        _portableWifiOff = Builder(name = "PortableWifiOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.42f, 2.36f)
                lineTo(2.01f, 3.78f)
                lineTo(4.1f, 5.87f)
                curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f)
                curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f)
                lineToRelative(1.0f, -1.73f)
                curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f)
                curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f)
                lineToRelative(1.43f, 1.44f)
                curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f)
                curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f)
                lineToRelative(1.0f, -1.74f)
                curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f)
                curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f)
                lineToRelative(1.58f, 1.58f)
                lineTo(10.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                lineToRelative(0.21f, -0.02f)
                lineToRelative(7.52f, 7.52f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.42f, 2.36f)
                close()
                moveTo(17.71f, 13.82f)
                curveToRelative(0.18f, -0.57f, 0.29f, -1.19f, 0.29f, -1.82f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.63f, 0.0f, -1.25f, 0.11f, -1.82f, 0.29f)
                lineToRelative(1.72f, 1.72f)
                curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.1f, -0.01f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.04f, -0.01f, 0.07f, -0.01f, 0.11f)
                lineToRelative(1.72f, 1.71f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.2f, -0.29f, 2.32f, -0.77f, 3.35f)
                lineToRelative(1.49f, 1.49f)
                curveTo(21.53f, 15.4f, 22.0f, 13.76f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-1.76f, 0.0f, -3.4f, 0.48f, -4.84f, 1.28f)
                lineToRelative(1.48f, 1.48f)
                curveTo(9.66f, 4.28f, 10.8f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _portableWifiOff!!
    }

private var _portableWifiOff: ImageVector? = null
