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

public val BrandsGroup.Weixin: ImageVector
    get() {
        if (_weixin != null) {
            return _weixin!!
        }
        _weixin = Builder(name = "Weixin", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(385.2f, 167.6f)
                curveToRelative(6.4f, 0.0f, 12.6f, 0.3f, 18.8f, 1.1f)
                curveTo(387.4f, 90.3f, 303.3f, 32.0f, 207.7f, 32.0f)
                curveTo(100.5f, 32.0f, 13.0f, 104.8f, 13.0f, 197.4f)
                curveToRelative(0.0f, 53.4f, 29.3f, 97.5f, 77.9f, 131.6f)
                lineToRelative(-19.3f, 58.6f)
                lineToRelative(68.0f, -34.1f)
                curveToRelative(24.4f, 4.8f, 43.8f, 9.7f, 68.2f, 9.7f)
                curveToRelative(6.2f, 0.0f, 12.1f, -0.3f, 18.3f, -0.8f)
                curveToRelative(-4.0f, -12.9f, -6.2f, -26.6f, -6.2f, -40.8f)
                curveToRelative(-0.1f, -84.9f, 72.9f, -154.0f, 165.3f, -154.0f)
                close()
                moveTo(280.7f, 114.7f)
                curveToRelative(14.5f, 0.0f, 24.2f, 9.7f, 24.2f, 24.4f)
                curveToRelative(0.0f, 14.5f, -9.7f, 24.2f, -24.2f, 24.2f)
                curveToRelative(-14.8f, 0.0f, -29.3f, -9.7f, -29.3f, -24.2f)
                curveToRelative(0.1f, -14.7f, 14.6f, -24.4f, 29.3f, -24.4f)
                close()
                moveTo(144.3f, 163.3f)
                curveToRelative(-14.5f, 0.0f, -29.3f, -9.7f, -29.3f, -24.2f)
                curveToRelative(0.0f, -14.8f, 14.8f, -24.4f, 29.3f, -24.4f)
                curveToRelative(14.8f, 0.0f, 24.4f, 9.7f, 24.4f, 24.4f)
                curveToRelative(0.0f, 14.6f, -9.6f, 24.2f, -24.4f, 24.2f)
                close()
                moveTo(563.0f, 319.4f)
                curveToRelative(0.0f, -77.9f, -77.9f, -141.3f, -165.4f, -141.3f)
                curveToRelative(-92.7f, 0.0f, -165.4f, 63.4f, -165.4f, 141.3f)
                reflectiveCurveTo(305.0f, 460.7f, 397.6f, 460.7f)
                curveToRelative(19.3f, 0.0f, 38.9f, -5.1f, 58.6f, -9.9f)
                lineToRelative(53.4f, 29.3f)
                lineToRelative(-14.8f, -48.6f)
                curveTo(534.0f, 402.1f, 563.0f, 363.2f, 563.0f, 319.4f)
                close()
                moveTo(343.9f, 294.9f)
                curveToRelative(-9.7f, 0.0f, -19.3f, -9.7f, -19.3f, -19.6f)
                curveToRelative(0.0f, -9.7f, 9.7f, -19.3f, 19.3f, -19.3f)
                curveToRelative(14.8f, 0.0f, 24.4f, 9.7f, 24.4f, 19.3f)
                curveToRelative(0.0f, 10.0f, -9.7f, 19.6f, -24.4f, 19.6f)
                close()
                moveTo(451.0f, 294.9f)
                curveToRelative(-9.7f, 0.0f, -19.3f, -9.7f, -19.3f, -19.6f)
                curveToRelative(0.0f, -9.7f, 9.7f, -19.3f, 19.3f, -19.3f)
                curveToRelative(14.5f, 0.0f, 24.4f, 9.7f, 24.4f, 19.3f)
                curveToRelative(0.1f, 10.0f, -9.9f, 19.6f, -24.4f, 19.6f)
                close()
            }
        }
        .build()
        return _weixin!!
    }

private var _weixin: ImageVector? = null
