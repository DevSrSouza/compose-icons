package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Slides: VectorAsset
    get() {
        if (_slides != null) {
            return _slides!!
        }
        _slides = VectorAssetBuilder(name = "Slides", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(14.176f, 15.794f)
                curveToRelative(-0.644f, 0.584f, -1.41f, 0.87f, -2.31f, 0.87f)
                curveToRelative(-0.9f, 0.0f, -1.664f, -0.137f, -2.324f, -0.406f)
                curveToRelative(-0.646f, -0.27f, -0.976f, -0.525f, -0.976f, -0.78f)
                lineToRelative(-0.076f, 0.095f)
                curveToRelative(0.0f, -0.13f, 0.08f, -0.324f, 0.244f, -0.585f)
                curveToRelative(0.163f, -0.26f, 0.31f, -0.39f, 0.44f, -0.39f)
                curveToRelative(0.014f, 0.0f, 0.12f, 0.06f, 0.314f, 0.184f)
                curveToRelative(0.195f, 0.125f, 0.472f, 0.247f, 0.837f, 0.372f)
                curveToRelative(0.364f, 0.123f, 0.804f, 0.185f, 1.317f, 0.185f)
                curveToRelative(0.525f, 0.0f, 0.945f, -0.147f, 1.275f, -0.44f)
                curveToRelative(0.33f, -0.292f, 0.495f, -0.69f, 0.495f, -1.19f)
                reflectiveCurveToRelative(-0.15f, -0.89f, -0.436f, -1.17f)
                curveToRelative(-0.285f, -0.28f, -0.87f, -0.544f, -1.74f, -0.79f)
                curveToRelative(-0.87f, -0.25f, -1.5f, -0.564f, -1.89f, -0.946f)
                curveToRelative(-0.39f, -0.386f, -0.586f, -0.968f, -0.586f, -1.748f)
                reflectiveCurveToRelative(0.3f, -1.435f, 0.9f, -1.962f)
                curveToRelative(0.6f, -0.54f, 1.38f, -0.795f, 2.34f, -0.795f)
                curveToRelative(0.675f, 0.0f, 1.26f, 0.074f, 1.785f, 0.254f)
                curveToRelative(0.524f, 0.165f, 0.78f, 0.36f, 0.78f, 0.555f)
                curveToRelative(0.0f, 0.164f, -0.075f, 0.39f, -0.226f, 0.644f)
                curveToRelative(-0.15f, 0.27f, -0.285f, 0.39f, -0.39f, 0.39f)
                curveToRelative(-0.017f, 0.0f, -0.09f, -0.045f, -0.257f, -0.12f)
                curveToRelative(-0.435f, -0.24f, -0.93f, -0.36f, -1.484f, -0.36f)
                reflectiveCurveToRelative(-0.976f, 0.105f, -1.29f, 0.33f)
                curveToRelative(-0.3f, 0.225f, -0.45f, 0.525f, -0.45f, 0.885f)
                reflectiveCurveToRelative(0.12f, 0.644f, 0.344f, 0.854f)
                reflectiveCurveToRelative(0.615f, 0.39f, 1.17f, 0.57f)
                curveToRelative(1.23f, 0.375f, 2.055f, 0.78f, 2.49f, 1.23f)
                curveToRelative(0.436f, 0.45f, 0.66f, 1.126f, 0.66f, 2.025f)
                curveToRelative(0.002f, 0.9f, -0.312f, 1.65f, -0.958f, 2.234f)
                close()
            }
        }
        .build()
        return _slides!!
    }

private var _slides: VectorAsset? = null
