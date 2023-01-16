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

public val MaterialDesignIcons.LandRowsHorizontal: ImageVector
    get() {
        if (_landRowsHorizontal != null) {
            return _landRowsHorizontal!!
        }
        _landRowsHorizontal = Builder(name = "LandRowsHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                moveTo(4.0f, 6.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 15.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _landRowsHorizontal!!
    }

private var _landRowsHorizontal: ImageVector? = null
