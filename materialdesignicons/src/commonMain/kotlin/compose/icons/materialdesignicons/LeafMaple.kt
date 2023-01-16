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

public val MaterialDesignIcons.LeafMaple: ImageVector
    get() {
        if (_leafMaple != null) {
            return _leafMaple!!
        }
        _leafMaple = Builder(name = "LeafMaple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.79f, 13.0f)
                lineTo(16.0f, 16.0f)
                lineTo(17.0f, 18.0f)
                lineTo(13.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.25f)
                lineTo(7.0f, 18.0f)
                lineTo(8.0f, 16.0f)
                lineTo(2.21f, 13.0f)
                lineTo(3.21f, 11.27f)
                lineTo(1.61f, 8.0f)
                lineTo(5.21f, 7.77f)
                lineTo(6.21f, 6.0f)
                lineTo(9.63f, 9.9f)
                lineTo(8.0f, 5.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 2.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(16.0f)
                lineTo(14.37f, 9.9f)
                lineTo(17.79f, 6.0f)
                lineTo(18.79f, 7.73f)
                lineTo(22.39f, 7.96f)
                lineTo(20.79f, 11.19f)
                lineTo(21.79f, 13.0f)
                close()
            }
        }
        .build()
        return _leafMaple!!
    }

private var _leafMaple: ImageVector? = null
