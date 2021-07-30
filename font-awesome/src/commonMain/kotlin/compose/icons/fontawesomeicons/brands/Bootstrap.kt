package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(292.3f, 311.93f)
                curveToRelative(0.0f, 42.41f, -39.72f, 41.43f, -43.92f, 41.43f)
                horizontalLineToRelative(-80.89f)
                verticalLineToRelative(-81.69f)
                horizontalLineToRelative(80.89f)
                curveToRelative(42.56f, 0.0f, 43.92f, 31.9f, 43.92f, 40.26f)
                close()
                moveTo(242.15f, 238.8f)
                curveToRelative(0.67f, 0.0f, 38.44f, 1.0f, 38.44f, -36.31f)
                curveToRelative(0.0f, -15.52f, -3.51f, -35.87f, -38.44f, -35.87f)
                horizontalLineToRelative(-74.66f)
                verticalLineToRelative(72.18f)
                horizontalLineToRelative(74.66f)
                close()
                moveTo(448.0f, 106.67f)
                verticalLineToRelative(298.66f)
                arcTo(74.89f, 74.89f, 0.0f, false, true, 373.33f, 480.0f)
                lineTo(74.67f, 480.0f)
                arcTo(74.89f, 74.89f, 0.0f, false, true, 0.0f, 405.33f)
                lineTo(0.0f, 106.67f)
                arcTo(74.89f, 74.89f, 0.0f, false, true, 74.67f, 32.0f)
                horizontalLineToRelative(298.66f)
                arcTo(74.89f, 74.89f, 0.0f, false, true, 448.0f, 106.67f)
                close()
                moveTo(338.05f, 317.86f)
                curveToRelative(0.0f, -21.57f, -6.65f, -58.29f, -49.05f, -67.35f)
                verticalLineToRelative(-0.73f)
                curveToRelative(22.91f, -9.78f, 37.34f, -28.25f, 37.34f, -55.64f)
                curveToRelative(0.0f, -7.0f, 2.0f, -64.78f, -77.6f, -64.78f)
                horizontalLineToRelative(-127.0f)
                verticalLineToRelative(261.33f)
                curveToRelative(128.23f, 0.0f, 139.87f, 1.68f, 163.6f, -5.71f)
                curveToRelative(14.21f, -4.42f, 52.71f, -17.98f, 52.71f, -67.12f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null
