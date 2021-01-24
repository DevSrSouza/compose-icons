package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.941f, 225.941f)
                lineTo(286.059f, 14.059f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 252.118f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(204.118f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 14.059f, 33.941f)
                lineToRelative(211.882f, 211.882f)
                curveToRelative(18.744f, 18.745f, 49.136f, 18.746f, 67.882f, 0.0f)
                lineToRelative(204.118f, -204.118f)
                curveToRelative(18.745f, -18.745f, 18.745f, -49.137f, 0.0f, -67.882f)
                close()
                moveTo(112.0f, 160.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(625.941f, 293.823f)
                lineTo(421.823f, 497.941f)
                curveToRelative(-18.745f, 18.745f, -49.137f, 18.745f, -67.882f, 0.0f)
                lineToRelative(-0.36f, -0.36f)
                lineTo(527.64f, 323.522f)
                curveToRelative(16.999f, -16.999f, 26.36f, -39.6f, 26.36f, -63.64f)
                reflectiveCurveToRelative(-9.362f, -46.641f, -26.36f, -63.64f)
                lineTo(331.397f, 0.0f)
                horizontalLineToRelative(48.721f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 33.941f, 14.059f)
                lineToRelative(211.882f, 211.882f)
                curveToRelative(18.745f, 18.745f, 18.745f, 49.137f, 0.0f, 67.882f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
