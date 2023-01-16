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

public val MaterialDesignIcons.LightbulbFluorescentTube: ImageVector
    get() {
        if (_lightbulbFluorescentTube != null) {
            return _lightbulbFluorescentTube!!
        }
        _lightbulbFluorescentTube = Builder(name = "LightbulbFluorescentTube", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.05f, 2.81f)
                lineTo(6.5f, 3.34f)
                lineTo(5.11f, 1.92f)
                lineTo(3.87f, 3.16f)
                lineTo(5.28f, 4.58f)
                lineTo(4.58f, 5.28f)
                lineTo(3.16f, 3.87f)
                lineTo(1.92f, 5.11f)
                lineTo(3.34f, 6.5f)
                lineTo(2.81f, 7.05f)
                lineTo(16.95f, 21.19f)
                lineTo(17.5f, 20.66f)
                lineTo(18.89f, 22.08f)
                lineTo(20.13f, 20.84f)
                lineTo(18.72f, 19.43f)
                lineTo(19.42f, 18.72f)
                lineTo(20.84f, 20.13f)
                lineTo(22.08f, 18.9f)
                lineTo(20.66f, 17.5f)
                lineTo(21.19f, 16.95f)
                lineTo(7.05f, 2.81f)
                close()
            }
        }
        .build()
        return _lightbulbFluorescentTube!!
    }

private var _lightbulbFluorescentTube: ImageVector? = null
