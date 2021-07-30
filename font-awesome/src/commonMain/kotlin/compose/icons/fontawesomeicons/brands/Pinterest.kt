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

public val BrandsGroup.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.0f, 248.0f, -248.0f, 248.0f)
                curveToRelative(-25.6f, 0.0f, -50.2f, -3.9f, -73.4f, -11.1f)
                curveToRelative(10.1f, -16.5f, 25.2f, -43.5f, 30.8f, -65.0f)
                curveToRelative(3.0f, -11.6f, 15.4f, -59.0f, 15.4f, -59.0f)
                curveToRelative(8.1f, 15.4f, 31.7f, 28.5f, 56.8f, 28.5f)
                curveToRelative(74.8f, 0.0f, 128.7f, -68.8f, 128.7f, -154.3f)
                curveToRelative(0.0f, -81.9f, -66.9f, -143.2f, -152.9f, -143.2f)
                curveToRelative(-107.0f, 0.0f, -163.9f, 71.8f, -163.9f, 150.1f)
                curveToRelative(0.0f, 36.4f, 19.4f, 81.7f, 50.3f, 96.1f)
                curveToRelative(4.7f, 2.2f, 7.2f, 1.2f, 8.3f, -3.3f)
                curveToRelative(0.8f, -3.4f, 5.0f, -20.3f, 6.9f, -28.1f)
                curveToRelative(0.6f, -2.5f, 0.3f, -4.7f, -1.7f, -7.1f)
                curveToRelative(-10.1f, -12.5f, -18.3f, -35.3f, -18.3f, -56.6f)
                curveToRelative(0.0f, -54.7f, 41.4f, -107.6f, 112.0f, -107.6f)
                curveToRelative(60.9f, 0.0f, 103.6f, 41.5f, 103.6f, 100.9f)
                curveToRelative(0.0f, 67.1f, -33.9f, 113.6f, -78.0f, 113.6f)
                curveToRelative(-24.3f, 0.0f, -42.6f, -20.1f, -36.7f, -44.8f)
                curveToRelative(7.0f, -29.5f, 20.5f, -61.3f, 20.5f, -82.6f)
                curveToRelative(0.0f, -19.0f, -10.2f, -34.9f, -31.4f, -34.9f)
                curveToRelative(-24.9f, 0.0f, -44.9f, 25.7f, -44.9f, 60.2f)
                curveToRelative(0.0f, 22.0f, 7.4f, 36.8f, 7.4f, 36.8f)
                reflectiveCurveToRelative(-24.5f, 103.8f, -29.0f, 123.2f)
                curveToRelative(-5.0f, 21.4f, -3.0f, 51.6f, -0.9f, 71.2f)
                curveTo(65.4f, 450.9f, 0.0f, 361.1f, 0.0f, 256.0f)
                curveTo(0.0f, 119.0f, 111.0f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
