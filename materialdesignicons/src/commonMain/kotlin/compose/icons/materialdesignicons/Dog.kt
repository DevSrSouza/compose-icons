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

public val MaterialDesignIcons.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                curveTo(16.29f, 4.0f, 15.25f, 4.33f, 14.65f, 4.61f)
                curveTo(13.88f, 4.23f, 13.0f, 4.0f, 12.0f, 4.0f)
                curveTo(11.0f, 4.0f, 10.12f, 4.23f, 9.35f, 4.61f)
                curveTo(8.75f, 4.33f, 7.71f, 4.0f, 6.0f, 4.0f)
                curveTo(3.0f, 4.0f, 1.0f, 12.0f, 1.0f, 14.0f)
                curveTo(1.0f, 14.83f, 2.32f, 15.59f, 4.14f, 15.9f)
                curveTo(4.78f, 18.14f, 7.8f, 19.85f, 11.5f, 20.0f)
                verticalLineTo(15.72f)
                curveTo(10.91f, 15.35f, 10.0f, 14.68f, 10.0f, 14.0f)
                curveTo(10.0f, 13.0f, 12.0f, 13.0f, 12.0f, 13.0f)
                curveTo(12.0f, 13.0f, 14.0f, 13.0f, 14.0f, 14.0f)
                curveTo(14.0f, 14.68f, 13.09f, 15.35f, 12.5f, 15.72f)
                verticalLineTo(20.0f)
                curveTo(16.2f, 19.85f, 19.22f, 18.14f, 19.86f, 15.9f)
                curveTo(21.68f, 15.59f, 23.0f, 14.83f, 23.0f, 14.0f)
                curveTo(23.0f, 12.0f, 21.0f, 4.0f, 18.0f, 4.0f)
                moveTo(4.15f, 13.87f)
                curveTo(3.65f, 13.75f, 3.26f, 13.61f, 3.0f, 13.5f)
                curveTo(3.25f, 10.73f, 5.2f, 6.4f, 6.05f, 6.0f)
                curveTo(6.59f, 6.0f, 7.0f, 6.06f, 7.37f, 6.11f)
                curveTo(5.27f, 8.42f, 4.44f, 12.04f, 4.15f, 13.87f)
                moveTo(9.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 11.0f)
                curveTo(8.0f, 10.46f, 8.45f, 10.0f, 9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 11.0f)
                curveTo(10.0f, 11.56f, 9.55f, 12.0f, 9.0f, 12.0f)
                moveTo(15.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 11.0f)
                curveTo(14.0f, 10.46f, 14.45f, 10.0f, 15.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 11.0f)
                curveTo(16.0f, 11.56f, 15.55f, 12.0f, 15.0f, 12.0f)
                moveTo(19.85f, 13.87f)
                curveTo(19.56f, 12.04f, 18.73f, 8.42f, 16.63f, 6.11f)
                curveTo(17.0f, 6.06f, 17.41f, 6.0f, 17.95f, 6.0f)
                curveTo(18.8f, 6.4f, 20.75f, 10.73f, 21.0f, 13.5f)
                curveTo(20.75f, 13.61f, 20.36f, 13.75f, 19.85f, 13.87f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
