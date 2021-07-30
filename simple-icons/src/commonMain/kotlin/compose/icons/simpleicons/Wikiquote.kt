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

public val SimpleIcons.Wikiquote: ImageVector
    get() {
        if (_wikiquote != null) {
            return _wikiquote!!
        }
        _wikiquote = Builder(name = "Wikiquote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.152f, 12.0f)
                arcToRelative(4.037f, 4.037f, 0.0f, true, true, -8.075f, 0.0f)
                arcToRelative(4.037f, 4.037f, 0.0f, false, true, 8.075f, 0.0f)
                close()
                moveTo(17.292f, 0.822f)
                curveToRelative(-0.286f, -0.287f, -0.581f, -0.56f, -0.885f, -0.822f)
                lineToRelative(-1.528f, 1.527f)
                curveTo(17.872f, 4.036f, 19.778f, 7.8f, 19.778f, 12.0f)
                reflectiveCurveToRelative(-1.906f, 7.964f, -4.899f, 10.473f)
                lineTo(16.407f, 24.0f)
                curveToRelative(0.304f, -0.262f, 0.6f, -0.535f, 0.886f, -0.822f)
                arcTo(15.705f, 15.705f, 0.0f, false, false, 21.923f, 12.0f)
                curveToRelative(0.0f, -4.223f, -1.644f, -8.192f, -4.63f, -11.178f)
                close()
                moveTo(13.508f, 2.9f)
                lineTo(12.03f, 4.377f)
                arcToRelative(9.642f, 9.642f, 0.0f, false, true, 0.0f, 15.246f)
                lineToRelative(1.477f, 1.477f)
                arcToRelative(11.712f, 11.712f, 0.0f, false, false, 0.0f, -18.2f)
                close()
                moveTo(10.773f, 5.635f)
                lineTo(9.349f, 7.057f)
                curveToRelative(1.61f, 1.057f, 2.675f, 2.878f, 2.675f, 4.943f)
                reflectiveCurveToRelative(-1.065f, 3.886f, -2.675f, 4.943f)
                lineToRelative(1.423f, 1.422f)
                arcTo(7.884f, 7.884f, 0.0f, false, false, 14.005f, 12.0f)
                arcToRelative(7.884f, 7.884f, 0.0f, false, false, -3.233f, -6.365f)
                close()
            }
        }
        .build()
        return _wikiquote!!
    }

private var _wikiquote: ImageVector? = null
