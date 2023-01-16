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

public val MaterialDesignIcons.Axis: ImageVector
    get() {
        if (_axis != null) {
            return _axis!!
        }
        _axis = Builder(name = "Axis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.61f, 21.0f)
                lineTo(1.61f, 19.27f)
                lineTo(11.0f, 13.85f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.85f)
                lineTo(22.39f, 19.27f)
                lineTo(21.39f, 21.0f)
                lineTo(12.0f, 15.58f)
                lineTo(2.61f, 21.0f)
                close()
            }
        }
        .build()
        return _axis!!
    }

private var _axis: ImageVector? = null
