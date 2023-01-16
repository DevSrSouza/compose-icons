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

public val MaterialDesignIcons.DiceD20Outline: ImageVector
    get() {
        if (_diceD20Outline != null) {
            return _diceD20Outline!!
        }
        _diceD20Outline = Builder(name = "DiceD20Outline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22.0f, 12.0f, 22.0f)
                curveTo(11.79f, 22.0f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3.0f, 16.88f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3.0f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2.0f, 12.0f, 2.0f)
                curveTo(12.21f, 2.0f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21.0f, 7.12f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(12.0f, 4.15f)
                lineTo(5.0f, 8.09f)
                verticalLineTo(15.91f)
                lineTo(12.0f, 19.85f)
                lineTo(19.0f, 15.91f)
                verticalLineTo(8.09f)
                lineTo(12.0f, 4.15f)
                moveTo(14.93f, 8.27f)
                arcTo(2.57f, 2.57f, 0.0f, false, true, 17.5f, 10.84f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 14.9f, 16.35f, 16.05f, 14.93f, 16.05f)
                curveTo(13.5f, 16.05f, 12.36f, 14.9f, 12.36f, 13.5f)
                verticalLineTo(10.84f)
                arcTo(2.57f, 2.57f, 0.0f, false, true, 14.93f, 8.27f)
                moveTo(14.92f, 9.71f)
                curveTo(14.34f, 9.71f, 13.86f, 10.18f, 13.86f, 10.77f)
                verticalLineTo(13.53f)
                curveTo(13.86f, 14.12f, 14.34f, 14.6f, 14.92f, 14.6f)
                curveTo(15.5f, 14.6f, 16.0f, 14.12f, 16.0f, 13.53f)
                verticalLineTo(10.77f)
                curveTo(16.0f, 10.18f, 15.5f, 9.71f, 14.92f, 9.71f)
                moveTo(11.45f, 14.76f)
                verticalLineTo(15.96f)
                lineTo(6.31f, 15.93f)
                verticalLineTo(14.91f)
                curveTo(6.31f, 14.91f, 9.74f, 11.58f, 9.75f, 10.57f)
                curveTo(9.75f, 9.33f, 8.73f, 9.46f, 8.73f, 9.46f)
                curveTo(8.73f, 9.46f, 7.75f, 9.5f, 7.64f, 10.71f)
                lineTo(6.14f, 10.76f)
                curveTo(6.14f, 10.76f, 6.18f, 8.26f, 8.83f, 8.26f)
                curveTo(11.2f, 8.26f, 11.23f, 10.04f, 11.23f, 10.5f)
                curveTo(11.23f, 12.18f, 8.15f, 14.77f, 8.15f, 14.77f)
                lineTo(11.45f, 14.76f)
                close()
            }
        }
        .build()
        return _diceD20Outline!!
    }

private var _diceD20Outline: ImageVector? = null
