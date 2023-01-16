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

public val MaterialDesignIcons.TagText: ImageVector
    get() {
        if (_tagText != null) {
            return _tagText!!
        }
        _tagText = Builder(name = "TagText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.59f, 12.41f)
                lineTo(11.59f, 21.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.41f, 11.58f)
                moveTo(6.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 8.0f)
                moveTo(11.59f, 15.41f)
                lineTo(7.59f, 11.41f)
                lineTo(9.0f, 10.0f)
                lineTo(13.0f, 14.0f)
                moveTo(15.59f, 14.41f)
                lineTo(10.09f, 8.91f)
                lineTo(11.5f, 7.5f)
                lineTo(17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tagText!!
    }

private var _tagText: ImageVector? = null
