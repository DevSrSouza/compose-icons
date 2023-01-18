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

public val IonIcons.InvertModeSharp: ImageVector
    get() {
        if (_invertModeSharp != null) {
            return _invertModeSharp!!
        }
        _invertModeSharp = Builder(name = "InvertModeSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(256.0f, 432.0f)
                verticalLineTo(336.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 0.0f, -160.0f)
                verticalLineTo(80.0f)
                curveTo(353.05f, 80.0f, 432.0f, 159.0f, 432.0f, 256.0f)
                reflectiveCurveTo(353.05f, 432.0f, 256.0f, 432.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 256.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, -80.0f)
                verticalLineTo(336.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 336.0f, 256.0f)
                close()
            }
        }
        .build()
        return _invertModeSharp!!
    }

private var _invertModeSharp: ImageVector? = null
