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

public val MaterialDesignIcons.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.07f)
                verticalLineTo(1.0f)
                lineTo(8.45f, 5.55f)
                lineTo(13.0f, 10.0f)
                verticalLineTo(6.09f)
                curveTo(15.84f, 6.57f, 18.0f, 9.03f, 18.0f, 12.0f)
                curveTo(18.0f, 14.97f, 15.84f, 17.43f, 13.0f, 17.91f)
                verticalLineTo(19.93f)
                curveTo(16.95f, 19.44f, 20.0f, 16.08f, 20.0f, 12.0f)
                curveTo(20.0f, 7.92f, 16.95f, 4.56f, 13.0f, 4.07f)
                moveTo(7.1f, 18.32f)
                curveTo(8.26f, 19.22f, 9.61f, 19.76f, 11.0f, 19.93f)
                verticalLineTo(17.9f)
                curveTo(10.13f, 17.75f, 9.29f, 17.41f, 8.54f, 16.87f)
                lineTo(7.1f, 18.32f)
                moveTo(6.09f, 13.0f)
                horizontalLineTo(4.07f)
                curveTo(4.24f, 14.39f, 4.79f, 15.73f, 5.69f, 16.89f)
                lineTo(7.1f, 15.47f)
                curveTo(6.58f, 14.72f, 6.23f, 13.88f, 6.09f, 13.0f)
                moveTo(7.11f, 8.53f)
                lineTo(5.7f, 7.11f)
                curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f)
                horizontalLineTo(6.09f)
                curveTo(6.23f, 10.13f, 6.58f, 9.28f, 7.11f, 8.53f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
