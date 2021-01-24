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

public val SolidGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 480.0f)
                horizontalLineToRelative(256.0f)
                lineTo(384.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(400.0f)
                close()
                moveTo(192.0f, 96.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(32.0f)
                lineTo(192.0f, 128.0f)
                lineTo(192.0f, 96.0f)
                close()
                moveTo(512.0f, 176.0f)
                verticalLineToRelative(256.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(416.0f, 128.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(96.0f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 176.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(352.0f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
