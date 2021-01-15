package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Clubhouse: ImageVector
    get() {
        if (_clubhouse != null) {
            return _clubhouse!!
        }
        _clubhouse = Builder(name = "Clubhouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.7422f, 17.9588f)
                curveTo(0.7813f, 17.9588f, 0.0f, 18.7528f, 0.0f, 19.7294f)
                curveTo(0.0f, 20.6981f, 0.7813f, 21.5f, 1.7422f, 21.5f)
                curveTo(2.7031f, 21.5f, 3.4844f, 20.6981f, 3.4844f, 19.7294f)
                curveTo(3.4844f, 18.7528f, 2.7109f, 17.9588f, 1.7422f, 17.9588f)
                close()
                moveTo(23.1797f, 2.5f)
                lineTo(12.2188f, 6.057f)
                verticalLineTo(2.5476f)
                lineTo(0.3906f, 6.3826f)
                verticalLineTo(16.5694f)
                lineTo(10.5938f, 13.2585f)
                verticalLineTo(16.752f)
                lineTo(24.0f, 12.4089f)
                lineTo(20.3672f, 8.8042f)
                lineTo(23.1797f, 2.5f)
                close()
                moveTo(10.5938f, 11.5117f)
                lineTo(2.0234f, 14.2906f)
                verticalLineTo(7.5894f)
                lineTo(10.5938f, 4.8105f)
                verticalLineTo(11.5117f)
                close()
                moveTo(20.9688f, 11.6546f)
                lineTo(12.2188f, 14.4971f)
                verticalLineTo(7.8038f)
                lineTo(20.2734f, 5.1837f)
                lineTo(18.4219f, 9.1536f)
                lineTo(20.9688f, 11.6546f)
                close()
            }
        }
        .build()
        return _clubhouse!!
    }

private var _clubhouse: ImageVector? = null
