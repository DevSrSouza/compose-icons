package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.VoiceOverOff: ImageVector
    get() {
        if (_voiceOverOff != null) {
            return _voiceOverOff!!
        }
        _voiceOverOff = Builder(name = "VoiceOverOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.0f)
                curveToRelative(-2.69f, 0.0f, -5.77f, 1.28f, -6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(-0.2f, -0.71f, -3.3f, -2.0f, -6.0f, -2.0f)
                close()
                moveTo(7.0f, 9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.22f, 0.0f, 0.42f, -0.04f, 0.62f, -0.11f)
                lineTo(7.11f, 8.38f)
                curveToRelative(-0.07f, 0.2f, -0.11f, 0.4f, -0.11f, 0.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.76f, 5.36f)
                lineToRelative(-1.68f, 1.69f)
                curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f)
                lineToRelative(1.7f, 1.7f)
                curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f)
                close()
                moveTo(20.07f, 2.0f)
                lineToRelative(-1.63f, 1.63f)
                curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f)
                close()
                moveTo(9.43f, 5.04f)
                lineToRelative(3.53f, 3.53f)
                curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f)
                close()
                moveTo(4.41f, 2.86f)
                lineTo(3.0f, 4.27f)
                lineToRelative(2.62f, 2.62f)
                curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f)
                lineToRelative(4.4f, 4.4f)
                curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f)
                lineTo(19.73f, 21.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                close()
                moveTo(3.0f, 19.0f)
                curveToRelative(0.22f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f)
                curveToRelative(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(9.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.22f, 0.04f, -0.42f, 0.11f, -0.62f)
                lineToRelative(2.51f, 2.51f)
                curveToRelative(-0.2f, 0.07f, -0.4f, 0.11f, -0.62f, 0.11f)
                close()
            }
        }
        .build()
        return _voiceOverOff!!
    }

private var _voiceOverOff: ImageVector? = null
