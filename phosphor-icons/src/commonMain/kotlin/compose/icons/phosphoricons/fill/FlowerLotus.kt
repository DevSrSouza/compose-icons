package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) {
            return _flowerLotus!!
        }
        _flowerLotus = Builder(name = "FlowerLotus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.5f, 121.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -9.9f, -7.5f)
                arcToRelative(77.1f, 77.1f, 0.0f, false, false, -27.9f, -1.8f)
                arcToRelative(86.7f, 86.7f, 0.0f, false, false, -2.6f, -40.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -18.5f, -10.7f)
                arcToRelative(82.3f, 82.3f, 0.0f, false, false, -26.2f, 10.8f)
                arcToRelative(94.4f, 94.4f, 0.0f, false, false, -27.8f, -34.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -19.2f, 0.0f)
                arcTo(94.4f, 94.4f, 0.0f, false, false, 90.6f, 71.2f)
                arcTo(82.3f, 82.3f, 0.0f, false, false, 64.4f, 60.4f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 45.9f, 71.1f)
                arcTo(86.7f, 86.7f, 0.0f, false, false, 43.3f, 112.0f)
                arcToRelative(77.1f, 77.1f, 0.0f, false, false, -27.9f, 1.8f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 4.0f, 133.6f)
                curveToRelative(3.5f, 12.6f, 14.3f, 36.7f, 47.1f, 55.6f)
                reflectiveCurveTo(112.5f, 208.0f, 127.9f, 208.0f)
                horizontalLineToRelative(0.2f)
                curveToRelative(15.4f, 0.0f, 44.2f, 0.0f, 76.8f, -18.8f)
                reflectiveCurveToRelative(43.6f, -43.0f, 47.1f, -55.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 250.5f, 121.3f)
                close()
                moveTo(128.0f, 49.6f)
                curveToRelative(9.6f, 7.2f, 32.0f, 28.4f, 32.0f, 70.4f)
                reflectiveCurveToRelative(-22.4f, 63.2f, -32.0f, 70.4f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-9.6f, -7.2f, -32.0f, -28.4f, -32.0f, -70.4f)
                reflectiveCurveTo(118.4f, 56.8f, 128.0f, 49.6f)
                close()
                moveTo(19.3f, 129.3f)
                curveToRelative(6.2f, -1.6f, 15.9f, -2.8f, 28.4f, -0.6f)
                arcToRelative(117.1f, 117.1f, 0.0f, false, false, 9.7f, 20.9f)
                arcToRelative(137.9f, 137.9f, 0.0f, false, false, 33.2f, 38.6f)
                arcToRelative(123.4f, 123.4f, 0.0f, false, true, -31.5f, -12.9f)
                curveTo(31.3f, 159.2f, 22.3f, 139.5f, 19.3f, 129.3f)
                close()
                moveTo(196.9f, 175.3f)
                arcToRelative(123.4f, 123.4f, 0.0f, false, true, -31.5f, 12.9f)
                arcToRelative(137.9f, 137.9f, 0.0f, false, false, 33.2f, -38.6f)
                arcToRelative(117.1f, 117.1f, 0.0f, false, false, 9.7f, -20.9f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, true, 28.3f, 0.5f)
                curveTo(233.7f, 139.5f, 224.7f, 159.2f, 196.9f, 175.3f)
                close()
            }
        }
        .build()
        return _flowerLotus!!
    }

private var _flowerLotus: ImageVector? = null
