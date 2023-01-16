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

public val MaterialDesignIcons.LandRowsVertical: ImageVector
    get() {
        if (_landRowsVertical != null) {
            return _landRowsVertical!!
        }
        _landRowsVertical = Builder(name = "LandRowsVertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(6.5f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(20.0f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                moveTo(15.5f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _landRowsVertical!!
    }

private var _landRowsVertical: ImageVector? = null
