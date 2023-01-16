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

public val MaterialDesignIcons.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 12.0f)
                moveTo(12.0f, 20.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                curveTo(10.89f, 8.0f, 10.0f, 7.1f, 10.0f, 6.0f)
                curveTo(10.0f, 4.89f, 10.89f, 4.0f, 12.0f, 4.0f)
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 2.0f, 5.0f, 2.89f, 5.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(19.0f, 2.89f, 18.1f, 2.0f, 17.0f, 2.0f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
