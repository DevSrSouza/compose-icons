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

public val SimpleIcons.Cliqz: ImageVector
    get() {
        if (_cliqz != null) {
            return _cliqz!!
        }
        _cliqz = Builder(name = "Cliqz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.387f, 18.146f)
                lineToRelative(4.19f, -1.402f)
                lineTo(12.0f, 12.027f)
                lineToRelative(4.716f, 11.578f)
                lineToRelative(1.403f, -4.19f)
                lineToRelative(3.917f, 3.917f)
                lineToRelative(1.268f, -1.268f)
                close()
                moveTo(12.0f, 19.146f)
                curveToRelative(0.035f, 0.0f, 0.07f, -0.004f, 0.105f, -0.004f)
                lineToRelative(1.908f, 4.686f)
                curveToRelative(-0.654f, 0.11f, -1.326f, 0.172f, -2.013f, 0.172f)
                curveToRelative(-6.617f, 0.0f, -12.0f, -5.383f, -12.0f, -12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 0.695f, -0.063f, 1.376f, -0.177f, 2.04f)
                lineToRelative(-4.683f, -1.908f)
                curveToRelative(0.0f, -0.044f, 0.006f, -0.087f, 0.006f, -0.133f)
                arcTo(7.153f, 7.153f, 0.0f, false, false, 12.0f, 4.854f)
                arcToRelative(7.155f, 7.154f, 0.0f, false, false, -7.147f, 7.145f)
                arcTo(7.155f, 7.154f, 0.0f, false, false, 12.0f, 19.146f)
                close()
            }
        }
        .build()
        return _cliqz!!
    }

private var _cliqz: ImageVector? = null
