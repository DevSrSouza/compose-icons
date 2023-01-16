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

public val MaterialDesignIcons.SyncAlert: ImageVector
    get() {
        if (_syncAlert != null) {
            return _syncAlert!!
        }
        _syncAlert = Builder(name = "SyncAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(21.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                lineTo(17.24f, 7.76f)
                curveTo(18.32f, 8.85f, 19.0f, 10.34f, 19.0f, 12.0f)
                curveTo(19.0f, 14.61f, 17.33f, 16.83f, 15.0f, 17.65f)
                verticalLineTo(19.74f)
                curveTo(18.45f, 18.85f, 21.0f, 15.73f, 21.0f, 12.0f)
                curveTo(21.0f, 9.79f, 20.09f, 7.8f, 18.64f, 6.36f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 14.21f, 3.91f, 16.2f, 5.36f, 17.64f)
                lineTo(3.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                lineTo(6.76f, 16.24f)
                curveTo(5.68f, 15.15f, 5.0f, 13.66f, 5.0f, 12.0f)
                curveTo(5.0f, 9.39f, 6.67f, 7.17f, 9.0f, 6.35f)
                verticalLineTo(4.26f)
                curveTo(5.55f, 5.15f, 3.0f, 8.27f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _syncAlert!!
    }

private var _syncAlert: ImageVector? = null
