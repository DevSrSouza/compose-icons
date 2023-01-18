package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DribbbleFill: ImageVector
    get() {
        if (_dribbbleFill != null) {
            return _dribbbleFill!!
        }
        _dribbbleFill = Builder(name = "DribbbleFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.51f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.605f, 6.61f)
                arcToRelative(8.502f, 8.502f, 0.0f, false, true, 1.93f, 5.314f)
                curveToRelative(-0.281f, -0.054f, -3.101f, -0.629f, -5.943f, -0.271f)
                curveToRelative(-0.065f, -0.141f, -0.12f, -0.293f, -0.184f, -0.445f)
                arcToRelative(25.424f, 25.424f, 0.0f, false, false, -0.564f, -1.236f)
                curveToRelative(3.145f, -1.28f, 4.577f, -3.124f, 4.761f, -3.362f)
                close()
                moveTo(12.0f, 3.475f)
                curveToRelative(2.17f, 0.0f, 4.154f, 0.814f, 5.662f, 2.148f)
                curveToRelative(-0.152f, 0.216f, -1.443f, 1.941f, -4.48f, 3.08f)
                curveToRelative(-1.399f, -2.57f, -2.95f, -4.675f, -3.189f, -5.0f)
                arcTo(8.686f, 8.686f, 0.0f, false, true, 12.0f, 3.475f)
                close()
                moveTo(8.367f, 4.278f)
                arcToRelative(53.903f, 53.903f, 0.0f, false, true, 3.167f, 4.935f)
                curveToRelative(-3.992f, 1.063f, -7.517f, 1.04f, -7.896f, 1.04f)
                arcToRelative(8.581f, 8.581f, 0.0f, false, true, 4.729f, -5.975f)
                close()
                moveTo(3.453f, 12.01f)
                verticalLineToRelative(-0.26f)
                curveToRelative(0.37f, 0.01f, 4.512f, 0.065f, 8.775f, -1.215f)
                curveToRelative(0.25f, 0.477f, 0.477f, 0.965f, 0.694f, 1.453f)
                curveToRelative(-0.109f, 0.033f, -0.228f, 0.065f, -0.336f, 0.098f)
                curveToRelative(-4.404f, 1.42f, -6.747f, 5.303f, -6.942f, 5.629f)
                arcToRelative(8.522f, 8.522f, 0.0f, false, true, -2.19f, -5.705f)
                close()
                moveTo(12.0f, 20.547f)
                arcToRelative(8.482f, 8.482f, 0.0f, false, true, -5.239f, -1.8f)
                curveToRelative(0.152f, -0.315f, 1.888f, -3.656f, 6.703f, -5.337f)
                curveToRelative(0.022f, -0.01f, 0.033f, -0.01f, 0.054f, -0.022f)
                arcToRelative(35.309f, 35.309f, 0.0f, false, true, 1.823f, 6.475f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -3.341f, 0.684f)
                close()
                moveTo(16.761f, 19.082f)
                curveToRelative(-0.086f, -0.52f, -0.542f, -3.015f, -1.66f, -6.084f)
                curveToRelative(2.68f, -0.423f, 5.023f, 0.271f, 5.315f, 0.369f)
                arcToRelative(8.468f, 8.468f, 0.0f, false, true, -3.655f, 5.715f)
                close()
            }
        }
        .build()
        return _dribbbleFill!!
    }

private var _dribbbleFill: ImageVector? = null
