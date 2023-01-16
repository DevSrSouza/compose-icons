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

public val MaterialDesignIcons.ShuffleVariant: ImageVector
    get() {
        if (_shuffleVariant != null) {
            return _shuffleVariant!!
        }
        _shuffleVariant = Builder(name = "ShuffleVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                lineTo(22.25f, 7.5f)
                lineTo(17.0f, 12.0f)
                lineTo(22.25f, 16.5f)
                lineTo(17.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.26f)
                lineTo(11.44f, 15.18f)
                lineTo(13.56f, 13.06f)
                lineTo(15.5f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineTo(15.5f)
                lineTo(6.5f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.26f)
                lineTo(14.26f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                moveTo(2.0f, 6.0f)
                horizontalLineTo(6.5f)
                lineTo(9.32f, 8.82f)
                lineTo(7.2f, 10.94f)
                lineTo(5.26f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _shuffleVariant!!
    }

private var _shuffleVariant: ImageVector? = null
