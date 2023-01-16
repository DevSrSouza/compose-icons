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

public val MaterialDesignIcons.HorseVariant: ImageVector
    get() {
        if (_horseVariant != null) {
            return _horseVariant!!
        }
        _horseVariant = Builder(name = "HorseVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(17.0f, 17.0f)
                lineTo(13.91f, 11.5f)
                curveTo(13.65f, 11.04f, 12.92f, 11.27f, 13.0f, 11.81f)
                lineTo(14.0f, 21.0f)
                lineTo(4.0f, 17.0f)
                lineTo(5.15f, 8.94f)
                curveTo(5.64f, 5.53f, 8.56f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(20.0f)
                lineTo(18.42f, 5.37f)
                curveTo(19.36f, 5.88f, 20.0f, 6.86f, 20.0f, 8.0f)
                close()
            }
        }
        .build()
        return _horseVariant!!
    }

private var _horseVariant: ImageVector? = null
