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

public val SimpleIcons.Starlingbank: ImageVector
    get() {
        if (_starlingbank != null) {
            return _starlingbank!!
        }
        _starlingbank = Builder(name = "Starlingbank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.738f, 3.822f)
                horizontalLineToRelative(0.666f)
                verticalLineToRelative(2.724f)
                horizontalLineToRelative(-0.666f)
                arcToRelative(4.794f, 4.794f, 0.0f, false, false, -4.789f, 4.788f)
                lineTo(9.949f, 12.0f)
                lineTo(7.226f, 12.0f)
                verticalLineToRelative(-0.666f)
                curveToRelative(0.0f, -4.142f, 3.37f, -7.512f, 7.512f, -7.512f)
                close()
                moveTo(14.05f, 12.0f)
                horizontalLineToRelative(2.723f)
                verticalLineToRelative(0.666f)
                curveToRelative(0.0f, 4.142f, -3.37f, 7.512f, -7.512f, 7.512f)
                horizontalLineToRelative(-0.666f)
                verticalLineToRelative(-2.724f)
                horizontalLineToRelative(0.666f)
                arcToRelative(4.794f, 4.794f, 0.0f, false, false, 4.789f, -4.788f)
                close()
            }
        }
        .build()
        return _starlingbank!!
    }

private var _starlingbank: ImageVector? = null
