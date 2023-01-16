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

public val MaterialDesignIcons.Bandage: ImageVector
    get() {
        if (_bandage != null) {
            return _bandage!!
        }
        _bandage = Builder(name = "Bandage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.73f, 12.0f)
                lineTo(21.71f, 8.04f)
                curveTo(22.1f, 7.65f, 22.1f, 7.0f, 21.71f, 6.63f)
                lineTo(17.37f, 2.29f)
                curveTo(17.0f, 1.9f, 16.35f, 1.9f, 15.96f, 2.29f)
                lineTo(12.0f, 6.27f)
                lineTo(8.0f, 2.29f)
                curveTo(7.8f, 2.1f, 7.55f, 2.0f, 7.29f, 2.0f)
                curveTo(7.04f, 2.0f, 6.78f, 2.1f, 6.59f, 2.29f)
                lineTo(2.25f, 6.63f)
                curveTo(1.86f, 7.0f, 1.86f, 7.65f, 2.25f, 8.04f)
                lineTo(6.23f, 12.0f)
                lineTo(2.25f, 16.0f)
                curveTo(1.86f, 16.39f, 1.86f, 17.0f, 2.25f, 17.41f)
                lineTo(6.59f, 21.75f)
                curveTo(7.0f, 22.14f, 7.61f, 22.14f, 8.0f, 21.75f)
                lineTo(12.0f, 17.77f)
                lineTo(15.96f, 21.75f)
                curveTo(16.16f, 21.95f, 16.41f, 22.04f, 16.67f, 22.04f)
                curveTo(16.93f, 22.04f, 17.18f, 21.94f, 17.38f, 21.75f)
                lineTo(21.72f, 17.41f)
                curveTo(22.11f, 17.0f, 22.11f, 16.39f, 21.72f, 16.0f)
                lineTo(17.73f, 12.0f)
                moveTo(12.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 9.0f)
                moveTo(7.29f, 10.96f)
                lineTo(3.66f, 7.34f)
                lineTo(7.29f, 3.71f)
                lineTo(10.91f, 7.33f)
                lineTo(7.29f, 10.96f)
                moveTo(10.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 13.0f)
                moveTo(12.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(14.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.0f)
                moveTo(16.66f, 20.34f)
                lineTo(13.03f, 16.72f)
                lineTo(16.66f, 13.09f)
                lineTo(20.28f, 16.71f)
                lineTo(16.66f, 20.34f)
                close()
            }
        }
        .build()
        return _bandage!!
    }

private var _bandage: ImageVector? = null
