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

public val IonIcons.CaretUpCircle: ImageVector
    get() {
        if (_caretUpCircle != null) {
            return _caretUpCircle!!
        }
        _caretUpCircle = Builder(name = "CaretUpCircle", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(330.14f, 300.0f)
                lineTo(181.86f, 300.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.29f, -26.23f)
                lineToRelative(74.13f, -89.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.6f, 0.0f)
                lineToRelative(74.13f, 89.09f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 330.14f, 300.0f)
                close()
            }
        }
        .build()
        return _caretUpCircle!!
    }

private var _caretUpCircle: ImageVector? = null
