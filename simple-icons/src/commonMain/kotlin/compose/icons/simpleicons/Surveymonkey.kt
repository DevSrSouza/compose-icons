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

public val SimpleIcons.Surveymonkey: ImageVector
    get() {
        if (_surveymonkey != null) {
            return _surveymonkey!!
        }
        _surveymonkey = Builder(name = "Surveymonkey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.163f, 13.184f)
                arcToRelative(2.852f, 2.852f, 0.0f, false, false, -0.678f, 0.084f)
                curveToRelative(-0.844f, -3.318f, -3.548f, -5.838f, -6.917f, -6.445f)
                arcToRelative(8.393f, 8.393f, 0.0f, false, false, -0.441f, -0.067f)
                curveToRelative(0.026f, -0.826f, 0.064f, -1.779f, 1.278f, -2.637f)
                lineToRelative(-0.192f, -0.484f)
                reflectiveCurveToRelative(-2.371f, 0.735f, -2.639f, 2.76f)
                curveToRelative(-0.117f, -0.551f, -1.221f, -1.24f, -1.767f, -1.371f)
                lineToRelative(-0.272f, 0.438f)
                reflectiveCurveToRelative(0.724f, 0.362f, 0.901f, 1.361f)
                curveToRelative(-3.369f, 0.606f, -6.074f, 3.123f, -6.92f, 6.44f)
                curveToRelative(-1.519f, -0.376f, -3.056f, 0.551f, -3.432f, 2.07f)
                curveToRelative(-0.376f, 1.519f, 0.551f, 3.056f, 2.07f, 3.432f)
                arcToRelative(2.835f, 2.835f, 0.0f, false, false, 1.719f, -0.114f)
                arcToRelative(8.682f, 8.682f, 0.0f, false, false, 0.92f, 1.712f)
                lineToRelative(2.352f, -1.585f)
                curveToRelative(-0.638f, -0.807f, -1.021f, -1.988f, -1.087f, -3.174f)
                curveToRelative(-0.07f, -1.293f, 0.245f, -2.576f, 1.07f, -3.33f)
                curveToRelative(1.702f, -1.448f, 3.556f, -0.788f, 4.714f, 0.6f)
                horizontalLineToRelative(0.311f)
                curveToRelative(1.161f, -1.388f, 3.017f, -2.047f, 4.714f, -0.6f)
                curveToRelative(0.824f, 0.754f, 1.14f, 2.038f, 1.07f, 3.33f)
                curveToRelative(-0.066f, 1.185f, -0.448f, 2.366f, -1.087f, 3.174f)
                lineToRelative(2.352f, 1.585f)
                arcToRelative(8.685f, 8.685f, 0.0f, false, false, 0.922f, -1.712f)
                curveToRelative(1.455f, 0.575f, 3.101f, -0.138f, 3.676f, -1.594f)
                reflectiveCurveToRelative(-0.138f, -3.101f, -1.594f, -3.676f)
                arcToRelative(2.835f, 2.835f, 0.0f, false, false, -1.045f, -0.198f)
                close()
                moveTo(2.786f, 16.848f)
                arcToRelative(0.836f, 0.836f, 0.0f, false, true, 0.0f, -1.672f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, 0.469f, 0.144f)
                curveToRelative(0.007f, 0.439f, 0.037f, 0.878f, 0.089f, 1.314f)
                curveToRelative(-0.147f, 0.135f, -0.374f, 0.233f, -0.558f, 0.214f)
                close()
                moveTo(21.213f, 16.848f)
                arcToRelative(0.836f, 0.836f, 0.0f, false, true, -0.558f, -0.215f)
                arcToRelative(12.679f, 12.679f, 0.0f, false, false, 0.089f, -1.314f)
                arcToRelative(0.835f, 0.835f, 0.0f, false, true, 1.304f, 0.693f)
                curveToRelative(0.008f, 0.457f, -0.382f, 0.858f, -0.835f, 0.836f)
                close()
            }
        }
        .build()
        return _surveymonkey!!
    }

private var _surveymonkey: ImageVector? = null
