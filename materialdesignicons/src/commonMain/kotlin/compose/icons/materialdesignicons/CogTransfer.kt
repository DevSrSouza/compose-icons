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

public val MaterialDesignIcons.CogTransfer: ImageVector
    get() {
        if (_cogTransfer != null) {
            return _cogTransfer!!
        }
        _cogTransfer = Builder(name = "CogTransfer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(10.0f, 19.5f)
                lineTo(14.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                moveTo(22.0f, 15.5f)
                lineTo(18.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                lineTo(22.0f, 15.5f)
                moveTo(21.66f, 8.73f)
                lineTo(19.66f, 5.27f)
                curveTo(19.54f, 5.05f, 19.28f, 4.96f, 19.05f, 5.05f)
                lineTo(16.56f, 6.05f)
                curveTo(16.05f, 5.64f, 15.5f, 5.31f, 14.87f, 5.05f)
                lineTo(14.5f, 2.42f)
                curveTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(9.75f, 2.0f, 9.54f, 2.18f, 9.5f, 2.42f)
                lineTo(9.13f, 5.07f)
                curveTo(8.5f, 5.33f, 7.96f, 5.66f, 7.44f, 6.07f)
                lineTo(5.0f, 5.05f)
                curveTo(4.77f, 4.96f, 4.5f, 5.05f, 4.39f, 5.27f)
                lineTo(2.39f, 8.73f)
                curveTo(2.26f, 8.94f, 2.31f, 9.22f, 2.5f, 9.37f)
                lineTo(4.57f, 11.0f)
                curveTo(4.53f, 11.33f, 4.5f, 11.67f, 4.5f, 12.0f)
                curveTo(4.5f, 12.33f, 4.53f, 12.67f, 4.57f, 13.0f)
                lineTo(2.46f, 14.63f)
                curveTo(2.26f, 14.78f, 2.21f, 15.06f, 2.34f, 15.27f)
                lineTo(4.34f, 18.73f)
                curveTo(4.45f, 19.0f, 4.74f, 19.11f, 5.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(7.5f, 18.0f)
                curveTo(7.74f, 18.19f, 8.0f, 18.37f, 8.26f, 18.53f)
                lineTo(11.77f, 15.53f)
                curveTo(9.84f, 15.4f, 8.38f, 13.73f, 8.5f, 11.8f)
                curveTo(8.65f, 9.87f, 10.32f, 8.41f, 12.25f, 8.55f)
                curveTo(13.69f, 8.64f, 14.92f, 9.62f, 15.35f, 11.0f)
                horizontalLineTo(19.43f)
                lineTo(21.54f, 9.37f)
                curveTo(21.73f, 9.22f, 21.78f, 8.94f, 21.66f, 8.73f)
                close()
            }
        }
        .build()
        return _cogTransfer!!
    }

private var _cogTransfer: ImageVector? = null
