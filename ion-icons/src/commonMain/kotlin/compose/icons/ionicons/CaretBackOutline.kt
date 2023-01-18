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

public val IonIcons.CaretBackOutline: ImageVector
    get() {
        if (_caretBackOutline != null) {
            return _caretBackOutline!!
        }
        _caretBackOutline = Builder(name = "CaretBackOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(321.94f, 98.0f)
                lineTo(158.82f, 237.78f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 36.44f)
                lineTo(321.94f, 414.0f)
                curveToRelative(15.57f, 13.34f, 39.62f, 2.28f, 39.62f, -18.22f)
                verticalLineTo(116.18f)
                curveTo(361.56f, 95.68f, 337.51f, 84.62f, 321.94f, 98.0f)
                close()
            }
        }
        .build()
        return _caretBackOutline!!
    }

private var _caretBackOutline: ImageVector? = null
