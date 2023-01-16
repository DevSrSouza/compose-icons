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

public val MaterialDesignIcons.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.68f, 4.0f)
                horizontalLineTo(14.3f)
                lineTo(12.56f, 8.0f)
                curveTo(12.53f, 8.04f, 12.45f, 8.22f, 12.31f, 8.5f)
                reflectiveCurveTo(12.06f, 9.04f, 12.0f, 9.19f)
                lineTo(9.7f, 4.0f)
                horizontalLineTo(6.32f)
                lineTo(10.41f, 12.84f)
                curveTo(10.5f, 13.06f, 10.73f, 13.59f, 11.11f, 14.43f)
                curveTo(11.5f, 15.28f, 11.78f, 15.91f, 12.0f, 16.35f)
                lineTo(13.41f, 19.44f)
                curveTo(13.6f, 19.78f, 13.89f, 19.95f, 14.3f, 19.95f)
                lineTo(19.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                lineTo(13.6f, 12.84f)
                lineTo(17.68f, 4.0f)
                moveTo(20.03f, 16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 16.73f, 21.91f, 16.5f, 21.72f, 16.28f)
                curveTo(21.53f, 16.08f, 21.3f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(20.03f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(20.0f)
                lineTo(9.7f, 19.95f)
                curveTo(10.11f, 19.95f, 10.4f, 19.78f, 10.59f, 19.44f)
                lineTo(11.44f, 17.5f)
                lineTo(9.84f, 14.06f)
                lineTo(9.0f, 16.0f)
                horizontalLineTo(5.0f)
                moveTo(2.0f, 20.0f)
                horizontalLineTo(3.97f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                curveTo(2.7f, 16.0f, 2.47f, 16.08f, 2.28f, 16.28f)
                curveTo(2.09f, 16.5f, 2.0f, 16.73f, 2.0f, 17.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
