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

public val IonIcons.CaretUpOutline: ImageVector
    get() {
        if (_caretUpOutline != null) {
            return _caretUpOutline!!
        }
        _caretUpOutline = Builder(name = "CaretUpOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.0f, 321.94f)
                lineTo(274.22f, 158.82f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -36.44f, 0.0f)
                lineTo(98.0f, 321.94f)
                curveToRelative(-13.34f, 15.57f, -2.28f, 39.62f, 18.22f, 39.62f)
                horizontalLineTo(395.82f)
                curveTo(416.32f, 361.56f, 427.38f, 337.51f, 414.0f, 321.94f)
                close()
            }
        }
        .build()
        return _caretUpOutline!!
    }

private var _caretUpOutline: ImageVector? = null
