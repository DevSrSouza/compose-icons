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

public val SimpleIcons.Lydia: ImageVector
    get() {
        if (_lydia != null) {
            return _lydia!!
        }
        _lydia = Builder(name = "Lydia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.895f, 17.611f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, -0.168f, 0.035f)
                horizontalLineToRelative(-1.155f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, true, -0.56f, -0.377f)
                lineToRelative(-4.0f, -9.613f)
                lineToRelative(-3.991f, 9.607f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.56f, 0.377f)
                lineTo(6.273f, 17.64f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.385f, -0.59f)
                lineTo(10.91f, 5.575f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, 0.726f, -0.475f)
                horizontalLineToRelative(0.748f)
                arcToRelative(0.792f, 0.792f, 0.0f, false, true, 0.726f, 0.48f)
                lineToRelative(5.003f, 11.482f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.218f, 0.549f)
                close()
            }
        }
        .build()
        return _lydia!!
    }

private var _lydia: ImageVector? = null
