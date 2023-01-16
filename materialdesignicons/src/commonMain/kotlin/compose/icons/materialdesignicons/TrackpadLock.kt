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

public val MaterialDesignIcons.TrackpadLock: ImageVector
    get() {
        if (_trackpadLock != null) {
            return _trackpadLock!!
        }
        _trackpadLock = Builder(name = "TrackpadLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 1.0f)
                curveTo(1.89f, 1.0f, 1.0f, 1.89f, 1.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 18.11f, 1.89f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.68f)
                curveTo(17.5f, 12.35f, 18.47f, 12.0f, 19.5f, 12.0f)
                curveTo(20.0f, 12.0f, 20.5f, 12.09f, 21.0f, 12.26f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 1.89f, 20.11f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                moveTo(19.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 16.5f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 18.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 23.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 22.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.5f, 14.0f)
                moveTo(19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 16.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 15.0f)
                close()
            }
        }
        .build()
        return _trackpadLock!!
    }

private var _trackpadLock: ImageVector? = null
