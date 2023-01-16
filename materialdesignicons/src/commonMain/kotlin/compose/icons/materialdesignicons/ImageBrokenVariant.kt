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

public val MaterialDesignIcons.ImageBrokenVariant: ImageVector
    get() {
        if (_imageBrokenVariant != null) {
            return _imageBrokenVariant!!
        }
        _imageBrokenVariant = Builder(name = "ImageBrokenVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                verticalLineTo(11.59f)
                lineTo(18.0f, 8.58f)
                lineTo(14.0f, 12.59f)
                lineTo(10.0f, 8.59f)
                lineTo(6.0f, 12.59f)
                lineTo(3.0f, 9.58f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                moveTo(18.0f, 11.42f)
                lineTo(21.0f, 14.43f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(12.42f)
                lineTo(6.0f, 15.41f)
                lineTo(10.0f, 11.41f)
                lineTo(14.0f, 15.41f)
            }
        }
        .build()
        return _imageBrokenVariant!!
    }

private var _imageBrokenVariant: ImageVector? = null
