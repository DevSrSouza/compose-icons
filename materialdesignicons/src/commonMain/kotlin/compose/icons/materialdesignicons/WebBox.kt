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

public val MaterialDesignIcons.WebBox: ImageVector
    get() {
        if (_webBox != null) {
            return _webBox!!
        }
        _webBox = Builder(name = "WebBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.95f, 13.4f)
                horizontalLineTo(6.58f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 6.58f, 10.6f)
                horizontalLineTo(8.95f)
                arcTo(11.56f, 11.56f, 0.0f, false, false, 8.85f, 12.0f)
                arcTo(11.56f, 11.56f, 0.0f, false, false, 8.95f, 13.4f)
                moveTo(7.16f, 9.2f)
                horizontalLineTo(9.2f)
                arcTo(12.06f, 12.06f, 0.0f, false, true, 10.18f, 6.71f)
                arcTo(5.55f, 5.55f, 0.0f, false, false, 7.16f, 9.2f)
                moveTo(16.84f, 9.2f)
                arcTo(5.59f, 5.59f, 0.0f, false, false, 13.81f, 6.71f)
                arcTo(10.95f, 10.95f, 0.0f, false, true, 14.78f, 9.2f)
                moveTo(12.0f, 17.57f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 13.34f, 14.8f)
                horizontalLineTo(10.66f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 17.57f)
                moveTo(12.0f, 6.42f)
                arcTo(9.53f, 9.53f, 0.0f, false, false, 10.66f, 9.2f)
                horizontalLineTo(13.34f)
                arcTo(9.53f, 9.53f, 0.0f, false, false, 12.0f, 6.42f)
                moveTo(7.16f, 14.8f)
                arcTo(5.61f, 5.61f, 0.0f, false, false, 10.18f, 17.29f)
                arcTo(12.06f, 12.06f, 0.0f, false, true, 9.2f, 14.8f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                moveTo(19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 12.0f)
                moveTo(15.15f, 12.0f)
                arcTo(11.56f, 11.56f, 0.0f, false, true, 15.05f, 13.4f)
                horizontalLineTo(17.42f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.42f, 10.6f)
                horizontalLineTo(15.05f)
                arcTo(11.56f, 11.56f, 0.0f, false, true, 15.15f, 12.0f)
                moveTo(13.81f, 17.29f)
                arcTo(5.62f, 5.62f, 0.0f, false, false, 16.84f, 14.8f)
                horizontalLineTo(14.78f)
                arcTo(10.95f, 10.95f, 0.0f, false, true, 13.81f, 17.29f)
                moveTo(10.36f, 10.6f)
                arcTo(8.81f, 8.81f, 0.0f, false, false, 10.36f, 13.4f)
                horizontalLineTo(13.64f)
                arcTo(10.3f, 10.3f, 0.0f, false, false, 13.75f, 12.0f)
                arcTo(10.21f, 10.21f, 0.0f, false, false, 13.64f, 10.6f)
                close()
            }
        }
        .build()
        return _webBox!!
    }

private var _webBox: ImageVector? = null
