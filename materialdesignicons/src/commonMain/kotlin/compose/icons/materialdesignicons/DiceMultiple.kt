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

public val MaterialDesignIcons.DiceMultiple: ImageVector
    get() {
        if (_diceMultiple != null) {
            return _diceMultiple!!
        }
        _diceMultiple = Builder(name = "DiceMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.78f, 3.0f)
                horizontalLineTo(11.22f)
                curveTo(10.55f, 3.0f, 10.0f, 3.55f, 10.0f, 4.22f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.78f)
                curveTo(20.45f, 14.0f, 21.0f, 13.45f, 21.0f, 12.78f)
                verticalLineTo(4.22f)
                curveTo(21.0f, 3.55f, 20.45f, 3.0f, 19.78f, 3.0f)
                moveTo(12.44f, 6.67f)
                curveTo(11.76f, 6.67f, 11.21f, 6.12f, 11.21f, 5.44f)
                curveTo(11.21f, 4.76f, 11.76f, 4.21f, 12.44f, 4.21f)
                arcTo(1.23f, 1.23f, 0.0f, false, true, 13.67f, 5.44f)
                curveTo(13.67f, 6.12f, 13.12f, 6.67f, 12.44f, 6.67f)
                moveTo(18.56f, 12.78f)
                curveTo(17.88f, 12.79f, 17.33f, 12.24f, 17.32f, 11.56f)
                curveTo(17.31f, 10.88f, 17.86f, 10.33f, 18.54f, 10.32f)
                curveTo(19.22f, 10.31f, 19.77f, 10.86f, 19.78f, 11.56f)
                curveTo(19.77f, 12.23f, 19.23f, 12.77f, 18.56f, 12.78f)
                moveTo(18.56f, 6.67f)
                curveTo(17.88f, 6.68f, 17.33f, 6.13f, 17.32f, 5.45f)
                curveTo(17.31f, 4.77f, 17.86f, 4.22f, 18.54f, 4.21f)
                curveTo(19.22f, 4.2f, 19.77f, 4.75f, 19.78f, 5.44f)
                curveTo(19.78f, 6.12f, 19.24f, 6.66f, 18.56f, 6.67f)
                moveTo(4.22f, 10.0f)
                horizontalLineTo(12.78f)
                arcTo(1.22f, 1.22f, 0.0f, false, true, 14.0f, 11.22f)
                verticalLineTo(19.78f)
                curveTo(14.0f, 20.45f, 13.45f, 21.0f, 12.78f, 21.0f)
                horizontalLineTo(4.22f)
                curveTo(3.55f, 21.0f, 3.0f, 20.45f, 3.0f, 19.78f)
                verticalLineTo(11.22f)
                curveTo(3.0f, 10.55f, 3.55f, 10.0f, 4.22f, 10.0f)
                moveTo(8.5f, 14.28f)
                curveTo(7.83f, 14.28f, 7.28f, 14.83f, 7.28f, 15.5f)
                curveTo(7.28f, 16.17f, 7.83f, 16.72f, 8.5f, 16.72f)
                curveTo(9.17f, 16.72f, 9.72f, 16.17f, 9.72f, 15.5f)
                arcTo(1.22f, 1.22f, 0.0f, false, false, 8.5f, 14.28f)
                moveTo(5.44f, 11.22f)
                curveTo(4.77f, 11.22f, 4.22f, 11.77f, 4.22f, 12.44f)
                arcTo(1.22f, 1.22f, 0.0f, false, false, 5.44f, 13.66f)
                curveTo(6.11f, 13.66f, 6.66f, 13.11f, 6.66f, 12.44f)
                verticalLineTo(12.44f)
                curveTo(6.66f, 11.77f, 6.11f, 11.22f, 5.44f, 11.22f)
                moveTo(11.55f, 17.33f)
                curveTo(10.88f, 17.33f, 10.33f, 17.88f, 10.33f, 18.55f)
                curveTo(10.33f, 19.22f, 10.88f, 19.77f, 11.55f, 19.77f)
                arcTo(1.22f, 1.22f, 0.0f, false, false, 12.77f, 18.55f)
                horizontalLineTo(12.77f)
                curveTo(12.77f, 17.88f, 12.23f, 17.34f, 11.56f, 17.33f)
                horizontalLineTo(11.55f)
                close()
            }
        }
        .build()
        return _diceMultiple!!
    }

private var _diceMultiple: ImageVector? = null
