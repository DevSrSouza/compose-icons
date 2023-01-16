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

public val MaterialDesignIcons.Rotate3dVariant: ImageVector
    get() {
        if (_rotate3dVariant != null) {
            return _rotate3dVariant!!
        }
        _rotate3dVariant = Builder(name = "Rotate3dVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(16.97f, 5.0f, 21.0f, 7.69f, 21.0f, 11.0f)
                curveTo(21.0f, 12.68f, 19.96f, 14.2f, 18.29f, 15.29f)
                curveTo(19.36f, 14.42f, 20.0f, 13.32f, 20.0f, 12.13f)
                curveTo(20.0f, 9.29f, 16.42f, 7.0f, 12.0f, 7.0f)
                verticalLineTo(10.0f)
                lineTo(8.0f, 6.0f)
                lineTo(12.0f, 2.0f)
                verticalLineTo(5.0f)
                moveTo(12.0f, 19.0f)
                curveTo(7.03f, 19.0f, 3.0f, 16.31f, 3.0f, 13.0f)
                curveTo(3.0f, 11.32f, 4.04f, 9.8f, 5.71f, 8.71f)
                curveTo(4.64f, 9.58f, 4.0f, 10.68f, 4.0f, 11.88f)
                curveTo(4.0f, 14.71f, 7.58f, 17.0f, 12.0f, 17.0f)
                verticalLineTo(14.0f)
                lineTo(16.0f, 18.0f)
                lineTo(12.0f, 22.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _rotate3dVariant!!
    }

private var _rotate3dVariant: ImageVector? = null
