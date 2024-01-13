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

public val SimpleIcons.Scrapy: ImageVector
    get() {
        if (_scrapy != null) {
            return _scrapy!!
        }
        _scrapy = Builder(name = "Scrapy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.372f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 1.113f)
                curveToRelative(6.003f, 0.0f, 10.887f, 4.884f, 10.887f, 10.887f)
                reflectiveCurveTo(18.003f, 22.887f, 12.0f, 22.887f)
                reflectiveCurveTo(1.113f, 18.003f, 1.113f, 12.0f)
                reflectiveCurveTo(5.997f, 1.113f, 12.0f, 1.113f)
                close()
                moveTo(19.03f, 6.314f)
                curveToRelative(-0.536f, -0.002f, -1.28f, 0.304f, -2.255f, 1.098f)
                curveToRelative(-1.052f, 0.858f, -3.814f, 3.045f, -3.814f, 3.045f)
                lineToRelative(1.025f, 1.3f)
                curveToRelative(4.694f, -2.558f, 6.19f, -3.167f, 6.116f, -4.294f)
                curveToRelative(-0.042f, -0.634f, -0.384f, -1.146f, -1.073f, -1.149f)
                close()
                moveTo(18.523f, 7.066f)
                curveToRelative(0.147f, 0.0f, 0.266f, 0.106f, 0.266f, 0.239f)
                curveToRelative(0.0f, 0.132f, -0.119f, 0.238f, -0.266f, 0.238f)
                curveToRelative(-0.146f, 0.0f, -0.265f, -0.106f, -0.265f, -0.238f)
                curveToRelative(0.0f, -0.171f, 0.162f, -0.239f, 0.265f, -0.239f)
                close()
                moveTo(16.943f, 8.555f)
                curveToRelative(0.0f, 0.131f, -0.118f, 0.238f, -0.265f, 0.238f)
                curveToRelative(-0.147f, 0.0f, -0.264f, -0.107f, -0.264f, -0.238f)
                curveToRelative(0.0f, -0.128f, 0.11f, -0.234f, 0.24f, -0.24f)
                curveToRelative(0.13f, -0.006f, 0.29f, 0.077f, 0.29f, 0.24f)
                close()
                moveTo(14.834f, 9.565f)
                curveToRelative(0.147f, 0.0f, 0.266f, 0.106f, 0.266f, 0.238f)
                reflectiveCurveToRelative(-0.12f, 0.238f, -0.266f, 0.238f)
                curveToRelative(-0.146f, 0.0f, -0.266f, -0.106f, -0.266f, -0.238f)
                curveToRelative(0.0f, -0.148f, 0.139f, -0.239f, 0.266f, -0.239f)
                close()
                moveTo(12.389f, 10.537f)
                curveToRelative(-1.502f, 0.225f, -5.807f, 0.992f, -8.01f, 2.672f)
                lineToRelative(3.574f, 5.387f)
                reflectiveCurveToRelative(4.706f, -2.932f, 5.863f, -6.244f)
                close()
            }
        }
        .build()
        return _scrapy!!
    }

private var _scrapy: ImageVector? = null
