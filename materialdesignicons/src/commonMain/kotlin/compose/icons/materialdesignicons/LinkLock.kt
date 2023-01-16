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

public val MaterialDesignIcons.LinkLock: ImageVector
    get() {
        if (_linkLock != null) {
            return _linkLock!!
        }
        _linkLock = Builder(name = "LinkLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 16.0f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 15.5f)
                verticalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 17.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 22.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 21.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 16.0f)
                moveTo(22.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 15.5f)
                moveTo(7.0f, 8.9f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.1f)
                horizontalLineTo(7.0f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 7.0f, 8.9f)
                moveTo(8.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                moveTo(13.0f, 15.1f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.1f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.9f)
                horizontalLineTo(17.0f)
                arcTo(3.09f, 3.09f, 0.0f, false, true, 19.94f, 11.0f)
                arcTo(5.12f, 5.12f, 0.0f, false, true, 20.5f, 11.0f)
                horizontalLineTo(21.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _linkLock!!
    }

private var _linkLock: ImageVector? = null
