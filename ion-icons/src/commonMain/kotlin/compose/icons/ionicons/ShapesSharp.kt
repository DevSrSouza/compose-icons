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

public val IonIcons.ShapesSharp: ImageVector
    get() {
        if (_shapesSharp != null) {
            return _shapesSharp!!
        }
        _shapesSharp = Builder(name = "ShapesSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(363.27f, 336.0f)
                horizontalLineTo(4.73f)
                lineTo(184.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 160.0f)
                arcToRelative(160.54f, 160.54f, 0.0f, false, false, -32.55f, 3.36f)
                lineToRelative(87.75f, 157.0f)
                lineTo(417.81f, 368.0f)
                horizontalLineTo(183.36f)
                curveTo(203.8f, 432.85f, 264.49f, 480.0f, 336.0f, 480.0f)
                curveToRelative(88.22f, 0.0f, 160.0f, -71.78f, 160.0f, -160.0f)
                reflectiveCurveTo(424.22f, 160.0f, 336.0f, 160.0f)
                close()
            }
        }
        .build()
        return _shapesSharp!!
    }

private var _shapesSharp: ImageVector? = null
