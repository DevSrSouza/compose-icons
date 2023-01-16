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

public val MaterialDesignIcons.EmailEdit: ImageVector
    get() {
        if (_emailEdit != null) {
            return _emailEdit!!
        }
        _emailEdit = Builder(name = "EmailEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.13f)
                curveTo(20.85f, 12.14f, 20.71f, 12.19f, 20.61f, 12.3f)
                lineTo(19.61f, 13.3f)
                lineTo(21.66f, 15.3f)
                lineTo(22.66f, 14.3f)
                curveTo(22.88f, 14.09f, 22.88f, 13.74f, 22.66f, 13.53f)
                lineTo(21.42f, 12.3f)
                curveTo(21.32f, 12.19f, 21.18f, 12.14f, 21.04f, 12.13f)
                moveTo(19.04f, 13.88f)
                lineTo(13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.11f)
                lineTo(19.24f, 10.89f)
                curveTo(19.71f, 10.4f, 20.36f, 10.13f, 21.04f, 10.13f)
                curveTo(21.38f, 10.13f, 21.72f, 10.19f, 22.04f, 10.32f)
                verticalLineTo(6.0f)
                curveTo(22.04f, 4.88f, 21.12f, 4.0f, 20.0f, 4.0f)
                moveTo(20.0f, 8.0f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 11.0f)
                lineTo(20.0f, 6.0f)
            }
        }
        .build()
        return _emailEdit!!
    }

private var _emailEdit: ImageVector? = null
