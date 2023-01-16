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

public val MaterialDesignIcons.Spear: ImageVector
    get() {
        if (_spear != null) {
            return _spear!!
        }
        _spear = Builder(name = "Spear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(16.41f)
                lineTo(3.41f, 22.0f)
                lineTo(2.0f, 20.59f)
                lineTo(15.0f, 7.59f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                lineTo(22.0f, 2.0f)
                lineTo(16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _spear!!
    }

private var _spear: ImageVector? = null
