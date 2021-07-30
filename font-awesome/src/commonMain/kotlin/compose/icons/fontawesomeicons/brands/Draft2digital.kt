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

public val BrandsGroup.Draft2digital: ImageVector
    get() {
        if (_draft2digital != null) {
            return _draft2digital!!
        }
        _draft2digital = Builder(name = "Draft2digital", defaultWidth = 480.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 398.1f)
                lineToRelative(-144.0f, -82.2f)
                verticalLineToRelative(64.7f)
                horizontalLineToRelative(-91.3f)
                curveToRelative(30.8f, -35.0f, 81.8f, -95.9f, 111.8f, -149.3f)
                curveToRelative(35.2f, -62.6f, 16.1f, -123.4f, -12.8f, -153.3f)
                curveToRelative(-4.4f, -4.6f, -62.2f, -62.9f, -166.0f, -41.2f)
                curveToRelative(-59.1f, 12.4f, -89.4f, 43.4f, -104.3f, 67.3f)
                curveToRelative(-13.1f, 20.9f, -17.0f, 39.8f, -18.2f, 47.7f)
                curveToRelative(-5.5f, 33.0f, 19.4f, 67.1f, 56.7f, 67.1f)
                curveToRelative(31.7f, 0.0f, 57.3f, -25.7f, 57.3f, -57.4f)
                curveToRelative(0.0f, -27.1f, -19.7f, -52.1f, -48.0f, -56.8f)
                curveToRelative(1.8f, -7.3f, 17.7f, -21.1f, 26.3f, -24.7f)
                curveToRelative(41.1f, -17.3f, 78.0f, 5.2f, 83.3f, 33.5f)
                curveToRelative(8.3f, 44.3f, -37.1f, 90.4f, -69.7f, 127.6f)
                curveTo(84.5f, 328.1f, 18.3f, 396.8f, 0.0f, 415.9f)
                lineToRelative(336.0f, -0.1f)
                verticalLineTo(480.0f)
                close()
                moveTo(369.9f, 371.0f)
                lineToRelative(47.1f, 27.2f)
                lineToRelative(-47.1f, 27.2f)
                close()
                moveTo(134.2f, 161.4f)
                curveToRelative(0.0f, 12.4f, -10.0f, 22.4f, -22.4f, 22.4f)
                reflectiveCurveToRelative(-22.4f, -10.0f, -22.4f, -22.4f)
                reflectiveCurveToRelative(10.0f, -22.4f, 22.4f, -22.4f)
                reflectiveCurveToRelative(22.4f, 10.1f, 22.4f, 22.4f)
                close()
                moveTo(82.5f, 380.5f)
                curveToRelative(25.6f, -27.4f, 97.7f, -104.7f, 150.8f, -169.9f)
                curveToRelative(35.1f, -43.1f, 40.3f, -82.4f, 28.4f, -112.7f)
                curveToRelative(-7.4f, -18.8f, -17.5f, -30.2f, -24.3f, -35.7f)
                curveToRelative(45.3f, 2.1f, 68.0f, 23.4f, 82.2f, 38.3f)
                curveToRelative(0.0f, 0.0f, 42.4f, 48.2f, 5.8f, 113.3f)
                curveToRelative(-37.0f, 65.9f, -110.9f, 147.5f, -128.5f, 166.7f)
                close()
            }
        }
        .build()
        return _draft2digital!!
    }

private var _draft2digital: ImageVector? = null
