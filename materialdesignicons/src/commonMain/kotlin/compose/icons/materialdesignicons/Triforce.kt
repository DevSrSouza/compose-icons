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

public val MaterialDesignIcons.Triforce: ImageVector
    get() {
        if (_triforce != null) {
            return _triforce!!
        }
        _triforce = Builder(name = "Triforce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 21.0f)
                lineTo(12.0f, 3.5f)
                lineTo(22.5f, 21.0f)
                horizontalLineTo(1.5f)
                moveTo(12.0f, 21.0f)
                lineTo(17.0f, 12.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _triforce!!
    }

private var _triforce: ImageVector? = null
