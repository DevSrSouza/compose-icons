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

public val MaterialDesignIcons.Pillar: ImageVector
    get() {
        if (_pillar != null) {
            return _pillar!!
        }
        _pillar = Builder(name = "Pillar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 7.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                moveTo(21.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                moveTo(15.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                moveTo(7.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pillar!!
    }

private var _pillar: ImageVector? = null
