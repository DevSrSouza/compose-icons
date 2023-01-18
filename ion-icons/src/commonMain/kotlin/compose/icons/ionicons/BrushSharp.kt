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

public val IonIcons.BrushSharp: ImageVector
    get() {
        if (_brushSharp != null) {
            return _brushSharp!!
        }
        _brushSharp = Builder(name = "BrushSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 96.0f)
                lineTo(416.0f, 32.0f)
                lineTo(172.0f, 292.0f)
                lineToRelative(64.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 320.0f)
                curveToRelative(-36.52f, 0.0f, -66.0f, 30.63f, -66.0f, 68.57f)
                curveToRelative(0.0f, 25.43f, -31.0f, 45.72f, -44.0f, 45.72f)
                curveTo(52.24f, 462.17f, 86.78f, 480.0f, 120.0f, 480.0f)
                curveToRelative(48.62f, 0.0f, 88.0f, -40.91f, 88.0f, -91.43f)
                curveTo(208.0f, 350.63f, 178.52f, 320.0f, 142.0f, 320.0f)
                close()
            }
        }
        .build()
        return _brushSharp!!
    }

private var _brushSharp: ImageVector? = null
