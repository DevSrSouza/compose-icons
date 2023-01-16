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

public val MaterialDesignIcons.Video3dVariant: ImageVector
    get() {
        if (_video3dVariant != null) {
            return _video3dVariant!!
        }
        _video3dVariant = Builder(name = "Video3dVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.5f, 14.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.0f, 10.0f)
                moveTo(21.0f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 7.0f)
                verticalLineTo(10.5f)
                moveTo(9.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 14.5f)
                moveTo(15.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 14.5f)
            }
        }
        .build()
        return _video3dVariant!!
    }

private var _video3dVariant: ImageVector? = null
