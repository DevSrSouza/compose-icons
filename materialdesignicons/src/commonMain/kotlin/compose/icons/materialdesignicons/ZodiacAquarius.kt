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

public val MaterialDesignIcons.ZodiacAquarius: ImageVector
    get() {
        if (_zodiacAquarius != null) {
            return _zodiacAquarius!!
        }
        _zodiacAquarius = Builder(name = "ZodiacAquarius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.41f)
                lineTo(12.0f, 9.41f)
                lineTo(9.0f, 12.41f)
                lineTo(6.0f, 9.41f)
                lineTo(3.71f, 11.71f)
                lineTo(2.29f, 10.29f)
                lineTo(6.0f, 6.59f)
                lineTo(9.0f, 9.59f)
                lineTo(12.0f, 6.59f)
                lineTo(15.0f, 9.59f)
                lineTo(18.0f, 6.59f)
                lineTo(21.71f, 10.29f)
                lineTo(20.29f, 11.71f)
                lineTo(18.0f, 9.41f)
                lineTo(15.0f, 12.41f)
                moveTo(18.0f, 15.41f)
                lineTo(20.29f, 17.71f)
                lineTo(21.71f, 16.29f)
                lineTo(18.0f, 12.59f)
                lineTo(15.0f, 15.59f)
                lineTo(12.0f, 12.59f)
                lineTo(9.0f, 15.59f)
                lineTo(6.0f, 12.59f)
                lineTo(2.29f, 16.29f)
                lineTo(3.71f, 17.71f)
                lineTo(6.0f, 15.41f)
                lineTo(9.0f, 18.41f)
                lineTo(12.0f, 15.41f)
                lineTo(15.0f, 18.41f)
                lineTo(18.0f, 15.41f)
                close()
            }
        }
        .build()
        return _zodiacAquarius!!
    }

private var _zodiacAquarius: ImageVector? = null
