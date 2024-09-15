package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Resolving: ImageVector
    get() {
        if (_resolving != null) {
            return _resolving!!
        }
        _resolving = Builder(name = "Resolving", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(9.857f, 3.0f, 4.711f, 7.288f, 3.361f, 13.025f)
                lineTo(3.377f, 13.02f)
                lineTo(14.936f, 9.689f)
                curveTo(16.745f, 9.162f, 17.756f, 9.085f, 19.068f, 9.264f)
                curveTo(20.956f, 9.582f, 21.813f, 10.565f, 22.26f, 12.145f)
                lineTo(22.824f, 14.113f)
                curveTo(23.251f, 15.574f, 22.876f, 16.746f, 21.594f, 17.949f)
                curveTo(20.59f, 18.853f, 19.973f, 19.221f, 18.393f, 19.678f)
                lineTo(13.572f, 21.059f)
                lineTo(25.051f, 22.471f)
                lineTo(25.557f, 24.248f)
                lineTo(23.053f, 24.945f)
                lineTo(8.117f, 23.006f)
                lineTo(9.287f, 27.111f)
                curveTo(11.249f, 28.302f, 13.542f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(18.039f, 11.73f)
                curveTo(17.504f, 11.725f, 16.765f, 11.86f, 15.73f, 12.16f)
                lineTo(5.869f, 14.99f)
                lineTo(7.369f, 20.16f)
                lineTo(17.74f, 17.16f)
                curveTo(20.15f, 16.47f, 20.341f, 15.931f, 20.051f, 14.891f)
                lineTo(19.461f, 12.83f)
                curveTo(19.261f, 12.143f, 18.931f, 11.74f, 18.039f, 11.73f)
                close()
                moveTo(3.008f, 16.133f)
                curveTo(3.033f, 18.581f, 3.742f, 20.863f, 4.947f, 22.811f)
                lineTo(3.008f, 16.133f)
                close()
            }
        }
        .build()
        return _resolving!!
    }

private var _resolving: ImageVector? = null
