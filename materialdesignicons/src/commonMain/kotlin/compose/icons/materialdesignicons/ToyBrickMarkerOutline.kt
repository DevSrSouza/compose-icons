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

public val MaterialDesignIcons.ToyBrickMarkerOutline: ImageVector
    get() {
        if (_toyBrickMarkerOutline != null) {
            return _toyBrickMarkerOutline!!
        }
        _toyBrickMarkerOutline = Builder(name = "ToyBrickMarkerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.0f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 15.0f, 15.5f)
                curveTo(15.0f, 18.1f, 18.5f, 22.0f, 18.5f, 22.0f)
                reflectiveCurveTo(22.0f, 18.1f, 22.0f, 15.5f)
                arcTo(3.54f, 3.54f, 0.0f, false, false, 18.5f, 12.0f)
                moveTo(18.5f, 16.8f)
                arcTo(1.2f, 1.2f, 0.0f, true, true, 18.5f, 14.4f)
                arcTo(1.29f, 1.29f, 0.0f, false, true, 19.7f, 15.6f)
                arcTo(1.15f, 1.15f, 0.0f, false, true, 18.5f, 16.8f)
                moveTo(19.0f, 6.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.54f)
                arcTo(15.55f, 15.55f, 0.0f, false, true, 13.54f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                arcTo(5.11f, 5.11f, 0.0f, false, true, 21.0f, 10.6f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _toyBrickMarkerOutline!!
    }

private var _toyBrickMarkerOutline: ImageVector? = null
