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

public val MaterialDesignIcons.EscalatorBox: ImageVector
    get() {
        if (_escalatorBox != null) {
            return _escalatorBox!!
        }
        _escalatorBox = Builder(name = "EscalatorBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(14.34f, 6.0f)
                horizontalLineTo(17.05f)
                curveTo(18.16f, 6.0f, 19.05f, 6.9f, 19.05f, 8.0f)
                curveTo(19.05f, 9.11f, 18.16f, 10.0f, 17.05f, 10.0f)
                horizontalLineTo(16.0f)
                lineTo(10.0f, 18.0f)
                horizontalLineTo(7.05f)
                curveTo(5.95f, 18.0f, 5.05f, 17.11f, 5.05f, 16.0f)
                curveTo(5.05f, 14.9f, 5.95f, 14.0f, 7.05f, 14.0f)
                horizontalLineTo(8.34f)
                lineTo(14.34f, 6.0f)
                close()
            }
        }
        .build()
        return _escalatorBox!!
    }

private var _escalatorBox: ImageVector? = null
