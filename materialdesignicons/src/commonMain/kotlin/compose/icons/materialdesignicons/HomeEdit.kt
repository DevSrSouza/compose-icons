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

public val MaterialDesignIcons.HomeEdit: ImageVector
    get() {
        if (_homeEdit != null) {
            return _homeEdit!!
        }
        _homeEdit = Builder(name = "HomeEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.11f)
                lineTo(19.43f, 9.68f)
                lineTo(12.0f, 3.0f)
                moveTo(21.04f, 11.14f)
                curveTo(20.9f, 11.14f, 20.76f, 11.2f, 20.65f, 11.3f)
                lineTo(19.65f, 12.3f)
                lineTo(21.7f, 14.35f)
                lineTo(22.7f, 13.35f)
                curveTo(22.91f, 13.14f, 22.91f, 12.79f, 22.7f, 12.58f)
                lineTo(21.42f, 11.3f)
                curveTo(21.32f, 11.2f, 21.18f, 11.14f, 21.04f, 11.14f)
                moveTo(19.06f, 12.88f)
                lineTo(13.0f, 18.94f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.06f)
                lineTo(21.11f, 14.93f)
                lineTo(19.06f, 12.88f)
                close()
            }
        }
        .build()
        return _homeEdit!!
    }

private var _homeEdit: ImageVector? = null
