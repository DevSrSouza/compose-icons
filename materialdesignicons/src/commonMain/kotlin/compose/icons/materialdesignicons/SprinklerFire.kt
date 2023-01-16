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

public val MaterialDesignIcons.SprinklerFire: ImageVector
    get() {
        if (_sprinklerFire != null) {
            return _sprinklerFire!!
        }
        _sprinklerFire = Builder(name = "SprinklerFire", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                moveTo(7.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                moveTo(11.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                moveTo(16.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                moveTo(21.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                lineTo(14.0f, 10.0f)
                verticalLineTo(7.2f)
                lineTo(16.0f, 5.2f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.2f)
                lineTo(10.0f, 7.2f)
                verticalLineTo(10.0f)
                lineTo(6.0f, 6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _sprinklerFire!!
    }

private var _sprinklerFire: ImageVector? = null
