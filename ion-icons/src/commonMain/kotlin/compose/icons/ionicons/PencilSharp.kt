package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PencilSharp: ImageVector
    get() {
        if (_pencilSharp != null) {
            return _pencilSharp!!
        }
        _pencilSharp = Builder(name = "PencilSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(103.0f, 464.0f)
                lineToRelative(-55.0f, 0.0f)
                lineToRelative(0.0f, -55.0f)
                lineToRelative(310.14f, -310.91f)
                lineToRelative(55.77f, 55.78f)
                lineToRelative(-310.91f, 310.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(425.72f, 142.0f)
                lineTo(370.0f, 86.28f)
                lineToRelative(31.66f, -30.66f)
                curveTo(406.55f, 50.7f, 414.05f, 48.0f, 421.0f, 48.0f)
                arcToRelative(25.91f, 25.91f, 0.0f, false, true, 18.42f, 7.62f)
                lineToRelative(17.0f, 17.0f)
                arcTo(25.87f, 25.87f, 0.0f, false, true, 464.0f, 91.0f)
                curveToRelative(0.0f, 7.0f, -2.71f, 14.45f, -7.62f, 19.36f)
                close()
                moveTo(418.2f, 71.17f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _pencilSharp!!
    }

private var _pencilSharp: ImageVector? = null
