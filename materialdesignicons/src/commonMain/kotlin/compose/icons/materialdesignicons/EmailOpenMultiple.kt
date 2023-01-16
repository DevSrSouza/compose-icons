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

public val MaterialDesignIcons.EmailOpenMultiple: ImageVector
    get() {
        if (_emailOpenMultiple != null) {
            return _emailOpenMultiple!!
        }
        _emailOpenMultiple = Builder(name = "EmailOpenMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                lineTo(14.0f, 13.0f)
                lineTo(22.0f, 8.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 3.0f)
                lineTo(6.0f, 8.0f)
                verticalLineTo(8.0f)
                moveTo(24.0f, 8.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 20.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 7.27f, 4.39f, 6.64f, 4.97f, 6.29f)
                lineTo(14.0f, 0.64f)
                lineTo(23.03f, 6.29f)
                curveTo(23.61f, 6.64f, 24.0f, 7.27f, 24.0f, 8.0f)
                moveTo(2.0f, 8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _emailOpenMultiple!!
    }

private var _emailOpenMultiple: ImageVector? = null
