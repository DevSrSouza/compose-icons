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

public val IonIcons.ChevronBackCircle: ImageVector
    get() {
        if (_chevronBackCircle != null) {
            return _chevronBackCircle!!
        }
        _chevronBackCircle = Builder(name = "ChevronBackCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(291.31f, 340.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.62f, 22.62f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.62f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.62f, 22.62f)
                lineTo(206.63f, 256.0f)
                close()
            }
        }
        .build()
        return _chevronBackCircle!!
    }

private var _chevronBackCircle: ImageVector? = null
