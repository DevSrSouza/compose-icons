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

public val MaterialDesignIcons.PhoneVoip: ImageVector
    get() {
        if (_phoneVoip != null) {
            return _phoneVoip!!
        }
        _phoneVoip = Builder(name = "PhoneVoip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(23.7f, 7.67f)
                curveTo(23.88f, 7.85f, 24.0f, 8.09f, 24.0f, 8.37f)
                curveTo(24.0f, 8.65f, 23.89f, 8.9f, 23.71f, 9.08f)
                lineTo(21.23f, 11.56f)
                curveTo(21.05f, 11.74f, 20.8f, 11.85f, 20.5f, 11.85f)
                curveTo(20.25f, 11.85f, 20.0f, 11.75f, 19.82f, 11.57f)
                curveTo(19.0f, 10.84f, 18.13f, 10.21f, 17.15f, 9.72f)
                curveTo(16.82f, 9.56f, 16.59f, 9.21f, 16.59f, 8.82f)
                verticalLineTo(5.72f)
                curveTo(15.14f, 5.25f, 13.59f, 5.0f, 12.0f, 5.0f)
                curveTo(10.4f, 5.0f, 8.85f, 5.25f, 7.4f, 5.73f)
                verticalLineTo(8.83f)
                curveTo(7.4f, 9.23f, 7.17f, 9.57f, 6.84f, 9.73f)
                curveTo(5.87f, 10.22f, 4.97f, 10.84f, 4.18f, 11.58f)
                curveTo(4.0f, 11.75f, 3.75f, 11.86f, 3.5f, 11.86f)
                curveTo(3.2f, 11.86f, 2.95f, 11.75f, 2.77f, 11.57f)
                lineTo(0.29f, 9.09f)
                curveTo(0.11f, 8.91f, 0.0f, 8.66f, 0.0f, 8.38f)
                curveTo(0.0f, 8.1f, 0.11f, 7.85f, 0.29f, 7.67f)
                curveTo(3.34f, 4.78f, 7.46f, 3.0f, 12.0f, 3.0f)
                curveTo(16.53f, 3.0f, 20.65f, 4.78f, 23.7f, 7.67f)
                moveTo(11.0f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _phoneVoip!!
    }

private var _phoneVoip: ImageVector? = null
