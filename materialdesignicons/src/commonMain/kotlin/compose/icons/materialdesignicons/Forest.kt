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

public val MaterialDesignIcons.Forest: ImageVector
    get() {
        if (_forest != null) {
            return _forest!!
        }
        _forest = Builder(name = "Forest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                lineTo(9.0f, 2.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineTo(3.86f)
                lineTo(0.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                lineTo(14.14f, 12.0f)
                horizontalLineTo(16.0f)
                moveTo(20.14f, 12.0f)
                horizontalLineTo(22.0f)
                lineTo(15.0f, 2.0f)
                lineTo(12.61f, 5.41f)
                lineTo(17.92f, 13.0f)
                horizontalLineTo(15.97f)
                lineTo(19.19f, 18.0f)
                horizontalLineTo(24.0f)
                lineTo(20.14f, 12.0f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _forest!!
    }

private var _forest: ImageVector? = null
