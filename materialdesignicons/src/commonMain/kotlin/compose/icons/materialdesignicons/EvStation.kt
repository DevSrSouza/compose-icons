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

public val MaterialDesignIcons.EvStation: ImageVector
    get() {
        if (_evStation != null) {
            return _evStation!!
        }
        _evStation = Builder(name = "EvStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 7.23f)
                lineTo(19.78f, 7.22f)
                lineTo(16.06f, 3.5f)
                lineTo(15.0f, 4.56f)
                lineTo(17.11f, 6.67f)
                curveTo(16.17f, 7.03f, 15.5f, 7.93f, 15.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 11.5f)
                curveTo(18.36f, 11.5f, 18.69f, 11.42f, 19.0f, 11.29f)
                verticalLineTo(18.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 19.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.5f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 3.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 18.5f)
                verticalLineTo(9.0f)
                curveTo(20.5f, 8.31f, 20.22f, 7.68f, 19.77f, 7.23f)
                moveTo(18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 10.0f)
                moveTo(8.0f, 18.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                lineTo(8.0f, 18.0f)
                close()
            }
        }
        .build()
        return _evStation!!
    }

private var _evStation: ImageVector? = null
