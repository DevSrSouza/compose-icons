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

public val MaterialDesignIcons.BottleSoda: ImageVector
    get() {
        if (_bottleSoda != null) {
            return _bottleSoda!!
        }
        _bottleSoda = Builder(name = "BottleSoda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 20.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.6f, 9.58f)
                curveTo(11.1f, 7.89f, 11.0f, 4.0f, 11.0f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                reflectiveCurveTo(12.9f, 7.89f, 14.4f, 9.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _bottleSoda!!
    }

private var _bottleSoda: ImageVector? = null
