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

public val MaterialDesignIcons.TrainVariant: ImageVector
    get() {
        if (_trainVariant != null) {
            return _trainVariant!!
        }
        _trainVariant = Builder(name = "TrainVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 17.0f)
                curveTo(10.89f, 17.0f, 10.0f, 16.1f, 10.0f, 15.0f)
                curveTo(10.0f, 13.89f, 10.89f, 13.0f, 12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 17.0f)
                moveTo(4.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 19.0f)
                lineTo(6.0f, 20.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.5f)
                lineTo(16.5f, 19.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.0f, 15.5f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 1.5f, 16.42f, 1.0f, 12.0f, 1.0f)
                curveTo(7.58f, 1.0f, 4.0f, 1.5f, 4.0f, 5.0f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _trainVariant!!
    }

private var _trainVariant: ImageVector? = null
