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

public val MaterialDesignIcons.FuseOff: ImageVector
    get() {
        if (_fuseOff != null) {
            return _fuseOff!!
        }
        _fuseOff = Builder(name = "FuseOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.8f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.8f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(2.0f)
                curveTo(16.0f, 1.45f, 15.55f, 1.0f, 15.0f, 1.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 1.0f, 7.0f, 1.45f, 7.0f, 2.0f)
                verticalLineTo(3.8f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(16.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(8.0f, 9.89f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(7.0f, 22.0f)
                curveTo(7.0f, 22.55f, 7.45f, 23.0f, 8.0f, 23.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 23.0f, 16.0f, 22.55f, 16.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _fuseOff!!
    }

private var _fuseOff: ImageVector? = null
