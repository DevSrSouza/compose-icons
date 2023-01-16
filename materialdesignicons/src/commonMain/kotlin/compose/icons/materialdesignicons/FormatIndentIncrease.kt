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

public val MaterialDesignIcons.FormatIndentIncrease: ImageVector
    get() {
        if (_formatIndentIncrease != null) {
            return _formatIndentIncrease!!
        }
        _formatIndentIncrease = Builder(name = "FormatIndentIncrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(7.0f, 12.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _formatIndentIncrease!!
    }

private var _formatIndentIncrease: ImageVector? = null
