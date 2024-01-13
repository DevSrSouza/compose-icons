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

public val SimpleIcons.Istio: ImageVector
    get() {
        if (_istio != null) {
            return _istio!!
        }
        _istio = Builder(name = "Istio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(10.0f, 24.0f)
                close()
                moveTo(4.0f, 20.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(20.0f, 20.0f)
                lineTo(11.0f, 0.0f)
                close()
            }
        }
        .build()
        return _istio!!
    }

private var _istio: ImageVector? = null
