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

public val MaterialDesignIcons.FormatStrikethroughVariant: ImageVector
    get() {
        if (_formatStrikethroughVariant != null) {
            return _formatStrikethroughVariant!!
        }
        _formatStrikethroughVariant = Builder(name = "FormatStrikethroughVariant", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.61f)
                curveTo(19.61f, 16.14f, 19.56f, 22.0f, 12.38f, 22.0f)
                curveTo(4.05f, 22.05f, 4.37f, 15.5f, 4.37f, 15.5f)
                lineTo(8.34f, 15.55f)
                curveTo(8.37f, 18.92f, 11.5f, 18.92f, 12.12f, 18.88f)
                curveTo(12.76f, 18.83f, 15.15f, 18.84f, 15.34f, 16.5f)
                curveTo(15.42f, 15.41f, 14.32f, 14.58f, 13.12f, 14.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                moveTo(19.41f, 7.89f)
                lineTo(15.43f, 7.86f)
                curveTo(15.43f, 7.86f, 15.6f, 5.09f, 12.15f, 5.08f)
                curveTo(8.7f, 5.06f, 9.0f, 7.28f, 9.0f, 7.56f)
                curveTo(9.04f, 7.84f, 9.34f, 9.22f, 12.0f, 9.88f)
                horizontalLineTo(5.71f)
                curveTo(5.71f, 9.88f, 2.22f, 3.15f, 10.74f, 2.0f)
                curveTo(19.45f, 0.8f, 19.43f, 7.91f, 19.41f, 7.89f)
                close()
            }
        }
        .build()
        return _formatStrikethroughVariant!!
    }

private var _formatStrikethroughVariant: ImageVector? = null
