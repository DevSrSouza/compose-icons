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

public val MaterialDesignIcons.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.39f, 19.37f)
                lineTo(16.38f, 18.0f)
                lineTo(15.0f, 22.0f)
                lineTo(11.92f, 16.0f)
                lineTo(9.0f, 22.0f)
                lineTo(7.62f, 18.0f)
                lineTo(3.61f, 19.37f)
                lineTo(6.53f, 13.37f)
                curveTo(5.57f, 12.17f, 5.0f, 10.65f, 5.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 9.0f)
                curveTo(19.0f, 10.65f, 18.43f, 12.17f, 17.47f, 13.37f)
                lineTo(20.39f, 19.37f)
                moveTo(7.0f, 9.0f)
                lineTo(9.69f, 10.34f)
                lineTo(9.5f, 13.34f)
                lineTo(12.0f, 11.68f)
                lineTo(14.5f, 13.33f)
                lineTo(14.33f, 10.34f)
                lineTo(17.0f, 9.0f)
                lineTo(14.32f, 7.65f)
                lineTo(14.5f, 4.67f)
                lineTo(12.0f, 6.31f)
                lineTo(9.5f, 4.65f)
                lineTo(9.67f, 7.66f)
                lineTo(7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
