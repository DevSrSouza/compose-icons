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

public val SolidGroup.MicrophoneSlash: ImageVector
    get() {
        if (_microphoneSlash != null) {
            return _microphoneSlash!!
        }
        _microphoneSlash = Builder(name = "MicrophoneSlash", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(633.82f, 458.1f)
                lineToRelative(-157.8f, -121.96f)
                curveTo(488.61f, 312.13f, 496.0f, 285.01f, 496.0f, 256.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.92f, -3.96f, 34.8f, -10.72f, 50.2f)
                lineToRelative(-26.55f, -20.52f)
                curveToRelative(3.1f, -9.4f, 5.28f, -19.22f, 5.28f, -29.67f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 42.98f, -96.0f, 96.0f)
                verticalLineToRelative(45.36f)
                lineTo(45.47f, 3.37f)
                curveTo(38.49f, -2.05f, 28.43f, -0.8f, 23.01f, 6.18f)
                lineTo(3.37f, 31.45f)
                curveTo(-2.05f, 38.42f, -0.8f, 48.47f, 6.18f, 53.9f)
                lineToRelative(588.36f, 454.73f)
                curveToRelative(6.98f, 5.43f, 17.03f, 4.17f, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                curveToRelative(5.41f, -6.97f, 4.16f, -17.02f, -2.82f, -22.45f)
                close()
                moveTo(400.0f, 464.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(-33.77f)
                curveToRelative(11.66f, -1.6f, 22.85f, -4.54f, 33.67f, -8.31f)
                lineToRelative(-50.11f, -38.73f)
                curveToRelative(-6.71f, 0.4f, -13.41f, 0.87f, -20.35f, 0.2f)
                curveToRelative(-55.85f, -5.45f, -98.74f, -48.63f, -111.18f, -101.85f)
                lineTo(144.0f, 241.31f)
                verticalLineToRelative(6.85f)
                curveToRelative(0.0f, 89.64f, 63.97f, 169.55f, 152.0f, 181.69f)
                verticalLineTo(464.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _microphoneSlash!!
    }

private var _microphoneSlash: ImageVector? = null
