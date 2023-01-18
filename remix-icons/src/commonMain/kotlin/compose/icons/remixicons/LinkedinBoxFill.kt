package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.LinkedinBoxFill: ImageVector
    get() {
        if (_linkedinBoxFill != null) {
            return _linkedinBoxFill!!
        }
        _linkedinBoxFill = Builder(name = "LinkedinBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.335f, 18.339f)
                lineTo(15.67f, 18.339f)
                verticalLineToRelative(-4.177f)
                curveToRelative(0.0f, -0.996f, -0.02f, -2.278f, -1.39f, -2.278f)
                curveToRelative(-1.389f, 0.0f, -1.601f, 1.084f, -1.601f, 2.205f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(-2.666f)
                lineTo(10.013f, 9.75f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(1.17f)
                horizontalLineToRelative(0.035f)
                curveToRelative(0.358f, -0.674f, 1.228f, -1.387f, 2.528f, -1.387f)
                curveToRelative(2.7f, 0.0f, 3.2f, 1.778f, 3.2f, 4.091f)
                verticalLineToRelative(4.715f)
                close()
                moveTo(7.003f, 8.575f)
                arcToRelative(1.546f, 1.546f, 0.0f, false, true, -1.548f, -1.549f)
                arcToRelative(1.548f, 1.548f, 0.0f, true, true, 1.547f, 1.549f)
                close()
                moveTo(8.339f, 18.339f)
                lineTo(5.666f, 18.339f)
                lineTo(5.666f, 9.75f)
                lineTo(8.34f, 9.75f)
                verticalLineToRelative(8.589f)
                close()
                moveTo(19.67f, 3.0f)
                lineTo(4.329f, 3.0f)
                curveTo(3.593f, 3.0f, 3.0f, 3.58f, 3.0f, 4.297f)
                verticalLineToRelative(15.406f)
                curveTo(3.0f, 20.42f, 3.594f, 21.0f, 4.328f, 21.0f)
                horizontalLineToRelative(15.338f)
                curveTo(20.4f, 21.0f, 21.0f, 20.42f, 21.0f, 19.703f)
                lineTo(21.0f, 4.297f)
                curveTo(21.0f, 3.58f, 20.4f, 3.0f, 19.666f, 3.0f)
                horizontalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _linkedinBoxFill!!
    }

private var _linkedinBoxFill: ImageVector? = null
