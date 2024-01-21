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

public val RegularGroup.FaceGrinStars: ImageVector
    get() {
        if (_faceGrinStars != null) {
            return _faceGrinStars!!
        }
        _faceGrinStars = Builder(name = "FaceGrinStars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(183.2f, 132.6f)
                curveToRelative(-1.3f, -2.8f, -4.1f, -4.6f, -7.2f, -4.6f)
                reflectiveCurveToRelative(-5.9f, 1.8f, -7.2f, 4.6f)
                lineToRelative(-16.6f, 34.7f)
                lineToRelative(-38.1f, 5.0f)
                curveToRelative(-3.1f, 0.4f, -5.6f, 2.5f, -6.6f, 5.5f)
                reflectiveCurveToRelative(-0.1f, 6.2f, 2.1f, 8.3f)
                lineToRelative(27.9f, 26.5f)
                lineToRelative(-7.0f, 37.8f)
                curveToRelative(-0.6f, 3.0f, 0.7f, 6.1f, 3.2f, 7.9f)
                reflectiveCurveToRelative(5.8f, 2.0f, 8.5f, 0.6f)
                lineTo(176.0f, 240.5f)
                lineToRelative(33.8f, 18.3f)
                curveToRelative(2.7f, 1.5f, 6.0f, 1.3f, 8.5f, -0.6f)
                reflectiveCurveToRelative(3.7f, -4.9f, 3.2f, -7.9f)
                lineToRelative(-7.0f, -37.8f)
                lineTo(242.4f, 186.0f)
                curveToRelative(2.2f, -2.1f, 3.1f, -5.3f, 2.1f, -8.3f)
                reflectiveCurveToRelative(-3.5f, -5.1f, -6.6f, -5.5f)
                lineToRelative(-38.1f, -5.0f)
                lineToRelative(-16.6f, -34.7f)
                close()
                moveTo(343.2f, 132.6f)
                curveToRelative(-1.3f, -2.8f, -4.1f, -4.6f, -7.2f, -4.6f)
                reflectiveCurveToRelative(-5.9f, 1.8f, -7.2f, 4.6f)
                lineToRelative(-16.6f, 34.7f)
                lineToRelative(-38.1f, 5.0f)
                curveToRelative(-3.1f, 0.4f, -5.6f, 2.5f, -6.6f, 5.5f)
                reflectiveCurveToRelative(-0.1f, 6.2f, 2.1f, 8.3f)
                lineToRelative(27.9f, 26.5f)
                lineToRelative(-7.0f, 37.8f)
                curveToRelative(-0.6f, 3.0f, 0.7f, 6.1f, 3.2f, 7.9f)
                reflectiveCurveToRelative(5.8f, 2.0f, 8.5f, 0.6f)
                lineTo(336.0f, 240.5f)
                lineToRelative(33.8f, 18.3f)
                curveToRelative(2.7f, 1.5f, 6.0f, 1.3f, 8.5f, -0.6f)
                reflectiveCurveToRelative(3.7f, -4.9f, 3.2f, -7.9f)
                lineToRelative(-7.0f, -37.8f)
                lineTo(402.4f, 186.0f)
                curveToRelative(2.2f, -2.1f, 3.1f, -5.3f, 2.1f, -8.3f)
                reflectiveCurveToRelative(-3.5f, -5.1f, -6.6f, -5.5f)
                lineToRelative(-38.1f, -5.0f)
                lineToRelative(-16.6f, -34.7f)
                close()
                moveTo(349.5f, 308.4f)
                curveToRelative(-28.9f, 6.8f, -60.5f, 10.5f, -93.6f, 10.5f)
                reflectiveCurveToRelative(-64.7f, -3.7f, -93.6f, -10.5f)
                curveToRelative(-18.7f, -4.4f, -35.9f, 12.0f, -25.5f, 28.1f)
                curveToRelative(24.6f, 38.1f, 68.7f, 63.5f, 119.1f, 63.5f)
                reflectiveCurveToRelative(94.5f, -25.4f, 119.1f, -63.5f)
                curveToRelative(10.4f, -16.1f, -6.8f, -32.5f, -25.5f, -28.1f)
                close()
            }
        }
        .build()
        return _faceGrinStars!!
    }

private var _faceGrinStars: ImageVector? = null
