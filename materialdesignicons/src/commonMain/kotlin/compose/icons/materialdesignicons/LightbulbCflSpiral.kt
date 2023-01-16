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

public val MaterialDesignIcons.LightbulbCflSpiral: ImageVector
    get() {
        if (_lightbulbCflSpiral != null) {
            return _lightbulbCflSpiral!!
        }
        _lightbulbCflSpiral = Builder(name = "LightbulbCflSpiral", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(10.84f, 2.0f, 10.69f, 2.03f, 10.55f, 2.1f)
                lineTo(8.55f, 3.1f)
                curveTo(7.56f, 3.66f, 8.0f, 5.0f, 9.0f, 5.0f)
                curveTo(9.16f, 5.0f, 9.32f, 4.95f, 9.45f, 4.9f)
                lineTo(11.45f, 3.9f)
                curveTo(12.43f, 3.36f, 12.0f, 2.0f, 11.0f, 2.0f)
                moveTo(15.0f, 4.0f)
                curveTo(14.83f, 4.0f, 14.69f, 4.03f, 14.55f, 4.1f)
                lineTo(8.55f, 7.1f)
                curveTo(7.56f, 7.68f, 8.0f, 9.0f, 9.0f, 9.0f)
                curveTo(9.18f, 9.0f, 9.32f, 8.95f, 9.45f, 8.9f)
                lineTo(15.45f, 5.9f)
                curveTo(16.41f, 5.43f, 16.0f, 4.0f, 15.0f, 4.0f)
                moveTo(15.0f, 8.0f)
                curveTo(14.84f, 8.0f, 14.69f, 8.03f, 14.55f, 8.1f)
                lineTo(8.7f, 11.03f)
                curveTo(8.2f, 11.25f, 8.0f, 11.6f, 8.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 17.55f, 7.44f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 18.0f, 17.0f, 17.55f, 17.0f, 17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 12.44f, 15.55f, 12.0f, 15.0f, 12.0f)
                curveTo(14.45f, 12.0f, 14.0f, 12.45f, 14.0f, 13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.62f)
                lineTo(15.45f, 9.9f)
                curveTo(16.42f, 9.34f, 16.0f, 8.0f, 15.0f, 8.0f)
                moveTo(9.0f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(9.0f, 21.57f, 9.46f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(14.56f, 22.0f, 15.0f, 21.55f, 15.0f, 21.0f)
                verticalLineTo(20.0f)
            }
        }
        .build()
        return _lightbulbCflSpiral!!
    }

private var _lightbulbCflSpiral: ImageVector? = null
