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

public val IonIcons.StopCircle: ImageVector
    get() {
        if (_stopCircle != null) {
            return _stopCircle!!
        }
        _stopCircle = Builder(name = "StopCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(336.0f, 310.4f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 310.4f, 336.0f)
                lineTo(201.6f, 336.0f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 176.0f, 310.4f)
                lineTo(176.0f, 201.6f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 201.6f, 176.0f)
                lineTo(310.4f, 176.0f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 336.0f, 201.6f)
                close()
            }
        }
        .build()
        return _stopCircle!!
    }

private var _stopCircle: ImageVector? = null
