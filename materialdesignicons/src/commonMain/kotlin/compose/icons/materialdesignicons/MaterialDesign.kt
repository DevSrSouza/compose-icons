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

public val MaterialDesignIcons.MaterialDesign: ImageVector
    get() {
        if (_materialDesign != null) {
            return _materialDesign!!
        }
        _materialDesign = Builder(name = "MaterialDesign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 9.97f, 20.33f, 8.09f, 19.0f, 6.38f)
                verticalLineTo(17.63f)
                curveTo(20.33f, 15.97f, 21.0f, 14.09f, 21.0f, 12.0f)
                moveTo(17.63f, 19.0f)
                horizontalLineTo(6.38f)
                curveTo(7.06f, 19.55f, 7.95f, 20.0f, 9.05f, 20.41f)
                curveTo(10.14f, 20.8f, 11.13f, 21.0f, 12.0f, 21.0f)
                curveTo(12.88f, 21.0f, 13.86f, 20.8f, 14.95f, 20.41f)
                curveTo(16.05f, 20.0f, 16.94f, 19.55f, 17.63f, 19.0f)
                moveTo(11.0f, 17.0f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(17.0f, 9.0f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 14.53f)
                lineTo(15.75f, 7.0f)
                horizontalLineTo(8.25f)
                lineTo(12.0f, 14.53f)
                moveTo(17.63f, 5.0f)
                curveTo(15.97f, 3.67f, 14.09f, 3.0f, 12.0f, 3.0f)
                curveTo(9.91f, 3.0f, 8.03f, 3.67f, 6.38f, 5.0f)
                horizontalLineTo(17.63f)
                moveTo(5.0f, 17.63f)
                verticalLineTo(6.38f)
                curveTo(3.67f, 8.09f, 3.0f, 9.97f, 3.0f, 12.0f)
                curveTo(3.0f, 14.09f, 3.67f, 15.97f, 5.0f, 17.63f)
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 15.03f, 21.94f, 17.63f, 19.78f, 19.78f)
                curveTo(17.63f, 21.94f, 15.03f, 23.0f, 12.0f, 23.0f)
                curveTo(8.97f, 23.0f, 6.38f, 21.94f, 4.22f, 19.78f)
                curveTo(2.06f, 17.63f, 1.0f, 15.03f, 1.0f, 12.0f)
                curveTo(1.0f, 8.97f, 2.06f, 6.38f, 4.22f, 4.22f)
                curveTo(6.38f, 2.06f, 8.97f, 1.0f, 12.0f, 1.0f)
                curveTo(15.03f, 1.0f, 17.63f, 2.06f, 19.78f, 4.22f)
                curveTo(21.94f, 6.38f, 23.0f, 8.97f, 23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _materialDesign!!
    }

private var _materialDesign: ImageVector? = null
