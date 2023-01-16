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

public val MaterialDesignIcons.CloseOctagonOutline: ImageVector
    get() {
        if (_closeOctagonOutline != null) {
            return _closeOctagonOutline!!
        }
        _closeOctagonOutline = Builder(name = "CloseOctagonOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.27f, 3.0f)
                lineTo(3.0f, 8.27f)
                verticalLineTo(15.73f)
                lineTo(8.27f, 21.0f)
                horizontalLineTo(15.73f)
                curveTo(17.5f, 19.24f, 21.0f, 15.73f, 21.0f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3.0f)
                moveTo(9.1f, 5.0f)
                horizontalLineTo(14.9f)
                lineTo(19.0f, 9.1f)
                verticalLineTo(14.9f)
                lineTo(14.9f, 19.0f)
                horizontalLineTo(9.1f)
                lineTo(5.0f, 14.9f)
                verticalLineTo(9.1f)
                moveTo(9.12f, 7.71f)
                lineTo(7.71f, 9.12f)
                lineTo(10.59f, 12.0f)
                lineTo(7.71f, 14.88f)
                lineTo(9.12f, 16.29f)
                lineTo(12.0f, 13.41f)
                lineTo(14.88f, 16.29f)
                lineTo(16.29f, 14.88f)
                lineTo(13.41f, 12.0f)
                lineTo(16.29f, 9.12f)
                lineTo(14.88f, 7.71f)
                lineTo(12.0f, 10.59f)
            }
        }
        .build()
        return _closeOctagonOutline!!
    }

private var _closeOctagonOutline: ImageVector? = null
