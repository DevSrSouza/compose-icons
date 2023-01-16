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

public val MaterialDesignIcons.HeadsetDock: ImageVector
    get() {
        if (_headsetDock != null) {
            return _headsetDock!!
        }
        _headsetDock = Builder(name = "HeadsetDock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.13f)
                curveTo(7.27f, 6.57f, 6.0f, 8.14f, 6.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 15.0f)
                verticalLineTo(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 10.0f, 4.0f)
                horizontalLineTo(11.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.14f, 13.73f, 6.57f, 12.0f, 6.13f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _headsetDock!!
    }

private var _headsetDock: ImageVector? = null
