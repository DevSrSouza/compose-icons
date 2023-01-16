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

public val MaterialDesignIcons.Spellcheck: ImageVector
    get() {
        if (_spellcheck != null) {
            return _spellcheck!!
        }
        _spellcheck = Builder(name = "Spellcheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.59f, 11.59f)
                lineTo(13.5f, 19.68f)
                lineTo(9.83f, 16.0f)
                lineTo(8.42f, 17.41f)
                lineTo(13.5f, 22.5f)
                lineTo(23.0f, 13.0f)
                moveTo(6.43f, 11.0f)
                lineTo(8.5f, 5.5f)
                lineTo(10.57f, 11.0f)
                moveTo(12.45f, 16.0f)
                horizontalLineTo(14.54f)
                lineTo(9.43f, 3.0f)
                horizontalLineTo(7.57f)
                lineTo(2.46f, 16.0f)
                horizontalLineTo(4.55f)
                lineTo(5.67f, 13.0f)
                horizontalLineTo(11.31f)
                lineTo(12.45f, 16.0f)
                close()
            }
        }
        .build()
        return _spellcheck!!
    }

private var _spellcheck: ImageVector? = null
