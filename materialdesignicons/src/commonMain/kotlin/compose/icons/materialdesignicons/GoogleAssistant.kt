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

public val MaterialDesignIcons.GoogleAssistant: ImageVector
    get() {
        if (_googleAssistant != null) {
            return _googleAssistant!!
        }
        _googleAssistant = Builder(name = "GoogleAssistant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 1.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 13.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.0f, 2.0f)
                moveTo(21.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 6.0f)
                moveTo(17.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 8.0f)
                moveTo(17.0f, 15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.5f, 18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.0f, 22.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 18.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _googleAssistant!!
    }

private var _googleAssistant: ImageVector? = null
