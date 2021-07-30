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

public val BrandsGroup.WatchmanMonitoring: ImageVector
    get() {
        if (_watchmanMonitoring != null) {
            return _watchmanMonitoring!!
        }
        _watchmanMonitoring = Builder(name = "WatchmanMonitoring", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveTo(123.452f, 16.0f, 16.0f, 123.452f, 16.0f, 256.0f)
                reflectiveCurveTo(123.452f, 496.0f, 256.0f, 496.0f)
                reflectiveCurveTo(496.0f, 388.548f, 496.0f, 256.0f)
                reflectiveCurveTo(388.548f, 16.0f, 256.0f, 16.0f)
                close()
                moveTo(121.69f, 429.122f)
                curveTo(70.056f, 388.972f, 36.741f, 326.322f, 36.741f, 256.0f)
                arcToRelative(218.519f, 218.519f, 0.0f, false, true, 9.587f, -64.122f)
                lineToRelative(102.9f, -17.895f)
                lineToRelative(-0.121f, 10.967f)
                lineToRelative(-13.943f, 2.013f)
                reflectiveCurveToRelative(-0.144f, 12.5f, -0.144f, 19.549f)
                arcToRelative(12.778f, 12.778f, 0.0f, false, false, 4.887f, 10.349f)
                lineToRelative(9.468f, 7.4f)
                close()
                moveTo(227.382f, 145.852f)
                lineTo(235.862f, 138.234f)
                reflectiveCurveToRelative(6.934f, -5.38f, -0.143f, -9.344f)
                curveToRelative(-7.188f, -4.024f, -39.53f, -34.5f, -39.53f, -34.5f)
                curveToRelative(-5.348f, -5.477f, -8.257f, -7.347f, -15.46f, 0.0f)
                curveToRelative(0.0f, 0.0f, -32.342f, 30.474f, -39.529f, 34.5f)
                curveToRelative(-7.078f, 3.964f, -0.144f, 9.344f, -0.144f, 9.344f)
                lineToRelative(8.481f, 7.618f)
                lineToRelative(-0.048f, 4.369f)
                lineTo(75.982f, 131.045f)
                curveToRelative(39.644f, -56.938f, 105.532f, -94.3f, 180.018f, -94.3f)
                arcTo(218.754f, 218.754f, 0.0f, false, true, 420.934f, 111.77f)
                lineToRelative(-193.512f, 37.7f)
                close()
                moveTo(261.445f, 475.121f)
                lineTo(227.545f, 224.264f)
                lineTo(237.012f, 216.864f)
                arcToRelative(12.778f, 12.778f, 0.0f, false, false, 4.888f, -10.349f)
                curveToRelative(0.0f, -7.044f, -0.144f, -19.549f, -0.144f, -19.549f)
                lineToRelative(-13.943f, -2.013f)
                lineToRelative(-0.116f, -10.474f)
                lineToRelative(241.711f, 31.391f)
                arcTo(218.872f, 218.872f, 0.0f, false, true, 475.259f, 256.0f)
                curveTo(475.259f, 375.074f, 379.831f, 472.212f, 261.445f, 475.121f)
                close()
            }
        }
        .build()
        return _watchmanMonitoring!!
    }

private var _watchmanMonitoring: ImageVector? = null
