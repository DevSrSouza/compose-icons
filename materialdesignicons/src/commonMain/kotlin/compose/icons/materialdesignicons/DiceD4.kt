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

public val MaterialDesignIcons.DiceD4: ImageVector
    get() {
        if (_diceD4 != null) {
            return _diceD4!!
        }
        _diceD4 = Builder(name = "DiceD4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 15.15f)
                lineTo(11.92f, 12.47f)
                verticalLineTo(15.15f)
                horizontalLineTo(10.25f)
                moveTo(21.92f, 21.0f)
                horizontalLineTo(2.08f)
                curveTo(1.24f, 21.0f, 0.72f, 20.08f, 1.16f, 19.36f)
                lineTo(11.08f, 3.13f)
                curveTo(11.5f, 2.44f, 12.5f, 2.44f, 12.92f, 3.13f)
                lineTo(22.84f, 19.36f)
                curveTo(23.28f, 20.08f, 22.76f, 21.0f, 21.92f, 21.0f)
                moveTo(14.29f, 15.15f)
                horizontalLineTo(13.43f)
                verticalLineTo(10.42f)
                horizontalLineTo(11.91f)
                lineTo(8.75f, 15.41f)
                lineTo(8.82f, 16.36f)
                horizontalLineTo(11.92f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.43f)
                verticalLineTo(16.36f)
                horizontalLineTo(14.29f)
                verticalLineTo(15.15f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
