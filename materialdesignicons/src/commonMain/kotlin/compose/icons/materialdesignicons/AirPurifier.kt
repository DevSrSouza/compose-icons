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

public val MaterialDesignIcons.AirPurifier: ImageVector
    get() {
        if (_airPurifier != null) {
            return _airPurifier!!
        }
        _airPurifier = Builder(name = "AirPurifier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 9.0f)
                moveTo(11.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 11.0f)
                moveTo(7.0f, 4.0f)
                horizontalLineTo(14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 6.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 7.0f, 4.0f)
                moveTo(16.0f, 11.0f)
                curveTo(18.5f, 11.0f, 18.5f, 9.0f, 21.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(18.5f, 11.0f, 18.5f, 13.0f, 16.0f, 13.0f)
                verticalLineTo(11.0f)
                moveTo(16.0f, 15.0f)
                curveTo(18.5f, 15.0f, 18.5f, 13.0f, 21.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(18.5f, 15.0f, 18.5f, 17.0f, 16.0f, 17.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _airPurifier!!
    }

private var _airPurifier: ImageVector? = null
