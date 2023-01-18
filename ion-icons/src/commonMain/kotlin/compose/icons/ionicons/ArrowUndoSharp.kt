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

public val IonIcons.ArrowUndoSharp: ImageVector
    get() {
        if (_arrowUndoSharp != null) {
            return _arrowUndoSharp!!
        }
        _arrowUndoSharp = Builder(name = "ArrowUndoSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 440.0f)
                lineToRelative(-28.12f, -32.11f)
                curveToRelative(-22.48f, -25.65f, -43.33f, -45.45f, -72.08f, -58.7f)
                curveToRelative(-26.61f, -12.26f, -60.0f, -18.65f, -104.27f, -19.84f)
                verticalLineTo(432.0f)
                lineTo(48.0f, 252.0f)
                lineTo(259.53f, 72.0f)
                verticalLineTo(175.21f)
                curveToRelative(72.88f, 3.0f, 127.18f, 27.08f, 161.56f, 71.75f)
                curveTo(449.56f, 284.0f, 464.0f, 335.19f, 464.0f, 399.26f)
                close()
            }
        }
        .build()
        return _arrowUndoSharp!!
    }

private var _arrowUndoSharp: ImageVector? = null
