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

public val MaterialDesignIcons.CompareVertical: ImageVector
    get() {
        if (_compareVertical != null) {
            return _compareVertical!!
        }
        _compareVertical = Builder(name = "CompareVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                lineTo(15.0f, 11.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineTo(14.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                lineTo(9.0f, 13.0f)
                lineTo(13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _compareVertical!!
    }

private var _compareVertical: ImageVector? = null
