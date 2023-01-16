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

public val MaterialDesignIcons.DiceD4Outline: ImageVector
    get() {
        if (_diceD4Outline != null) {
            return _diceD4Outline!!
        }
        _diceD4Outline = Builder(name = "DiceD4Outline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.43f, 15.15f)
                horizontalLineTo(14.29f)
                verticalLineTo(16.36f)
                horizontalLineTo(13.43f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.92f)
                verticalLineTo(16.36f)
                horizontalLineTo(8.82f)
                lineTo(8.75f, 15.41f)
                lineTo(11.91f, 10.42f)
                horizontalLineTo(13.43f)
                verticalLineTo(15.15f)
                moveTo(10.25f, 15.15f)
                horizontalLineTo(11.92f)
                verticalLineTo(12.47f)
                lineTo(10.25f, 15.15f)
                moveTo(22.0f, 21.0f)
                horizontalLineTo(2.0f)
                curveTo(1.64f, 21.0f, 1.31f, 20.81f, 1.13f, 20.5f)
                curveTo(0.95f, 20.18f, 0.96f, 19.79f, 1.15f, 19.5f)
                lineTo(11.15f, 3.0f)
                curveTo(11.5f, 2.38f, 12.5f, 2.38f, 12.86f, 3.0f)
                lineTo(22.86f, 19.5f)
                curveTo(23.04f, 19.79f, 23.05f, 20.18f, 22.87f, 20.5f)
                curveTo(22.69f, 20.81f, 22.36f, 21.0f, 22.0f, 21.0f)
                moveTo(3.78f, 19.0f)
                horizontalLineTo(20.23f)
                lineTo(12.0f, 5.43f)
                lineTo(3.78f, 19.0f)
                close()
            }
        }
        .build()
        return _diceD4Outline!!
    }

private var _diceD4Outline: ImageVector? = null
