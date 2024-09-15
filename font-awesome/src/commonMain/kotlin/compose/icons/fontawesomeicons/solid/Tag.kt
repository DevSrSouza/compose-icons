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

public val SolidGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 252.12f)
                verticalLineTo(48.0f)
                curveTo(0.0f, 21.49f, 21.49f, 0.0f, 48.0f, 0.0f)
                horizontalLineToRelative(204.12f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 33.94f, 14.06f)
                lineToRelative(211.88f, 211.88f)
                curveToRelative(18.75f, 18.75f, 18.75f, 49.14f, 0.0f, 67.88f)
                lineTo(293.82f, 497.94f)
                curveToRelative(-18.75f, 18.75f, -49.14f, 18.75f, -67.88f, 0.0f)
                lineTo(14.06f, 286.06f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 0.0f, 252.12f)
                close()
                moveTo(112.0f, 64.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.49f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
