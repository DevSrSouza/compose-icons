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

public val MaterialDesignIcons.DiceD12: ImageVector
    get() {
        if (_diceD12 != null) {
            return _diceD12!!
        }
        _diceD12 = Builder(name = "DiceD12", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(1.5f, 9.64f)
                lineTo(5.5f, 22.0f)
                horizontalLineTo(18.5f)
                lineTo(22.5f, 9.64f)
                lineTo(12.0f, 2.0f)
                moveTo(10.5f, 17.0f)
                horizontalLineTo(8.89f)
                verticalLineTo(10.89f)
                lineTo(7.0f, 11.47f)
                verticalLineTo(10.19f)
                lineTo(10.31f, 9.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(11.66f)
                verticalLineTo(15.91f)
                curveTo(11.66f, 15.91f, 15.23f, 12.45f, 15.23f, 11.4f)
                curveTo(15.23f, 10.12f, 14.18f, 10.25f, 14.18f, 10.25f)
                curveTo(13.5f, 10.3f, 13.0f, 10.87f, 13.0f, 11.55f)
                horizontalLineTo(11.44f)
                curveTo(11.5f, 10.09f, 12.72f, 8.94f, 14.27f, 9.0f)
                curveTo(16.74f, 9.0f, 16.77f, 10.85f, 16.77f, 11.3f)
                curveTo(16.77f, 13.07f, 13.58f, 15.77f, 13.58f, 15.77f)
                lineTo(17.0f, 15.75f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
