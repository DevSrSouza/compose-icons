package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.KebabHorizontal24: ImageVector
    get() {
        if (_kebabHorizontal24 != null) {
            return _kebabHorizontal24!!
        }
        _kebabHorizontal24 = Builder(name = "KebabHorizontal24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -0.001f, -3.999f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 14.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.999f, 0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(14.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.999f, 0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _kebabHorizontal24!!
    }

private var _kebabHorizontal24: ImageVector? = null
