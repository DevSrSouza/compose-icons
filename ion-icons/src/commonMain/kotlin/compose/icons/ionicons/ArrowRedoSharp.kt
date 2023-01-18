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

public val IonIcons.ArrowRedoSharp: ImageVector
    get() {
        if (_arrowRedoSharp != null) {
            return _arrowRedoSharp!!
        }
        _arrowRedoSharp = Builder(name = "ArrowRedoSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 399.26f)
                curveTo(48.0f, 335.19f, 62.44f, 284.0f, 90.91f, 247.0f)
                curveToRelative(34.38f, -44.67f, 88.68f, -68.77f, 161.56f, -71.75f)
                verticalLineTo(72.0f)
                lineTo(464.0f, 252.0f)
                lineTo(252.47f, 432.0f)
                verticalLineTo(329.35f)
                curveToRelative(-44.25f, 1.19f, -77.66f, 7.58f, -104.27f, 19.84f)
                curveToRelative(-28.75f, 13.25f, -49.6f, 33.05f, -72.08f, 58.7f)
                lineTo(48.0f, 440.0f)
                close()
            }
        }
        .build()
        return _arrowRedoSharp!!
    }

private var _arrowRedoSharp: ImageVector? = null
