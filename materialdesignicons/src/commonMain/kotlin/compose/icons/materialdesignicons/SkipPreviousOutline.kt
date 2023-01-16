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

public val MaterialDesignIcons.SkipPreviousOutline: ImageVector
    get() {
        if (_skipPreviousOutline != null) {
            return _skipPreviousOutline!!
        }
        _skipPreviousOutline = Builder(name = "SkipPreviousOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                moveTo(9.5f, 12.0f)
                lineTo(18.0f, 18.0f)
                verticalLineTo(6.0f)
                moveTo(16.0f, 14.14f)
                lineTo(12.97f, 12.0f)
                lineTo(16.0f, 9.86f)
                verticalLineTo(14.14f)
                close()
            }
        }
        .build()
        return _skipPreviousOutline!!
    }

private var _skipPreviousOutline: ImageVector? = null
