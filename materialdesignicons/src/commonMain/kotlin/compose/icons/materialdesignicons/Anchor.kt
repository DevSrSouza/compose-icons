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

public val MaterialDesignIcons.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 7.83f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.92f)
                curveTo(10.26f, 19.79f, 9.5f, 19.58f, 8.79f, 19.27f)
                curveTo(8.05f, 18.95f, 7.4f, 18.56f, 6.82f, 18.09f)
                curveTo(6.24f, 17.62f, 5.78f, 17.11f, 5.44f, 16.55f)
                lineTo(7.0f, 15.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 15.97f, 3.27f, 16.88f, 3.82f, 17.72f)
                curveTo(4.37f, 18.56f, 5.09f, 19.31f, 6.0f, 19.95f)
                curveTo(6.87f, 20.59f, 7.84f, 21.09f, 8.88f, 21.45f)
                curveTo(9.93f, 21.81f, 10.97f, 22.0f, 12.0f, 22.0f)
                curveTo(13.03f, 22.0f, 14.07f, 21.8f, 15.12f, 21.44f)
                curveTo(16.16f, 21.08f, 17.13f, 20.58f, 18.0f, 19.95f)
                curveTo(18.92f, 19.31f, 19.63f, 18.57f, 20.18f, 17.72f)
                curveTo(20.73f, 16.88f, 21.0f, 15.97f, 21.0f, 15.0f)
                verticalLineTo(12.0f)
                lineTo(17.0f, 15.0f)
                lineTo(18.56f, 16.55f)
                curveTo(18.22f, 17.11f, 17.76f, 17.62f, 17.18f, 18.09f)
                curveTo(16.6f, 18.56f, 15.95f, 18.95f, 15.21f, 19.27f)
                curveTo(14.5f, 19.58f, 13.74f, 19.79f, 13.0f, 19.92f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.82f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
