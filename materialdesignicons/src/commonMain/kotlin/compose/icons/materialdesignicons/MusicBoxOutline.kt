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

public val MaterialDesignIcons.MusicBoxOutline: ImageVector
    get() {
        if (_musicBoxOutline != null) {
            return _musicBoxOutline!!
        }
        _musicBoxOutline = Builder(name = "MusicBoxOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 17.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.5f, 12.0f)
                curveTo(11.07f, 12.0f, 11.58f, 12.19f, 12.0f, 12.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _musicBoxOutline!!
    }

private var _musicBoxOutline: ImageVector? = null
