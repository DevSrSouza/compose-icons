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

public val MaterialDesignIcons.LineScan: ImageVector
    get() {
        if (_lineScan != null) {
            return _lineScan!!
        }
        _lineScan = Builder(name = "LineScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.5f)
                curveTo(22.0f, 20.9f, 21.8f, 21.2f, 21.5f, 21.5f)
                curveTo(21.2f, 21.8f, 20.8f, 22.0f, 20.5f, 22.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(3.1f, 22.0f, 2.8f, 21.8f, 2.5f, 21.5f)
                curveTo(2.2f, 21.2f, 2.0f, 20.8f, 2.0f, 20.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(20.5f)
                curveTo(20.9f, 2.0f, 21.2f, 2.2f, 21.5f, 2.5f)
                curveTo(21.8f, 2.8f, 22.0f, 3.1f, 22.0f, 3.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                moveTo(7.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                curveTo(2.0f, 3.1f, 2.2f, 2.8f, 2.5f, 2.5f)
                reflectiveCurveTo(3.1f, 2.0f, 3.5f, 2.0f)
                horizontalLineTo(7.0f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _lineScan!!
    }

private var _lineScan: ImageVector? = null
