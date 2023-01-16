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

public val MaterialDesignIcons.Scanner: ImageVector
    get() {
        if (_scanner != null) {
            return _scanner!!
        }
        _scanner = Builder(name = "Scanner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2f, 10.7f)
                lineTo(19.8f, 5.0f)
                lineTo(20.5f, 6.9f)
                lineTo(6.4f, 12.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 18.0f)
                verticalLineTo(12.5f)
                curveTo(3.0f, 11.7f, 3.5f, 10.9f, 4.2f, 10.7f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                moveTo(5.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _scanner!!
    }

private var _scanner: ImageVector? = null
