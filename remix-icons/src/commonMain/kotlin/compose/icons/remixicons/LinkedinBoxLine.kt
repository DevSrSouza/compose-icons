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

public val RemixIcons.LinkedinBoxLine: ImageVector
    get() {
        if (_linkedinBoxLine != null) {
            return _linkedinBoxLine!!
        }
        _linkedinBoxLine = Builder(name = "LinkedinBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(6.5f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.5f, 10.0f)
                close()
                moveTo(12.0f, 10.43f)
                curveToRelative(0.584f, -0.565f, 1.266f, -0.93f, 2.0f, -0.93f)
                curveToRelative(2.071f, 0.0f, 3.5f, 1.679f, 3.5f, 3.75f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -3.5f, 0.0f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.43f)
                close()
            }
        }
        .build()
        return _linkedinBoxLine!!
    }

private var _linkedinBoxLine: ImageVector? = null
