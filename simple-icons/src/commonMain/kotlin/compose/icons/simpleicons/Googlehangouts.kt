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

public val SimpleIcons.Googlehangouts: ImageVector
    get() {
        if (_googlehangouts != null) {
            return _googlehangouts!!
        }
        _googlehangouts = Builder(name = "Googlehangouts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.2f, 0.0f, 1.5f, 4.7f, 1.5f, 10.5f)
                curveToRelative(0.0f, 5.5f, 5.0f, 10.0f, 10.5f, 10.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(6.35f, -3.1f, 10.5f, -8.2f, 10.5f, -13.5f)
                curveTo(22.5f, 4.7f, 17.8f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.5f, 12.0f)
                curveToRelative(0.0f, 1.4f, -0.9f, 2.5f, -2.0f, 2.5f)
                lineTo(9.5f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 7.5f)
                horizontalLineToRelative(4.5f)
                lineTo(11.5f, 12.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveToRelative(0.0f, 1.4f, -0.9f, 2.5f, -2.0f, 2.5f)
                lineTo(15.5f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 7.5f)
                horizontalLineToRelative(4.5f)
                lineTo(17.5f, 12.0f)
                close()
            }
        }
        .build()
        return _googlehangouts!!
    }

private var _googlehangouts: ImageVector? = null
