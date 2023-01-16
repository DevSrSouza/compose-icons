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

public val MaterialDesignIcons.TrophyAward: ImageVector
    get() {
        if (_trophyAward != null) {
            return _trophyAward!!
        }
        _trophyAward = Builder(name = "TrophyAward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2f, 10.7f)
                lineTo(16.6f, 16.0f)
                lineTo(12.0f, 12.2f)
                lineTo(7.4f, 16.0f)
                lineTo(8.8f, 10.8f)
                lineTo(4.6f, 7.3f)
                lineTo(10.0f, 7.0f)
                lineTo(12.0f, 2.0f)
                lineTo(14.0f, 7.0f)
                lineTo(19.4f, 7.3f)
                lineTo(15.2f, 10.7f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                lineTo(12.0f, 15.0f)
                lineTo(11.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 19.0f, 8.0f, 19.9f, 8.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 19.9f, 15.11f, 19.0f, 14.0f, 19.0f)
                close()
            }
        }
        .build()
        return _trophyAward!!
    }

private var _trophyAward: ImageVector? = null
