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

public val MaterialDesignIcons.MusicNoteMinus: ImageVector
    get() {
        if (_musicNoteMinus != null) {
            return _musicNoteMinus!!
        }
        _musicNoteMinus = Builder(name = "MusicNoteMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                moveTo(9.0f, 3.0f)
                verticalLineTo(13.55f)
                curveTo(8.41f, 13.21f, 7.73f, 13.0f, 7.0f, 13.0f)
                curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                reflectiveCurveTo(4.79f, 21.0f, 7.0f, 21.0f)
                reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _musicNoteMinus!!
    }

private var _musicNoteMinus: ImageVector? = null
