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

public val MaterialDesignIcons.PowerSocketAu: ImageVector
    get() {
        if (_powerSocketAu != null) {
            return _powerSocketAu!!
        }
        _powerSocketAu = Builder(name = "PowerSocketAu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.22f, 2.0f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 2.0f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 4.22f, 22.0f)
                horizontalLineTo(19.78f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 22.0f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.78f, 2.0f)
                horizontalLineTo(4.22f)
                moveTo(12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(8.27f, 7.54f)
                lineTo(6.27f, 11.0f)
                lineTo(8.0f, 12.0f)
                lineTo(10.0f, 8.54f)
                lineTo(8.27f, 7.54f)
                moveTo(15.73f, 7.54f)
                lineTo(14.0f, 8.54f)
                lineTo(16.0f, 12.0f)
                lineTo(17.73f, 11.0f)
                lineTo(15.73f, 7.54f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _powerSocketAu!!
    }

private var _powerSocketAu: ImageVector? = null
