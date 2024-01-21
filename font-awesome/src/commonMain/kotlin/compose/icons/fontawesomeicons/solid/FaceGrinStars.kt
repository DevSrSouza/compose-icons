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

public val SolidGroup.FaceGrinStars: ImageVector
    get() {
        if (_faceGrinStars != null) {
            return _faceGrinStars!!
        }
        _faceGrinStars = Builder(name = "FaceGrinStars", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(407.4f, 331.5f)
                curveToRelative(5.0f, -11.8f, -7.0f, -22.5f, -19.3f, -18.7f)
                curveToRelative(-39.7f, 12.2f, -84.5f, 19.0f, -131.8f, 19.0f)
                reflectiveCurveToRelative(-92.1f, -6.8f, -131.8f, -19.0f)
                curveToRelative(-12.3f, -3.8f, -24.3f, 6.9f, -19.3f, 18.7f)
                curveToRelative(25.0f, 59.1f, 83.2f, 100.5f, 151.1f, 100.5f)
                reflectiveCurveToRelative(126.2f, -41.4f, 151.1f, -100.5f)
                close()
                moveTo(160.0f, 120.0f)
                curveToRelative(-3.1f, 0.0f, -5.9f, 1.8f, -7.2f, 4.6f)
                lineToRelative(-16.6f, 34.7f)
                lineToRelative(-38.1f, 5.0f)
                curveToRelative(-3.1f, 0.4f, -5.6f, 2.5f, -6.6f, 5.5f)
                reflectiveCurveToRelative(-0.1f, 6.2f, 2.1f, 8.3f)
                lineToRelative(27.9f, 26.5f)
                lineToRelative(-7.0f, 37.8f)
                curveToRelative(-0.6f, 3.0f, 0.7f, 6.1f, 3.2f, 7.9f)
                reflectiveCurveToRelative(5.8f, 2.0f, 8.5f, 0.6f)
                lineTo(160.0f, 232.5f)
                lineToRelative(33.8f, 18.3f)
                curveToRelative(2.7f, 1.5f, 6.0f, 1.3f, 8.5f, -0.6f)
                reflectiveCurveToRelative(3.7f, -4.9f, 3.2f, -7.9f)
                lineToRelative(-7.0f, -37.8f)
                lineTo(226.4f, 178.0f)
                curveToRelative(2.2f, -2.1f, 3.1f, -5.3f, 2.1f, -8.3f)
                reflectiveCurveToRelative(-3.5f, -5.1f, -6.6f, -5.5f)
                lineToRelative(-38.1f, -5.0f)
                lineToRelative(-16.6f, -34.7f)
                curveToRelative(-1.3f, -2.8f, -4.1f, -4.6f, -7.2f, -4.6f)
                close()
                moveTo(352.0f, 120.0f)
                curveToRelative(-3.1f, 0.0f, -5.9f, 1.8f, -7.2f, 4.6f)
                lineToRelative(-16.6f, 34.7f)
                lineToRelative(-38.1f, 5.0f)
                curveToRelative(-3.1f, 0.4f, -5.6f, 2.5f, -6.6f, 5.5f)
                reflectiveCurveToRelative(-0.1f, 6.2f, 2.1f, 8.3f)
                lineToRelative(27.9f, 26.5f)
                lineToRelative(-7.0f, 37.8f)
                curveToRelative(-0.6f, 3.0f, 0.7f, 6.1f, 3.2f, 7.9f)
                reflectiveCurveToRelative(5.8f, 2.0f, 8.5f, 0.6f)
                lineTo(352.0f, 232.5f)
                lineToRelative(33.8f, 18.3f)
                curveToRelative(2.7f, 1.5f, 6.0f, 1.3f, 8.5f, -0.6f)
                reflectiveCurveToRelative(3.7f, -4.9f, 3.2f, -7.9f)
                lineToRelative(-7.0f, -37.8f)
                lineTo(418.4f, 178.0f)
                curveToRelative(2.2f, -2.1f, 3.1f, -5.3f, 2.1f, -8.3f)
                reflectiveCurveToRelative(-3.5f, -5.1f, -6.6f, -5.5f)
                lineToRelative(-38.1f, -5.0f)
                lineToRelative(-16.6f, -34.7f)
                curveToRelative(-1.3f, -2.8f, -4.1f, -4.6f, -7.2f, -4.6f)
                close()
            }
        }
        .build()
        return _faceGrinStars!!
    }

private var _faceGrinStars: ImageVector? = null
