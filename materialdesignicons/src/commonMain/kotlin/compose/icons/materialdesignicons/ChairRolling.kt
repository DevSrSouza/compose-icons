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

public val MaterialDesignIcons.ChairRolling: ImageVector
    get() {
        if (_chairRolling != null) {
            return _chairRolling!!
        }
        _chairRolling = Builder(name = "ChairRolling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                moveTo(2.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                moveTo(17.0f, 5.0f)
                curveTo(17.0f, 3.9f, 16.1f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 3.0f, 7.0f, 3.9f, 7.0f, 5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.8f)
                lineTo(12.0f, 19.8f)
                lineTo(14.2f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(13.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _chairRolling!!
    }

private var _chairRolling: ImageVector? = null
