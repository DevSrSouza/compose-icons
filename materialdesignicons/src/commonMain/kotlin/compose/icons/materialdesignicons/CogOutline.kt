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

public val MaterialDesignIcons.CogOutline: ImageVector
    get() {
        if (_cogOutline != null) {
            return _cogOutline!!
        }
        _cogOutline = Builder(name = "CogOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                moveTo(10.0f, 22.0f)
                curveTo(9.75f, 22.0f, 9.54f, 21.82f, 9.5f, 21.58f)
                lineTo(9.13f, 18.93f)
                curveTo(8.5f, 18.68f, 7.96f, 18.34f, 7.44f, 17.94f)
                lineTo(4.95f, 18.95f)
                curveTo(4.73f, 19.03f, 4.46f, 18.95f, 4.34f, 18.73f)
                lineTo(2.34f, 15.27f)
                curveTo(2.21f, 15.05f, 2.27f, 14.78f, 2.46f, 14.63f)
                lineTo(4.57f, 12.97f)
                lineTo(4.5f, 12.0f)
                lineTo(4.57f, 11.0f)
                lineTo(2.46f, 9.37f)
                curveTo(2.27f, 9.22f, 2.21f, 8.95f, 2.34f, 8.73f)
                lineTo(4.34f, 5.27f)
                curveTo(4.46f, 5.05f, 4.73f, 4.96f, 4.95f, 5.05f)
                lineTo(7.44f, 6.05f)
                curveTo(7.96f, 5.66f, 8.5f, 5.32f, 9.13f, 5.07f)
                lineTo(9.5f, 2.42f)
                curveTo(9.54f, 2.18f, 9.75f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.25f, 2.0f, 14.46f, 2.18f, 14.5f, 2.42f)
                lineTo(14.87f, 5.07f)
                curveTo(15.5f, 5.32f, 16.04f, 5.66f, 16.56f, 6.05f)
                lineTo(19.05f, 5.05f)
                curveTo(19.27f, 4.96f, 19.54f, 5.05f, 19.66f, 5.27f)
                lineTo(21.66f, 8.73f)
                curveTo(21.79f, 8.95f, 21.73f, 9.22f, 21.54f, 9.37f)
                lineTo(19.43f, 11.0f)
                lineTo(19.5f, 12.0f)
                lineTo(19.43f, 13.0f)
                lineTo(21.54f, 14.63f)
                curveTo(21.73f, 14.78f, 21.79f, 15.05f, 21.66f, 15.27f)
                lineTo(19.66f, 18.73f)
                curveTo(19.54f, 18.95f, 19.27f, 19.04f, 19.05f, 18.95f)
                lineTo(16.56f, 17.95f)
                curveTo(16.04f, 18.34f, 15.5f, 18.68f, 14.87f, 18.93f)
                lineTo(14.5f, 21.58f)
                curveTo(14.46f, 21.82f, 14.25f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                moveTo(11.25f, 4.0f)
                lineTo(10.88f, 6.61f)
                curveTo(9.68f, 6.86f, 8.62f, 7.5f, 7.85f, 8.39f)
                lineTo(5.44f, 7.35f)
                lineTo(4.69f, 8.65f)
                lineTo(6.8f, 10.2f)
                curveTo(6.4f, 11.37f, 6.4f, 12.64f, 6.8f, 13.8f)
                lineTo(4.68f, 15.36f)
                lineTo(5.43f, 16.66f)
                lineTo(7.86f, 15.62f)
                curveTo(8.63f, 16.5f, 9.68f, 17.14f, 10.87f, 17.38f)
                lineTo(11.24f, 20.0f)
                horizontalLineTo(12.76f)
                lineTo(13.13f, 17.39f)
                curveTo(14.32f, 17.14f, 15.37f, 16.5f, 16.14f, 15.62f)
                lineTo(18.57f, 16.66f)
                lineTo(19.32f, 15.36f)
                lineTo(17.2f, 13.81f)
                curveTo(17.6f, 12.64f, 17.6f, 11.37f, 17.2f, 10.2f)
                lineTo(19.31f, 8.65f)
                lineTo(18.56f, 7.35f)
                lineTo(16.15f, 8.39f)
                curveTo(15.38f, 7.5f, 14.32f, 6.86f, 13.12f, 6.62f)
                lineTo(12.75f, 4.0f)
                horizontalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _cogOutline!!
    }

private var _cogOutline: ImageVector? = null
