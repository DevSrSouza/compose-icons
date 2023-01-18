package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodToast: ImageVector
    get() {
        if (_foodToast != null) {
            return _foodToast!!
        }
        _foodToast = Builder(name = "FoodToast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 9.0f)
                curveTo(7.8358f, 9.0f, 7.5f, 9.3358f, 7.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(7.5f, 14.6642f, 7.8358f, 15.0f, 8.25f, 15.0f)
                horizontalLineTo(12.75f)
                curveTo(13.1642f, 15.0f, 13.5f, 14.6642f, 13.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(13.5f, 9.3358f, 13.1642f, 9.0f, 12.75f, 9.0f)
                horizontalLineTo(8.25f)
                close()
                moveTo(9.0f, 13.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(9.0f)
                close()
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.1266f, 4.1266f, 3.0f, 6.75f, 3.0f)
                horizontalLineTo(17.2501f)
                curveTo(19.8734f, 3.0f, 22.0001f, 5.1266f, 22.0001f, 7.75f)
                curveTo(22.0001f, 8.9881f, 21.5256f, 10.1164f, 20.7501f, 10.9613f)
                verticalLineTo(18.75f)
                curveTo(20.7501f, 19.9926f, 19.7427f, 21.0f, 18.5001f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.2574f, 21.0f, 3.25f, 19.9926f, 3.25f, 18.75f)
                verticalLineTo(10.9613f)
                curveTo(2.4745f, 10.1164f, 2.0f, 8.9881f, 2.0f, 7.75f)
                close()
                moveTo(6.75f, 4.5f)
                curveTo(4.9551f, 4.5f, 3.5f, 5.9551f, 3.5f, 7.75f)
                curveTo(3.5f, 8.6795f, 3.8892f, 9.5169f, 4.5157f, 10.1102f)
                curveTo(4.6653f, 10.2518f, 4.75f, 10.4488f, 4.75f, 10.6548f)
                verticalLineTo(18.75f)
                curveTo(4.75f, 19.1642f, 5.0858f, 19.5f, 5.5f, 19.5f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 19.5f, 16.25f, 19.1642f, 16.25f, 18.75f)
                verticalLineTo(11.0577f)
                curveTo(16.25f, 10.8096f, 16.3726f, 10.5776f, 16.5776f, 10.4379f)
                curveTo(17.4378f, 9.8517f, 18.0f, 8.8664f, 18.0f, 7.75f)
                curveTo(18.0f, 5.9551f, 16.5449f, 4.5f, 14.75f, 4.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _foodToast!!
    }

private var _foodToast: ImageVector? = null
