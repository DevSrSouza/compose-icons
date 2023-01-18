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

public val IonIcons.ArrowUpCircle: ImageVector
    get() {
        if (_arrowUpCircle != null) {
            return _arrowUpCircle!!
        }
        _arrowUpCircle = Builder(name = "ArrowUpCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(347.36f, 260.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.09f)
                lineTo(272.0f, 208.42f)
                lineTo(272.0f, 342.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(240.0f, 208.42f)
                lineToRelative(-52.73f, 52.32f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 164.73f, 238.0f)
                lineToRelative(80.0f, -79.39f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.54f, 0.0f)
                lineToRelative(80.0f, 79.39f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 347.36f, 260.65f)
                close()
            }
        }
        .build()
        return _arrowUpCircle!!
    }

private var _arrowUpCircle: ImageVector? = null
