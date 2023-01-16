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

public val MaterialDesignIcons.HelpNetwork: ImageVector
    get() {
        if (_helpNetwork != null) {
            return _helpNetwork!!
        }
        _helpNetwork = Builder(name = "HelpNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 5.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 17.0f, 5.0f, 16.1f, 5.0f, 15.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                moveTo(12.19f, 5.0f)
                curveTo(11.32f, 5.0f, 10.62f, 5.2f, 10.08f, 5.59f)
                curveTo(9.56f, 6.0f, 9.3f, 6.57f, 9.31f, 7.36f)
                lineTo(9.32f, 7.39f)
                horizontalLineTo(11.25f)
                curveTo(11.26f, 7.09f, 11.35f, 6.86f, 11.53f, 6.7f)
                curveTo(11.71f, 6.55f, 11.93f, 6.47f, 12.19f, 6.47f)
                curveTo(12.5f, 6.47f, 12.76f, 6.57f, 12.94f, 6.75f)
                curveTo(13.12f, 6.94f, 13.2f, 7.2f, 13.2f, 7.5f)
                curveTo(13.2f, 7.82f, 13.13f, 8.09f, 12.97f, 8.32f)
                curveTo(12.83f, 8.55f, 12.62f, 8.75f, 12.36f, 8.91f)
                curveTo(11.85f, 9.25f, 11.5f, 9.55f, 11.31f, 9.82f)
                curveTo(11.11f, 10.08f, 11.0f, 10.5f, 11.0f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 10.69f, 13.04f, 10.44f, 13.13f, 10.26f)
                curveTo(13.22f, 10.07f, 13.39f, 9.9f, 13.64f, 9.74f)
                curveTo(14.09f, 9.5f, 14.46f, 9.21f, 14.75f, 8.81f)
                curveTo(15.04f, 8.41f, 15.19f, 8.0f, 15.19f, 7.5f)
                curveTo(15.19f, 6.74f, 14.92f, 6.13f, 14.38f, 5.68f)
                curveTo(13.85f, 5.23f, 13.12f, 5.0f, 12.19f, 5.0f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _helpNetwork!!
    }

private var _helpNetwork: ImageVector? = null
