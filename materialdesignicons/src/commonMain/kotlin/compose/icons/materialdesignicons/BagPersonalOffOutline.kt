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

public val MaterialDesignIcons.BagPersonalOffOutline: ImageVector
    get() {
        if (_bagPersonalOffOutline != null) {
            return _bagPersonalOffOutline!!
        }
        _bagPersonalOffOutline = Builder(name = "BagPersonalOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.35f)
                lineTo(2.38f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.77f, 6.66f)
                curveTo(4.27f, 7.34f, 4.0f, 8.16f, 4.0f, 9.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.56f, 22.0f, 19.08f, 21.76f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.0f, 19.35f)
                moveTo(6.0f, 9.0f)
                curveTo(6.0f, 8.69f, 6.08f, 8.38f, 6.22f, 8.11f)
                lineTo(13.11f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.11f)
                lineTo(18.0f, 19.89f)
                verticalLineTo(20.0f)
                moveTo(16.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 9.0f)
                verticalLineTo(14.8f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 4.0f)
                verticalLineTo(4.8f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(16.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _bagPersonalOffOutline!!
    }

private var _bagPersonalOffOutline: ImageVector? = null
