package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MicrophoneAlt: ImageVector
    get() {
        if (_microphoneAlt != null) {
            return _microphoneAlt!!
        }
        _microphoneAlt = Builder(name = "MicrophoneAlt", defaultWidth = 352.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 352.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 192.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 74.8f, -64.49f, 134.82f, -140.79f, 127.38f)
                curveTo(96.71f, 376.89f, 48.0f, 317.11f, 48.0f, 250.3f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(40.16f)
                curveToRelative(0.0f, 89.64f, 63.97f, 169.55f, 152.0f, 181.69f)
                verticalLineTo(464.0f)
                horizontalLineTo(96.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(160.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineToRelative(-33.77f)
                curveTo(285.71f, 418.47f, 352.0f, 344.9f, 352.0f, 256.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(176.0f, 352.0f)
                curveToRelative(53.02f, 0.0f, 96.0f, -42.98f, 96.0f, -96.0f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0.0f, -10.67f, -3.58f, -10.67f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 4.78f, -8.0f, 10.67f, -8.0f)
                horizontalLineTo(272.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0.0f, -10.67f, -3.58f, -10.67f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 4.78f, -8.0f, 10.67f, -8.0f)
                horizontalLineTo(272.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0.0f, -10.67f, -3.58f, -10.67f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 4.78f, -8.0f, 10.67f, -8.0f)
                horizontalLineTo(272.0f)
                curveToRelative(0.0f, -53.02f, -42.98f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveTo(80.0f, 42.98f, 80.0f, 96.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 53.02f, 42.98f, 96.0f, 96.0f, 96.0f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
