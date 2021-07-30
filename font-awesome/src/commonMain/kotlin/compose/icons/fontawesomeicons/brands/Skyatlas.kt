package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Skyatlas: ImageVector
    get() {
        if (_skyatlas != null) {
            return _skyatlas!!
        }
        _skyatlas = Builder(name = "Skyatlas", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 329.3f)
                curveToRelative(0.0f, 65.9f, -52.5f, 114.4f, -117.5f, 114.4f)
                curveToRelative(-165.9f, 0.0f, -196.6f, -249.7f, -359.7f, -249.7f)
                curveToRelative(-146.9f, 0.0f, -147.1f, 212.2f, 5.6f, 212.2f)
                curveToRelative(42.5f, 0.0f, 90.9f, -17.8f, 125.3f, -42.5f)
                curveToRelative(5.6f, -4.1f, 16.9f, -16.3f, 22.8f, -16.3f)
                reflectiveCurveToRelative(10.9f, 5.0f, 10.9f, 10.9f)
                curveToRelative(0.0f, 7.8f, -13.1f, 19.1f, -18.7f, 24.1f)
                curveToRelative(-40.9f, 35.6f, -100.3f, 61.2f, -154.7f, 61.2f)
                curveToRelative(-83.4f, 0.1f, -154.0f, -59.0f, -154.0f, -144.9f)
                reflectiveCurveToRelative(67.5f, -149.1f, 152.8f, -149.1f)
                curveToRelative(185.3f, 0.0f, 222.5f, 245.9f, 361.9f, 245.9f)
                curveToRelative(99.9f, 0.0f, 94.8f, -139.7f, 3.4f, -139.7f)
                curveToRelative(-17.5f, 0.0f, -35.0f, 11.6f, -46.9f, 11.6f)
                curveToRelative(-8.4f, 0.0f, -15.9f, -7.2f, -15.9f, -15.6f)
                curveToRelative(0.0f, -11.6f, 5.3f, -23.7f, 5.3f, -36.3f)
                curveToRelative(0.0f, -66.6f, -50.9f, -114.7f, -116.9f, -114.7f)
                curveToRelative(-53.1f, 0.0f, -80.0f, 36.9f, -88.8f, 36.9f)
                curveToRelative(-6.2f, 0.0f, -11.2f, -5.0f, -11.2f, -11.2f)
                curveToRelative(0.0f, -5.6f, 4.1f, -10.3f, 7.8f, -14.4f)
                curveToRelative(25.3f, -28.8f, 64.7f, -43.7f, 102.8f, -43.7f)
                curveToRelative(79.4f, 0.0f, 139.1f, 58.4f, 139.1f, 137.8f)
                curveToRelative(0.0f, 6.9f, -0.3f, 13.7f, -1.2f, 20.6f)
                curveToRelative(11.9f, -3.1f, 24.1f, -4.7f, 35.9f, -4.7f)
                curveToRelative(60.7f, 0.0f, 111.9f, 45.3f, 111.9f, 107.2f)
                close()
            }
        }
        .build()
        return _skyatlas!!
    }

private var _skyatlas: ImageVector? = null
