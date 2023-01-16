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

public val MaterialDesignIcons.CodeTagsCheck: ImageVector
    get() {
        if (_codeTagsCheck != null) {
            return _codeTagsCheck!!
        }
        _codeTagsCheck = Builder(name = "CodeTagsCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.59f, 3.41f)
                lineTo(2.0f, 8.0f)
                lineTo(6.59f, 12.6f)
                lineTo(8.0f, 11.18f)
                lineTo(4.82f, 8.0f)
                lineTo(8.0f, 4.82f)
                lineTo(6.59f, 3.41f)
                moveTo(12.41f, 3.41f)
                lineTo(11.0f, 4.82f)
                lineTo(14.18f, 8.0f)
                lineTo(11.0f, 11.18f)
                lineTo(12.41f, 12.6f)
                lineTo(17.0f, 8.0f)
                lineTo(12.41f, 3.41f)
                moveTo(21.59f, 11.59f)
                lineTo(13.5f, 19.68f)
                lineTo(9.83f, 16.0f)
                lineTo(8.42f, 17.41f)
                lineTo(13.5f, 22.5f)
                lineTo(23.0f, 13.0f)
                lineTo(21.59f, 11.59f)
                close()
            }
        }
        .build()
        return _codeTagsCheck!!
    }

private var _codeTagsCheck: ImageVector? = null
