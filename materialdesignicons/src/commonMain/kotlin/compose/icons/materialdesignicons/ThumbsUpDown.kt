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

public val MaterialDesignIcons.ThumbsUpDown: ImageVector
    get() {
        if (_thumbsUpDown != null) {
            return _thumbsUpDown!!
        }
        _thumbsUpDown = Builder(name = "ThumbsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 10.0f)
                horizontalLineTo(15.75f)
                curveTo(15.13f, 10.0f, 14.6f, 10.38f, 14.37f, 10.91f)
                lineTo(12.11f, 16.2f)
                curveTo(12.04f, 16.37f, 12.0f, 16.56f, 12.0f, 16.75f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                horizontalLineTo(18.18f)
                lineTo(17.5f, 22.18f)
                verticalLineTo(22.42f)
                curveTo(17.5f, 22.73f, 17.63f, 23.0f, 17.83f, 23.22f)
                lineTo(18.62f, 24.0f)
                lineTo(23.56f, 19.06f)
                curveTo(23.83f, 18.79f, 24.0f, 18.41f, 24.0f, 18.0f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 10.0f)
                moveTo(12.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 5.0f)
                horizontalLineTo(5.82f)
                lineTo(6.5f, 1.82f)
                verticalLineTo(1.59f)
                curveTo(6.5f, 1.28f, 6.37f, 1.0f, 6.17f, 0.79f)
                lineTo(5.38f, 0.0f)
                lineTo(0.44f, 4.94f)
                curveTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f)
                verticalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineTo(8.25f)
                curveTo(8.87f, 14.0f, 9.4f, 13.62f, 9.63f, 13.09f)
                lineTo(11.89f, 7.8f)
                curveTo(11.96f, 7.63f, 12.0f, 7.44f, 12.0f, 7.25f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _thumbsUpDown!!
    }

private var _thumbsUpDown: ImageVector? = null
