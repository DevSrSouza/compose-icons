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

public val MaterialDesignIcons.BlindsOpen: ImageVector
    get() {
        if (_blindsOpen != null) {
            return _blindsOpen!!
        }
        _blindsOpen = Builder(name = "BlindsOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 2.0f, 22.0f, 2.45f, 22.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 5.55f, 21.55f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 7.55f, 19.55f, 8.0f, 19.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.17f)
                curveTo(14.17f, 10.58f, 15.0f, 11.7f, 15.0f, 13.0f)
                curveTo(15.0f, 14.66f, 13.66f, 16.0f, 12.0f, 16.0f)
                curveTo(10.34f, 16.0f, 9.0f, 14.66f, 9.0f, 13.0f)
                curveTo(9.0f, 11.69f, 9.84f, 10.58f, 11.0f, 10.17f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 8.0f, 4.0f, 7.55f, 4.0f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 6.0f, 2.0f, 5.55f, 2.0f, 5.0f)
                verticalLineTo(3.0f)
                curveTo(2.0f, 2.45f, 2.45f, 2.0f, 3.0f, 2.0f)
                moveTo(12.0f, 12.0f)
                curveTo(11.45f, 12.0f, 11.0f, 12.45f, 11.0f, 13.0f)
                curveTo(11.0f, 13.55f, 11.45f, 14.0f, 12.0f, 14.0f)
                curveTo(12.55f, 14.0f, 13.0f, 13.55f, 13.0f, 13.0f)
                curveTo(13.0f, 12.45f, 12.55f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _blindsOpen!!
    }

private var _blindsOpen: ImageVector? = null
