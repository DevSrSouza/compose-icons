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

public val MaterialDesignIcons.KnifeMilitary: ImageVector
    get() {
        if (_knifeMilitary != null) {
            return _knifeMilitary!!
        }
        _knifeMilitary = Builder(name = "KnifeMilitary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(17.39f, 3.75f)
                lineTo(10.46f, 10.68f)
                lineTo(14.0f, 14.22f)
                lineTo(20.92f, 7.29f)
                curveTo(22.43f, 5.78f, 22.0f, 2.0f, 22.0f, 2.0f)
                moveTo(8.33f, 10.0f)
                lineTo(6.92f, 11.39f)
                lineTo(8.33f, 12.8f)
                lineTo(2.68f, 18.46f)
                lineTo(6.21f, 22.0f)
                lineTo(11.87f, 16.34f)
                lineTo(13.28f, 17.76f)
                lineTo(14.7f, 16.34f)
                lineTo(8.33f, 10.0f)
                close()
            }
        }
        .build()
        return _knifeMilitary!!
    }

private var _knifeMilitary: ImageVector? = null
