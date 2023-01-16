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

public val MaterialDesignIcons.DiameterVariant: ImageVector
    get() {
        if (_diameterVariant != null) {
            return _diameterVariant!!
        }
        _diameterVariant = Builder(name = "DiameterVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.15f, 21.46f)
                lineTo(5.47f, 19.58f)
                curveTo(3.35f, 17.74f, 2.0f, 15.03f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                curveTo(13.78f, 2.0f, 15.44f, 2.46f, 16.89f, 3.27f)
                lineTo(18.21f, 1.39f)
                lineTo(19.85f, 2.54f)
                lineTo(18.53f, 4.42f)
                curveTo(20.65f, 6.26f, 22.0f, 8.97f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(10.22f, 22.0f, 8.56f, 21.54f, 7.11f, 20.73f)
                lineTo(5.79f, 22.61f)
                lineTo(4.15f, 21.46f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 14.35f, 5.0f, 16.46f, 6.63f, 17.93f)
                lineTo(15.73f, 4.92f)
                curveTo(14.62f, 4.33f, 13.35f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.0f, 9.65f, 19.0f, 7.54f, 17.37f, 6.07f)
                lineTo(8.27f, 19.08f)
                curveTo(9.38f, 19.67f, 10.65f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _diameterVariant!!
    }

private var _diameterVariant: ImageVector? = null
