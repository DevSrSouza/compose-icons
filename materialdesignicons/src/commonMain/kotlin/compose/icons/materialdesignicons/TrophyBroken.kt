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

public val MaterialDesignIcons.TrophyBroken: ImageVector
    get() {
        if (_trophyBroken != null) {
            return _trophyBroken!!
        }
        _trophyBroken = Builder(name = "TrophyBroken", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2f, 13.0f)
                curveTo(6.6f, 14.8f, 7.6f, 16.3f, 10.0f, 16.8f)
                verticalLineTo(19.34f)
                curveTo(8.0f, 20.12f, 8.0f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(13.2f)
                lineTo(10.2f, 15.0f)
                lineTo(14.2f, 10.0f)
                lineTo(10.7f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 3.0f, 6.9f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 12.0f, 3.0f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(6.2f)
                moveTo(6.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                moveTo(17.8f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(21.0f, 13.0f, 22.0f, 12.0f, 22.0f, 11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(17.1f, 2.0f, 16.0f, 3.0f, 16.0f, 4.0f)
                horizontalLineTo(13.9f)
                lineTo(16.7f, 10.0f)
                lineTo(12.2f, 15.0f)
                lineTo(13.2f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 22.0f, 16.0f, 20.12f, 14.0f, 19.34f)
                lineTo(14.0f, 16.85f)
                curveTo(16.39f, 16.35f, 17.5f, 14.7f, 17.8f, 13.0f)
                moveTo(20.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _trophyBroken!!
    }

private var _trophyBroken: ImageVector? = null
