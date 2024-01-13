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

public val SimpleIcons.Yaml: ImageVector
    get() {
        if (_yaml != null) {
            return _yaml!!
        }
        _yaml = Builder(name = "Yaml", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 0.97f)
                lineToRelative(4.111f, 6.453f)
                verticalLineToRelative(4.09f)
                horizontalLineToRelative(2.638f)
                verticalLineToRelative(-4.09f)
                lineTo(11.053f, 0.969f)
                lineTo(8.214f, 0.969f)
                lineTo(5.58f, 5.125f)
                lineTo(2.965f, 0.969f)
                close()
                moveTo(12.093f, 0.994f)
                lineTo(7.623f, 11.538f)
                horizontalLineToRelative(2.114f)
                lineToRelative(0.97f, -2.345f)
                horizontalLineToRelative(4.775f)
                lineToRelative(0.804f, 2.345f)
                horizontalLineToRelative(2.26f)
                lineTo(14.255f, 0.994f)
                close()
                moveTo(13.226f, 3.219f)
                lineTo(14.689f, 7.089f)
                horizontalLineToRelative(-3.096f)
                close()
                moveTo(16.286f, 12.694f)
                verticalLineToRelative(10.29f)
                lineTo(24.0f, 22.984f)
                verticalLineToRelative(-2.199f)
                horizontalLineToRelative(-5.454f)
                verticalLineToRelative(-8.091f)
                close()
                moveTo(4.111f, 12.696f)
                verticalLineToRelative(10.335f)
                horizontalLineToRelative(2.217f)
                verticalLineToRelative(-7.129f)
                lineToRelative(2.32f, 4.792f)
                horizontalLineToRelative(1.746f)
                lineToRelative(2.4f, -4.96f)
                verticalLineToRelative(7.295f)
                horizontalLineToRelative(2.127f)
                lineTo(14.921f, 12.696f)
                horizontalLineToRelative(-2.904f)
                lineTo(9.44f, 17.37f)
                lineToRelative(-2.455f, -4.674f)
                close()
            }
        }
        .build()
        return _yaml!!
    }

private var _yaml: ImageVector? = null
