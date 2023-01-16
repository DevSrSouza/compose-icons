package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.NearMe: ImageVector
    get() {
        if (_nearMe != null) {
            return _nearMe!!
        }
        _nearMe = Builder(name = "NearMe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 10.53f)
                verticalLineTo(11.5f)
                lineTo(9.84f, 14.16f)
                lineTo(12.5f, 21.0f)
                horizontalLineTo(13.46f)
                lineTo(21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _nearMe!!
    }

private var _nearMe: ImageVector? = null
