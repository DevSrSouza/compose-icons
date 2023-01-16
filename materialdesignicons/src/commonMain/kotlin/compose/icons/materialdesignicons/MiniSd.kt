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

public val MaterialDesignIcons.MiniSd: ImageVector
    get() {
        if (_miniSd != null) {
            return _miniSd!!
        }
        _miniSd = Builder(name = "MiniSd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 18.0f)
                verticalLineTo(12.0f)
                lineTo(18.0f, 10.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 4.0f)
                horizontalLineTo(6.0f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                moveTo(10.0f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _miniSd!!
    }

private var _miniSd: ImageVector? = null
