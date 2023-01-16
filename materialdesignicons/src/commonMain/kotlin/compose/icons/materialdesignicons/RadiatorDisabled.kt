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

public val MaterialDesignIcons.RadiatorDisabled: ImageVector
    get() {
        if (_radiatorDisabled != null) {
            return _radiatorDisabled!!
        }
        _radiatorDisabled = Builder(name = "RadiatorDisabled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 12.0f)
                moveTo(7.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 15.0f)
                verticalLineTo(17.0f)
                moveTo(11.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 15.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 15.0f)
                verticalLineTo(17.0f)
                moveTo(19.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 15.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _radiatorDisabled!!
    }

private var _radiatorDisabled: ImageVector? = null
