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

public val MaterialDesignIcons.SkipForwardOutline: ImageVector
    get() {
        if (_skipForwardOutline != null) {
            return _skipForwardOutline!!
        }
        _skipForwardOutline = Builder(name = "SkipForwardOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.83f)
                lineTo(8.17f, 12.0f)
                lineTo(6.0f, 14.17f)
                verticalLineTo(9.83f)
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(11.0f, 12.0f)
                moveTo(20.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                moveTo(13.0f, 9.83f)
                lineTo(15.17f, 12.0f)
                lineTo(13.0f, 14.17f)
                verticalLineTo(9.83f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(19.0f)
                lineTo(18.0f, 12.0f)
            }
        }
        .build()
        return _skipForwardOutline!!
    }

private var _skipForwardOutline: ImageVector? = null
