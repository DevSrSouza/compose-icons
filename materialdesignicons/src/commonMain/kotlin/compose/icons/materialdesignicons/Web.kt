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

public val MaterialDesignIcons.Web: ImageVector
    get() {
        if (_web != null) {
            return _web!!
        }
        _web = Builder(name = "Web", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.36f, 14.0f)
                curveTo(16.44f, 13.34f, 16.5f, 12.68f, 16.5f, 12.0f)
                curveTo(16.5f, 11.32f, 16.44f, 10.66f, 16.36f, 10.0f)
                horizontalLineTo(19.74f)
                curveTo(19.9f, 10.64f, 20.0f, 11.31f, 20.0f, 12.0f)
                curveTo(20.0f, 12.69f, 19.9f, 13.36f, 19.74f, 14.0f)
                moveTo(14.59f, 19.56f)
                curveTo(15.19f, 18.45f, 15.65f, 17.25f, 15.97f, 16.0f)
                horizontalLineTo(18.92f)
                curveTo(17.96f, 17.65f, 16.43f, 18.93f, 14.59f, 19.56f)
                moveTo(14.34f, 14.0f)
                horizontalLineTo(9.66f)
                curveTo(9.56f, 13.34f, 9.5f, 12.68f, 9.5f, 12.0f)
                curveTo(9.5f, 11.32f, 9.56f, 10.65f, 9.66f, 10.0f)
                horizontalLineTo(14.34f)
                curveTo(14.43f, 10.65f, 14.5f, 11.32f, 14.5f, 12.0f)
                curveTo(14.5f, 12.68f, 14.43f, 13.34f, 14.34f, 14.0f)
                moveTo(12.0f, 19.96f)
                curveTo(11.17f, 18.76f, 10.5f, 17.43f, 10.09f, 16.0f)
                horizontalLineTo(13.91f)
                curveTo(13.5f, 17.43f, 12.83f, 18.76f, 12.0f, 19.96f)
                moveTo(8.0f, 8.0f)
                horizontalLineTo(5.08f)
                curveTo(6.03f, 6.34f, 7.57f, 5.06f, 9.4f, 4.44f)
                curveTo(8.8f, 5.55f, 8.35f, 6.75f, 8.0f, 8.0f)
                moveTo(5.08f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(8.35f, 17.25f, 8.8f, 18.45f, 9.4f, 19.56f)
                curveTo(7.57f, 18.93f, 6.03f, 17.65f, 5.08f, 16.0f)
                moveTo(4.26f, 14.0f)
                curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f)
                curveTo(4.0f, 11.31f, 4.1f, 10.64f, 4.26f, 10.0f)
                horizontalLineTo(7.64f)
                curveTo(7.56f, 10.66f, 7.5f, 11.32f, 7.5f, 12.0f)
                curveTo(7.5f, 12.68f, 7.56f, 13.34f, 7.64f, 14.0f)
                moveTo(12.0f, 4.03f)
                curveTo(12.83f, 5.23f, 13.5f, 6.57f, 13.91f, 8.0f)
                horizontalLineTo(10.09f)
                curveTo(10.5f, 6.57f, 11.17f, 5.23f, 12.0f, 4.03f)
                moveTo(18.92f, 8.0f)
                horizontalLineTo(15.97f)
                curveTo(15.65f, 6.75f, 15.19f, 5.55f, 14.59f, 4.44f)
                curveTo(16.43f, 5.07f, 17.96f, 6.34f, 18.92f, 8.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _web!!
    }

private var _web: ImageVector? = null
