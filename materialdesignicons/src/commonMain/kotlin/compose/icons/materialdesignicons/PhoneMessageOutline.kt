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

public val MaterialDesignIcons.PhoneMessageOutline: ImageVector
    get() {
        if (_phoneMessageOutline != null) {
            return _phoneMessageOutline!!
        }
        _phoneMessageOutline = Builder(name = "PhoneMessageOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.5f)
                curveTo(18.75f, 15.5f, 17.55f, 15.3f, 16.43f, 14.93f)
                curveTo(16.33f, 14.9f, 16.22f, 14.88f, 16.12f, 14.88f)
                curveTo(15.86f, 14.88f, 15.61f, 15.0f, 15.41f, 15.17f)
                lineTo(13.21f, 17.37f)
                curveTo(10.38f, 15.93f, 8.06f, 13.62f, 6.62f, 10.79f)
                lineTo(8.82f, 8.58f)
                curveTo(9.1f, 8.31f, 9.18f, 7.92f, 9.07f, 7.57f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                curveTo(8.5f, 3.45f, 8.05f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 3.0f, 3.0f, 3.45f, 3.0f, 4.0f)
                curveTo(3.0f, 13.39f, 10.61f, 21.0f, 20.0f, 21.0f)
                curveTo(20.55f, 21.0f, 21.0f, 20.55f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 15.95f, 20.55f, 15.5f, 20.0f, 15.5f)
                moveTo(5.03f, 5.0f)
                horizontalLineTo(6.53f)
                curveTo(6.6f, 5.88f, 6.75f, 6.75f, 7.0f, 7.59f)
                lineTo(5.79f, 8.8f)
                curveTo(5.38f, 7.59f, 5.12f, 6.32f, 5.03f, 5.0f)
                moveTo(19.0f, 18.97f)
                curveTo(17.68f, 18.88f, 16.4f, 18.62f, 15.2f, 18.21f)
                lineTo(16.4f, 17.0f)
                curveTo(17.25f, 17.25f, 18.12f, 17.4f, 19.0f, 17.46f)
                verticalLineTo(18.97f)
                moveTo(12.0f, 3.0f)
                verticalLineTo(13.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                moveTo(19.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _phoneMessageOutline!!
    }

private var _phoneMessageOutline: ImageVector? = null
