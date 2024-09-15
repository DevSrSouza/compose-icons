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
                moveTo(497.94f, 225.94f)
                lineTo(286.06f, 14.06f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 252.12f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(204.12f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 14.06f, 33.94f)
                lineToRelative(211.88f, 211.88f)
                curveToRelative(18.74f, 18.75f, 49.14f, 18.75f, 67.88f, 0.0f)
                lineToRelative(204.12f, -204.12f)
                curveToRelative(18.75f, -18.75f, 18.75f, -49.14f, 0.0f, -67.88f)
                close()
                moveTo(112.0f, 160.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.49f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(625.94f, 293.82f)
                lineTo(421.82f, 497.94f)
                curveToRelative(-18.75f, 18.75f, -49.14f, 18.75f, -67.88f, 0.0f)
                lineToRelative(-0.36f, -0.36f)
                lineTo(527.64f, 323.52f)
                curveToRelative(17.0f, -17.0f, 26.36f, -39.6f, 26.36f, -63.64f)
                reflectiveCurveToRelative(-9.36f, -46.64f, -26.36f, -63.64f)
                lineTo(331.4f, 0.0f)
                horizontalLineToRelative(48.72f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 33.94f, 14.06f)
                lineToRelative(211.88f, 211.88f)
                curveToRelative(18.75f, 18.75f, 18.75f, 49.14f, 0.0f, 67.88f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
