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

public val MaterialDesignIcons.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) {
            return _escalatorUp!!
        }
        _escalatorUp = Builder(name = "EscalatorUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(18.95f)
                lineTo(6.95f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                curveTo(2.0f, 16.9f, 2.9f, 16.0f, 4.0f, 16.0f)
                horizontalLineTo(5.29f)
                lineTo(7.0f, 14.29f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 9.45f, 7.45f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 9.0f, 10.0f, 9.45f, 10.0f, 10.0f)
                verticalLineTo(11.29f)
                lineTo(17.29f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                curveTo(22.0f, 7.11f, 21.11f, 8.0f, 20.0f, 8.0f)
                moveTo(8.5f, 5.0f)
                curveTo(9.33f, 5.0f, 10.0f, 5.67f, 10.0f, 6.5f)
                curveTo(10.0f, 7.33f, 9.33f, 8.0f, 8.5f, 8.0f)
                curveTo(7.67f, 8.0f, 7.0f, 7.33f, 7.0f, 6.5f)
                curveTo(7.0f, 5.67f, 7.67f, 5.0f, 8.5f, 5.0f)
                moveTo(20.17f, 15.66f)
                lineTo(14.66f, 21.17f)
                lineTo(12.83f, 19.34f)
                lineTo(18.34f, 13.83f)
                lineTo(16.5f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.5f)
                lineTo(20.17f, 15.66f)
                close()
            }
        }
        .build()
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
