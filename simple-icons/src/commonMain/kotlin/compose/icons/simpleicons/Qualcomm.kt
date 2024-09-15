package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Qualcomm: ImageVector
    get() {
        if (_qualcomm != null) {
            return _qualcomm!!
        }
        _qualcomm = Builder(name = "Qualcomm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.229f, 0.0f, 1.576f, 4.486f, 1.576f, 10.474f)
                curveToRelative(0.0f, 6.004f, 4.653f, 10.474f, 10.424f, 10.474f)
                curveToRelative(0.984f, 0.0f, 1.935f, -0.133f, 2.835f, -0.384f)
                lineToRelative(1.134f, 2.919f)
                curveToRelative(0.117f, 0.317f, 0.35f, 0.517f, 0.767f, 0.517f)
                horizontalLineToRelative(1.801f)
                curveToRelative(0.434f, 0.0f, 0.751f, -0.284f, 0.55f, -0.834f)
                lineToRelative(-1.468f, -3.819f)
                curveToRelative(2.885f, -1.818f, 4.803f, -5.037f, 4.803f, -8.889f)
                curveTo(22.424f, 4.486f, 17.771f, 0.0f, 12.0f, 0.0f)
                moveToRelative(4.536f, 16.562f)
                lineToRelative(-1.318f, -3.419f)
                curveToRelative(-0.117f, -0.284f, -0.35f, -0.55f, -0.851f, -0.55f)
                horizontalLineToRelative(-1.718f)
                curveToRelative(-0.434f, 0.0f, -0.767f, 0.284f, -0.567f, 0.834f)
                lineToRelative(1.735f, 4.486f)
                curveToRelative(-0.567f, 0.15f, -1.184f, 0.217f, -1.818f, 0.217f)
                curveToRelative(-4.22f, 0.0f, -7.222f, -3.319f, -7.222f, -7.655f)
                curveTo(4.778f, 6.138f, 7.78f, 2.819f, 12.0f, 2.819f)
                reflectiveCurveToRelative(7.222f, 3.319f, 7.222f, 7.655f)
                curveToRelative(0.0f, 2.535f, -1.017f, 4.703f, -2.685f, 6.088f)
            }
        }
        .build()
        return _qualcomm!!
    }

private var _qualcomm: ImageVector? = null
