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

public val MaterialDesignIcons.MusicBoxMultipleOutline: ImageVector
    get() {
        if (_musicBoxMultipleOutline != null) {
            return _musicBoxMultipleOutline!!
        }
        _musicBoxMultipleOutline = Builder(name = "MusicBoxMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                moveTo(12.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 12.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.5f)
                curveTo(13.58f, 10.19f, 13.07f, 10.0f, 12.5f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.0f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 15.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
            }
        }
        .build()
        return _musicBoxMultipleOutline!!
    }

private var _musicBoxMultipleOutline: ImageVector? = null
