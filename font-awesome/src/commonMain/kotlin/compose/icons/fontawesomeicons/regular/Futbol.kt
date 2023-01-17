package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.1f, 228.6f)
                lineTo(207.9f, 320.0f)
                horizontalLineToRelative(96.5f)
                lineToRelative(29.62f, -91.38f)
                lineTo(256.0f, 172.1f)
                lineTo(177.1f, 228.6f)
                close()
                moveTo(255.1f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(255.1f, -114.6f, 255.1f, -255.1f)
                reflectiveCurveTo(397.4f, 0.0f, 255.1f, 0.0f)
                close()
                moveTo(435.2f, 361.1f)
                lineToRelative(-103.9f, -1.578f)
                lineToRelative(-30.67f, 99.52f)
                curveTo(286.2f, 462.2f, 271.3f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(-30.19f, -1.773f, -44.56f, -4.93f)
                lineTo(180.8f, 359.6f)
                lineTo(76.83f, 361.1f)
                curveToRelative(-14.93f, -25.35f, -24.79f, -54.01f, -27.8f, -84.72f)
                lineTo(134.3f, 216.4f)
                lineTo(100.7f, 118.1f)
                curveToRelative(19.85f, -22.34f, 44.32f, -40.45f, 72.04f, -52.62f)
                lineTo(256.0f, 128.0f)
                lineToRelative(83.29f, -62.47f)
                curveToRelative(27.72f, 12.17f, 52.19f, 30.27f, 72.04f, 52.62f)
                lineTo(377.7f, 216.4f)
                lineToRelative(85.23f, 59.97f)
                curveTo(459.1f, 307.1f, 450.1f, 335.8f, 435.2f, 361.1f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
