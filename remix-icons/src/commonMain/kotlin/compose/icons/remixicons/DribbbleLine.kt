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

public val RemixIcons.DribbbleLine: ImageVector
    get() {
        if (_dribbbleLine != null) {
            return _dribbbleLine!!
        }
        _dribbbleLine = Builder(name = "DribbbleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.989f, 11.572f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, -1.573f, -4.351f)
                arcToRelative(9.749f, 9.749f, 0.0f, false, true, -0.92f, 0.87f)
                arcToRelative(13.157f, 13.157f, 0.0f, false, true, -3.313f, 2.01f)
                curveToRelative(0.167f, 0.35f, 0.32f, 0.689f, 0.455f, 1.009f)
                verticalLineToRelative(0.003f)
                arcToRelative(9.186f, 9.186f, 0.0f, false, true, 0.11f, 0.27f)
                curveToRelative(1.514f, -0.17f, 3.11f, -0.108f, 4.657f, 0.101f)
                curveToRelative(0.206f, 0.028f, 0.4f, 0.058f, 0.584f, 0.088f)
                close()
                moveTo(10.604f, 4.122f)
                arcToRelative(46.164f, 46.164f, 0.0f, false, true, 2.692f, 4.27f)
                curveToRelative(1.223f, -0.482f, 2.234f, -1.09f, 3.048f, -1.767f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, 0.796f, -0.755f)
                arcTo(7.968f, 7.968f, 0.0f, false, false, 12.0f, 4.0f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, -1.396f, 0.121f)
                close()
                moveTo(4.253f, 9.997f)
                arcToRelative(29.21f, 29.21f, 0.0f, false, false, 2.04f, -0.123f)
                arcToRelative(31.53f, 31.53f, 0.0f, false, false, 4.862f, -0.822f)
                arcToRelative(54.365f, 54.365f, 0.0f, false, false, -2.7f, -4.227f)
                arcToRelative(8.018f, 8.018f, 0.0f, false, false, -4.202f, 5.172f)
                close()
                moveTo(5.783f, 17.035f)
                curveToRelative(0.388f, -0.567f, 0.898f, -1.205f, 1.575f, -1.899f)
                curveToRelative(1.454f, -1.49f, 3.17f, -2.65f, 5.156f, -3.29f)
                lineToRelative(0.062f, -0.018f)
                curveToRelative(-0.165f, -0.364f, -0.32f, -0.689f, -0.476f, -0.995f)
                curveToRelative(-1.836f, 0.535f, -3.77f, 0.869f, -5.697f, 1.042f)
                curveToRelative(-0.94f, 0.085f, -1.783f, 0.122f, -2.403f, 0.128f)
                arcToRelative(7.967f, 7.967f, 0.0f, false, false, 1.784f, 5.032f)
                close()
                moveTo(15.005f, 19.415f)
                arcToRelative(35.947f, 35.947f, 0.0f, false, false, -1.632f, -5.709f)
                curveToRelative(-2.002f, 0.727f, -3.597f, 1.79f, -4.83f, 3.058f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, false, -1.317f, 1.655f)
                arcTo(7.964f, 7.964f, 0.0f, false, false, 12.0f, 20.0f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, false, 3.005f, -0.583f)
                close()
                moveTo(16.878f, 18.34f)
                arcToRelative(7.998f, 7.998f, 0.0f, false, false, 2.987f, -4.87f)
                curveToRelative(-0.34f, -0.085f, -0.771f, -0.17f, -1.245f, -0.236f)
                arcToRelative(12.023f, 12.023f, 0.0f, false, false, -3.18f, -0.033f)
                arcToRelative(39.368f, 39.368f, 0.0f, false, true, 1.438f, 5.14f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _dribbbleLine!!
    }

private var _dribbbleLine: ImageVector? = null
