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

public val SimpleIcons.Campaignmonitor: ImageVector
    get() {
        if (_campaignmonitor != null) {
            return _campaignmonitor!!
        }
        _campaignmonitor = Builder(name = "Campaignmonitor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.836f, 4.27f)
                curveToRelative(-0.29f, -0.413f, -0.86f, -0.515f, -1.273f, -0.226f)
                lineTo(0.163f, 19.73f)
                curveToRelative(0.167f, 0.235f, 0.437f, 0.39f, 0.747f, 0.39f)
                horizontalLineToRelative(22.18f)
                curveToRelative(0.503f, 0.0f, 0.91f, -0.41f, 0.91f, -0.914f)
                lineTo(24.0f, 4.78f)
                curveToRelative(-0.004f, -0.176f, -0.058f, -0.352f, -0.164f, -0.51f)
                close()
                moveTo(1.436f, 4.044f)
                curveToRelative(-0.413f, -0.29f, -0.982f, -0.19f, -1.272f, 0.226f)
                curveToRelative(-0.107f, 0.154f, -0.162f, 0.332f, -0.164f, 0.51f)
                verticalLineToRelative(14.45f)
                lineToRelative(10.664f, -8.736f)
                lineToRelative(-9.227f, -6.45f)
                verticalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _campaignmonitor!!
    }

private var _campaignmonitor: ImageVector? = null
