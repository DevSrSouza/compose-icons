package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ArrowBackCircle: ImageVector
    get() {
        if (_arrowBackCircle != null) {
            return _arrowBackCircle!!
        }
        _arrowBackCircle = Builder(name = "ArrowBackCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.87f, 93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                close()
                moveTo(260.65f, 164.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.09f, 22.63f)
                lineTo(208.42f, 240.0f)
                lineTo(342.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                lineTo(208.42f, 272.0f)
                lineToRelative(52.32f, 52.73f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 238.0f, 347.27f)
                lineToRelative(-79.39f, -80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.54f)
                lineToRelative(79.39f, -80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 260.65f, 164.64f)
                close()
            }
        }
        .build()
        return _arrowBackCircle!!
    }

private var _arrowBackCircle: ImageVector? = null
