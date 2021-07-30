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

public val SimpleIcons.Intellijidea: ImageVector
    get() {
        if (_intellijidea != null) {
            return _intellijidea!!
        }
        _intellijidea = Builder(name = "Intellijidea", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(3.723f, 3.111f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.834f)
                horizontalLineToRelative(-1.39f)
                verticalLineToRelative(6.277f)
                horizontalLineToRelative(1.39f)
                verticalLineToRelative(1.834f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.834f)
                horizontalLineToRelative(1.444f)
                lineTo(5.167f, 4.945f)
                lineTo(3.723f, 4.945f)
                close()
                moveTo(14.778f, 3.111f)
                lineTo(17.0f, 3.111f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.612f, -0.055f, 1.111f, -0.222f, 1.556f)
                curveToRelative(-0.167f, 0.444f, -0.39f, 0.777f, -0.723f, 1.11f)
                curveToRelative(-0.277f, 0.279f, -0.666f, 0.557f, -1.11f, 0.668f)
                arcToRelative(3.933f, 3.933f, 0.0f, false, true, -1.445f, 0.278f)
                curveToRelative(-0.778f, 0.0f, -1.444f, -0.167f, -1.944f, -0.445f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, true, -1.279f, -1.056f)
                lineToRelative(1.39f, -1.555f)
                curveToRelative(0.277f, 0.334f, 0.555f, 0.555f, 0.833f, 0.722f)
                curveToRelative(0.277f, 0.167f, 0.611f, 0.278f, 0.945f, 0.278f)
                curveToRelative(0.389f, 0.0f, 0.721f, -0.111f, 1.0f, -0.389f)
                curveToRelative(0.221f, -0.278f, 0.333f, -0.667f, 0.333f, -1.278f)
                close()
                moveTo(2.222f, 19.5f)
                horizontalLineToRelative(9.0f)
                lineTo(11.222f, 21.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _intellijidea!!
    }

private var _intellijidea: ImageVector? = null
