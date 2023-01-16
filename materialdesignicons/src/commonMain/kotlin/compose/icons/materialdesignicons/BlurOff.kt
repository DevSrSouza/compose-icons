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

public val MaterialDesignIcons.BlurOff: ImageVector
    get() {
        if (_blurOff != null) {
            return _blurOff!!
        }
        _blurOff = Builder(name = "BlurOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 2.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 13.5f)
                moveTo(6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 17.0f)
                moveTo(10.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 21.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 20.5f)
                moveTo(3.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 2.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 9.5f)
                moveTo(6.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 13.0f)
                moveTo(21.0f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.0f, 13.5f)
                moveTo(10.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 17.0f)
                moveTo(2.5f, 5.27f)
                lineTo(6.28f, 9.05f)
                lineTo(6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 10.0f)
                curveTo(7.0f, 9.9f, 6.97f, 9.81f, 6.94f, 9.72f)
                lineTo(9.75f, 12.53f)
                curveTo(9.04f, 12.64f, 8.5f, 13.26f, 8.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 15.5f)
                curveTo(10.74f, 15.5f, 11.36f, 14.96f, 11.47f, 14.25f)
                lineTo(14.28f, 17.06f)
                curveTo(14.19f, 17.03f, 14.1f, 17.0f, 14.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 18.0f)
                curveTo(15.0f, 17.9f, 14.97f, 17.81f, 14.94f, 17.72f)
                lineTo(18.72f, 21.5f)
                lineTo(20.0f, 20.23f)
                lineTo(3.77f, 4.0f)
                lineTo(2.5f, 5.27f)
                moveTo(14.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 21.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 20.5f)
                moveTo(18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 7.0f)
                moveTo(18.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 11.0f)
                moveTo(18.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 15.0f)
                moveTo(10.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 7.0f)
                moveTo(21.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 20.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 21.0f, 10.5f)
                moveTo(10.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 3.5f)
                moveTo(14.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 3.5f)
                moveTo(13.8f, 11.5f)
                horizontalLineTo(14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 10.0f)
                verticalLineTo(10.2f)
                curveTo(12.61f, 10.87f, 13.13f, 11.39f, 13.8f, 11.5f)
                moveTo(14.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _blurOff!!
    }

private var _blurOff: ImageVector? = null
