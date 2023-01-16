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

public val MaterialDesignIcons.UnicornVariant: ImageVector
    get() {
        if (_unicornVariant != null) {
            return _unicornVariant!!
        }
        _unicornVariant = Builder(name = "UnicornVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineTo(19.0f)
                lineTo(17.0f, 20.0f)
                lineTo(14.0f, 15.33f)
                curveTo(13.71f, 14.89f, 13.0f, 15.14f, 13.08f, 15.67f)
                lineTo(14.0f, 23.0f)
                lineTo(4.0f, 18.0f)
                lineTo(4.96f, 12.75f)
                curveTo(5.56f, 9.42f, 8.46f, 7.0f, 11.84f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(19.0f, 1.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineTo(20.0f)
                lineTo(18.42f, 9.37f)
                curveTo(19.36f, 9.88f, 20.0f, 10.86f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _unicornVariant!!
    }

private var _unicornVariant: ImageVector? = null
