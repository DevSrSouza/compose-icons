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

public val MaterialDesignIcons.CctvOff: ImageVector
    get() {
        if (_cctvOff != null) {
            return _cctvOff!!
        }
        _cctvOff = Builder(name = "CctvOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(15.9f, 20.0f, 15.0f, 19.1f, 15.0f, 18.0f)
                verticalLineTo(16.89f)
                lineTo(12.66f, 14.55f)
                lineTo(11.81f, 15.04f)
                curveTo(10.86f, 15.59f, 9.63f, 15.26f, 9.08f, 14.31f)
                lineTo(7.58f, 11.71f)
                curveTo(7.18f, 11.0f, 7.25f, 10.18f, 7.68f, 9.57f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(18.5f, 13.0f)
                curveTo(18.5f, 12.43f, 18.3f, 11.9f, 17.97f, 11.5f)
                lineTo(19.94f, 10.35f)
                curveTo(20.95f, 9.76f, 21.3f, 8.47f, 20.71f, 7.46f)
                lineTo(19.33f, 5.06f)
                curveTo(18.74f, 4.05f, 17.45f, 3.7f, 16.44f, 4.28f)
                lineTo(10.77f, 7.57f)
                lineTo(17.86f, 14.66f)
                curveTo(18.26f, 14.22f, 18.5f, 13.64f, 18.5f, 13.0f)
                moveTo(2.0f, 12.62f)
                lineTo(5.5f, 18.68f)
                lineTo(8.03f, 15.5f)
                lineTo(6.03f, 12.03f)
                lineTo(2.0f, 12.62f)
                close()
            }
        }
        .build()
        return _cctvOff!!
    }

private var _cctvOff: ImageVector? = null
