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

public val BrandsGroup.Quinscape: ImageVector
    get() {
        if (_quinscape != null) {
            return _quinscape!!
        }
        _quinscape = Builder(name = "Quinscape", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.6f, 474.6f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(158.1f, 158.1f, 0.0f, false, true, 0.0f, -316.2f)
                curveToRelative(94.9f, 0.0f, 168.2f, 83.1f, 157.0f, 176.6f)
                curveToRelative(4.0f, 5.1f, 8.2f, 9.6f, 11.2f, 15.3f)
                curveToRelative(13.4f, -30.3f, 20.3f, -62.4f, 20.3f, -97.7f)
                curveTo(501.1f, 117.5f, 391.6f, 8.0f, 256.5f, 8.0f)
                reflectiveCurveTo(12.0f, 117.5f, 12.0f, 252.6f)
                reflectiveCurveToRelative(109.5f, 244.6f, 244.5f, 244.6f)
                arcToRelative(237.36f, 237.36f, 0.0f, false, false, 70.4f, -10.1f)
                curveToRelative(-5.2f, -3.5f, -8.9f, -8.1f, -13.3f, -12.5f)
                close()
                moveTo(313.5f, 474.5f)
                lineToRelative(0.4f, 0.1f)
                close()
                moveTo(391.9f, 305.6f)
                arcToRelative(99.2f, 99.2f, 0.0f, true, false, 99.2f, 99.2f)
                arcToRelative(99.18f, 99.18f, 0.0f, false, false, -99.2f, -99.2f)
                close()
            }
        }
        .build()
        return _quinscape!!
    }

private var _quinscape: ImageVector? = null
