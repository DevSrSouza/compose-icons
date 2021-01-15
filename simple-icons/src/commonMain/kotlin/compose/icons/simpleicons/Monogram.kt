package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Monogram: ImageVector
    get() {
        if (_monogram != null) {
            return _monogram!!
        }
        _monogram = Builder(name = "Monogram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.158f, 0.0f)
                verticalLineToRelative(23.503f)
                curveToRelative(0.0f, 0.451f, -0.533f, 0.668f, -0.83f, 0.338f)
                lineTo(12.0f, 12.38f)
                lineTo(3.301f, 2.73f)
                lineTo(0.842f, 0.0f)
                horizontalLineToRelative(22.316f)
                close()
                moveTo(11.029f, 13.46f)
                lineTo(1.672f, 23.841f)
                curveToRelative(-0.297f, 0.33f, -0.83f, 0.111f, -0.83f, -0.338f)
                verticalLineTo(0.0f)
                lineToRelative(10.187f, 13.46f)
                close()
            }
        }
        .build()
        return _monogram!!
    }

private var _monogram: ImageVector? = null
