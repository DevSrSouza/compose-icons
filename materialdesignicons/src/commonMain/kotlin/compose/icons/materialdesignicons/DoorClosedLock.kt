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

public val MaterialDesignIcons.DoorClosedLock: ImageVector
    get() {
        if (_doorClosedLock != null) {
            return _doorClosedLock!!
        }
        _doorClosedLock = Builder(name = "DoorClosedLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(12.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                moveTo(6.2f, 5.0f)
                horizontalLineTo(2.8f)
                verticalLineTo(4.5f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 6.2f, 4.5f)
                moveTo(7.0f, 5.0f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 4.5f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 6.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 11.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 10.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 5.0f)
            }
        }
        .build()
        return _doorClosedLock!!
    }

private var _doorClosedLock: ImageVector? = null
