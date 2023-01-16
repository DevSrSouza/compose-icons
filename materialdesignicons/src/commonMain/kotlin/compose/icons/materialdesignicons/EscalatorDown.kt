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

public val MaterialDesignIcons.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) {
            return _escalatorDown!!
        }
        _escalatorDown = Builder(name = "EscalatorDown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.83f, 17.34f)
                lineTo(20.34f, 11.83f)
                lineTo(22.17f, 13.66f)
                lineTo(16.66f, 19.17f)
                lineTo(18.5f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.5f)
                lineTo(14.83f, 17.34f)
                close()
            }
        }
        .build()
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
