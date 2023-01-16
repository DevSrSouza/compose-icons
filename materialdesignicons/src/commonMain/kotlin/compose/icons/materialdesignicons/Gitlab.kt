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

public val MaterialDesignIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.94f, 13.11f)
                lineTo(20.89f, 9.89f)
                curveTo(20.89f, 9.86f, 20.88f, 9.83f, 20.87f, 9.8f)
                lineTo(18.76f, 3.32f)
                curveTo(18.65f, 3.0f, 18.33f, 2.75f, 17.96f, 2.75f)
                curveTo(17.6f, 2.75f, 17.28f, 3.0f, 17.17f, 3.33f)
                lineTo(15.17f, 9.5f)
                horizontalLineTo(8.84f)
                lineTo(6.83f, 3.33f)
                curveTo(6.72f, 3.0f, 6.4f, 2.75f, 6.04f, 2.75f)
                horizontalLineTo(6.04f)
                curveTo(5.67f, 2.75f, 5.35f, 3.0f, 5.24f, 3.33f)
                lineTo(3.13f, 9.82f)
                curveTo(3.13f, 9.82f, 3.13f, 9.83f, 3.13f, 9.83f)
                lineTo(2.06f, 13.11f)
                curveTo(1.9f, 13.61f, 2.07f, 14.15f, 2.5f, 14.45f)
                lineTo(11.72f, 21.16f)
                curveTo(11.89f, 21.28f, 12.11f, 21.28f, 12.28f, 21.15f)
                lineTo(21.5f, 14.45f)
                curveTo(21.93f, 14.15f, 22.1f, 13.61f, 21.94f, 13.11f)
                moveTo(8.15f, 10.45f)
                lineTo(10.72f, 18.36f)
                lineTo(4.55f, 10.45f)
                moveTo(13.28f, 18.37f)
                lineTo(15.75f, 10.78f)
                lineTo(15.85f, 10.45f)
                horizontalLineTo(19.46f)
                lineTo(13.87f, 17.61f)
                moveTo(17.97f, 3.94f)
                lineTo(19.78f, 9.5f)
                horizontalLineTo(16.16f)
                moveTo(14.86f, 10.45f)
                lineTo(13.07f, 15.96f)
                lineTo(12.0f, 19.24f)
                lineTo(9.14f, 10.45f)
                moveTo(6.03f, 3.94f)
                lineTo(7.84f, 9.5f)
                horizontalLineTo(4.23f)
                moveTo(3.05f, 13.69f)
                curveTo(2.96f, 13.62f, 2.92f, 13.5f, 2.96f, 13.4f)
                lineTo(3.75f, 10.97f)
                lineTo(9.57f, 18.42f)
                moveTo(20.95f, 13.69f)
                lineTo(14.44f, 18.42f)
                lineTo(14.46f, 18.39f)
                lineTo(20.25f, 10.97f)
                lineTo(21.04f, 13.4f)
                curveTo(21.08f, 13.5f, 21.04f, 13.62f, 20.95f, 13.69f)
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
