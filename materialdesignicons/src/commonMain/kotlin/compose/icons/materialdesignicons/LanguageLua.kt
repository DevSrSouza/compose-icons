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

public val MaterialDesignIcons.LanguageLua: ImageVector
    get() {
        if (_languageLua != null) {
            return _languageLua!!
        }
        _languageLua = Builder(name = "LanguageLua", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 5.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 2.0f, 13.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 10.5f, 22.0f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 19.0f, 13.5f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 10.5f, 5.0f)
                moveTo(13.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 13.0f)
                moveTo(19.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 2.0f)
            }
        }
        .build()
        return _languageLua!!
    }

private var _languageLua: ImageVector? = null
