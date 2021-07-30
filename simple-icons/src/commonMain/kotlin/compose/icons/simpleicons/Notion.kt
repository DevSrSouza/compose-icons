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

public val SimpleIcons.Notion: ImageVector
    get() {
        if (_notion != null) {
            return _notion!!
        }
        _notion = Builder(name = "Notion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.459f, 4.208f)
                curveToRelative(0.746f, 0.606f, 1.026f, 0.56f, 2.428f, 0.466f)
                lineToRelative(13.215f, -0.793f)
                curveToRelative(0.28f, 0.0f, 0.047f, -0.28f, -0.046f, -0.326f)
                lineTo(17.86f, 1.968f)
                curveToRelative(-0.42f, -0.326f, -0.981f, -0.7f, -2.055f, -0.607f)
                lineTo(3.01f, 2.295f)
                curveToRelative(-0.466f, 0.046f, -0.56f, 0.28f, -0.374f, 0.466f)
                close()
                moveTo(5.252f, 7.288f)
                verticalLineToRelative(13.904f)
                curveToRelative(0.0f, 0.747f, 0.373f, 1.027f, 1.214f, 0.98f)
                lineToRelative(14.523f, -0.84f)
                curveToRelative(0.841f, -0.046f, 0.935f, -0.56f, 0.935f, -1.167f)
                lineTo(21.924f, 6.354f)
                curveToRelative(0.0f, -0.606f, -0.233f, -0.933f, -0.748f, -0.887f)
                lineToRelative(-15.177f, 0.887f)
                curveToRelative(-0.56f, 0.047f, -0.747f, 0.327f, -0.747f, 0.933f)
                close()
                moveTo(19.589f, 8.033f)
                curveToRelative(0.093f, 0.42f, 0.0f, 0.84f, -0.42f, 0.888f)
                lineToRelative(-0.7f, 0.14f)
                verticalLineToRelative(10.264f)
                curveToRelative(-0.608f, 0.327f, -1.168f, 0.514f, -1.635f, 0.514f)
                curveToRelative(-0.748f, 0.0f, -0.935f, -0.234f, -1.495f, -0.933f)
                lineToRelative(-4.577f, -7.186f)
                verticalLineToRelative(6.952f)
                lineTo(12.21f, 19.0f)
                reflectiveCurveToRelative(0.0f, 0.84f, -1.168f, 0.84f)
                lineToRelative(-3.222f, 0.186f)
                curveToRelative(-0.093f, -0.186f, 0.0f, -0.653f, 0.327f, -0.746f)
                lineToRelative(0.84f, -0.233f)
                lineTo(8.987f, 9.854f)
                lineTo(7.822f, 9.76f)
                curveToRelative(-0.094f, -0.42f, 0.14f, -1.026f, 0.793f, -1.073f)
                lineToRelative(3.456f, -0.233f)
                lineToRelative(4.764f, 7.279f)
                verticalLineToRelative(-6.44f)
                lineToRelative(-1.215f, -0.139f)
                curveToRelative(-0.093f, -0.514f, 0.28f, -0.887f, 0.747f, -0.933f)
                close()
                moveTo(1.936f, 1.035f)
                lineToRelative(13.31f, -0.98f)
                curveToRelative(1.634f, -0.14f, 2.055f, -0.047f, 3.082f, 0.7f)
                lineToRelative(4.249f, 2.986f)
                curveToRelative(0.7f, 0.513f, 0.934f, 0.653f, 0.934f, 1.213f)
                verticalLineToRelative(16.378f)
                curveToRelative(0.0f, 1.026f, -0.373f, 1.634f, -1.68f, 1.726f)
                lineToRelative(-15.458f, 0.934f)
                curveToRelative(-0.98f, 0.047f, -1.448f, -0.093f, -1.962f, -0.747f)
                lineToRelative(-3.129f, -4.06f)
                curveToRelative(-0.56f, -0.747f, -0.793f, -1.306f, -0.793f, -1.96f)
                lineTo(0.489f, 2.667f)
                curveToRelative(0.0f, -0.839f, 0.374f, -1.54f, 1.447f, -1.632f)
                close()
            }
        }
        .build()
        return _notion!!
    }

private var _notion: ImageVector? = null
