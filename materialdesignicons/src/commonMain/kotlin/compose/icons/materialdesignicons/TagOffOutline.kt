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

public val MaterialDesignIcons.TagOffOutline: ImageVector
    get() {
        if (_tagOffOutline != null) {
            return _tagOffOutline!!
        }
        _tagOffOutline = Builder(name = "TagOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 5.0f)
                moveTo(6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 5.0f)
                moveTo(18.33f, 8.5f)
                lineTo(22.92f, 3.92f)
                lineTo(21.5f, 2.5f)
                lineTo(2.5f, 21.5f)
                lineTo(3.92f, 22.92f)
                lineTo(8.5f, 18.33f)
                lineTo(11.59f, 21.42f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.41f, 11.58f)
                moveTo(13.0f, 20.0f)
                lineTo(9.92f, 16.92f)
                lineTo(16.92f, 9.92f)
                lineTo(20.0f, 13.0f)
                moveTo(5.61f, 15.43f)
                lineTo(7.0f, 14.0f)
                lineTo(4.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                lineTo(14.06f, 7.06f)
                lineTo(15.47f, 5.66f)
                lineTo(12.41f, 2.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.59f, 12.42f)
                moveTo(5.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 6.5f)
                close()
            }
        }
        .build()
        return _tagOffOutline!!
    }

private var _tagOffOutline: ImageVector? = null
