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

public val MaterialDesignIcons.SpiderThread: ImageVector
    get() {
        if (_spiderThread != null) {
            return _spiderThread!!
        }
        _spiderThread = Builder(name = "SpiderThread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineTo(7.08f)
                arcTo(5.47f, 5.47f, 0.0f, false, false, 12.0f, 7.0f)
                arcTo(5.47f, 5.47f, 0.0f, false, false, 11.0f, 7.08f)
                verticalLineTo(2.0f)
                moveTo(16.9f, 15.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.73f, 15.55f)
                lineTo(20.0f, 17.42f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.58f)
                lineTo(15.74f, 17.29f)
                arcTo(4.94f, 4.94f, 0.0f, false, true, 8.26f, 17.29f)
                lineTo(6.0f, 18.58f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.42f)
                lineTo(7.27f, 15.55f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.1f, 15.0f)
                horizontalLineTo(5.3f)
                lineTo(2.55f, 16.83f)
                lineTo(1.45f, 15.17f)
                lineTo(4.7f, 13.0f)
                horizontalLineTo(7.1f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.37f, 12.12f)
                lineTo(5.81f, 11.12f)
                lineTo(2.24f, 12.0f)
                lineTo(1.76f, 10.0f)
                lineTo(6.19f, 8.92f)
                lineTo(8.5f, 10.45f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 15.5f, 10.45f)
                lineTo(17.77f, 8.92f)
                lineTo(22.24f, 10.0f)
                lineTo(21.76f, 12.0f)
                lineTo(18.19f, 11.11f)
                lineTo(16.63f, 12.11f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 16.9f, 13.0f)
                horizontalLineTo(19.3f)
                lineTo(22.55f, 15.16f)
                lineTo(21.45f, 16.82f)
                lineTo(18.7f, 15.0f)
                moveTo(11.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 10.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 14.0f)
                moveTo(15.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 14.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _spiderThread!!
    }

private var _spiderThread: ImageVector? = null
