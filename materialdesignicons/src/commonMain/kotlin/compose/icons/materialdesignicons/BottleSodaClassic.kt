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

public val MaterialDesignIcons.BottleSodaClassic: ImageVector
    get() {
        if (_bottleSodaClassic != null) {
            return _bottleSodaClassic!!
        }
        _bottleSodaClassic = Builder(name = "BottleSodaClassic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.77f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 18.23f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 20.0f)
                verticalLineTo(18.23f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 13.77f)
                verticalLineTo(9.0f)
                arcTo(12.28f, 12.28f, 0.0f, false, false, 10.91f, 4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.09f)
                arcTo(12.28f, 12.28f, 0.0f, false, false, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bottleSodaClassic!!
    }

private var _bottleSodaClassic: ImageVector? = null
