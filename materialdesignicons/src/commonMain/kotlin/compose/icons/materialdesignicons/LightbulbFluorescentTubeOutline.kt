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

public val MaterialDesignIcons.LightbulbFluorescentTubeOutline: ImageVector
    get() {
        if (_lightbulbFluorescentTubeOutline != null) {
            return _lightbulbFluorescentTubeOutline!!
        }
        _lightbulbFluorescentTubeOutline = Builder(name = "LightbulbFluorescentTubeOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
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
                lineTo(4.22f, 8.46f)
                lineTo(15.54f, 19.78f)
                lineTo(16.95f, 21.19f)
                lineTo(17.5f, 20.66f)
                lineTo(18.89f, 22.08f)
                lineTo(20.13f, 20.84f)
                lineTo(18.72f, 19.43f)
                lineTo(19.43f, 18.72f)
                lineTo(20.84f, 20.13f)
                lineTo(22.08f, 18.89f)
                lineTo(20.66f, 17.5f)
                lineTo(21.19f, 16.95f)
                lineTo(19.78f, 15.54f)
                lineTo(8.46f, 4.22f)
                moveTo(7.05f, 5.64f)
                lineTo(18.36f, 16.95f)
                lineTo(16.95f, 18.36f)
                lineTo(5.64f, 7.05f)
                close()
            }
        }
        .build()
        return _lightbulbFluorescentTubeOutline!!
    }

private var _lightbulbFluorescentTubeOutline: ImageVector? = null
