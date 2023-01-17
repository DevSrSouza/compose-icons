package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 48.0f)
                verticalLineTo(384.0f)
                curveToRelative(-63.09f, 22.54f, -82.34f, 32.0f, -119.5f, 32.0f)
                curveToRelative(-62.82f, 0.0f, -86.6f, -32.0f, -149.3f, -32.0f)
                curveToRelative(-21.69f, 0.0f, -38.48f, 3.791f, -53.74f, 8.766f)
                curveTo(110.1f, 397.5f, 96.0f, 386.1f, 96.0f, 371.7f)
                verticalLineToRelative(-0.746f)
                curveToRelative(0.0f, -9.275f, 5.734f, -17.6f, 14.42f, -20.86f)
                curveTo(129.1f, 342.8f, 150.2f, 336.0f, 179.2f, 336.0f)
                curveToRelative(62.73f, 0.0f, 86.51f, 32.0f, 149.3f, 32.0f)
                curveToRelative(25.5f, 0.0f, 42.85f, -4.604f, 71.47f, -14.7f)
                verticalLineToRelative(-240.0f)
                curveTo(379.2f, 120.6f, 357.7f, 128.0f, 328.5f, 128.0f)
                curveToRelative(-0.004f, 0.0f, 0.004f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-62.81f, 0.0f, -86.61f, -32.0f, -149.3f, -32.0f)
                curveTo(122.1f, 96.0f, 98.8f, 122.1f, 48.0f, 126.1f)
                verticalLineTo(456.0f)
                curveTo(48.0f, 469.3f, 37.25f, 480.0f, 24.0f, 480.0f)
                reflectiveCurveTo(0.0f, 469.3f, 0.0f, 456.0f)
                verticalLineTo(56.0f)
                curveTo(0.0f, 42.74f, 10.75f, 32.0f, 24.0f, 32.0f)
                reflectiveCurveTo(48.0f, 42.74f, 48.0f, 56.0f)
                verticalLineToRelative(22.99f)
                curveTo(98.8f, 74.14f, 122.1f, 48.0f, 179.2f, 48.0f)
                curveToRelative(62.77f, 0.0f, 86.45f, 32.0f, 149.3f, 32.0f)
                curveTo(366.1f, 80.0f, 386.8f, 69.85f, 448.0f, 48.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
