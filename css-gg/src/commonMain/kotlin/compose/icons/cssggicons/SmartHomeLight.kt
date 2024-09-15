package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.SmartHomeLight: ImageVector
    get() {
        if (_smartHomeLight != null) {
            return _smartHomeLight!!
        }
        _smartHomeLight = Builder(name = "SmartHomeLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.034f, 6.5f)
                curveTo(7.034f, 3.739f, 9.273f, 1.5f, 12.034f, 1.5f)
                curveTo(14.796f, 1.5f, 17.034f, 3.739f, 17.034f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(17.034f, 13.261f, 14.796f, 15.5f, 12.034f, 15.5f)
                curveTo(9.273f, 15.5f, 7.034f, 13.261f, 7.034f, 10.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(15.034f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(15.034f, 12.157f, 13.691f, 13.5f, 12.034f, 13.5f)
                curveTo(10.377f, 13.5f, 9.034f, 12.157f, 9.034f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(9.034f, 4.843f, 10.377f, 3.5f, 12.034f, 3.5f)
                curveTo(13.691f, 3.5f, 15.034f, 4.843f, 15.034f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.034f, 16.5f)
                curveTo(11.482f, 16.5f, 11.034f, 16.948f, 11.034f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(11.034f, 22.052f, 11.482f, 22.5f, 12.034f, 22.5f)
                curveTo(12.587f, 22.5f, 13.034f, 22.052f, 13.034f, 21.5f)
                verticalLineTo(17.5f)
                curveTo(13.034f, 16.948f, 12.587f, 16.5f, 12.034f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.744f, 16.44f)
                curveTo(7.933f, 15.921f, 8.507f, 15.653f, 9.026f, 15.842f)
                curveTo(9.545f, 16.031f, 9.813f, 16.605f, 9.624f, 17.124f)
                lineTo(8.256f, 20.882f)
                curveTo(8.067f, 21.402f, 7.493f, 21.669f, 6.974f, 21.48f)
                curveTo(6.455f, 21.291f, 6.187f, 20.717f, 6.376f, 20.198f)
                lineTo(7.744f, 16.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.974f, 15.842f)
                curveTo(14.455f, 16.031f, 14.188f, 16.605f, 14.376f, 17.124f)
                lineTo(15.745f, 20.882f)
                curveTo(15.933f, 21.402f, 16.507f, 21.669f, 17.026f, 21.48f)
                curveTo(17.545f, 21.291f, 17.813f, 20.718f, 17.624f, 20.198f)
                lineTo(16.256f, 16.44f)
                curveTo(16.067f, 15.921f, 15.493f, 15.653f, 14.974f, 15.842f)
                close()
            }
        }
        .build()
        return _smartHomeLight!!
    }

private var _smartHomeLight: ImageVector? = null
