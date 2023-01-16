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

public val MaterialDesignIcons.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.5f, 2.0f, 11.0f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13.0f, 2.19f, 12.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 8.25f)
                curveTo(13.31f, 8.25f, 14.38f, 9.2f, 14.38f, 10.38f)
                curveTo(14.38f, 11.07f, 14.0f, 11.68f, 13.44f, 12.07f)
                curveTo(14.14f, 12.46f, 14.6f, 13.13f, 14.6f, 13.9f)
                curveTo(14.6f, 15.12f, 13.44f, 16.1f, 12.0f, 16.1f)
                curveTo(10.56f, 16.1f, 9.4f, 15.12f, 9.4f, 13.9f)
                curveTo(9.4f, 13.13f, 9.86f, 12.46f, 10.56f, 12.07f)
                curveTo(10.0f, 11.68f, 9.63f, 11.07f, 9.63f, 10.38f)
                curveTo(9.63f, 9.2f, 10.69f, 8.25f, 12.0f, 8.25f)
                moveTo(12.0f, 9.5f)
                curveTo(11.5f, 9.5f, 11.1f, 9.95f, 11.1f, 10.5f)
                curveTo(11.1f, 11.05f, 11.5f, 11.5f, 12.0f, 11.5f)
                curveTo(12.5f, 11.5f, 12.9f, 11.05f, 12.9f, 10.5f)
                curveTo(12.9f, 9.95f, 12.5f, 9.5f, 12.0f, 9.5f)
                moveTo(12.0f, 12.65f)
                curveTo(11.39f, 12.65f, 10.9f, 13.14f, 10.9f, 13.75f)
                curveTo(10.9f, 14.36f, 11.39f, 14.85f, 12.0f, 14.85f)
                curveTo(12.61f, 14.85f, 13.1f, 14.36f, 13.1f, 13.75f)
                curveTo(13.1f, 13.14f, 12.61f, 12.65f, 12.0f, 12.65f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
