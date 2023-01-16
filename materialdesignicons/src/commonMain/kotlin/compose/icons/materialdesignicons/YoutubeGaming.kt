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

public val MaterialDesignIcons.YoutubeGaming: ImageVector
    get() {
        if (_youtubeGaming != null) {
            return _youtubeGaming!!
        }
        _youtubeGaming = Builder(name = "YoutubeGaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(8.0f)
                lineTo(17.0f, 5.0f)
                lineTo(12.0f, 8.0f)
                lineTo(7.0f, 5.0f)
                lineTo(2.0f, 8.0f)
                verticalLineTo(13.0f)
                lineTo(12.0f, 19.0f)
                lineTo(22.0f, 13.0f)
                moveTo(9.0f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                moveTo(15.0f, 13.0f)
                curveTo(14.45f, 13.0f, 14.0f, 12.55f, 14.0f, 12.0f)
                reflectiveCurveTo(14.45f, 11.0f, 15.0f, 11.0f)
                reflectiveCurveTo(16.0f, 11.45f, 16.0f, 12.0f)
                reflectiveCurveTo(15.55f, 13.0f, 15.0f, 13.0f)
                moveTo(18.0f, 11.0f)
                curveTo(17.45f, 11.0f, 17.0f, 10.55f, 17.0f, 10.0f)
                reflectiveCurveTo(17.45f, 9.0f, 18.0f, 9.0f)
                reflectiveCurveTo(19.0f, 9.45f, 19.0f, 10.0f)
                reflectiveCurveTo(18.55f, 11.0f, 18.0f, 11.0f)
                close()
            }
        }
        .build()
        return _youtubeGaming!!
    }

private var _youtubeGaming: ImageVector? = null
