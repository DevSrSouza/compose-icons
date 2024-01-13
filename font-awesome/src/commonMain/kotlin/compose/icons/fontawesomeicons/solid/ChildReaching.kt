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

public val SolidGroup.ChildReaching: ImageVector
    get() {
        if (_childReaching != null) {
            return _childReaching!!
        }
        _childReaching = Builder(name = "ChildReaching", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 128.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(152.9f, 169.3f)
                curveToRelative(-23.7f, -8.4f, -44.5f, -24.3f, -58.8f, -45.8f)
                lineTo(74.6f, 94.2f)
                curveTo(64.8f, 79.5f, 45.0f, 75.6f, 30.2f, 85.4f)
                reflectiveCurveToRelative(-18.7f, 29.7f, -8.9f, 44.4f)
                lineTo(40.9f, 159.0f)
                curveToRelative(18.1f, 27.1f, 42.8f, 48.4f, 71.1f, 62.4f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(221.6f)
                curveToRelative(29.1f, -14.2f, 54.4f, -36.2f, 72.7f, -64.2f)
                lineToRelative(18.2f, -27.9f)
                curveToRelative(9.6f, -14.8f, 5.4f, -34.6f, -9.4f, -44.3f)
                reflectiveCurveToRelative(-34.6f, -5.5f, -44.3f, 9.4f)
                lineTo(291.0f, 122.4f)
                curveToRelative(-21.8f, 33.4f, -58.9f, 53.6f, -98.8f, 53.6f)
                curveToRelative(-12.6f, 0.0f, -24.9f, -2.0f, -36.6f, -5.8f)
                curveToRelative(-0.9f, -0.3f, -1.8f, -0.7f, -2.7f, -0.9f)
                close()
            }
        }
        .build()
        return _childReaching!!
    }

private var _childReaching: ImageVector? = null
