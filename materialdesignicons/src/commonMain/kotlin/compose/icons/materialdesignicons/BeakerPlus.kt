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

public val MaterialDesignIcons.BeakerPlus: ImageVector
    get() {
        if (_beakerPlus != null) {
            return _beakerPlus!!
        }
        _beakerPlus = Builder(name = "BeakerPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(19.9f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(15.69f, 12.0f, 13.0f, 14.69f, 13.0f, 18.0f)
                curveTo(13.0f, 19.09f, 13.29f, 20.12f, 13.8f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 21.0f, 5.0f, 20.1f, 5.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.9f, 4.1f, 5.0f, 3.0f, 5.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(10.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                moveTo(12.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _beakerPlus!!
    }

private var _beakerPlus: ImageVector? = null
