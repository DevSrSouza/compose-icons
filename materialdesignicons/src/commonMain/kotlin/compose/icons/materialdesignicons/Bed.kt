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

public val MaterialDesignIcons.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 7.0f)
                moveTo(7.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
