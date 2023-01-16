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

public val MaterialDesignIcons.DivingSnorkel: ImageVector
    get() {
        if (_divingSnorkel != null) {
            return _divingSnorkel!!
        }
        _divingSnorkel = Builder(name = "DivingSnorkel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineTo(7.15f)
                curveTo(7.57f, 12.0f, 7.95f, 12.24f, 8.1f, 12.63f)
                curveTo(8.44f, 13.68f, 9.58f, 14.25f, 10.62f, 13.91f)
                curveTo(11.23f, 13.71f, 11.7f, 13.23f, 11.9f, 12.63f)
                curveTo(12.05f, 12.24f, 12.43f, 12.0f, 12.85f, 12.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 10.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 3.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(11.35f)
                curveTo(11.1f, 9.46f, 10.59f, 9.09f, 10.0f, 9.0f)
                curveTo(9.41f, 9.09f, 8.9f, 9.46f, 8.65f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                moveTo(22.0f, 2.0f)
                verticalLineTo(15.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 15.5f, 22.0f)
                curveTo(13.79f, 22.0f, 12.15f, 21.32f, 10.93f, 20.12f)
                curveTo(8.95f, 20.58f, 6.88f, 19.79f, 5.71f, 18.12f)
                lineTo(7.62f, 17.29f)
                curveTo(8.5f, 18.22f, 9.84f, 18.5f, 11.0f, 18.0f)
                curveTo(11.2f, 17.91f, 11.39f, 17.8f, 11.56f, 17.67f)
                curveTo(12.4f, 17.05f, 12.87f, 16.04f, 12.78f, 15.0f)
                lineTo(14.69f, 14.17f)
                curveTo(15.1f, 16.04f, 14.41f, 18.0f, 12.9f, 19.17f)
                curveTo(13.66f, 19.71f, 14.57f, 20.0f, 15.5f, 20.0f)
                curveTo(18.0f, 20.0f, 20.0f, 18.0f, 20.0f, 15.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _divingSnorkel!!
    }

private var _divingSnorkel: ImageVector? = null
