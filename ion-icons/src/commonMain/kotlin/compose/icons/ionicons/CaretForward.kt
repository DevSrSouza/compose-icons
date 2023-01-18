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

public val IonIcons.CaretForward: ImageVector
    get() {
        if (_caretForward != null) {
            return _caretForward!!
        }
        _caretForward = Builder(name = "CaretForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.06f, 414.0f)
                lineTo(353.18f, 274.22f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -36.44f)
                lineTo(190.06f, 98.0f)
                curveToRelative(-15.57f, -13.34f, -39.62f, -2.28f, -39.62f, 18.22f)
                verticalLineTo(395.82f)
                curveTo(150.44f, 416.32f, 174.49f, 427.38f, 190.06f, 414.0f)
                close()
            }
        }
        .build()
        return _caretForward!!
    }

private var _caretForward: ImageVector? = null
