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

public val MaterialDesignIcons.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 11.0f)
                curveTo(3.0f, 14.03f, 4.53f, 16.82f, 7.0f, 18.47f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.46f)
                curveTo(19.47f, 16.81f, 21.0f, 14.0f, 21.0f, 11.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(8.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 11.0f)
                moveTo(16.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 11.0f)
                moveTo(12.0f, 14.0f)
                lineTo(13.5f, 17.0f)
                horizontalLineTo(10.5f)
                lineTo(12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
