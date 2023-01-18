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

public val IonIcons.CaretDownOutline: ImageVector
    get() {
        if (_caretDownOutline != null) {
            return _caretDownOutline!!
        }
        _caretDownOutline = Builder(name = "CaretDownOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 190.06f)
                lineTo(237.78f, 353.18f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 36.44f, 0.0f)
                lineTo(414.0f, 190.06f)
                curveToRelative(13.34f, -15.57f, 2.28f, -39.62f, -18.22f, -39.62f)
                horizontalLineTo(116.18f)
                curveTo(95.68f, 150.44f, 84.62f, 174.49f, 98.0f, 190.06f)
                close()
            }
        }
        .build()
        return _caretDownOutline!!
    }

private var _caretDownOutline: ImageVector? = null