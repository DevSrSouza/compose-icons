package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Kashflow: ImageVector
    get() {
        if (_kashflow != null) {
            return _kashflow!!
        }
        _kashflow = Builder(name = "Kashflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.278f, 2.141f)
                lineToRelative(-0.83f, 2.702f)
                curveTo(8.007f, 0.174f, 2.958f, 4.724f, 2.958f, 4.724f)
                curveTo(-1.638f, 8.564f, 0.49f, 14.678f, 0.495f, 14.678f)
                curveTo(1.252f, -0.016f, 14.24f, 8.943f, 14.24f, 8.943f)
                curveToRelative(-0.237f, 1.066f, -0.996f, 2.63f, -0.972f, 2.654f)
                lineToRelative(8.508f, -1.256f)
                close()
                moveTo(23.506f, 9.322f)
                curveTo(22.747f, 24.016f, 9.76f, 15.057f, 9.76f, 15.057f)
                curveToRelative(0.332f, -1.066f, 1.02f, -2.654f, 1.02f, -2.607f)
                lineTo(2.27f, 13.66f)
                lineToRelative(5.451f, 8.2f)
                lineToRelative(0.83f, -2.702f)
                curveToRelative(7.441f, 4.669f, 12.49f, 0.119f, 12.49f, 0.119f)
                curveToRelative(4.597f, -3.84f, 2.464f, -9.954f, 2.464f, -9.954f)
                close()
            }
        }
        .build()
        return _kashflow!!
    }

private var _kashflow: ImageVector? = null
