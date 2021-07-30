package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.0f, 442.7f)
                lineTo(405.3f, 343.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                horizontalLineTo(372.0f)
                curveToRelative(27.6f, -35.3f, 44.0f, -79.7f, 44.0f, -128.0f)
                curveTo(416.0f, 93.1f, 322.9f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveTo(0.0f, 93.1f, 0.0f, 208.0f)
                reflectiveCurveToRelative(93.1f, 208.0f, 208.0f, 208.0f)
                curveToRelative(48.3f, 0.0f, 92.7f, -16.4f, 128.0f, -44.0f)
                verticalLineToRelative(16.3f)
                curveToRelative(0.0f, 6.4f, 2.5f, 12.5f, 7.0f, 17.0f)
                lineToRelative(99.7f, 99.7f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.1f, -34.0f)
                close()
                moveTo(208.0f, 336.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.2f, -128.0f, -128.0f)
                curveToRelative(0.0f, -70.7f, 57.2f, -128.0f, 128.0f, -128.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.2f, 128.0f, 128.0f)
                curveToRelative(0.0f, 70.7f, -57.2f, 128.0f, -128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
