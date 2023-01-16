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

public val MaterialDesignIcons.FormatPilcrowArrowLeft: ImageVector
    get() {
        if (_formatPilcrowArrowLeft != null) {
            return _formatPilcrowArrowLeft!!
        }
        _formatPilcrowArrowLeft = Builder(name = "FormatPilcrowArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 18.0f)
                lineTo(8.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _formatPilcrowArrowLeft!!
    }

private var _formatPilcrowArrowLeft: ImageVector? = null