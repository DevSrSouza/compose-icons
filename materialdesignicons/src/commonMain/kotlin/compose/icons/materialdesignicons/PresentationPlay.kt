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

public val MaterialDesignIcons.PresentationPlay: ImageVector
    get() {
        if (_presentationPlay != null) {
            return _presentationPlay!!
        }
        _presentationPlay = Builder(name = "PresentationPlay", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.25f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(15.0f)
                lineTo(13.25f, 16.0f)
                horizontalLineTo(10.75f)
                lineTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                lineTo(8.75f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                moveTo(11.85f, 11.85f)
                curveTo(11.76f, 11.94f, 11.64f, 12.0f, 11.5f, 12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.0f, 11.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 11.5f, 7.0f)
                curveTo(11.64f, 7.0f, 11.76f, 7.06f, 11.85f, 7.15f)
                lineTo(13.25f, 8.54f)
                curveTo(13.57f, 8.86f, 13.89f, 9.18f, 13.89f, 9.5f)
                curveTo(13.89f, 9.82f, 13.57f, 10.14f, 13.25f, 10.46f)
                lineTo(11.85f, 11.85f)
                close()
            }
        }
        .build()
        return _presentationPlay!!
    }

private var _presentationPlay: ImageVector? = null
