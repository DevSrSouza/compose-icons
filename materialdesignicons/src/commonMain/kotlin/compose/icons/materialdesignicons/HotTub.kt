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

public val MaterialDesignIcons.HotTub: ImageVector
    get() {
        if (_hotTub != null) {
            return _hotTub!!
        }
        _hotTub = Builder(name = "HotTub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 4.0f)
                moveTo(11.15f, 12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.25f)
                curveTo(5.0f, 10.0f, 6.0f, 9.0f, 7.25f, 9.0f)
                horizontalLineTo(7.28f)
                curveTo(7.62f, 9.0f, 7.95f, 9.09f, 8.24f, 9.23f)
                curveTo(8.5f, 9.35f, 8.74f, 9.5f, 8.93f, 9.73f)
                lineTo(10.33f, 11.28f)
                curveTo(10.56f, 11.54f, 10.84f, 11.78f, 11.15f, 12.0f)
                moveTo(7.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                moveTo(18.65f, 5.86f)
                curveTo(19.68f, 6.86f, 20.16f, 8.21f, 19.95f, 9.57f)
                lineTo(19.89f, 10.0f)
                horizontalLineTo(18.0f)
                lineTo(18.09f, 9.41f)
                curveTo(18.24f, 8.62f, 18.0f, 7.83f, 17.42f, 7.21f)
                lineTo(17.35f, 7.15f)
                curveTo(16.32f, 6.14f, 15.85f, 4.79f, 16.05f, 3.43f)
                lineTo(16.11f, 3.0f)
                horizontalLineTo(18.0f)
                lineTo(17.91f, 3.59f)
                curveTo(17.76f, 4.38f, 18.0f, 5.17f, 18.58f, 5.79f)
                lineTo(18.65f, 5.86f)
                moveTo(14.65f, 5.86f)
                curveTo(15.68f, 6.86f, 16.16f, 8.21f, 15.95f, 9.57f)
                lineTo(15.89f, 10.0f)
                horizontalLineTo(14.0f)
                lineTo(14.09f, 9.41f)
                curveTo(14.24f, 8.62f, 14.0f, 7.83f, 13.42f, 7.21f)
                lineTo(13.35f, 7.15f)
                curveTo(12.32f, 6.14f, 11.85f, 4.79f, 12.05f, 3.43f)
                lineTo(12.11f, 3.0f)
                horizontalLineTo(14.0f)
                lineTo(13.91f, 3.59f)
                curveTo(13.76f, 4.38f, 14.0f, 5.17f, 14.58f, 5.79f)
                lineTo(14.65f, 5.86f)
                close()
            }
        }
        .build()
        return _hotTub!!
    }

private var _hotTub: ImageVector? = null
