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

public val MaterialDesignIcons.ScoreboardOutline: ImageVector
    get() {
        if (_scoreboardOutline != null) {
            return _scoreboardOutline!!
        }
        _scoreboardOutline = Builder(name = "ScoreboardOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.1f, 1.9f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 21.0f, 23.0f, 20.1f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(21.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                moveTo(5.0f, 7.0f)
                horizontalLineTo(9.0f)
                curveTo(9.6f, 7.0f, 10.0f, 7.4f, 10.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(10.0f, 16.6f, 9.6f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4f, 17.0f, 4.0f, 16.6f, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 7.4f, 4.4f, 7.0f, 5.0f, 7.0f)
                moveTo(6.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                moveTo(15.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(19.6f, 7.0f, 20.0f, 7.4f, 20.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 16.6f, 19.6f, 17.0f, 19.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4f, 17.0f, 14.0f, 16.6f, 14.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 7.4f, 14.4f, 7.0f, 15.0f, 7.0f)
                moveTo(16.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 11.0f)
                curveTo(12.6f, 11.0f, 13.0f, 10.6f, 13.0f, 10.0f)
                curveTo(13.0f, 9.4f, 12.6f, 9.0f, 12.0f, 9.0f)
                curveTo(11.4f, 9.0f, 11.0f, 9.4f, 11.0f, 10.0f)
                curveTo(11.0f, 10.6f, 11.4f, 11.0f, 12.0f, 11.0f)
                moveTo(12.0f, 15.0f)
                curveTo(12.6f, 15.0f, 13.0f, 14.6f, 13.0f, 14.0f)
                curveTo(13.0f, 13.4f, 12.6f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4f, 13.0f, 11.0f, 13.4f, 11.0f, 14.0f)
                curveTo(11.0f, 14.6f, 11.4f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _scoreboardOutline!!
    }

private var _scoreboardOutline: ImageVector? = null
