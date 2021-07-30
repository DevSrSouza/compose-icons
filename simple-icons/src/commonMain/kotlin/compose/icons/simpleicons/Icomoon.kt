package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Icomoon: ImageVector
    get() {
        if (_icomoon != null) {
            return _icomoon!!
        }
        _icomoon = Builder(name = "Icomoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(10.34f, 0.0f, 8.79f, 0.313f, 7.34f, 0.938f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.5f, 3.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.937f, 7.34f)
                curveTo(0.313f, 8.79f, 0.0f, 10.34f, 0.0f, 12.0f)
                curveTo(0.0f, 13.66f, 0.313f, 15.21f, 0.938f, 16.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 3.5f, 20.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 7.34f, 23.06f)
                curveTo(8.79f, 23.69f, 10.34f, 24.0f, 12.0f, 24.0f)
                curveTo(13.66f, 24.0f, 15.21f, 23.69f, 16.66f, 23.06f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.5f, 20.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 23.06f, 16.66f)
                curveTo(23.69f, 15.21f, 24.0f, 13.66f, 24.0f, 12.0f)
                curveTo(24.0f, 10.34f, 23.69f, 8.79f, 23.06f, 7.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.5f, 3.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.66f, 0.937f)
                curveTo(15.21f, 0.313f, 13.66f, 0.0f, 12.0f, 0.0f)
                moveTo(8.88f, 1.5f)
                arcTo(11.65f, 11.65f, 0.0f, false, true, 11.37f, 3.42f)
                arcTo(12.31f, 12.31f, 0.0f, false, true, 13.27f, 5.87f)
                curveTo(13.8f, 6.77f, 14.2f, 7.73f, 14.5f, 8.77f)
                curveTo(14.78f, 9.8f, 14.93f, 10.88f, 14.93f, 12.0f)
                reflectiveCurveTo(14.78f, 14.2f, 14.5f, 15.23f)
                arcTo(11.71f, 11.71f, 0.0f, false, true, 13.27f, 18.13f)
                arcTo(12.31f, 12.31f, 0.0f, false, true, 11.37f, 20.58f)
                curveTo(10.62f, 21.33f, 9.79f, 21.96f, 8.88f, 22.5f)
                arcTo(11.91f, 11.91f, 0.0f, false, true, 6.42f, 20.58f)
                arcTo(12.31f, 12.31f, 0.0f, false, true, 4.5f, 18.13f)
                arcTo(11.71f, 11.71f, 0.0f, false, true, 3.31f, 15.23f)
                arcTo(11.63f, 11.63f, 0.0f, false, true, 2.86f, 12.0f)
                curveTo(2.86f, 10.88f, 3.0f, 9.8f, 3.31f, 8.77f)
                arcTo(11.71f, 11.71f, 0.0f, false, true, 4.5f, 5.87f)
                arcTo(12.31f, 12.31f, 0.0f, false, true, 6.42f, 3.42f)
                curveTo(7.17f, 2.67f, 8.0f, 2.04f, 8.88f, 1.5f)
                moveTo(8.86f, 9.23f)
                curveTo(8.09f, 9.23f, 7.44f, 9.5f, 6.9f, 10.04f)
                arcTo(2.67f, 2.67f, 0.0f, false, false, 6.09f, 12.0f)
                curveTo(6.09f, 12.77f, 6.36f, 13.42f, 6.9f, 13.96f)
                curveTo(7.44f, 14.5f, 8.09f, 14.77f, 8.86f, 14.77f)
                curveTo(9.63f, 14.77f, 10.28f, 14.5f, 10.82f, 13.96f)
                curveTo(11.36f, 13.42f, 11.63f, 12.77f, 11.63f, 12.0f)
                reflectiveCurveTo(11.36f, 10.58f, 10.82f, 10.04f)
                arcTo(2.67f, 2.67f, 0.0f, false, false, 8.86f, 9.23f)
                close()
            }
        }
        .build()
        return _icomoon!!
    }

private var _icomoon: ImageVector? = null
