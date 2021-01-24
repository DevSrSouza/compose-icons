package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 336.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                lineTo(0.0f, 288.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 25.6f, 22.4f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(25.6f, 0.0f, 48.0f, -22.4f, 48.0f, -48.0f)
                lineTo(512.0f, 288.0f)
                lineTo(320.0f, 288.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(464.0f, 128.0f)
                horizontalLineToRelative(-80.0f)
                lineTo(384.0f, 80.0f)
                curveToRelative(0.0f, -25.6f, -22.4f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 32.0f)
                curveToRelative(-25.6f, 0.0f, -48.0f, 22.4f, -48.0f, 48.0f)
                verticalLineToRelative(48.0f)
                lineTo(48.0f, 128.0f)
                curveToRelative(-25.6f, 0.0f, -48.0f, 22.4f, -48.0f, 48.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(512.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -25.6f, -22.4f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(320.0f, 128.0f)
                lineTo(192.0f, 128.0f)
                lineTo(192.0f, 96.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
