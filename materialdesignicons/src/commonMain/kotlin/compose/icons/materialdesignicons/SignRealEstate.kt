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

public val MaterialDesignIcons.SignRealEstate: ImageVector
    get() {
        if (_signRealEstate != null) {
            return _signRealEstate!!
        }
        _signRealEstate = Builder(name = "SignRealEstate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 8.0f, 6.0f, 8.9f, 6.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.9f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 18.0f, 20.0f, 17.11f, 20.0f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 8.9f, 19.11f, 8.0f, 18.0f, 8.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                moveTo(18.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                moveTo(22.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _signRealEstate!!
    }

private var _signRealEstate: ImageVector? = null
