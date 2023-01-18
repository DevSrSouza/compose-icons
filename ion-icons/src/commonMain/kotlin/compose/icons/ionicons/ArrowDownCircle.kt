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

public val IonIcons.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                curveToRelative(114.87f, 0.0f, 208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveTo(141.13f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(164.64f, 251.35f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, -0.09f)
                lineTo(240.0f, 303.58f)
                verticalLineTo(170.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineTo(303.58f)
                lineToRelative(52.73f, -52.32f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 347.27f, 274.0f)
                lineToRelative(-80.0f, 79.39f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.54f, 0.0f)
                lineToRelative(-80.0f, -79.39f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.64f, 251.35f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
