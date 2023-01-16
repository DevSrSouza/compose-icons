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

public val MaterialDesignIcons.SkipBackwardOutline: ImageVector
    get() {
        if (_skipBackwardOutline != null) {
            return _skipBackwardOutline!!
        }
        _skipBackwardOutline = Builder(name = "SkipBackwardOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.17f)
                lineTo(15.83f, 12.0f)
                lineTo(18.0f, 9.83f)
                verticalLineTo(14.17f)
                moveTo(20.0f, 19.0f)
                verticalLineTo(5.0f)
                lineTo(13.0f, 12.0f)
                moveTo(4.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                moveTo(11.0f, 14.17f)
                lineTo(8.83f, 12.0f)
                lineTo(11.0f, 9.83f)
                verticalLineTo(14.17f)
                moveTo(13.0f, 19.0f)
                verticalLineTo(5.0f)
                lineTo(6.0f, 12.0f)
            }
        }
        .build()
        return _skipBackwardOutline!!
    }

private var _skipBackwardOutline: ImageVector? = null
