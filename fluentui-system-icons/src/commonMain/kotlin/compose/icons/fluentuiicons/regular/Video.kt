package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 4.5f)
                curveTo(15.5449f, 4.5f, 17.0f, 5.9551f, 17.0f, 7.75f)
                verticalLineTo(7.923f)
                lineTo(20.8639f, 5.605f)
                curveTo(21.3638f, 5.3049f, 22.0f, 5.6649f, 22.0f, 6.248f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.333f, 21.364f, 18.6931f, 20.8641f, 18.3931f)
                lineTo(17.0f, 16.075f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 18.0449f, 15.5449f, 19.5f, 13.75f, 19.5f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 19.5f, 2.0f, 18.0449f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 5.9551f, 3.4551f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 6.0f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 6.0f, 3.5f, 6.7835f, 3.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(3.5f, 17.2165f, 4.2835f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(13.75f)
                curveTo(14.7165f, 18.0f, 15.5f, 17.2165f, 15.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 6.7835f, 14.7165f, 6.0f, 13.75f, 6.0f)
                close()
                moveTo(20.5f, 7.5731f)
                lineTo(17.0f, 9.6745f)
                verticalLineTo(14.3254f)
                lineTo(20.5f, 16.4254f)
                verticalLineTo(7.5731f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
