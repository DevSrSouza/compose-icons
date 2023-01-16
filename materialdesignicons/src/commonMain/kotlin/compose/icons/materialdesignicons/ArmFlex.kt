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

public val MaterialDesignIcons.ArmFlex: ImageVector
    get() {
        if (_armFlex != null) {
            return _armFlex!!
        }
        _armFlex = Builder(name = "ArmFlex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.34f)
                curveTo(3.0f, 18.34f, 4.0f, 7.09f, 7.0f, 3.0f)
                lineTo(12.0f, 4.0f)
                lineTo(11.0f, 7.09f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.25f)
                horizontalLineTo(10.0f)
                curveTo(12.0f, 11.18f, 16.14f, 10.06f, 18.64f, 11.18f)
                curveTo(21.94f, 12.71f, 21.64f, 17.32f, 18.64f, 19.36f)
                curveTo(16.24f, 21.0f, 9.0f, 22.43f, 3.0f, 18.34f)
                close()
            }
        }
        .build()
        return _armFlex!!
    }

private var _armFlex: ImageVector? = null
