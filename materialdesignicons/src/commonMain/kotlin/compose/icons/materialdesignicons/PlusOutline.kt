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

public val MaterialDesignIcons.PlusOutline: ImageVector
    get() {
        if (_plusOutline != null) {
            return _plusOutline!!
        }
        _plusOutline = Builder(name = "PlusOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _plusOutline!!
    }

private var _plusOutline: ImageVector? = null
