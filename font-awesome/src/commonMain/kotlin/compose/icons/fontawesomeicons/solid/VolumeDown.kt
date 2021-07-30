package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.03f, 72.04f)
                lineTo(126.06f, 161.0f)
                lineTo(24.0f, 161.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 13.25f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                lineTo(256.0f, 89.02f)
                curveToRelative(0.0f, -21.47f, -25.96f, -31.98f, -40.97f, -16.98f)
                close()
                moveTo(338.23f, 180.12f)
                curveToRelative(-11.58f, -6.33f, -26.19f, -2.16f, -32.61f, 9.45f)
                curveToRelative(-6.39f, 11.61f, -2.16f, 26.2f, 9.45f, 32.61f)
                curveTo(327.98f, 229.28f, 336.0f, 242.62f, 336.0f, 257.0f)
                curveToRelative(0.0f, 14.38f, -8.02f, 27.72f, -20.92f, 34.81f)
                curveToRelative(-11.61f, 6.41f, -15.84f, 21.0f, -9.45f, 32.61f)
                curveToRelative(6.43f, 11.66f, 21.05f, 15.8f, 32.61f, 9.45f)
                curveToRelative(28.23f, -15.55f, 45.77f, -45.0f, 45.77f, -76.88f)
                reflectiveCurveToRelative(-17.54f, -61.32f, -45.78f, -76.87f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
